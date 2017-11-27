package br.com.srcomputador.mfd.servico;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.srcomputador.mfd.entidade.MFD;
import br.com.srcomputador.mfd.persistencia.MfdDao;
import br.com.srcomputador.servico.OperacaoZipService;
import br.com.srcomputador.servico.OperacaoDiretorioService;
import net.lingala.zip4j.exception.ZipException;

@Service
public class ImportacaoMFDBanco {

	@Autowired
	private LeitorMFD leitorMfd;
	@Autowired
	private MfdDao dao;
	@Autowired
	private OperacaoZipService descompactador;
	@Autowired
	private OperacaoDiretorioService operacaoDiretorio;
	
	public void importar(MultipartFile[] vetorFiles) throws IllegalStateException, IOException {
		File temp = new File("Arquivo");

		for (MultipartFile file : vetorFiles) {
			if (file.getOriginalFilename().toLowerCase().endsWith(".txt")) {
				file.transferTo(temp);
				MFD mfd = leitorMfd.lerMfd(temp);
				dao.salvar(mfd);
			}
		}

	}

	public void importarZip(MultipartFile multipartFile, String path) throws IllegalStateException, IOException, ZipException {
		File file = new File("multipartFile");
		multipartFile.transferTo(file);
		
		File destino = new File(path);
		descompactador.descompactarArquivoZip(file, destino);
		
		String nomeDiretorio = multipartFile.getOriginalFilename().replaceAll(".zip", "");
		File diretorio = new File(destino.getAbsolutePath() + File.separator + nomeDiretorio);
		File[] listaArquivos = diretorio.listFiles();
		
		for(File arquivo : listaArquivos) {
			if(arquivo.getName().toLowerCase().endsWith(".txt")) {
				MFD mfd = leitorMfd.lerMfd(arquivo);
				dao.salvar(mfd);
			}
		}
		operacaoDiretorio.apagarArquivos(diretorio);
	}

}
