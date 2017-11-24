package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.persistencia.ImportacaoDao;
import br.com.srcomputador.nfe.persistencia.NotaFiscalEletronicaDao;
import br.com.srcomputador.servico.DescompactadorService;
import net.lingala.zip4j.exception.ZipException;

@Service
public class NotaFiscalEletronicaService {

	private NotaFiscalEletronicaDao nfeDao;
	private ImportacaoDao descricaoDao;
	private LeitorNFeService leitorNFeService;
	private DescompactadorService descompactadorService;

	@Autowired
	public NotaFiscalEletronicaService(NotaFiscalEletronicaDao nfeDao, LeitorNFeService leitorNFeService,
			DescompactadorService descompactadorService, ImportacaoDao descricaoDao) {
		this.nfeDao = nfeDao;
		this.leitorNFeService = leitorNFeService;
		this.descompactadorService = descompactadorService;
		this.descricaoDao = descricaoDao;
	}

	public void salvarNfe(MultipartFile[] multiFile, String descricao)
			throws IllegalStateException, IOException, IllegalAccessException, InvocationTargetException {
		File temp = new File("NFes");
		Importacao importacao = new Importacao();
		List<NotaFiscalEletronica> lista = new ArrayList<>();
		importacao.setListaNfe(lista);
		importacao.setDescricao(descricao);
		for (MultipartFile f : multiFile) {
			f.transferTo(temp);
			NotaFiscalEletronica nfe = leitorNFeService.lerDadosNfe(temp);
			nfe.setImportacao(importacao);
			importacao.getListaNfe().add(nfe);
		}
		descricaoDao.salvar(importacao);
	}

	public void removerNfe(Long id) throws NullPointerException {
		nfeDao.removerPeloId(id);
	}

	public void removerNfe(String descricao) {
		nfeDao.removerPelaDescricao(descricao);
	}

	/**
	 * @throws IOException
	 * @throws IllegalStateException
	 * @throws ZipException
	 * @throws InvocationTargetException
	 * @throws IllegalAccessException
	 */
	public void salvarNfe(MultipartFile multiFile, String descricaoImportacao, String path)
			throws IllegalStateException, IOException, ZipException, IllegalAccessException, InvocationTargetException {
		File diretorio = new File("diretorio");
		multiFile.transferTo(diretorio);
		File destino = new File(path + File.pathSeparator + "Arquivos");
		this.descompactadorService.descompactarArquivoZip(diretorio, destino);

		File[] files = destino.listFiles();
		Importacao importacao = new Importacao();
		importacao.setDescricao(descricaoImportacao);
		for (File f : files) {
			NotaFiscalEletronica nfe = leitorNFeService.lerDadosNfe(f);
			nfe.setImportacao(importacao);
			importacao.getListaNfe().add(nfe);
			nfeDao.salvar(nfe);
		}

	}

}
