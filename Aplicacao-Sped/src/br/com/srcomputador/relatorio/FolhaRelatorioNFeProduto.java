package br.com.srcomputador.relatorio;

import java.io.IOException;
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
import br.com.srcomputador.nfe.entidade.InformacaoDaNfe;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.entidade.detalheProduto.Cofins;
import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.Ipi;
import br.com.srcomputador.nfe.entidade.detalheProduto.Pis;
import br.com.srcomputador.servico.ConversorDataService;

@Component
public class FolhaRelatorioNFeProduto {
	
	private final String TEXTO_CONTEUDO_INEXISTENTE = "Conteudo inexistente.";
	private String nomeFolha = "Relatorio Produto";
	
	private ConversorDataService conversorData;
	
	@Autowired
	public FolhaRelatorioNFeProduto(ConversorDataService conversorData) {
		this.conversorData = conversorData;
	}
	
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
			coluna = this.criaEEscreveNaCelula("Destinatario inexistente", linha, coluna);
			coluna = this.criaEEscreveNaCelula("Destinatario inexistente", linha, coluna);
			coluna = this.criaEEscreveNaCelula("Destinatario inexistente", linha, coluna);
			coluna = this.criaEEscreveNaCelula("Destinatario inexistente", linha, coluna);
			coluna = this.criaEEscreveNaCelula("Destinatario inexistente", linha, coluna);
			coluna = this.criaEEscreveNaCelula("Destinatario inexistente", linha, coluna);
			return coluna;
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
		cabecalhoSituacaoAtual.adicionarTexto("");
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
			coluna = this.criaEEscreveNaCelula("Destinatario inexistente", linha, coluna);
			coluna = this.criaEEscreveNaCelula("Destinatario inexistente", linha, coluna);
			coluna = this.criaEEscreveNaCelula("Destinatario inexistente", linha, coluna);
			coluna = this.criaEEscreveNaCelula("Destinatario inexistente", linha, coluna);
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
	
