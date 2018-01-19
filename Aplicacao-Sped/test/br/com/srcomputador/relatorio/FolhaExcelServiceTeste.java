package br.com.srcomputador.relatorio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.XSSFWorkbookConfig;
import br.com.srcomputador.nfe.servico.relatorio.CabecalhoRelatorioExcel;
import br.com.srcomputador.servico.relatorio.FolhaExcelService;
import br.com.srcomputador.servico.relatorio.RelatorioExcelService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {FolhaExcelService.class, RelatorioExcelService.class, XSSFWorkbookConfig.class})
public class FolhaExcelServiceTeste {

	@Autowired
	private RelatorioExcelService excelService;
	
	@Test
	public void deveriaCriarUmaFolha() throws IOException {
		String nomeDaFolha = "Relatorio 01";
		this.excelService.criarFolha(nomeDaFolha);
		XSSFSheet folha = this.excelService.recuperarFolha(nomeDaFolha);
		Assert.assertEquals(nomeDaFolha, folha.getSheetName());
	}
	
	@Test
	public void deveriaCriarUmCabecalho() throws IOException {
		List<CabecalhoRelatorioExcel> lista = new ArrayList<>();
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel01 = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel01.setTitulo("Titulo 01");
		cabecalhoRelatorioExcel01.setCampos(new ArrayList<String>() {
			private static final long serialVersionUID = 1L;

			{
				add("Campo 01");
				add("Campo 02");
				add("Campo 03");
				add("Campo 04");
			}
		});
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel02 = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel02.setTitulo("Titulo 02");
		cabecalhoRelatorioExcel02.setCampos(new ArrayList<String>() {
			private static final long serialVersionUID = 1L;

			{
				add("Campo 01");
				add("Campo 02");
				add("Campo 03");
			}
		});
		lista.add(cabecalhoRelatorioExcel01);
		lista.add(cabecalhoRelatorioExcel02);
		this.excelService.criarFolha("Relatorio Produto", lista);
		this.excelService.gerarRelatorio("Relatorio");
	}
	
	
}
