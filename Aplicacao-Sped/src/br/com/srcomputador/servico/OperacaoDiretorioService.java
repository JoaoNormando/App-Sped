package br.com.srcomputador.servico;

import java.io.File;

import org.springframework.stereotype.Service;

@Service
public class OperacaoDiretorioService {

	/**
	 * Move o arquivo para o seu local de destino
	 * 
	 * @param arquivo -> Arquivo que será movido
	 * @param destino -> Local para onde o arquivo será movido
	 * 
	 * */
	public void moverArquivo(File arquivo, File destino) {		
		arquivo.renameTo(new File(destino+File.separator + arquivo.getName()));
	}
	
	/**
	 * @param diretorio -> Diretorio que será totalmente limpado
	 * */
	public void apagarArquivos(File diretorio) {
		
	}
}
