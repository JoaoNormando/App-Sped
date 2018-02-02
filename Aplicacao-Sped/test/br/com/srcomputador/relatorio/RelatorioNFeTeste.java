package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class RelatorioNFeTeste {

	@Test
	public void deveriaEscreverNoRelatorio() throws IOException {
		RelatorioNFe relatorio = new RelatorioNFe();
		File file = relatorio.geraRelatorio();
		Assert.assertTrue(file.exists());
	}
	
}
