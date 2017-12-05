package br.com.srcomputador.servico.relatorio;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.servico.relatorio.CabecalhoRelatorioExcel;

@Service
public class FolhaExcelService {

	private HSSFSheet criarFolha(HSSFWorkbook wb, String nomeFolha) {
		return wb.createSheet(nomeFolha);
	}

	public HSSFSheet criarFolha(HSSFWorkbook wb, String nomeFolha, List<CabecalhoRelatorioExcel> listaCabecalho) {
		HSSFSheet folha = this.criarFolha(wb, nomeFolha);
		HSSFCellStyle celulaDeEstilo = this.criarCelulaDeEstilo(wb);

		if (listaCabecalho == null) {
			return folha;
		}
		HSSFRow linhaTitulo = folha.createRow(0);
		this.realizarMergeCabecalho(listaCabecalho, folha, linhaTitulo, celulaDeEstilo);
		HSSFRow linhaCamposCabecalho = folha.createRow(1);
		int indiceColuna = 0;

		indiceColuna = popularCamposCabecalho(listaCabecalho, linhaCamposCabecalho, indiceColuna, celulaDeEstilo);

		return folha;

	}

	private int popularCamposCabecalho(List<CabecalhoRelatorioExcel> listaCabecalho, HSSFRow linhaCamposCabecalho,
			int indiceColuna, HSSFCellStyle celulaDeEstilo) {
		HSSFSheet folha = linhaCamposCabecalho.getSheet();
		int j = 0;
		for (int i = 0; i < listaCabecalho.size(); i++) {

			for (String s : listaCabecalho.get(i).getCampos()) {
				HSSFCell cell = linhaCamposCabecalho.createCell(indiceColuna);
				cell.setCellStyle(celulaDeEstilo);
				cell.setCellValue(s);
				indiceColuna++;
				folha.setColumnWidth(j, s.length()*400);
				j++;
			}

		}
		return indiceColuna;
	}

	private void realizarMergeCabecalho(List<CabecalhoRelatorioExcel> listaCabecalho, HSSFSheet folha,
			HSSFRow linhaTitulo, HSSFCellStyle celulaDeEstilo) {
		int mergeInicial = 0;
		int mergeFinal = 0;
		for (CabecalhoRelatorioExcel cabecalho : listaCabecalho) {
			mergeFinal += cabecalho.getCampos().size();

			if (cabecalho.getCampos().size() > 1) { // So pode ser feito o merge se tiver mais de 1 campo.
				folha.addMergedRegion(new CellRangeAddress(linhaTitulo.getRowNum(), linhaTitulo.getRowNum(),
						mergeInicial, mergeFinal - 1));
			}

			HSSFCell celula = linhaTitulo.createCell(mergeInicial);
			celula.setCellValue(cabecalho.getTitulo());
			celula.setCellStyle(celulaDeEstilo);
			mergeInicial += cabecalho.getCampos().size();
		}
	}

	private HSSFCellStyle criarCelulaDeEstilo(HSSFWorkbook wb) {
		HSSFCellStyle celula = wb.createCellStyle();

		HSSFFont fonte = wb.createFont();
		fonte.setColor(IndexedColors.WHITE.getIndex());
		fonte.setBold(true);
		celula.setFillForegroundColor(IndexedColors.BLACK.getIndex());
		celula.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		celula.setAlignment(HorizontalAlignment.CENTER);
		celula.setFont(fonte);
		return celula;
	}

}
