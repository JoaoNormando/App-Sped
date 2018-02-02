package br.com.srcomputador.relatorio;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

import br.com.srcomputador.nfe.entidade.Destinatario;
import br.com.srcomputador.nfe.entidade.Emitente;
import br.com.srcomputador.nfe.entidade.IcmsTotal;
import br.com.srcomputador.nfe.entidade.IdentificacaoDaNfe;
import br.com.srcomputador.nfe.entidade.InformacaoDaNfe;
import br.com.srcomputador.servico.ConversorDataService;

public class FolhaRelatorioNFeTotal {

	private String nomeFolha = "Relatorio Total";
	
	private final String TEXTO_CONTEUDO_INEXISTENTE = "Conteudo inexistente.";
	private ConversorDataService conversorData;
	
	public String getNomeFolha() {
		return this.nomeFolha;
	}
	
	public Cabecalho getCabecalhoDadosDaNFe() {
		Cabecalho cabecalhoDadosNFe = new Cabecalho();
		cabecalhoDadosNFe.definirTitulo("Dados da NF-e");
		cabecalhoDadosNFe
			.adicionarTexto("N NF")
			.adicionarTexto("Serie")
			.adicionarTexto("Modelo")
			.adicionarTexto("Data de emissao")
			.adicionarTexto("Data Saida/Entrada")
			.adicionarTexto("Valor Total da Nota Fiscal");
		return cabecalhoDadosNFe;
	}
	
	public int escreverDadosDaNFe(IdentificacaoDaNfe dados, IcmsTotal total, XSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(dados.getnNf(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(dados.getSerie(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(dados.getMod(), linha, coluna);
		if(dados.getDhEmi() != null) {
			coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(dados.getDhEmi()), linha, coluna);
		} else {
			coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(dados.getdEmi()), linha, coluna);
		}
		if(dados.getDhSaiEnt() != null) {
			coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(dados.getDhSaiEnt()), linha, coluna);
		} else {
			coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(dados.getdSaiEnt()), linha, coluna);
		}
		coluna = this.criaEEscreveNaCelula(total.getvNf(), linha, coluna);
		return coluna;
	}
	
	public Cabecalho getCabecalhoChaveDeAcesso() {
		Cabecalho cabecalhoChaveDeAcesso = new Cabecalho();
		cabecalhoChaveDeAcesso.definirTitulo("Chave de acesso");
		cabecalhoChaveDeAcesso
			.adicionarTexto("Chave de acesso");
		
		return cabecalhoChaveDeAcesso;
	}
	
	public int escreverChaveDeAcesso(InformacaoDaNfe info, XSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(info.getChaveAcesso(), linha, coluna);
		return coluna;
	}
	
	public Cabecalho getCabecalhoEmitente() {
		Cabecalho cabecalhoEmitente = new Cabecalho();
		cabecalhoEmitente.definirTitulo("Emitente");
		cabecalhoEmitente
			.adicionarTexto("CNPJ/CPF")
			.adicionarTexto("Nome/Razao Social")
			.adicionarTexto("Inscricao Estadual")
			.adicionarTexto("UF");
		return cabecalhoEmitente;
	}
	
