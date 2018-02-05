package br.com.srcomputador.relatorio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.junit.After;
import org.junit.Test;

public class RelatorioTest {

	private String nomeRelatorio = "RelatorioMFD";
	private Relatorio relatorioMFD;
	
	@Test
	public void deveriaCriarUmRelatorioComUmaFolha() throws IOException {
		this.relatorioMFD = new Relatorio();
		this.relatorioMFD.criaFolha("Folha 01");
		this.relatorioMFD.geraRelatorio(this.nomeRelatorio);
		SXSSFSheet folha = this.relatorioMFD.recuperarFolha("Folha 01");
		assertTrue(folha != null);
	}

	/**
	 * Os campos definidos nesse teste � com base no documento passado pelo cliente
	 * no levantamendo de requisitos vers�o 1.0
	 * 
	 * @throws IOException
	 */
	@Test
	public void deveriaEscreverOCabecalhoMFD() throws IOException {
		relatorioMFD = new Relatorio();
		SXSSFSheet folha = relatorioMFD.criaFolha("Relatorio");
		
		Cabecalho c = new Cabecalho()
					.adicionarTexto("Texto1")
					.adicionarTexto("Texto2")
					.adicionarTexto("texto3");
		
		int posicaoLinha = 0;
		relatorioMFD.geraCabecalho(folha, c);
		String stringCellValue = folha.getRow(posicaoLinha).getCell(0).getStringCellValue();

		assertEquals("Texto1", stringCellValue);

	}

	@After
	public void removerRelatorio() {
		String r = this.nomeRelatorio + ".xlsx";
		File file = new File(r);
		if (file.exists())
			file.delete();
	}

}