	public int escreveProdutosEServicos(Detalhamento detalhamento, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(detalhamento.getNumeroItem(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(detalhamento.getProduto().getcProd(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(detalhamento.getProduto().getxProd(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(detalhamento.getProduto().getNcm(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(detalhamento.getProduto().getCfop(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(detalhamento.getProduto().getqCom(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(detalhamento.getProduto().getvUnCom(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(detalhamento.getProduto().getvProd(), linha, coluna);
		return coluna;
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
	
	public int escreveIcms(Icms icms, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(icms.getOrig(), linha, coluna); // Origem da Mercadoria
		coluna = this.criaEEscreveNaCelula(icms.getCst(), linha, coluna); // Tributacao do ICMS
		coluna = this.criaEEscreveNaCelula(icms.getModBc(), linha, coluna); // Modalidade Definicao da BC ICMS Normal
		coluna = this.criaEEscreveNaCelula(icms.getvBc(), linha, coluna); // Base de Calculo ICMS Normal
		coluna = this.criaEEscreveNaCelula(icms.getpIcms(), linha, coluna); // Aliquota do ICMS Normal
		coluna = this.criaEEscreveNaCelula(icms.getvIcms(), linha, coluna); // Valor do ICMS Normal
		
		coluna = this.criaEEscreveNaCelula(icms.getvBcSt(), linha, coluna); // Base de Calculo do ICMS ST
		coluna = this.criaEEscreveNaCelula(icms.getpIcmsSt(), linha, coluna); // Aliquota do ICMS ST
		coluna = this.criaEEscreveNaCelula(icms.getvIcmsSt(), linha, coluna); // Valor do ICMS ST
		coluna = this.criaEEscreveNaCelula(icms.getpRedBcSt(), linha, coluna); // Percentual Reducao de BC do ICMS ST
		coluna = this.criaEEscreveNaCelula(icms.getpMvaSt(), linha, coluna); // Percentual do MVA do ICMS ST
		coluna = this.criaEEscreveNaCelula(icms.getModBcSt(), linha, coluna); // Modalidade Definicao da BC ICMS ST
		return coluna;
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
	
	public int escreveIpi(Ipi ipi, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(ipi.getClEnq(), linha, coluna); // Classe de Enquadramento
		coluna = this.criaEEscreveNaCelula(ipi.getcEnq(), linha, coluna); // Codigo Enquadramento
		coluna = this.criaEEscreveNaCelula(ipi.getcSelo(), linha, coluna); // Codigo do Selo
		coluna = this.criaEEscreveNaCelula(ipi.getqSelo(), linha, coluna); // Quantidade Selo
		coluna = this.criaEEscreveNaCelula(ipi.getCst(), linha, coluna); // CST
		coluna = this.criaEEscreveNaCelula(ipi.getqUnid(), linha, coluna); // Qtd Total Unidade Padrao
		coluna = this.criaEEscreveNaCelula(ipi.getvUnid(), linha, coluna); // Valor por Unidade
		coluna = this.criaEEscreveNaCelula(ipi.getvBc(), linha, coluna); // Base de Calculo IPI
		coluna = this.criaEEscreveNaCelula(ipi.getpIpi(), linha, coluna); // Aliquota IPI
		coluna = this.criaEEscreveNaCelula(ipi.getvIpi(), linha, coluna); // Valor IPI
		return coluna;
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
	
	public int escrevePis(Pis pis, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(pis.getCst(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(pis.getvBc(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(pis.getvAliqProd(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(pis.getvPis(), linha, coluna);
		return coluna;
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
	
	public int escreveCofins(Cofins cofins, SXSSFRow linha, int coluna) {
		coluna = this.criaEEscreveNaCelula(cofins.getCst(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(cofins.getvBc(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(cofins.getvAliqProd(), linha, coluna);
		coluna = this.criaEEscreveNaCelula(cofins.getvCofins(), linha, coluna);
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
	
	public void escreve(List<Detalhamento> listaDet, SXSSFSheet sxssfSheet) throws IOException {
		int inicioLinhaDados = 2;
		for(int i = 0; i < listaDet.size(); i++) {
			if(i % 100 == 0) {
				sxssfSheet.flushRows(100);
			}
			int coluna = 0;
			NotaFiscalEletronica nfe = listaDet.get(i).getNfe();
			SXSSFRow linha = sxssfSheet.createRow(inicioLinhaDados + i);
			coluna = this.escreverDadosDaNFe(nfe.getInfNfe().getIde(), nfe.getInfNfe().getTotal().getIcmsTot(), linha, coluna);
			coluna = this.escreverEmitente(nfe.getInfNfe().getEmit(), linha, coluna);
			coluna = this.escreverDestinatario(nfe.getInfNfe().getDest(), linha, coluna);
			coluna = this.escreveEmissao(nfe.getInfNfe().getIde(), linha, coluna);
			coluna = this.escreveSituacaoAtual(linha, coluna);
			coluna = this.escreveEmitenteAdicionais(nfe.getInfNfe().getEmit(), linha, coluna);
			coluna = this.escreveDestinatarioAdicionais(nfe.getInfNfe().getDest(), linha, coluna);
			coluna = this.escreverChaveDeAcesso(nfe.getInfNfe(), linha, coluna);
			coluna = this.escreveProdutosEServicos(listaDet.get(i), linha, coluna);
			coluna = this.escreveIcms(listaDet.get(i).getImposto().getIcms(), linha, coluna);
			coluna = this.escreveIpi(listaDet.get(i).getImposto().getIpi(), linha, coluna);
			coluna = this.escrevePis(listaDet.get(i).getImposto().getPis(), linha, coluna);
			coluna = this.escreveCofins(listaDet.get(i).getImposto().getCofins(), linha, coluna);
		}
	}
}






