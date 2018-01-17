package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.entidade.detalheProduto.Produto;

@Service
public class DadosProdutoServicoNFe {

	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoProdutosServicosNFe() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Dados dos produtos e servicos");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("N Item");
				add("Codigo Produto");
				add("Descricao do Produto");
				add("Codigo NCM");
				add("CFOP");
				add("Quantidade");
				add("Valor Unitario");
				add("Valor Produto");
			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> relatorioProdutosServicosNFe(Detalhamento detalhamento) {
		List<String> lista = new ArrayList<>();
		Produto produto = detalhamento.getProduto();
		lista.add(String.valueOf(detalhamento.getNumeroItem()));
		lista.add(produto.getcProd());
		lista.add(produto.getxProd());
		lista.add(String.valueOf(produto.getNcm()));
		lista.add(String.valueOf(produto.getCfop()));
		lista.add(String.valueOf(produto.getqCom()));
		lista.add(String.valueOf(produto.getvUnCom()));
		lista.add(String.valueOf(produto.getvProd()));
		return lista;
	}
	
}
