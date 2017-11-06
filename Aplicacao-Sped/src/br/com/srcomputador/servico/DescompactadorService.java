package br.com.srcomputador.servico;

import java.io.File;

import org.springframework.stereotype.Service;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

@Service
public class DescompactadorService {

	private ZipFile zipFile;

	/**
	 * @throws ZipException
	 * 
	 */
	public void descompactarArquivoZip(File arquivo, File destino) throws ZipException {
		if (arquivo == null) {
			throw new NullPointerException("O arquivo esta nulo!");
		}

		zipFile = new ZipFile(arquivo);
		if (arquivo.isDirectory()) {
			File[] vetorArquivos = arquivo.listFiles();
			for (int i = 0; i < vetorArquivos.length; i++) {
				descompactarArquivoZip(vetorArquivos[i], destino);
			}
		}

		zipFile.extractAll(destino.getPath());
	}

}
