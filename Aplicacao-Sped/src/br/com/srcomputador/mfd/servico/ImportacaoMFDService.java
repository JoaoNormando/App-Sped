package br.com.srcomputador.mfd.servico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.entidade.ModulosImportacao;
import br.com.srcomputador.exception.ConteudoVazioException;
import br.com.srcomputador.importacao.persistencia.ImportacaoDao;
import br.com.srcomputador.mfd.entidade.MFD;
import br.com.srcomputador.servico.DefinirTipoArquivoService;
import br.com.srcomputador.servico.OperacaoDiretorioService;
import br.com.srcomputador.servico.OperacaoZipService;
import br.com.srcomputador.servico.TipoArquivo;
import net.lingala.zip4j.exception.ZipException;

@Service
public class ImportacaoMFDService {

	private ImportacaoDao importacaoDao;
	private LeitorMFD leitorMFD;
	private DefinirTipoArquivoService tipoArquivoService;
	private OperacaoZipService operacaoZip;
	private OperacaoDiretorioService operacaoDiretorioService;

	@Autowired
	public ImportacaoMFDService(ImportacaoDao importacaoDao, LeitorMFD leitorMFD, DefinirTipoArquivoService tipoArquivoService,
			OperacaoZipService operacaoZip, OperacaoDiretorioService operacaoDiretorioService) {
		this.importacaoDao = importacaoDao;
		this.leitorMFD = leitorMFD;
		this.tipoArquivoService = tipoArquivoService;
		this.operacaoZip = operacaoZip;
		this.operacaoDiretorioService = operacaoDiretorioService;
	}
	
	public void importar(String descricao, Cliente cliente, MultipartFile[] arquivos, String path) throws IllegalStateException, IOException, ZipException {
		
		Importacao importacao = new Importacao();
		importacao.setDescricao(descricao);
		importacao.setCliente(cliente);
		importacao.setModulo(ModulosImportacao.MFD);
		importacao.setListaMFD(new ArrayList<MFD>());
		
		File file;
		for(MultipartFile arquivo : arquivos) {
			
			file = new File(path + File.separator + arquivo.getOriginalFilename());
			arquivo.transferTo(file);
			
			TipoArquivo tipoArquivo = this.tipoArquivoService.definirTipoArquivo(file);
			
			if(tipoArquivo.equals(TipoArquivo.ZIP)) {
				this.importarArquivoZip(file, importacao, path);
			} else if (tipoArquivo.equals(TipoArquivo.TXT)) {
				adicionarMfdNaImportacao(importacao, file);			
			}
		}
		
		if(importacao.getListaMFD().isEmpty()) throw new ConteudoVazioException("Nenhum arquivo valido encontrado");
		this.importacaoDao.salvar(importacao);
		
	}

	private void adicionarMfdNaImportacao(Importacao importacao, File file) throws FileNotFoundException {
		MFD mfd = this.leitorMFD.lerMfd(file);
		
		if(mfd.getE01() != null) {
			mfd.setImportacao(importacao);
			importacao.getListaMFD().add(mfd);
		}
	}
	
	
	private void importarArquivoZip(File file, Importacao importacao, String path) throws FileNotFoundException, ZipException {
		
		File destino = new File(path + File.separator + "Destino");
		this.operacaoZip.descompactarArvoreDeDiretorio(file, destino);
		
		File[] arquivos = destino.listFiles();
		for(File arquivo : arquivos) {
			adicionarMfdNaImportacao(importacao, arquivo);
		}
		
		this.operacaoDiretorioService.apagarArquivos(destino);
	}
	
}
