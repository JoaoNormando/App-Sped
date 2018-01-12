package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Cofins;
import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;

@Service
public class DadosCofins {

	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoCofins() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("COFINS");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("CST COFINS");
				add("Base de Cálculo COFINS");
				add("Alíquota COFINS");
				add("Valor COFINS");

			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> relatorioCofins(Detalhamento detalhamento) {
		List<String> lista = new ArrayList<>();
		 Cofins cofins = detalhamento.getImposto().getCofins();
		lista.add(String.valueOf(cofins.getCst()));
		lista.add(String.valueOf(cofins.getvBc()));
		lista.add(String.valueOf(cofins.getvAliqProd()));
		lista.add(String.valueOf(cofins.getvCofins()));
		return lista;
	}
	
}
