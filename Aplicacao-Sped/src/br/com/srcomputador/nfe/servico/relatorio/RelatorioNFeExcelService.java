package br.com.srcomputador.nfe.servico.relatorio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.persistencia.DetalhamentoDao;
import br.com.srcomputador.nfe.persistencia.FiltroRelatorio;
import br.com.srcomputador.nfe.persistencia.NotaFiscalEletronicaDao;
import br.com.srcomputador.persistencia.ImportacaoDao;
import br.com.srcomputador.servico.relatorio.RelatorioExcelService;

@Service
public class RelatorioNFeExcelService {

	private RelatorioExcelService relatorioExcelService;
	private DadosIdeNFe dadosIdeNFe;
	private DadosEmitenteNFe dadosEmitenteNFe;
	private DadosChaveDeAcesso dadosChaveDeAcesso;
	private DadosDestinatarioNFe dadosDestinatarioNFe;
	private DadosEmissaoNFe dadosEmissaoNFe;
	private DadosSituacaoAtual dadosSituacaoAtual;
	private DadosTotaisNFe dadosTotaisNFe;
	private DadosInformacoesComplementares dadosInfoComplementares;
	private DetalhamentoDao detalhamentoDao;
	private DadosProdutoServicoNFe dadosProdutoServicoNFe;
	private DadosPis dadosPis;
	private DadosCofins dadosCofins;
	private DadosIcms dadosIcms;
	private DadosIpi dadosIpi;
	private NotaFiscalEletronicaDao nfeDao;

	@Autowired
	public RelatorioNFeExcelService(RelatorioExcelService service, ImportacaoDao dao, DadosIdeNFe dadosIdeNFe,
			DadosEmitenteNFe dadosEmitenteNFe, DadosChaveDeAcesso dadosChaveDeAcesso,
			DadosDestinatarioNFe dadosDestinatarioNFe, DadosEmissaoNFe dadosEmissaoNFe,
			DadosSituacaoAtual dadosSituacaoAtual, DadosTotaisNFe dadosTotaisNFe, DadosInformacoesComplementares dadosInfoComplementares, DetalhamentoDao detalhamentoDao, DadosProdutoServicoNFe dadosProdutoServicoNFe, DadosPis dadosPis, DadosCofins dadosCofins, DadosIcms dadosIcms, DadosIpi dadosIpi, NotaFiscalEletronicaDao nfeDao) {

		this.relatorioExcelService = service;
		this.dadosIdeNFe = dadosIdeNFe;
		this.dadosEmitenteNFe = dadosEmitenteNFe;
		this.dadosChaveDeAcesso = dadosChaveDeAcesso;
		this.dadosDestinatarioNFe = dadosDestinatarioNFe;
		this.dadosEmissaoNFe = dadosEmissaoNFe;
		this.dadosSituacaoAtual = dadosSituacaoAtual;
		this.dadosTotaisNFe = dadosTotaisNFe;
		this.dadosInfoComplementares = dadosInfoComplementares;
		this.detalhamentoDao = detalhamentoDao;
		this.dadosProdutoServicoNFe = dadosProdutoServicoNFe;
		this.dadosPis = dadosPis;
		this.dadosCofins = dadosCofins;
		this.dadosIcms = dadosIcms;
		this.dadosIpi = dadosIpi;
		this.nfeDao = nfeDao;
		
	}

	private int escreverNaFolha(HSSFRow row, int indiceColuna, List<String> dados) {
		for(String conteudo : dados) {
			row.createCell(indiceColuna).setCellValue(conteudo);
			indiceColuna++;
		}
		return indiceColuna;
	}
	
