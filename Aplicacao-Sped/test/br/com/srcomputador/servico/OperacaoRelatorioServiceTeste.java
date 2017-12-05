package br.com.srcomputador.servico;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.HSSFWorkbookConfig;
import br.com.srcomputador.servico.relatorio.OperacaoRelatorioService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {OperacaoRelatorioService.class, HSSFWorkbookConfig.class})
public class OperacaoRelatorioServiceTeste {
//
//	@Autowired
//	private HSSFWorkbook workbook;
//	@Autowired
//	private OperacaoRelatorioService service;
//	
//	@Test
//	public void deveriaCriarUmaFolhaComCabecalhoPreenchido() throws IOException {
//		File f = new File("RelatorioTeste.xls");
//		List<String> lista = new ArrayList<>();
//		lista.add("Campo 01");
//		lista.add("Campo 02");
//		lista.add("Campo 03");
//		CabecalhoRelatorioExcel excel = new CabecalhoRelatorioExcel();
//		excel.setTitulo("Cabecalho 01");
//		excel.setCampos(lista);
//		service.criarFolha(workbook, "Folha 01", excel);
//		workbook.write(f);
//	}
//	
}
