package br.com.srcomputador.relatorio;

import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.srcomputador.mfd.entidade.RegistroE01;
import br.com.srcomputador.mfd.entidade.RegistroE02;
import br.com.srcomputador.mfd.entidade.RegistroE15;
import br.com.srcomputador.servico.ConversorDataService;

public class FolhaRelatorioMFDRegistroE15 {
	
	public final String NOME_FOLHA = "RegistroE15";
	private final String TEXTO_CONTEUDO_INEXISTENTE = "Conteudo inexistente.";	
	private ConversorDataService conversorData;
	
	@Autowired
	public FolhaRelatorioMFDRegistroE15(ConversorDataService conversorData) {
		this.conversorData = conversorData;
	}
	
	public Cabecalho getCabecalhoE01() {
		Cabecalho cabecalhoE01 = new Cabecalho();
		cabecalhoE01.definirTitulo("E01 - Identificacaoo do ECF");
		cabecalhoE01.adicionarTexto("Tipo do registro").adicionarTexto("Numero de fabricacao")
				.adicionarTexto("MF adicional").adicionarTexto("Tipo do ECF").adicionarTexto("Marca")
				.adicionarTexto("Modelo").adicionarTexto("Numero Sequencial do ECF").adicionarTexto("CNPJ do usuario")
				.adicionarTexto("CRZ inicial").adicionarTexto("CRZ final").adicionarTexto("Data Inicial")
				.adicionarTexto("Data final");
		return cabecalhoE01;
	}

	public int escreverRegistroE01(RegistroE01 e01, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(e01.getTipoRegistro(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e01.getNumeroFabricacao(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e01.getMfAdicional(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e01.getTipoEcf(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e01.getMarca(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e01.getModelo(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e01.getNumeroEcf(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e01.getCnpjUsuario(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e01.getCrzInicial(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e01.getCrzFinal(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(e01.getDataInicial()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(e01.getDataFinal()), linha, coluna);
		return coluna;
	}

	public Cabecalho getCabecalhoE02() {
		Cabecalho cabecalhoE02 = new Cabecalho();
		cabecalhoE02.definirTitulo("E02 - Identificacaoo do atual contribuinte usuario do ECF");
		cabecalhoE02.adicionarTexto("CNPJ").adicionarTexto("Inscricaoo Estadual").adicionarTexto("Nome do contribuinte");
		return cabecalhoE02;
	}
	
	public int escreverRegistroE02(RegistroE02 e02, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(e02.getCnpj(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e02.getInscricaoEstadual(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e02.getNomeContribuinte(), linha, coluna);
		return coluna;
	}
	
	public Cabecalho getCabecalhoE15() {
		Cabecalho cabecalhoE15 = new Cabecalho();
		cabecalhoE15.definirTitulo("E15 -  Detalhe do Cupom Fiscal, da Nota Fiscal de Venda a Consumidor ou do Bilhete de Passagem");
		cabecalhoE15
			.adicionarTexto("Tipo do registro")
			.adicionarTexto("Numero do item")
			.adicionarTexto("Cudigo do produto ou servico")
			.adicionarTexto("Descricao")
			.adicionarTexto("Quantidade")
			.adicionarTexto("Unidade")
			.adicionarTexto("Valor unitario")
			.adicionarTexto("Desconto sobre item")
			.adicionarTexto("Acrascimo sobre item")
			.adicionarTexto("Valor total liquido")
			.adicionarTexto("Totalizador parcial")
			.adicionarTexto("Quantidade cancelada")
			.adicionarTexto("Valor cancelado")
			.adicionarTexto("Cancelamento de Acrescimo no Item");
		return cabecalhoE15;
	}
	
	public int escreverRegistroE15(RegistroE15 e15, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(e15.getTipoRegistro(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getNumeroDoItem(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getCodigoDoProduto(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getDescricaoProduto(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getQuantidadeComercializada(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getUnidadeMedida(), linha, coluna);
		coluna = this.criaEEscreveNaCelulaValorUnitario(e15.getValorUnitario(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getValorDesconto(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getValorAcrescimo(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getValorTotalLiquido(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getCodTotalizadorParcial(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getQuantidadeCancelada(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getValorCancelado(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e15.getValorCanceladoAcrescimo(), linha, coluna);
		return coluna;
	}

	public void escreve(SXSSFSheet folha, List<RegistroE15> registros) throws IOException {
		int inicioLinha = 2;
		
		for(int i = 0; i < registros.size(); i++) {
			if( i % 100 == 0) {
				folha.flushRows(100);
			}
			int coluna = 0;
			SXSSFRow linha = folha.createRow(inicioLinha+ i);
			
			RegistroE01 e01 = registros.get(i).getMfd().getE01();
			RegistroE02 e02 = registros.get(i).getMfd().getE02();
			coluna = this.escreverRegistroE01(e01, linha, coluna);
			coluna = this.escreverRegistroE02(e02, linha, coluna);
			coluna = this.escreverRegistroE15(registros.get(i), linha, coluna);
		}
		
		
	}
	
	// O valor unitario vem sem separacao de casas decimais
	// sendo assim � necess�rio andar uma casa a esquerda
	private int criaEEscreveNaCelulaValorUnitario(double conteudo, SXSSFRow linha, int coluna) {
		SXSSFCell celula = linha.createCell(coluna);
		double novoValor = conteudo/10;
		celula.setCellValue(novoValor);
		return ++coluna;
	}
	
	private int criaEEscreveNaCelula(double conteudo, SXSSFRow linha, int coluna) {
		SXSSFCell celula = linha.createCell(coluna);
		celula.setCellValue(conteudo);
		return ++coluna;
	}

	private int criaEEscreveNaCelula(String conteudo, SXSSFRow linha, int coluna) {
		SXSSFCell celula = linha.createCell(coluna);
		
		if(conteudo == null) celula.setCellValue(this.TEXTO_CONTEUDO_INEXISTENTE);
		else celula.setCellValue(conteudo);
		return ++coluna;
	}
}