	public File gerarRelatorio02(FiltroRelatorio filtro) throws IOException {
		List<NotaFiscalEletronica> listaNfe = this.nfeDao.recuperarPeloFiltro(filtro);
		List<CabecalhoRelatorioExcel> listaCabecalho = this.criarListaDeCabecalhoTotais();
		HSSFSheet folhaRelatorioTotal = this.relatorioExcelService.criarFolha("Relatorio Total", listaCabecalho);
		
		int indice = 2;
		for(NotaFiscalEletronica nfe : listaNfe) {
			HSSFRow row = folhaRelatorioTotal.createRow(indice);
			int indiceColuna = this.escreverNaFolha(row, 0, this.dadosIdeNFe.relatorioIdeDaNFe(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosChaveDeAcesso.getRelatorioChaveDeAcesso(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosEmitenteNFe.relatorioEmitenteNFe(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosDestinatarioNFe.getDadosDestinatarioNFe(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosEmissaoNFe.getDadosEmissao(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosSituacaoAtual.getDadosSitualAtual(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosEmitenteNFe.relatorioEmitenteAdicional(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosDestinatarioNFe.getDadosDestinatarioNFeAdicional(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosTotaisNFe.getDadosTotais(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosInfoComplementares.getInformacoesComplementares(nfe));
			indice++;
		}
		
		List<Detalhamento> listaDetalhamento = this.detalhamentoDao.recuperarTodosOsElementos(filtro);
		List<CabecalhoRelatorioExcel> listaCabecalhoProduto = this.criarListaDeCabecalhoProdutos();
		HSSFSheet folhaRelatorioProduto = this.relatorioExcelService.criarFolha("Relatorio Produto", listaCabecalhoProduto);
		
		indice = 2;
		for(Detalhamento elemento : listaDetalhamento) {
			
			HSSFRow row = folhaRelatorioProduto.createRow(indice);
			NotaFiscalEletronica nfe = elemento.getNfe();
			int indiceColuna = this.escreverNaFolha(row, 0, this.dadosIdeNFe.relatorioIdeDaNFe(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosEmitenteNFe.relatorioEmitenteNFe(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosDestinatarioNFe.getDadosDestinatarioNFe(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosEmissaoNFe.getDadosEmissao(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosSituacaoAtual.getDadosSitualAtual(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosEmitenteNFe.relatorioEmitenteAdicional(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosDestinatarioNFe.getDadosDestinatarioNFeAdicional(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosChaveDeAcesso.getRelatorioChaveDeAcesso(nfe));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosProdutoServicoNFe.relatorioProdutosServicosNFe(elemento));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosIcms.relatorioIcms(elemento));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosIpi.relatorioIpi(elemento));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosPis.relatorioPis(elemento));
			indiceColuna = this.escreverNaFolha(row, indiceColuna, this.dadosCofins.relatorioCofins(elemento));
			indice++;
			
		}

		
		return this.relatorioExcelService.gerarRelatorio("Relatorio");
	}
	

	private List<CabecalhoRelatorioExcel> criarListaDeCabecalhoTotais() {
		List<CabecalhoRelatorioExcel> listaCabecalho = new ArrayList<>();

		listaCabecalho.add(this.dadosIdeNFe.cabecalhoIdeDaNFe());
		listaCabecalho.add(this.dadosChaveDeAcesso.getCabecalhoChaveDeAcesso());
		listaCabecalho.add(this.dadosEmitenteNFe.getCabecalhoEmitenteNFe());
		listaCabecalho.add(this.dadosDestinatarioNFe.getCabecalhoDestinatario());
		listaCabecalho.add(this.dadosEmissaoNFe.getCabecalhoDadosEmissao());
		listaCabecalho.add(this.dadosSituacaoAtual.getCabecalhoSituacaoAtual());
		listaCabecalho.add(this.dadosEmitenteNFe.getCabecalhoEmitenteNFeAdicional());
		listaCabecalho.add(this.dadosDestinatarioNFe.getCabecalhoDestinatarioAdicional());
		listaCabecalho.add(this.dadosTotaisNFe.getCabecalhoTotais());
		listaCabecalho.add(this.dadosInfoComplementares.getDadosCabecalho());
		return listaCabecalho;
	}

	private List<CabecalhoRelatorioExcel> criarListaDeCabecalhoProdutos(){
		List<CabecalhoRelatorioExcel> listaCabecalho = new ArrayList<>();
		
		listaCabecalho.add(this.dadosIdeNFe.cabecalhoIdeDaNFe());
		listaCabecalho.add(this.dadosEmitenteNFe.getCabecalhoEmitenteNFe());
		listaCabecalho.add(this.dadosDestinatarioNFe.getCabecalhoDestinatario());
		listaCabecalho.add(this.dadosEmissaoNFe.getCabecalhoDadosEmissao());
		listaCabecalho.add(this.dadosSituacaoAtual.getCabecalhoSituacaoAtual());
		listaCabecalho.add(this.dadosEmitenteNFe.getCabecalhoEmitenteNFeAdicional());
		listaCabecalho.add(this.dadosDestinatarioNFe.getCabecalhoDestinatarioAdicional());
		listaCabecalho.add(this.dadosChaveDeAcesso.getCabecalhoChaveDeAcesso());
		listaCabecalho.add(this.dadosProdutoServicoNFe.getCabecalhoProdutosServicosNFe());
		listaCabecalho.add(this.dadosIcms.getCabecalhoIcms());
		listaCabecalho.add(this.dadosIpi.getCabecalhoIpi());
		listaCabecalho.add(this.dadosPis.getCabecalhoPis());
		listaCabecalho.add(this.dadosCofins.getCabecalhoCofins());
		
		return listaCabecalho;
	}

	public void fecharArquivo() throws IOException {
		this.relatorioExcelService.removerArquivo();
	}
	
}
