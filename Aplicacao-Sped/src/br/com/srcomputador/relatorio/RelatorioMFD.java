package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RelatorioMFD {
	
	private XSSFWorkbook workbook;
	
	public RelatorioMFD() {
		this.workbook = new XSSFWorkbook();
	}
	
	
	public File geraRelatorio(String nomeRelatorio) throws IOException {
		File file = new File(nomeRelatorio + ".xlsx");
		FileOutputStream outputStream = new FileOutputStream(file);
		this.workbook.write(outputStream);
		outputStream.flush();
		outputStream.close();
		return file;
	}

	public void geraCabecalho(XSSFSheet folha, int numeroLinha, List<String> campos) {
		XSSFRow linha = folha.createRow(numeroLinha);
	
		for(int i = 0; i< campos.size(); i++) {
			XSSFCell celula = linha.createCell(i);
			celula.setCellValue(campos.get(i));
		}
		
	}

	public  XSSFSheet recuperarFolha(String nomeFolha) {
		return this.workbook.getSheet(nomeFolha);
	}
	
	public XSSFSheet criaFolha(String nomeFolha) {
		return this.workbook.createSheet(nomeFolha);
	}
	
	
}
