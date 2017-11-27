package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.entidade.ModulosImportacao;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.persistencia.ImportacaoDao;
import br.com.srcomputador.nfe.rest.ConteudoVazioException;
import br.com.srcomputador.nfe.rest.dtorequest.RequestImportacao;
import br.com.srcomputador.servico.DefinirTipoArquivoService;
import br.com.srcomputador.servico.OperacaoDiretorioService;
import br.com.srcomputador.servico.OperacaoZipService;
import br.com.srcomputador.servico.TipoArquivo;
import net.lingala.zip4j.exception.ZipException;

@Service
public class ImportacaoService {

	private ImportacaoDao dao;
	private LeitorNFeService leitorNFeService;
	private OperacaoZipService descompactadorService;
	private DefinirTipoArquivoService definirTipoArquivo;
	private OperacaoDiretorioService operacaoDiretorioService;

	@Autowired
	public ImportacaoService(ImportacaoDao dao, LeitorNFeService leitorNFeService,
			OperacaoZipService descompactadorService, DefinirTipoArquivoService definirTipoArquivo,
			OperacaoDiretorioService operacaoDiretorioService) {
		this.dao = dao;
		this.leitorNFeService = leitorNFeService;
		this.descompactadorService = descompactadorService;
		this.definirTipoArquivo = definirTipoArquivo;
		this.operacaoDiretorioService = operacaoDiretorioService;
	}

	public List<Importacao> listarImportacoes(ModulosImportacao modulo) {
		return this.dao.listarImportacoesPorModulo(modulo);
	}

	public void salvarImportacao(String descricao, MultipartFile[] arquivos, Cliente cliente, String path)
			throws IllegalStateException, IOException, IllegalAccessException, InvocationTargetException,
			ConteudoVazioException, ZipException {

		Importacao importacao = new Importacao();
		importacao.setDescricao(descricao);
		importacao.setCliente(cliente);
		importacao.setModulo(ModulosImportacao.NFE);
		importacao.setListaNfe(new ArrayList<NotaFiscalEletronica>());

		File destino = new File(path + File.separator + "arquivos");
		for (MultipartFile file : arquivos) {

			File f = new File(file.getOriginalFilename());
			file.transferTo(f);

			TipoArquivo tipoArquivo = this.definirTipoArquivo.definirTipoArquivo(f);

			if (tipoArquivo.compareTo(TipoArquivo.ZIP) == 0) {
				this.descompactadorService.descompactarArvoreDeDiretorio(f, destino);
				File[] listaArquivos = destino.listFiles();
				this.salvar(listaArquivos, importacao, cliente);
			} else if (tipoArquivo.compareTo(TipoArquivo.XML) == 0) {
				File[] temp = { f };
				this.salvar(temp, importacao, cliente);
			}

		}
		this.operacaoDiretorioService.apagarArquivos(destino);
		if (importacao.getListaNfe().isEmpty()) {
			throw new ConteudoVazioException("Arquivos importados sem conteudo válido");
		}
		this.dao.salvar(importacao);
	}

	private void salvar(File[] listaArquivos, Importacao importacao, Cliente cliente)
			throws ZipException, IllegalAccessException, InvocationTargetException {

		for (File arquivo : listaArquivos) {

			if (!arquivo.isDirectory()) {

				if (this.definirTipoArquivo.definirTipoArquivo(arquivo).compareTo(TipoArquivo.XML) == 0) {
					NotaFiscalEletronica nfe = this.leitorNFeService.lerDadosNfe(arquivo);

					if (nfe.getInfNfe().getEmit().getCnpj().equals(cliente.getCnpj())) {
						importacao.getListaNfe().add(nfe);
					}

				}

			} else {
				File[] lista = arquivo.listFiles();
				this.salvar(lista, importacao, cliente);
			}

		}

	}

	public List<RequestImportacao> listarImportacoes() {
		List<Importacao> lista = dao.listar();

		List<RequestImportacao> listaRequest = new ArrayList<>();
		for (Importacao importacao : lista) {
			RequestImportacao request = new RequestImportacao();
			request.setId(importacao.getId());
			request.setDescricao(importacao.getDescricao());
			listaRequest.add(request);
		}
		return listaRequest;
	}

	public void remover(Long id) {
		dao.removerPeloId(id);
	}

}
