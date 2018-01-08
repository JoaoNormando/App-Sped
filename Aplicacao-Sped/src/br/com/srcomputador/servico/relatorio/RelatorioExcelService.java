package br.com.srcomputador.servico.relatorio;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.servico.relatorio.CabecalhoRelatorioExcel;

@Service
public class RelatorioExcelService {

	private FolhaExcelService folhaExcelService;
	private HSSFWorkbook workbook;
	
	@Autowired
	public RelatorioExcelService(FolhaExcelService folhaExcelService, HSSFWorkbook workbook) {
		this.folhaExcelService = folhaExcelService;
		this.workbook = workbook;
	}
	
	public HSSFSheet criarFolha(String nomeFolha) {
		return this.folhaExcelService.criarFolha(this.workbook, nomeFolha, null);
	}

	public HSSFSheet criarFolha(String nomeFolha, List<CabecalhoRelatorioExcel> listaCabecalho) {
		return this.folhaExcelService.criarFolha(this.workbook, nomeFolha, listaCabecalho);
	}
	
	public File gerarRelatorio(String relatorioNome) throws IOException {
		File file = new File(relatorioNome + ".xls");
		this.workbook.write(file);
		return file;
	}
	
	public HSSFSheet recuperarFolha(String nome) {
		return this.workbook.getSheet(nome);
	}

	public void removerArquivo() throws IOException {
		int num = this.workbook.getNumberOfSheets();
		for(int i = 0; i< num; i++) {
			this.workbook.removeSheetAt(0);
		}
		this.workbook.close();
	}
	
}
