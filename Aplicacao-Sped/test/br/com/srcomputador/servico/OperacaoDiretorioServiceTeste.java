package br.com.srcomputador.servico;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {OperacaoDiretorioService.class})
public class OperacaoDiretorioServiceTeste {
	
	@Autowired
	private OperacaoDiretorioService operacao;	
	
	@Test
	public void deveriaMoverOArquivoParaOLocalParametro() { 
		File arquivo = new File("ArquivoDeTeste.txt");
		try {
			arquivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File destino = new File("DiretorioArquivos");
		operacao.moverArquivo(arquivo, destino);
		
		int quantidadeArquivos = destino.listFiles().length;
		Assert.assertTrue(quantidadeArquivos > 0);
	}
	
	@Test
	public void deveriaLimparDiretorio() {
		File destino = new File("DiretorioArquivos");
		operacao.apagarArquivos(destino);
		Assert.assertTrue(destino.listFiles().length == 0);
	}
	
}
