package br.com.srcomputador.relatorio;

public class FolhaRelatorioNFeProduto {

	private String nomeFolha = "Relatorio Produto";
	
	public String getNomeFolha() {
		return this.nomeFolha;
	}
	
	public Cabecalho getCabecalhoDadosDaNFe() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("Dados da NF-e");
		cabecalho
			.adicionarTexto("N NF")
			.adicionarTexto("Serie")
			.adicionarTexto("Modelo")
			.adicionarTexto("Data de emissao")
			.adicionarTexto("Data Saida/Entrada")
			.adicionarTexto("Valor Total da Nota Fiscal");
		return cabecalho;
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
	
	public Cabecalho getCabecalhoChaveDeAcesso() {
		Cabecalho cabecalhoChaveDeAcesso = new Cabecalho();
		cabecalhoChaveDeAcesso.definirTitulo("Chave de acesso");
		cabecalhoChaveDeAcesso
			.adicionarTexto("Chave de acesso");
		
		return cabecalhoChaveDeAcesso;
	}
	
	public Cabecalho getCabecalhoProdutosEServicos() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("Dados dos produtos e servicos");
		cabecalho
			.adicionarTexto("N Item")
			.adicionarTexto("Codigo Produto")
			.adicionarTexto("Descricao do Produto")
			.adicionarTexto("Codigo NCM")
			.adicionarTexto("CFOP")
			.adicionarTexto("Quantidade")
			.adicionarTexto("Valor Unitario")
			.adicionarTexto("Valor Produto");

		return cabecalho;
	}
	
	public Cabecalho getCabecalhoIcms() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("ICMS Normal e ST");
		cabecalho
			.adicionarTexto("Origem da Mercadoria")
			.adicionarTexto("Tributacao do ICMS")
			.adicionarTexto("Modalidade Definicao da BC ICMS Normal")
			.adicionarTexto("Base de Calculo ICMS Normal")
			.adicionarTexto("Aliquota do ICMS Normal")
			.adicionarTexto("Valor do ICMS Normal")
			.adicionarTexto("Base de Calculo do ICMS ST")
			.adicionarTexto("Aliquota do ICMS ST")
			.adicionarTexto("Valor do ICMS ST")
			.adicionarTexto("Percentual Reducao de BC do ICMS ST")
			.adicionarTexto("Percentual do MVA do ICMS ST")
			.adicionarTexto("Modalidade Definicao da BC ICMS ST");
		return cabecalho;
	}
	
	public Cabecalho getCabecalhoIpi() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("Impostos sobre Produtos Industrializados");
		cabecalho
			.adicionarTexto("Classe de Enquadramento")
			.adicionarTexto("Codigo Enquadramento")
			.adicionarTexto("Codigo do Selo")
			.adicionarTexto("Quantidade Selo")
			.adicionarTexto("CST")
			.adicionarTexto("Qtd Total Unidade Padrao")
			.adicionarTexto("Valor por Unidade")
			.adicionarTexto("Base de Calculo IPI")
			.adicionarTexto("Aliquota IPI")
			.adicionarTexto("Valor IPI");
		return cabecalho;
	}
	
	public Cabecalho getCabecalhoPis() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("PIS");
		cabecalho
			.adicionarTexto("CST PIS")
			.adicionarTexto("Base de Calculo PIS")
			.adicionarTexto("Aliquota PIS")
			.adicionarTexto("Valor PIS");	
		return cabecalho;
	}
	
	public Cabecalho getCabecalhoCofins() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("COFINS");
		cabecalho
			.adicionarTexto("CST COFINS")
			.adicionarTexto("Base de Calculo COFINS")
			.adicionarTexto("Aliquota COFINS")
			.adicionarTexto("Valor COFINS");
		return cabecalho;
	}
}
