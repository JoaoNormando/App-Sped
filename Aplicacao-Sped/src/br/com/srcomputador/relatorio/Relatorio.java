package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;


public class Relatorio {
	
	protected SXSSFWorkbook workbook;
	private CellStyle estiloCabecalho;
	private int numeroLinha = 0;
	
	private int inicioMerge = 0;
	private int finalMerge = -1;
	private SXSSFRow linha;
	
	private SXSSFRow linhaSubtitulo;
	private CellStyle estiloSubtitulo;
	
	public Relatorio() {
		this.workbook = new SXSSFWorkbook(100);
		this.estiloCabecalho = this.workbook.createCellStyle();
		this.estiloSubtitulo = this.workbook.createCellStyle();
		this.defineEstiloCabecalho();
	}
	
	
	protected File geraRelatorio(String nomeRelatorio) throws IOException {
		File file = new File(nomeRelatorio + ".xlsx");
		FileOutputStream outputStream = new FileOutputStream(file);
		this.workbook.write(outputStream);
		outputStream.flush();
		outputStream.close();
		return file;
	}

	protected void geraCabecalho(SXSSFSheet folha, Cabecalho cabecalho) {
		this.defineEstiloCabecalho();
	
		if(linha == null)linha = folha.createRow(numeroLinha);
		if(linhaSubtitulo == null)linhaSubtitulo = folha.createRow(numeroLinha + 1);
		
		if(cabecalho.getTitulo() != null && !cabecalho.getTitulo().isEmpty()) {
			finalMerge += cabecalho.ok().size();
			if(cabecalho.ok().size() > 1)
				folha.addMergedRegion(new CellRangeAddress(0, 0, inicioMerge, finalMerge));
			
			SXSSFCell celula = linha.createCell(inicioMerge);
			celula.setCellStyle(estiloCabecalho);
			celula.setCellValue(cabecalho.getTitulo());
		}
				
		List<String> campos = cabecalho.getCampos();
		for(int i = 0; i< campos.size(); i++) {
			SXSSFCell celula = linhaSubtitulo.createCell(i + inicioMerge);
			celula.setCellStyle(this.estiloSubtitulo);
			celula.setCellValue(campos.get(i));
			folha.setColumnWidth(i + inicioMerge, (campos.get(i).length() * 340));
		}
		
		inicioMerge = finalMerge + 1;
	}

	protected void limparIndices() {
		this.linha = null;
		this.linhaSubtitulo = null;
		this.inicioMerge = 0;
		this.finalMerge = -1;
	}
	
	protected void removerFolha(String nomeFolha) {
		SXSSFSheet sheet = this.recuperarFolha(nomeFolha);

		if(sheet != null) 
			this.workbook.removeSheetAt(this.workbook.getSheetIndex(sheet));
		
	}
	
	protected SXSSFSheet recuperarFolha(String nomeFolha) {
		return this.workbook.getSheet(nomeFolha);
	}
	
	protected SXSSFSheet criaFolha(String nomeFolha) {
		return this.workbook.createSheet(nomeFolha);
	}
	
	protected void defineEstiloCabecalho() {

		definirCabecalhoTitulo();
		definirCabecalhoSubitutlo();
		
		// Alinhamento do texto
		this.estiloCabecalho.setVerticalAlignment(VerticalAlignment.CENTER);
		this.estiloCabecalho.setAlignment(HorizontalAlignment.CENTER);
		
	}

	private void definirCabecalhoTitulo() {
		// Cor da letra no texto
		Font font = this.workbook.createFont();
		font.setColor(IndexedColors.WHITE.getIndex());
		font.setBold(true);
		this.estiloCabecalho.setFont(font);
		
		// Cor do fundo do texto
		this.estiloCabecalho.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		this.estiloCabecalho.setFillBackgroundColor(IndexedColors.BLACK.getIndex());
		
	}

	private void definirCabecalhoSubitutlo() {
		// Subtitulo
		
		// Cor da letra no texto subtitulo
		Font fonteSubtitulo = this.workbook.createFont();
		
		fonteSubtitulo.setColor(IndexedColors.WHITE.getIndex());
		fonteSubtitulo.setBold(true);
		this.estiloSubtitulo.setFont(fonteSubtitulo);
		
		// Cor do fundo do texto no subtitulo
		
		this.estiloSubtitulo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		this.estiloSubtitulo.setFillForegroundColor(IndexedColors.GREY_40_PERCENT.getIndex());
		
		this.estiloSubtitulo.setBottomBorderColor(IndexedColors.WHITE.getIndex());
		this.estiloSubtitulo.setTopBorderColor(IndexedColors.WHITE.getIndex());
		this.estiloSubtitulo.setRightBorderColor(IndexedColors.WHITE.getIndex());
		this.estiloSubtitulo.setLeftBorderColor(IndexedColors.WHITE.getIndex());
		
		this.estiloSubtitulo.setBorderTop(BorderStyle.DOUBLE);
		this.estiloSubtitulo.setBorderRight(BorderStyle.MEDIUM);
		this.estiloSubtitulo.setBorderBottom(BorderStyle.MEDIUM);
		this.estiloSubtitulo.setBorderLeft(BorderStyle.MEDIUM);
		
		// Fim subtitulo
	}




}
