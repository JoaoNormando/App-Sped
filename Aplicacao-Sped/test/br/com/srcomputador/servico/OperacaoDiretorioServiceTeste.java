package br.com.srcomputador.servico;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

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
	public void deveriaMoverOArquivoParaOLocalParametro() throws IOException { 
		File arquivo = new File("ArquivoDeTeste.txt");
		try {
			arquivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Path tempDirectory = Files.createTempDirectory("DiretorioArquivo");
		boolean movido = operacao.moverArquivo(arquivo, new File(tempDirectory.toString()));
		Assert.assertTrue(movido);
	}
	
	
}