	public int escreverEmitente(Emitente emit, XSSFRow linha, int coluna) {
		if(emit.getCnpj() != null) {
			coluna = this.criaEEscreveNaCelula(emit.getCnpj(), linha, coluna);
		} else {
			coluna = this.criaEEscreveNaCelula(emit.getCpf(), linha, coluna);
		}
		coluna = this.criaEEscreveNaCelula(emit.getxNome(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(emit.getIe(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(emit.getEnderEmit().getUf(), linha, coluna);
		return coluna;
	}
	
	public Cabecalho getCabecalhoDestinatario() {
		Cabecalho cabecalhoDestinatario = new Cabecalho();
		cabecalhoDestinatario.definirTitulo("Destinatario");
		cabecalhoDestinatario
			.adicionarTexto("CNPJ/CPF")
			.adicionarTexto("Nome/Razao Social")
			.adicionarTexto("Inscricao Estadual")
			.adicionarTexto("UF")
			.adicionarTexto("Destino da Operacao")
			.adicionarTexto("Consumidor final");
		return cabecalhoDestinatario;
	}
	
	public int escreverDestinatario(Destinatario dest, XSSFRow linha, int coluna) {
		if(dest == null) {
			return coluna += 6;
		}
		if(dest.getCnpj() != null) {
			coluna = this.criaEEscreveNaCelula(dest.getCnpj(), linha, coluna);
		} else {
			coluna = this.criaEEscreveNaCelula(dest.getCpf(), linha, coluna);
		}
		coluna = this.criaEEscreveNaCelula(dest.getxNome(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(dest.getIe(), linha, coluna);
		if(dest.getEnderDest() != null) {
			coluna = this.criaEEscreveNaCelula(dest.getEnderDest().getUf(), linha, coluna);
		} else {
			coluna = this.criaEEscreveNaCelula("UF não encontrado", linha, coluna);
		}
		coluna = this.criaEEscreveNaCelula(dest.getIndIeDest(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(dest.getIdEstrangeiro(), linha, coluna);
		return coluna;
	}
	
	public Cabecalho getCabecalhoEmissao() {
		Cabecalho cabecalhoEmissao = new Cabecalho();
		cabecalhoEmissao.definirTitulo("Emissao");
		cabecalhoEmissao
			.adicionarTexto("Natureza da operacao")
			.adicionarTexto("Tipo da operacao");
		return cabecalhoEmissao;
	}
	
	public Cabecalho getCabecalhoSituacaoAtual() {
		Cabecalho cabecalhoSituacaoAtual = new Cabecalho();
		cabecalhoSituacaoAtual.definirTitulo("Situacao Atual");
		cabecalhoSituacaoAtual.adicionarTexto("");
		return cabecalhoSituacaoAtual;
	}
	
	public Cabecalho getCabecalhoDadosEmitenteAdicionais() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("Dados do Emitente");
		cabecalho
			.adicionarTexto("Municipio")
			.adicionarTexto("Codigo de Regime Tributario");
		
		return cabecalho;
	}
	
	public Cabecalho getCabecalhoDadosDestinatarioAdicionais() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("Dados do Destinatario");
		cabecalho
			.adicionarTexto("Municipio")
			.adicionarTexto("Pais")
			.adicionarTexto("Indicador IE")
			.adicionarTexto("Inscricao SUFRAMA");
		return cabecalho;
	}

	public Cabecalho getCabecalhoTotais() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("Totais");
		cabecalho
			.adicionarTexto("Base de calculo ICMS")
			.adicionarTexto("Valor do ICMS")
			.adicionarTexto("Valor do ICMS Desonerado")
			.adicionarTexto("Base de calculo ICMS ST")
			.adicionarTexto("Valor ICMS Substituição")
			.adicionarTexto("Valor Total dos Produtos")
			.adicionarTexto("Valor do Frete")
			.adicionarTexto("Valor do Seguro")
			.adicionarTexto("Outras Despesas Acessorias")
			.adicionarTexto("Valor Total do IPI")
			.adicionarTexto("Valor Total da NFe")
			.adicionarTexto("Valor Total dos Descontos")
			.adicionarTexto("Valor Total do II")
			.adicionarTexto("Valor do PIS")
			.adicionarTexto("Valor da COFINS")
			.adicionarTexto("Valor Aproximado dos Tributos")
			.adicionarTexto("Valor Total ICMS FCP")
			.adicionarTexto("Valor Total ICMS Interestadual UF Destino")
			.adicionarTexto("Valor Total ICMS Interestadual UF Remetente");
		return cabecalho;
	}
	
	public Cabecalho getCabecalhoInfoAdicional() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("Informacoes adicionais");
		cabecalho
			.adicionarTexto("Informacoes Complementares de Interesse do Contribuinte");
		return cabecalho;
	}	
	
	private int criaEEscreveNaCelula(String conteudo, XSSFRow linha, int coluna) {
		XSSFCell celula = linha.createCell(coluna);
		
		if(conteudo == null) celula.setCellValue(this.TEXTO_CONTEUDO_INEXISTENTE);
		else celula.setCellValue(conteudo);
		return ++coluna;
	}
	
	private int criaEEscreveNaCelula(int conteudo, XSSFRow linha, int coluna) {
		XSSFCell celula = linha.createCell(coluna);
		celula.setCellValue(conteudo);
		return ++coluna;
	}
	
	private int criaEEscreveNaCelula(double conteudo, XSSFRow linha, int coluna) {
		XSSFCell celula = linha.createCell(coluna);
		celula.setCellValue(conteudo);
		return ++coluna;
	}
}
