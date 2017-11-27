package br.com.srcomputador.servico;

import java.io.File;

import org.springframework.stereotype.Service;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

@Service
public class OperacaoZipService {

	private ZipFile zipFile;

	/**
	 * @param destino
	 *            -> diretorio para onde será descompactado os arquivos
	 * 
	 * @throws ZipException
	 * @throws NullPointerException
	 *             - > Se o arquivo passado como parametro estiver nulo.
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

	public void descompactarArvoreDeDiretorio(File arquivo, File destino) throws ZipException {
		int i = 1;
		ZipFile zipService = new ZipFile(arquivo);
		zipService.extractAll(destino.getAbsolutePath());
		File[] lista = destino.listFiles();
		for (File arquivoDezipado : lista) {
			if (arquivoDezipado.getName().toLowerCase().endsWith(".zip")) {
				this.descompactarArvoreDeDiretorio(arquivoDezipado,
						new File(destino.getAbsolutePath() + File.separator + "parte" + i));
				arquivoDezipado.delete();
			}
			i++;
		}
	}

}
