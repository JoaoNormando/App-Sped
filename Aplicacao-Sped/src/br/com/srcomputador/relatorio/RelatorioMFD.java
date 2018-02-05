package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.srcomputador.mfd.entidade.RelatorioMfdDTO;
import br.com.srcomputador.servico.ConversorDataService;

public class RelatorioMFD extends Relatorio {

	private final String NOME_FOLHA = "Relatorio";
	private final String TEXTO_CONTEUDO_INEXISTENTE = "Conteudo inexistente.";
	private ConversorDataService conversorData;
	
	@Autowired
	public RelatorioMFD(ConversorDataService conversorData) {
		this.conversorData = conversorData;
	}
	
	public File gerarRelatorio(List<RelatorioMfdDTO> lista) throws IOException {
		this.criarCabecalho();
		this.defineEstiloCabecalho();
		this.escreve(lista);
		File relatorio = this.geraRelatorio("RelatorioMFD");
		return relatorio;
	}
	
	private void criarCabecalho() {
		SXSSFSheet folha = this.criaFolha(this.NOME_FOLHA);
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
	
	private int escreverRegistroE01(RelatorioMfdDTO mfd, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(mfd.getTipoRegistroE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getNumeroFabricacaoE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getMfAdicionalE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getTipoEcfE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getMarcaE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getModeloE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getNumeroEcfE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getCnpjUsuarioE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getCrzInicialE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getCrzFinalE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(mfd.getDataInicialE01()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(mfd.getDataFinalE01()), linha, coluna);
		return coluna;
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
	
	private int escreverRegistroE02(RelatorioMfdDTO mfd, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(mfd.getCnpjE02(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getInscricaoEstadualE02(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getNomeContribuinteE02(), linha, coluna);
		return coluna;
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
	
	private int escreverRegistroE14(RelatorioMfdDTO mfd, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(mfd.getTipoRegistroE14(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(mfd.getDataInicioEmissaoE14()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getValorTotalDoDocumentoE14(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getValorDoDescontoE14(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getValorAcrescimoPercAplicadoE14(), linha, coluna);
		coluna = this.criaEEscreveNaCelulaComFormatacaoMonetaria(mfd.getValorTotalLiquidoE14(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getIndicadorDeCancelamentoE14(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getValorCancelamentoE14(), linha, coluna);
		return coluna;
	}
	
	private Cabecalho getCabecalhoE15() {
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
	
	private int escreverRegistroE15(RelatorioMfdDTO mfd, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(mfd.getTipoRegistroE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getNumeroDoItemE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getCodigoDoProdutoE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getDescricaoProdutoE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getQuantidadeComercializadaE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getUnidadeMedidaE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getValorUnitarioE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getValorDescontoE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getValorAcrescimoE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getValorTotalLiquidoE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getCodTotalizadorParcialE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getQuantidadeCanceladaE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getValorCanceladoE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getValorCanceladoAcrescimoE15(), linha, coluna);
		return coluna;
	}
		
	private int criaEEscreveNaCelula(String conteudo, SXSSFRow linha, int coluna) {
		SXSSFCell celula = linha.createCell(coluna);
		
		if(conteudo == null) celula.setCellValue(this.TEXTO_CONTEUDO_INEXISTENTE);
		else celula.setCellValue(conteudo);
		return ++coluna;
	}
	
	private int criaEEscreveNaCelula(double conteudo, SXSSFRow linha, int coluna) {
		SXSSFCell celula = linha.createCell(coluna);
		celula.setCellValue(conteudo);
		return ++coluna;
	}
	
	private int criaEEscreveNaCelulaComFormatacaoMonetaria(double conteudo, SXSSFRow linha, int coluna) {
		SXSSFCell celula = linha.createCell(coluna);
		CellStyle cellStyle = this.workbook.createCellStyle();

		DataFormat dataFormat = this.workbook.createDataFormat();
		cellStyle.setDataFormat(dataFormat.getFormat("(#,##0_);[Red](#,##0)"));
		
		celula.setCellStyle(cellStyle);

		celula.setCellValue(conteudo);
		return ++coluna;
	}
	
	// O valor unitario vem sem separacao de casas decimais
	// sendo assim � necess�rio andar uma casa a esquerda
	private int criaEEscreveNaCelulaValorUnitario(double conteudo, SXSSFRow linha, int coluna) {
		SXSSFCell celula = linha.createCell(coluna);
		double novoValor = conteudo/10;
		celula.setCellValue(novoValor);
		return ++coluna;
	}
	
	private void escreve(List<RelatorioMfdDTO> lista) {
		SXSSFSheet folha = this.recuperarFolha(this.NOME_FOLHA);
		int inicioLinhaDados = 2;
		for(int i = 0; i < lista.size(); i++) {
			int coluna = 0;
			SXSSFRow linha = folha.createRow(inicioLinhaDados + i);
			coluna = this.escreverRegistroE01(lista.get(i), linha, coluna);
			coluna = this.escreverRegistroE02(lista.get(i), linha, coluna);
			coluna = this.escreverRegistroE14(lista.get(i), linha, coluna);
			coluna = this.escreverRegistroE15(lista.get(i), linha, coluna);
		}
		
	}
	


}
