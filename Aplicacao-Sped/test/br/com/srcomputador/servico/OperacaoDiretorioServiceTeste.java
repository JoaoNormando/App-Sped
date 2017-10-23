package br.com.srcomputador.servico;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacaoDiretorioServiceTeste {

	private OperacaoDiretorioService operacao;
	private File destino;
	
	@Before
	public void setUp() {
		operacao = new OperacaoDiretorioService();
		destino = new File("/home/joao/Área de Trabalho/teste");
	}

	@Test
	public void deveriaMoverArquivo() {

		File arquivo = new File("ArquivoExemplo.txt");
		try {
			arquivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		operacao.moverArquivo(arquivo, destino);
		
		int quantidadeArquivos = destino.listFiles().length;
		Assert.assertTrue(quantidadeArquivos > 0);
	}

	public void deveriaLimparDiretorio() {
		
	}
	
}
