package br.com.srcomputador.servico;

import org.springframework.stereotype.Service;

@Service
public class RelatorioExcelService {
//
//	private OperacaoRelatorioService operacaoRelatorioService;
//	private HSSFWorkbook workbook;
//	
//	@Autowired
//	public RelatorioExcelService(OperacaoRelatorioService operacaoRelatorioService, HSSFWorkbook workbook) {
//		this.operacaoRelatorioService = operacaoRelatorioService;
//		this.workbook = workbook;
//	}
//	
//	public HSSFSheet criarFolha(String folhaNome) {
//		return this.operacaoRelatorioService.criarFolha(this.workbook, folhaNome);
//	}
//	
//	public HSSFSheet criarFolha(String folhaNome, List<String> cabecalho) {
//		return this.operacaoRelatorioService.criarFolha(this.workbook, folhaNome, cabecalho);
//	}
//	
//	public File gerarRelatorio(String relatorioNome) throws IOException {
//		File file = new File(relatorioNome + ".xls");
//		this.workbook.write(file);
//		return file;
//	}
//	
//	public HSSFSheet recuperarFolha(String nome) {
//		return this.workbook.getSheet(nome);
//	}
//	
}
