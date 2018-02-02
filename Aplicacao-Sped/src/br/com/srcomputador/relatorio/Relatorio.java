package br.com.srcomputador.relatorio;

import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellBorder.BorderSide;

public class Relatorio {
	
	protected XSSFWorkbook workbook;
	private XSSFCellStyle estiloCabecalho;
	private int numeroLinha = 0;
	
	private int inicioMerge = 0;
	private int finalMerge = -1;
	private XSSFRow linha;
	
	private XSSFRow linhaSubtitulo;
	private XSSFCellStyle estiloSubtitulo;
	
	public Relatorio() {
		this.workbook = new XSSFWorkbook();
		estiloCabecalho = this.workbook.createCellStyle();
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

	protected void geraCabecalho(XSSFSheet folha, Cabecalho cabecalho) {
		this.defineEstiloCabecalho();
	
		if(linha == null)linha = folha.createRow(numeroLinha);
		if(linhaSubtitulo == null)linhaSubtitulo = folha.createRow(numeroLinha + 1);
		
		if(cabecalho.getTitulo() != null && !cabecalho.getTitulo().isEmpty()) {
			finalMerge += cabecalho.ok().size();
			if(cabecalho.ok().size() > 1)
				folha.addMergedRegion(new CellRangeAddress(0, 0, inicioMerge, finalMerge));
			
			XSSFCell celula = linha.createCell(inicioMerge);
			celula.setCellStyle(estiloCabecalho);
			celula.setCellValue(cabecalho.getTitulo());
		}
				
		List<String> campos = cabecalho.getCampos();
		for(int i = 0; i< campos.size(); i++) {
			XSSFCell celula = linhaSubtitulo.createCell(i + inicioMerge);
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
	
	protected XSSFSheet recuperarFolha(String nomeFolha) {
		return this.workbook.getSheet(nomeFolha);
	}
	
	protected XSSFSheet criaFolha(String nomeFolha) {
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
		XSSFFont font = this.workbook.createFont();
		XSSFColor corLetra = new XSSFColor(Color.WHITE);
		font.setColor(corLetra);
		font.setBold(true);
		this.estiloCabecalho.setFont(font);
		
		// Cor do fundo do texto
		XSSFColor color = new XSSFColor(Color.BLACK);
		this.estiloCabecalho.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		this.estiloCabecalho.setFillBackgroundColor(color);
	}

	private void definirCabecalhoSubitutlo() {
		// Subtitulo
		
		// Cor da letra no texto subtitulo
		XSSFFont fonteSubtitulo = this.workbook.createFont();
		XSSFColor corLetraSubtitulo = new XSSFColor(Color.WHITE);
		fonteSubtitulo.setColor(corLetraSubtitulo);
		fonteSubtitulo.setBold(true);
		this.estiloSubtitulo.setFont(fonteSubtitulo);
		
		// Cor do fundo do texto no subtitulo
		XSSFColor corSubtitulo = new XSSFColor(new Color(89,89,89));
		this.estiloSubtitulo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		this.estiloSubtitulo.setFillForegroundColor(corSubtitulo);
		
		this.estiloSubtitulo.setBorderColor(BorderSide.BOTTOM, new XSSFColor(Color.WHITE));
		this.estiloSubtitulo.setBorderColor(BorderSide.TOP, new XSSFColor(Color.WHITE));
		this.estiloSubtitulo.setBorderColor(BorderSide.RIGHT, new XSSFColor(Color.WHITE));
		this.estiloSubtitulo.setBorderColor(BorderSide.LEFT, new XSSFColor(Color.WHITE));
		
		this.estiloSubtitulo.setBorderTop(BorderStyle.DOUBLE);
		this.estiloSubtitulo.setBorderRight(BorderStyle.MEDIUM);
		this.estiloSubtitulo.setBorderBottom(BorderStyle.MEDIUM);
		this.estiloSubtitulo.setBorderLeft(BorderStyle.MEDIUM);
		
		// Fim subtitulo
	}




}
