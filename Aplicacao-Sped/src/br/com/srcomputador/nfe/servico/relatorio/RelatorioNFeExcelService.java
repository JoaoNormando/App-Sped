package br.com.srcomputador.nfe.servico.relatorio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.importacao.persistencia.ImportacaoDao;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.persistencia.DetalhamentoDao;
import br.com.srcomputador.nfe.persistencia.Filtro;
import br.com.srcomputador.nfe.persistencia.FiltroRelatorio;
import br.com.srcomputador.servico.relatorio.RelatorioExcelService;

@Service
public class RelatorioNFeExcelService {

	private RelatorioExcelService relatorioExcelService;
	private ImportacaoDao dao;
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

	@Autowired
	public RelatorioNFeExcelService(RelatorioExcelService service, ImportacaoDao dao, DadosIdeNFe dadosIdeNFe,
			DadosEmitenteNFe dadosEmitenteNFe, DadosChaveDeAcesso dadosChaveDeAcesso,
			DadosDestinatarioNFe dadosDestinatarioNFe, DadosEmissaoNFe dadosEmissaoNFe,
			DadosSituacaoAtual dadosSituacaoAtual, DadosTotaisNFe dadosTotaisNFe, DadosInformacoesComplementares dadosInfoComplementares, DetalhamentoDao detalhamentoDao, DadosProdutoServicoNFe dadosProdutoServicoNFe, DadosPis dadosPis, DadosCofins dadosCofins, DadosIcms dadosIcms, DadosIpi dadosIpi) {
		this.relatorioExcelService = service;
		this.dao = dao;
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
		
	}

	private int escreverNaFolha(HSSFRow row, int indiceColuna, List<String> dados) {
		for(String conteudo : dados) {
			row.createCell(indiceColuna).setCellValue(conteudo);
			indiceColuna++;
		}
		return indiceColuna;
	}
	
	public File gerarRelatorio02(FiltroRelatorio filtro) throws IOException {
		List<Detalhamento> lista = this.detalhamentoDao.recuperarTodosOsElementos(filtro);
		List<CabecalhoRelatorioExcel> listaCabecalhoProduto = this.criarListaDeCabecalhoProdutos();
		HSSFSheet folhaRelatorioProduto = this.relatorioExcelService.criarFolha("Relatorio Produto", listaCabecalhoProduto);
		
		int indice = 2;
		
		lista.forEach(elemento -> {
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
		});
		
		return this.relatorioExcelService.gerarRelatorio("Relatorio");
	}
	
	public File gerarRelatorio(Filtro filtro) throws IOException {
		Importacao importacao = dao.listarImportacoesPeloFiltro(filtro);
		
		List<CabecalhoRelatorioExcel> listaCabecalho = this.criarListaDeCabecalhoTotais();
		HSSFSheet folhaRelatorioTotal = this.relatorioExcelService.criarFolha("Relatorio Total", listaCabecalho);
		
		List<CabecalhoRelatorioExcel> listaCabecalhoProduto = this.criarListaDeCabecalhoProdutos();
		HSSFSheet folhaRelatorioProduto = this.relatorioExcelService.criarFolha("Relatorio Produto", listaCabecalhoProduto);

		int indice = 2;
		for (NotaFiscalEletronica nfe : importacao.getListaNfe()) {

			HSSFRow linhaTotal = folhaRelatorioTotal.createRow(indice);
			HSSFRow linhaProduto = folhaRelatorioProduto.createRow(indice);
			
			int coluna = 0;
			for (String s : this.dadosIdeNFe.relatorioIdeDaNFe(nfe)) {
				linhaTotal.createCell(coluna).setCellValue(s);
				linhaProduto.createCell(coluna).setCellValue(s);
				coluna++;
			}
			for (String s : this.dadosChaveDeAcesso.getRelatorioChaveDeAcesso(nfe)) {
				linhaTotal.createCell(coluna).setCellValue(s);
				linhaProduto.createCell(coluna).setCellValue(s);
				coluna++;
			}
			for (String s : this.dadosEmitenteNFe.relatorioEmitenteNFe(nfe)) {
				linhaTotal.createCell(coluna).setCellValue(s);
				linhaProduto.createCell(coluna).setCellValue(s);
				coluna++;
			}
			for (String s : this.dadosDestinatarioNFe.getDadosDestinatarioNFe(nfe)) {
				linhaTotal.createCell(coluna).setCellValue(s);
				linhaProduto.createCell(coluna).setCellValue(s);
				coluna++;
			}
			for (String s : this.dadosEmissaoNFe.getDadosEmissao(nfe)) {
				linhaTotal.createCell(coluna).setCellValue(s);
				linhaProduto.createCell(coluna).setCellValue(s);
				coluna++;
			}
			for (String s : this.dadosSituacaoAtual.getDadosSitualAtual(nfe)) {
				linhaTotal.createCell(coluna).setCellValue(s);
				linhaProduto.createCell(coluna).setCellValue(s);
				coluna++;
			}
			for (String s : this.dadosEmitenteNFe.relatorioEmitenteAdicional(nfe)) {
				linhaTotal.createCell(coluna).setCellValue(s);
				linhaProduto.createCell(coluna).setCellValue(s);
				coluna++;
			}
			for (String s : this.dadosDestinatarioNFe.getDadosDestinatarioNFeAdicional(nfe)) {
				linhaTotal.createCell(coluna).setCellValue(s);
				linhaProduto.createCell(coluna).setCellValue(s);
				coluna++;
			}
			for (String s : this.dadosTotaisNFe.getDadosTotais(nfe)) {
				linhaTotal.createCell(coluna).setCellValue(s);
				coluna++;
			}
			for(String s : this.dadosInfoComplementares.getInformacoesComplementares(nfe)) {
				linhaTotal.createCell(coluna).setCellValue(s);
				coluna++;
			}
			indice++;

		}
		return this.relatorioExcelService.gerarRelatorio("Relatorio Final");
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
