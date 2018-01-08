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
import br.com.srcomputador.nfe.persistencia.Filtro;
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

	@Autowired
	public RelatorioNFeExcelService(RelatorioExcelService service, ImportacaoDao dao, DadosIdeNFe dadosIdeNFe,
			DadosEmitenteNFe dadosEmitenteNFe, DadosChaveDeAcesso dadosChaveDeAcesso,
			DadosDestinatarioNFe dadosDestinatarioNFe, DadosEmissaoNFe dadosEmissaoNFe,
			DadosSituacaoAtual dadosSituacaoAtual, DadosTotaisNFe dadosTotaisNFe, DadosInformacoesComplementares dadosInfoComplementares) {
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
	}

	public void gerarRelatorio02(Filtro filtro) {
		
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
		listaCabecalho.add(this.dadosChaveDeAcesso.getCabecalhoChaveDeAcesso());
		listaCabecalho.add(this.dadosEmitenteNFe.getCabecalhoEmitenteNFe());
		listaCabecalho.add(this.dadosDestinatarioNFe.getCabecalhoDestinatario());
		listaCabecalho.add(this.dadosEmissaoNFe.getCabecalhoDadosEmissao());
		listaCabecalho.add(this.dadosSituacaoAtual.getCabecalhoSituacaoAtual());
		listaCabecalho.add(this.dadosEmitenteNFe.getCabecalhoEmitenteNFeAdicional());
		listaCabecalho.add(this.dadosDestinatarioNFe.getCabecalhoDestinatarioAdicional());
		
		return listaCabecalho;
	}

	public void fecharArquivo() throws IOException {
		this.relatorioExcelService.removerArquivo();
	}
	
}
