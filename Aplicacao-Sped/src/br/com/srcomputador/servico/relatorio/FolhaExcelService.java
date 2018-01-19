package br.com.srcomputador.servico.relatorio;

import java.util.List;

import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.servico.relatorio.CabecalhoRelatorioExcel;

@Service
public class FolhaExcelService {

	private XSSFSheet criarFolha(XSSFWorkbook wb, String nomeFolha) {
		return wb.createSheet(nomeFolha);
	}

	public XSSFSheet criarFolha(XSSFWorkbook wb, String nomeFolha, List<CabecalhoRelatorioExcel> listaCabecalho) {
		XSSFSheet folha = this.criarFolha(wb, nomeFolha);
		XSSFCellStyle celulaDeEstilo = this.criarCelulaDeEstilo(wb);

		if (listaCabecalho == null) {
			return folha;
		}
		XSSFRow linhaTitulo = folha.createRow(0);
		this.realizarMergeCabecalho(listaCabecalho, folha, linhaTitulo, celulaDeEstilo);
		XSSFRow linhaCamposCabecalho = folha.createRow(1);
		int indiceColuna = 0;

		indiceColuna = popularCamposCabecalho(listaCabecalho, linhaCamposCabecalho, indiceColuna, celulaDeEstilo);

		return folha;

	}

	private int popularCamposCabecalho(List<CabecalhoRelatorioExcel> listaCabecalho, XSSFRow linhaCamposCabecalho,
			int indiceColuna, XSSFCellStyle celulaDeEstilo) {
		XSSFSheet folha = linhaCamposCabecalho.getSheet();
		int j = 0;
		for (int i = 0; i < listaCabecalho.size(); i++) {

			for (String s : listaCabecalho.get(i).getCampos()) {
				XSSFCell cell = linhaCamposCabecalho.createCell(indiceColuna);
				cell.setCellStyle(celulaDeEstilo);
				cell.setCellValue(s);
				indiceColuna++;
				folha.setColumnWidth(j, s.length()*400);
				j++;
			}

		}
		return indiceColuna;
	}

	private void realizarMergeCabecalho(List<CabecalhoRelatorioExcel> listaCabecalho, XSSFSheet folha,
			XSSFRow linhaTitulo, XSSFCellStyle celulaDeEstilo) {
		int mergeInicial = 0;
		int mergeFinal = 0;
		for (CabecalhoRelatorioExcel cabecalho : listaCabecalho) {
			mergeFinal += cabecalho.getCampos().size();

			if (cabecalho.getCampos().size() > 1) { // So pode ser feito o merge se tiver mais de 1 campo.
				folha.addMergedRegion(new CellRangeAddress(linhaTitulo.getRowNum(), linhaTitulo.getRowNum(),
						mergeInicial, mergeFinal - 1));
			}

			XSSFCell celula = linhaTitulo.createCell(mergeInicial);
			celula.setCellValue(cabecalho.getTitulo());
			celula.setCellStyle(celulaDeEstilo);
			mergeInicial += cabecalho.getCampos().size();
		}
	}

	private XSSFCellStyle criarCelulaDeEstilo(XSSFWorkbook wb) {
		XSSFCellStyle celula = wb.createCellStyle();

		XSSFFont fonte = wb.createFont();
		fonte.setColor(IndexedColors.WHITE.getIndex());
		fonte.setBold(true);
		celula.setFillForegroundColor(IndexedColors.BLACK.getIndex());
		celula.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		celula.setAlignment(HorizontalAlignment.CENTER);
		celula.setFont(fonte);
		return celula;
	}

}
