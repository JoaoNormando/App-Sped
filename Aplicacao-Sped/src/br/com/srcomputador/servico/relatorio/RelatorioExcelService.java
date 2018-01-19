package br.com.srcomputador.servico.relatorio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.servico.relatorio.CabecalhoRelatorioExcel;

@Service
public class RelatorioExcelService {

	private FolhaExcelService folhaExcelService;
	private XSSFWorkbook workbook;
	
	@Autowired
	public RelatorioExcelService(FolhaExcelService folhaExcelService, XSSFWorkbook workbook) {
		this.folhaExcelService = folhaExcelService;
		this.workbook = workbook;
	}
	
	public XSSFSheet criarFolha(String nomeFolha) {
		return this.folhaExcelService.criarFolha(this.workbook, nomeFolha, null);
	}

	public XSSFSheet criarFolha(String nomeFolha, List<CabecalhoRelatorioExcel> listaCabecalho) {
		return this.folhaExcelService.criarFolha(this.workbook, nomeFolha, listaCabecalho);
	}
	
	public File gerarRelatorio(String relatorioNome) throws IOException {
		File file = new File(relatorioNome + ".xlsx");
		FileOutputStream outputStream = new FileOutputStream(file);
		this.workbook.write(outputStream);
		outputStream.close();
		return file;
	}
	
	public XSSFSheet recuperarFolha(String nome) {
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
