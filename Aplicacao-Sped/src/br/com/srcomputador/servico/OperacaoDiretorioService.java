package br.com.srcomputador.servico;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class OperacaoDiretorioService {

	/**
	 * Move o arquivo para o seu local de destino
	 * 
	 * @param arquivo
	 *            -> Arquivo que será movido
	 * @param destino
	 *            -> Local para onde o arquivo será movido
	 * 
	 */
	public void moverArquivo(File arquivo, File destino) {
		arquivo.renameTo(new File(destino + File.separator + arquivo.getName()));
	}

	
	public void moverArquivo(MultipartFile arquivo, File destino) throws IllegalStateException, IOException {
		File temp = new File(destino + File.separator + arquivo.getName());
		
		if(!temp.exists()) {
			temp.mkdirs();
		}
		
		arquivo.transferTo(new File(destino + File.separator + arquivo.getName()));
		arquivo.transferTo(new File("DiretorioArquivos"));
	}

	/**
	 * @param diretorio
	 *            -> Diretorio que será totalmente limpado
	 */
	public void apagarArquivos(File diretorio) {
	
		if (diretorio.isDirectory()) {
			File[] vetorArquivos = diretorio.listFiles();
			for (int i = 0; i < vetorArquivos.length; i++) {
				apagarArquivos(vetorArquivos[i]);
			}
		}
			diretorio.delete();
	}
}
