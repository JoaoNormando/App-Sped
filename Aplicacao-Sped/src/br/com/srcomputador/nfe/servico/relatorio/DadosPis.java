package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.entidade.detalheProduto.Pis;

@Service
public class DadosPis {

	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoPis() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("PIS");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("CST PIS");
				add("Base de Cálculo PIS");
				add("Alíquota PIS");
				add("Valor PIS");

			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> relatorioPis(Detalhamento detalhamento) {
		List<String> lista = new ArrayList<>();
		Pis pis = detalhamento.getImposto().getPis();
		lista.add(String.valueOf(pis.getCst()));
		lista.add(String.valueOf(pis.getvBc()));
		lista.add(String.valueOf(pis.getvAliqProd()));
		lista.add(String.valueOf(pis.getvPis()));
		return lista;
	}
	
}
