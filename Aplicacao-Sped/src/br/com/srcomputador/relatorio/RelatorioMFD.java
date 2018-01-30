package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
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
		XSSFSheet folha = this.criaFolha(this.NOME_FOLHA);
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
	
	private int escreverRegistroE01(RelatorioMfdDTO mfd, XSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(mfd.getTipoRegistroE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getNumeroFabricacaoE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getMfAdicionalE01()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getTipoEcfE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getMarcaE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getModeloE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getNumeroEcfE01()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getCnpjUsuarioE01(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getCrzInicialE01()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getCrzFinalE01()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(mfd.getDataInicialE01()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(mfd.getDataFinalE01()), linha, coluna);
		return coluna;
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
	
	private int escreverRegistroE02(RelatorioMfdDTO mfd, XSSFRow linha, int coluna) {
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
			.adicionarTexto("Data de início da emissão")
			.adicionarTexto("Subtotal do documento")
			.adicionarTexto("Desconto sobre subtotal")
			.adicionarTexto("Acréscimo sobre subtotal")
			.adicionarTexto("Valor Total Líquido")
			.adicionarTexto("Indicador de cancelamento")
			.adicionarTexto("Cancelamento de Acréscimo no Subtotal");
		return cabecalhoE14;
	}
	
	private int escreverRegistroE14(RelatorioMfdDTO mfd, XSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(mfd.getTipoRegistroE14(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(mfd.getDataInicioEmissaoE14()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getValorTotalDoDocumentoE14()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getValorDoDescontoE14()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getValorAcrescimoPercAplicadoE14()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getValorTotalLiquidoE14()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getIndicadorDeCancelamentoE14()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getValorCancelamentoE14()), linha, coluna);
		return coluna;
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
	
	private int escreverRegistroE15(RelatorioMfdDTO mfd, XSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(mfd.getTipoRegistroE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getNumeroDoItemE15()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getCodigoDoProdutoE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getDescricaoProdutoE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getQuantidadeComercializadaE15()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getUnidadeMedidaE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getValorUnitarioE15()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getValorDescontoE15()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getValorAcrescimoE15()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getValorTotalLiquidoE15()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(mfd.getCodTotalizadorParcialE15(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getQuantidadeCanceladaE15()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getValorCanceladoE15()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(String.valueOf(mfd.getValorCanceladoAcrescimoE15()), linha, coluna);
		return coluna;
	}
		
	private int criaEEscreveNaCelula(String conteudo, XSSFRow linha, int coluna) {
		XSSFCell celula = linha.createCell(coluna);
		
		if(conteudo == null) celula.setCellValue(this.TEXTO_CONTEUDO_INEXISTENTE);
		else celula.setCellValue(conteudo);
		return ++coluna;
	}
	
	private void escreve(List<RelatorioMfdDTO> lista) {
		XSSFSheet folha = this.recuperarFolha(this.NOME_FOLHA);
		int inicioLinhaDados = 2;
		for(int i = 0; i < lista.size(); i++) {
			int coluna = 0;
			XSSFRow linha = folha.createRow(inicioLinhaDados + i);
			coluna = this.escreverRegistroE01(lista.get(i), linha, coluna);
			coluna = this.escreverRegistroE02(lista.get(i), linha, coluna);
			coluna = this.escreverRegistroE14(lista.get(i), linha, coluna);
			coluna = this.escreverRegistroE15(lista.get(i), linha, coluna);
		}
		
	}
	


}
