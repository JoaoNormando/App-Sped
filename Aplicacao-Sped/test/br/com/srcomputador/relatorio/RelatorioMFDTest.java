package br.com.srcomputador.relatorio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.junit.After;
import org.junit.Test;

public class RelatorioMFDTest {

	private String nomeRelatorio = "RelatorioMFD";
	private RelatorioMFD relatorioMFD;
	
	@Test
	public void deveriaCriarUmRelatorioComUmaFolha() throws IOException {
		this.relatorioMFD = new RelatorioMFD();
		this.relatorioMFD.criaFolha("Folha 01");
		this.relatorioMFD.geraRelatorio(this.nomeRelatorio);
		XSSFSheet folha = this.relatorioMFD.recuperarFolha("Folha 01");
		assertTrue(folha != null);
	}

	/**
	 * Os campos definidos nesse teste é com base no documento passado pelo cliente
	 * no levantamendo de requisitos versão 1.0
	 * 
	 * @throws IOException
	 */
	@Test
	public void deveriaEscreverOCabecalhoMFD() throws IOException {
		relatorioMFD = new RelatorioMFD();
		XSSFSheet folha = relatorioMFD.criaFolha("Relatorio");
		
		List<String> lista = new Cabecalho()
					.adicionarTexto("Texto1")
					.adicionarTexto("Texto2")
					.adicionarTexto("texto3")
					.ok();
		
		int posicaoLinha = 0;
		relatorioMFD.geraCabecalho(folha, posicaoLinha, lista);
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
