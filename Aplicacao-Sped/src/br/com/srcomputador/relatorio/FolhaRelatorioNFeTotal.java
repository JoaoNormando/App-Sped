package br.com.srcomputador.relatorio;

import java.util.List;

import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.srcomputador.nfe.entidade.Destinatario;
import br.com.srcomputador.nfe.entidade.Emitente;
import br.com.srcomputador.nfe.entidade.IcmsTotal;
import br.com.srcomputador.nfe.entidade.IdentificacaoDaNfe;
import br.com.srcomputador.nfe.entidade.InformacaoAdicional;
import br.com.srcomputador.nfe.entidade.InformacaoDaNfe;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.entidade.Total;
import br.com.srcomputador.servico.ConversorDataService;

@Component
public class FolhaRelatorioNFeTotal {

	private String nomeFolha = "Relatorio Total";
	
	private final String TEXTO_CONTEUDO_INEXISTENTE = "Conteudo inexistente.";
	private ConversorDataService conversorData;
	
	@Autowired
	public FolhaRelatorioNFeTotal(ConversorDataService conversorData) {
		this.conversorData = conversorData;
	}
	
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
	
	public int escreverDadosDaNFe(IdentificacaoDaNfe dados, IcmsTotal total, SXSSFRow linha, int coluna) {
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
		} else if(dados.getdSaiEnt() != null){
			coluna = this.criaEEscreveNaCelula(this.conversorData.transformarData(dados.getdSaiEnt()), linha, coluna);
		} else {
			coluna = this.criaEEscreveNaCelula(null, linha, coluna);
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
	
	public int escreverChaveDeAcesso(InformacaoDaNfe info, SXSSFRow linha, int coluna) {
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

	
	public int escreverEmitente(Emitente emit, SXSSFRow linha, int coluna) {
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
	
	public int escreverDestinatario(Destinatario dest, SXSSFRow linha, int coluna) {
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
			coluna = this.criaEEscreveNaCelula("UF nao encontrado", linha, coluna);
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
	
	public int escreveEmissao(IdentificacaoDaNfe ide, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(ide.getNatOp(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(ide.getTpNf(), linha, coluna);
		return coluna;
	}
	
	public Cabecalho getCabecalhoSituacaoAtual() {
		Cabecalho cabecalhoSituacaoAtual = new Cabecalho();
		cabecalhoSituacaoAtual.definirTitulo("Situacao Atual");
		cabecalhoSituacaoAtual.adicionarTexto("Situacao Atual");
		return cabecalhoSituacaoAtual;
	}
	
	public int escreveSituacaoAtual(SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(null, linha, coluna);
		return coluna;
	}
	
	public Cabecalho getCabecalhoDadosEmitenteAdicionais() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("Dados do Emitente");
		cabecalho
			.adicionarTexto("Municipio")
			.adicionarTexto("Codigo de Regime Tributario");
		
		return cabecalho;
	}
	
	public int escreveEmitenteAdicionais(Emitente emit, SXSSFRow linha, int coluna) {
		if(emit.getEnderEmit() == null) {
			coluna = this.criaEEscreveNaCelula(null, linha, coluna);
		} else {
			coluna = this.criaEEscreveNaCelula(emit.getEnderEmit().getxMun(), linha, coluna);
		}
		coluna = this.criaEEscreveNaCelula(emit.getCrt(), linha, coluna);
		return coluna;
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
	
	public int escreveDestinatarioAdicionais(Destinatario dest, SXSSFRow linha, int coluna) {
		if(dest == null) {
			coluna += 4;
			return coluna;
		}
		if(dest.getEnderDest() == null) {
			coluna = this.criaEEscreveNaCelula(null, linha, coluna);
			coluna = this.criaEEscreveNaCelula(null, linha, coluna);
		} else {
			coluna = this.criaEEscreveNaCelula(dest.getEnderDest().getxMun(), linha, coluna);
			coluna = this.criaEEscreveNaCelula(dest.getEnderDest().getxPais(), linha, coluna);
		}
		coluna = this.criaEEscreveNaCelula(dest.getIndIeDest(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(dest.getIsuf(), linha, coluna);
		return coluna;
	}

	public Cabecalho getCabecalhoTotais() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("Totais");
		cabecalho
			.adicionarTexto("Base de calculo ICMS")
			.adicionarTexto("Valor do ICMS")
			.adicionarTexto("Valor do ICMS Desonerado")
			.adicionarTexto("Base de calculo ICMS ST")
			.adicionarTexto("Valor ICMS Substituicao")
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
	
	public int escreveTotais(Total total, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvBc(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvIcms(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvIcmsDeson(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvBcSt(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvSt(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvProd(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvFrete(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvSeg(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvOutro(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvIpi(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvNf(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvDesc(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvII(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvPis(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvCofins(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvTotTrib(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvFcpUfDest(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvIcmsUfDest(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(total.getIcmsTot().getvIcmsUfRemet(), linha, coluna);
		return coluna;
	}
	
	public Cabecalho getCabecalhoInfoAdicional() {
		Cabecalho cabecalho = new Cabecalho();
		cabecalho.definirTitulo("Informacoes adicionais");
		cabecalho
			.adicionarTexto("Informacoes Complementares de Interesse do Contribuinte");
		return cabecalho;
	}	
	
	public int escreveInfoAdicional(InformacaoAdicional info, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(info.getInfCpl(), linha, coluna);
		return coluna;
	}
	
	private int criaEEscreveNaCelula(String conteudo, SXSSFRow linha, int coluna) {
		SXSSFCell celula = linha.createCell(coluna);
		
		if(conteudo == null) celula.setCellValue(this.TEXTO_CONTEUDO_INEXISTENTE);
		else celula.setCellValue(conteudo);
		return ++coluna;
	}
	
	private int criaEEscreveNaCelula(int conteudo, SXSSFRow linha, int coluna) {
		SXSSFCell celula = linha.createCell(coluna);
		celula.setCellValue(conteudo);
		return ++coluna;
	}
	
	private int criaEEscreveNaCelula(double conteudo, SXSSFRow linha, int coluna) {
		SXSSFCell celula = linha.createCell(coluna);
		celula.setCellValue(conteudo);
		return ++coluna;
	}
	
	public void escreve(List<NotaFiscalEletronica> listaNFe, SXSSFSheet sxssfSheet) {
		int inicioLinhaDados = 2;
		for(int i = 0; i < listaNFe.size(); i++) {
			int coluna = 0;
			SXSSFRow linha = sxssfSheet.createRow(inicioLinhaDados + i);
			coluna = this.escreverDadosDaNFe(listaNFe.get(i).getInfNfe().getIde(), listaNFe.get(i).getInfNfe().getTotal().getIcmsTot(), linha, coluna);
			coluna = this.escreverChaveDeAcesso(listaNFe.get(i).getInfNfe(), linha, coluna);
			coluna = this.escreverEmitente(listaNFe.get(i).getInfNfe().getEmit(), linha, coluna);
			coluna = this.escreverDestinatario(listaNFe.get(i).getInfNfe().getDest(), linha, coluna);
			coluna = this.escreveEmissao(listaNFe.get(i).getInfNfe().getIde(), linha, coluna);
			coluna = this.escreveSituacaoAtual(linha, coluna);
			coluna = this.escreveEmitenteAdicionais(listaNFe.get(i).getInfNfe().getEmit(), linha, coluna);
			coluna = this.escreveDestinatarioAdicionais(listaNFe.get(i).getInfNfe().getDest(), linha, coluna);
			coluna = this.escreveTotais(listaNFe.get(i).getInfNfe().getTotal(), linha, coluna);
			coluna = this.escreveInfoAdicional(listaNFe.get(i).getInfNfe().getInfAdic(), linha, coluna);
		}
	}
	
}
