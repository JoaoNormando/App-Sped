package br.com.srcomputador.servico;

import org.springframework.stereotype.Service;

@Service
public class OperacaoRelatorioService {

//	public HSSFSheet criarFolha(HSSFWorkbook wb, String fileName) {
//		HSSFSheet sheet = wb.createSheet(fileName);
//		return sheet;
//	}
//
//	public HSSFSheet criarFolha(HSSFWorkbook wb, String fileName, List<String> cabecalho) {
//		HSSFSheet sheet = wb.createSheet(fileName);
//		HSSFRow row = sheet.createRow(0);
//		for (int i = 0; i < cabecalho.size(); i++) {
//			HSSFCell cell = row.createCell(i);
//			cell.setCellValue(cabecalho.get(i));
//		}
//		return sheet;
//	}
//
//	public HSSFSheet criarFolha(HSSFWorkbook wb, String fileName, CabecalhoRelatorioExcel cabecalho) {
//		HSSFSheet sheet = wb.createSheet(fileName);
//		HSSFRow row = sheet.createRow(0);
//		sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, cabecalho.getCampos().size() - 1));
//
//		HSSFCellStyle cellStyle = wb.createCellStyle();
//		cellStyle.setAlignment(HorizontalAlignment.CENTER);
//
//		HSSFCell cell = row.createCell(0);
//		cell.setCellValue(cabecalho.getTitulo());
//		cell.setCellStyle(cellStyle);
//
//		this.metodo(cabecalho.getCampos(), sheet, 1);
//		return sheet;
//	}
//
//	public void criar(HSSFWorkbook wb, String tituloFolha, List<CabecalhoRelatorioExcel> listaCabecalho) {
//		HSSFSheet folha = wb.createSheet(tituloFolha);
//		HSSFRow linhaTituloCabecalho = folha.createRow(0);
//		
//		int inicioDoMerge = 0;
//		int fimDoMerge = 0;
//		for(CabecalhoRelatorioExcel cre : listaCabecalho) {
//			fimDoMerge += cre.getCampos().size();
//			folha.addMergedRegion(new CellRangeAddress(0, 0, inicioDoMerge, fimDoMerge));
//			inicioDoMerge += fimDoMerge;
//		}
//		
//	}
//	
//	
//	
//	private void metodo(List<String> cabecalho, HSSFSheet sheet, int indexRow) {
//		HSSFRow row = sheet.createRow(indexRow);
//		for(int i = 0; i < cabecalho.size(); i++) {
//			HSSFCell cell = row.createCell(i);
//			cell.setCellValue(cabecalho.get(i));
//		}
//	}
}
