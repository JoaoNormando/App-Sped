package br.com.srcomputador.servico;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.HSSFWorkbookConfig;
import br.com.srcomputador.servico.relatorio.OperacaoRelatorioService;
import br.com.srcomputador.servico.relatorio.RelatorioExcelService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RelatorioExcelService.class, OperacaoRelatorioService.class, HSSFWorkbookConfig.class})
public class RelatorioExcelServiceTeste {
//	
//	@Autowired
//	private RelatorioExcelService relatorioExcelService;
//	
//	@Test
//	public void deveriaCriarUmArquivoExcel() throws IOException {
//		File relatorio = this.relatorioExcelService.gerarRelatorio("RelatorioBrugnara");
//		Assert.assertTrue(relatorio != null);
//		relatorio.delete();
//	}
//	
//	@Test
//	public void deveriaAdicionarUmaFolhaAUmArquivoExcel() throws IOException {
//		this.relatorioExcelService.criarFolha("Folha de exemplo");
//		File relatorio = this.relatorioExcelService.gerarRelatorio("Relatorio Exemplo");
//		HSSFSheet folha = this.relatorioExcelService.recuperarFolha("Folha de exemplo");
//		Assert.assertTrue(folha != null);
//		relatorio.delete();
//	}
//	
	
}
