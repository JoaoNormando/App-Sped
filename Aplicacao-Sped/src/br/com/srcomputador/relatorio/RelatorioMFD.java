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
		cabecalhoE01.definirTitulo("E01 - Identificação do ECF");
		cabecalhoE01
			.adicionarTexto("Tipo do registro")
			.adicionarTexto("Número de fabricação")
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
		cabecalhoE02.definirTitulo("E02 - Identificação do atual contribuinte usuário do ECF");
		cabecalhoE02
			.adicionarTexto("CNPJ")
			.adicionarTexto("Inscrição Estadual")
			.adicionarTexto("Nome do contribuinte");
		return cabecalhoE02;
	}
	
	private Cabecalho getCabecalhoE14() {
		Cabecalho cabecalhoE14 = new Cabecalho();
		cabecalhoE14.definirTitulo("E14 - Cupom Fiscal, Nota Fiscal de Venda a Consumidor ou Bilhete de Passagem");
		cabecalhoE14
			.adicionarTexto("Tipo do registro")
			.adicionarTexto("Data de início da emissão")
			.adicionarTexto("Subtotal do documento")
			.adicionarTexto("Desconto sobre subtotal")
			.adicionarTexto("Acréscimo sobre subtotal")
			.adicionarTexto("Valor Total Líquido")
			.adicionarTexto("Indicador de cancelamento")
			.adicionarTexto("Cancelamento de Acréscimo no Subtotal");
		return cabecalhoE14;
	}
	
	private Cabecalho getCabecalhoE15() {
		Cabecalho cabecalhoE15 = new Cabecalho();
		cabecalhoE15.definirTitulo("E15 -  Detalhe do Cupom Fiscal, da Nota Fiscal de Venda a Consumidor ou do Bilhete de Passagem");
		cabecalhoE15
			.adicionarTexto("Tipo do registro")
			.adicionarTexto("Número do item")
			.adicionarTexto("Código do produto ou serviço")
			.adicionarTexto("Descrição")
			.adicionarTexto("Quantidade")
			.adicionarTexto("Unidade")
			.adicionarTexto("Valor unitário")
			.adicionarTexto("Desconto sobre item")
			.adicionarTexto("Acréscimo sobre item")
			.adicionarTexto("Valor total líquido")
			.adicionarTexto("Totalizador parcial")
			.adicionarTexto("Quantidade cancelada")
			.adicionarTexto("Valor cancelado")
			.adicionarTexto("Cancelamento de Acréscimo no Item");
		return cabecalhoE15;
	}
	
}
