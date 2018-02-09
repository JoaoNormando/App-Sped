package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.cliente.persistencia.ClienteDao;
import br.com.srcomputador.nfe.persistencia.DetalhamentoDao;
import br.com.srcomputador.nfe.persistencia.FiltroRelatorio;
import br.com.srcomputador.nfe.persistencia.NotaFiscalEletronicaDao;
import br.com.srcomputador.persistencia.ImportacaoDao;

@Service
public class RelatorioNFe extends Relatorio{
	
	private FolhaRelatorioNFeTotal relatorioTotal;
	private FolhaRelatorioNFeProduto relatorioProduto;
	@Autowired
	private NotaFiscalEletronicaDao dao;
	@Autowired
	private DetalhamentoDao detDao;

	@Autowired
	public RelatorioNFe(FolhaRelatorioNFeTotal relatorioTotal, FolhaRelatorioNFeProduto relatorioProduto) {
		this.relatorioTotal = relatorioTotal;
		this.relatorioProduto = relatorioProduto;
	}
	
	public File geraRelatorio(FiltroRelatorio filtro) throws IOException {
		this.criaCabecalho();
		this.defineEstiloCabecalho();
		
		this.relatorioTotal.escreve(dao.recuperarPeloFiltro(filtro), this.recuperarFolha(this.relatorioTotal.getNomeFolha()));
		this.relatorioProduto.escreve(detDao.recuperarTodosOsElementos(filtro), this.recuperarFolha(this.relatorioProduto.getNomeFolha()));
		System.gc();
		File relatorio = this.geraRelatorio("RelatorioNFe");
		this.removerFolha(this.relatorioProduto.getNomeFolha());
		this.removerFolha(this.relatorioTotal.getNomeFolha());
		return relatorio;
	}
	
	public void criaCabecalho() {
		this.criaCabecalhoRelatorioTotal();
		this.limparIndices();
		this.criaCabecalhoRelatorioProduto();
		this.limparIndices();
	}
	
	private void criaCabecalhoRelatorioTotal() {
		SXSSFSheet folha = this.criaFolha(this.relatorioTotal.getNomeFolha());
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
		SXSSFSheet folhaProduto = this.criaFolha(this.relatorioProduto.getNomeFolha());
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
