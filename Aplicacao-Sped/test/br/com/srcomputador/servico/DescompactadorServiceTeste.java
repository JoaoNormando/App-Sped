package br.com.srcomputador.servico;

import java.io.File;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import net.lingala.zip4j.exception.ZipException;

public class DescompactadorServiceTeste {

	private DescompactadorService descompactador;
	private File destino;
	@Before
	public void setUp() {
		descompactador = new DescompactadorService();
		destino = new File("/home/joao/Área de Trabalho/teste");
	}
	
	public void deveriaDescompactarOArquivo() {
		File arquivo = new File("/home/joao/Área de Trabalho/100.zip");
		
		try {
			descompactador.descompactarArquivoZip(arquivo, destino);
		} catch (ZipException e) {
			e.printStackTrace();
		}
		int tamanho = destino.listFiles().length;
		Assert.assertTrue(tamanho > 0);
	}
	
	@After
	public void limparDiretorio() {
		
	}
	
}
