package br.com.srcomputador.relatorio;

public class FolhaRelatorioNFeTotal {

	private String nomeFolha = "Relatorio Total";
	
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
	
	public Cabecalho getCabecalhoChaveDeAcesso() {
		Cabecalho cabecalhoChaveDeAcesso = new Cabecalho();
		cabecalhoChaveDeAcesso.definirTitulo("Chave de acesso");
		cabecalhoChaveDeAcesso
			.adicionarTexto("Chave de acesso");
		
		return cabecalhoChaveDeAcesso;
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
}
