package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class RelatorioNFe extends Relatorio{
	
	private FolhaRelatorioNFeTotal relatorioTotal;
	private FolhaRelatorioNFeProduto relatorioProduto;
	
	public File geraRelatorio() throws IOException {
		this.criaCabecalho();
		this.defineEstiloCabecalho();
		File relatorio = this.geraRelatorio("RelatorioNFe");
		return relatorio;
	}
	
	public void criaCabecalho() {
		this.criaCabecalhoRelatorioTotal();
		this.limparIndices();
		this.criaCabecalhoRelatorioProduto();
	}
	
	private void criaCabecalhoRelatorioTotal() {
		this.relatorioTotal = new FolhaRelatorioNFeTotal();
		XSSFSheet folha = this.criaFolha(this.relatorioTotal.getNomeFolha());
		this.geraCabecalho(folha, this.relatorioTotal.getCabecalhoDadosDaNFe());
		this.geraCabecalho(folha, this.relatorioTotal.getCabecalhoChaveDeAcesso());
		this.geraCabecalho(folha, this.relatorioTotal.getCabecalhoEmitente());
		this.geraCabecalho(folha, this.relatorioTotal.getCabecalhoDestinatario());
		this.geraCabecalho(folha, this.relatorioTotal.getCabecalhoEmissao());
		this.geraCabecalho(folha, this.relatorioTotal.getCabecalhoSituacaoAtual());
		this.geraCabecalho(folha, this.relatorioTotal.getCabecalhoDadosEmitenteAdicionais());
		this.geraCabecalho(folha, this.relatorioTotal.getCabecalhoDadosDestinatarioAdicionais());
		this.geraCabecalho(folha, this.relatorioTotal.getCabecalhoTotais());
		this.geraCabecalho(folha, this.relatorioTotal.getCabecalhoInfoAdicional());
	}
	
	private void criaCabecalhoRelatorioProduto() {
		this.relatorioProduto = new FolhaRelatorioNFeProduto();
		XSSFSheet folhaProduto = this.criaFolha(this.relatorioProduto.getNomeFolha());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoDadosDaNFe());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoEmitente());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoDestinatario());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoEmissao());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoSituacaoAtual());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoDadosEmitenteAdicionais());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoDadosDestinatarioAdicionais());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoChaveDeAcesso());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoProdutosEServicos());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoIcms());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoIpi());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoPis());
		this.geraCabecalho(folhaProduto, this.relatorioProduto.getCabecalhoCofins());
	}

	
}
