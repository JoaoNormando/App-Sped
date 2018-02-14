package br.com.srcomputador.relatorio;

import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.srcomputador.mfd.entidade.RegistroE01;
import br.com.srcomputador.mfd.entidade.RegistroE02;
import br.com.srcomputador.mfd.entidade.RegistroE14;
import br.com.srcomputador.servico.ConversorDataService;

@Component
public class FolhaRelatorioMFDRegistroE14 {

	public final String NOME_FOLHA = "RegistroE14";
	private ConversorDataService conversorData;

	private final String TEXTO_CONTEUDO_INEXISTENTE = "Conteudo inexistente.";
	
	@Autowired
	public FolhaRelatorioMFDRegistroE14(ConversorDataService conversorData) {
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
	
	public Cabecalho getCabecalhoE14() {
		Cabecalho cabecalhoE14 = new Cabecalho();
		cabecalhoE14.definirTitulo("E14 - Cupom Fiscal, Nota Fiscal de Venda a Consumidor ou Bilhete de Passagem");
		cabecalhoE14
			.adicionarTexto("Tipo do registro")
			.adicionarTexto("Data de inicio da emissao")
			.adicionarTexto("Subtotal do documento")
			.adicionarTexto("Desconto sobre subtotal")
			.adicionarTexto("Acrescimo sobre subtotal")
			.adicionarTexto("Valor Total Liquido")
			.adicionarTexto("Indicador de cancelamento")
			.adicionarTexto("Cancelamento de Acrescimo no Subtotal");
		return cabecalhoE14;
	}
	
	public int escreverRegistroE14(RegistroE14 e14, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(e14.getTipoRegistro(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(e14.getDataInicioEmissao()), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e14.getValorTotalDoDocumento(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e14.getValorDoDesconto(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e14.getValorAcrescimoPercAplicado(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e14.getValorTotalLiquido(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e14.getIndicadorDeCancelamento(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(e14.getValorCancelamento(), linha, coluna);
		return coluna;
	}

	public void escreve(SXSSFSheet folha, List<RegistroE14> registros) throws IOException {
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
			coluna = this.escreverRegistroE14(registros.get(i), linha, coluna);
		}
		
		
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
