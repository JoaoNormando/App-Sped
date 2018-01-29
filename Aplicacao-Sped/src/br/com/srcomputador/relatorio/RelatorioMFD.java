package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class RelatorioMFD extends Relatorio {

	public File gerarRelatorio() throws IOException {
		this.criarCabecalho();
		this.defineEstiloCabecalho();
		File relatorio = this.geraRelatorio("RelatorioMFD");
		return relatorio;
	}
	
	public void criarCabecalho() {
		XSSFSheet folha = this.criaFolha("Relatorio");
		this.geraCabecalho(folha, this.getCabecalhoE01());
		this.geraCabecalho(folha, this.getCabecalhoE02());
		this.geraCabecalho(folha, this.getCabecalhoE14());
		this.geraCabecalho(folha, this.getCabecalhoE15());
	}
	
	private Cabecalho getCabecalhoE01() {
		Cabecalho cabecalhoE01 = new Cabecalho();
		cabecalhoE01.definirTitulo("E01 -�Identifica��o do ECF");
		cabecalhoE01
			.adicionarTexto("Tipo do registro")
			.adicionarTexto("N�mero de fabrica��o")
			.adicionarTexto("MF adicional")
			.adicionarTexto("Tipo do ECF")
			.adicionarTexto("Marca")
			.adicionarTexto("Modelo")
			.adicionarTexto("Numero Sequencial do ECF")
			.adicionarTexto("CNPJ do usuario")
			.adicionarTexto("CRZ inicial")
			.adicionarTexto("CRZ final")
			.adicionarTexto("Data Inicial")
			.adicionarTexto("Data final");
		return cabecalhoE01;
	}
	
	private Cabecalho getCabecalhoE02() {
		Cabecalho cabecalhoE02 = new Cabecalho();
		cabecalhoE02.definirTitulo("E02 - Identifica��o do atual contribuinte usu�rio do ECF");
		cabecalhoE02
			.adicionarTexto("CNPJ")
			.adicionarTexto("Inscri��o Estadual")
			.adicionarTexto("Nome do contribuinte");
		return cabecalhoE02;
	}
	
	private Cabecalho getCabecalhoE14() {
		Cabecalho cabecalhoE14 = new Cabecalho();
		cabecalhoE14.definirTitulo("E14 - Cupom Fiscal, Nota Fiscal de Venda a Consumidor ou Bilhete de Passagem");
		cabecalhoE14
			.adicionarTexto("Tipo do registro")
			.adicionarTexto("Data de in�cio da emiss�o")
			.adicionarTexto("Subtotal do documento")
			.adicionarTexto("Desconto sobre subtotal")
			.adicionarTexto("Acr�scimo sobre subtotal")
			.adicionarTexto("Valor Total L�quido")
			.adicionarTexto("Indicador de cancelamento")
			.adicionarTexto("Cancelamento de Acr�scimo no Subtotal");
		return cabecalhoE14;
	}
	
	private Cabecalho getCabecalhoE15() {
		Cabecalho cabecalhoE15 = new Cabecalho();
		cabecalhoE15.definirTitulo("E15 -  Detalhe do Cupom Fiscal, da Nota Fiscal de Venda a Consumidor ou do Bilhete de Passagem");
		cabecalhoE15
			.adicionarTexto("Tipo do registro")
			.adicionarTexto("N�mero do item")
			.adicionarTexto("C�digo do produto ou servi�o")
			.adicionarTexto("Descri��o")
			.adicionarTexto("Quantidade")
			.adicionarTexto("Unidade")
			.adicionarTexto("Valor unit�rio")
			.adicionarTexto("Desconto sobre item")
			.adicionarTexto("Acr�scimo sobre item")
			.adicionarTexto("Valor total l�quido")
			.adicionarTexto("Totalizador parcial")
			.adicionarTexto("Quantidade cancelada")
			.adicionarTexto("Valor cancelado")
			.adicionarTexto("Cancelamento de Acr�scimo no Item");
		return cabecalhoE15;
	}
	
}
