package br.com.srcomputador.relatorio;

import java.io.IOException;

import org.junit.Test;

public class RelatorioMFDTest {

	@Test
	public void deveCriarUmRelatorioComOCabecalhoPopulado() throws IOException {
		RelatorioMFD relatorio = new RelatorioMFD();
		relatorio.gerarRelatorio();
	}
	
	@Test
	public void deveriaEscreverNoRelatorio() {
		RelatorioMFD relatorio = new RelatorioMFD();

	}
	
}
