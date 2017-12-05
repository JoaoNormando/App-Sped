package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.IcmsTotal;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;

@Service
public class DadosTotaisNFe {

	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoTotais() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Totais");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("Base de Cálculo ICMS");
				add("Valor do ICMS");
				add("Valor do ICMS Desonerado");
				add("Base de Cálculo ICMS ST");
				add("Valor ICMS Substituição");
				add("Valor Total dos Produtos");
				add("Valor do Frete");
				add("Valor do Seguro");
				add("Outras Despesas Acessórias");
				add("Valor Total do IPI");
				add("Valor Total da Nfe");
				add("Valor Total dos Descontos");
				add("Valor Total do II");
				add("Valor do PIS");
				add("Valor da COFINS");
				add("Valor Aproximado dos Tributos");
				add("Valor Total ICMS FCP");
				add("Valor Total ICMS Interestadual UF Destino");
				add("Valor Total ICMS Interestadual UF Remetente");
			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> getDadosTotais(NotaFiscalEletronica nfe){
		List<String> lista = new ArrayList<>();
		IcmsTotal total = nfe.getInfNfe().getTotal().getIcmsTot();
		
		lista.add(String.valueOf(total.getvBc()));
		lista.add(String.valueOf(total.getvIcms()));
		lista.add(String.valueOf(total.getvIcmsDeson()));
		lista.add(String.valueOf(total.getvBcSt()));
		lista.add(String.valueOf(total.getvSt()));
		lista.add(String.valueOf(total.getvProd()));
		lista.add(String.valueOf(total.getvFrete()));
		lista.add(String.valueOf(total.getvSeg()));
		lista.add(String.valueOf(total.getvOutro()));
		lista.add(String.valueOf(total.getvIpi()));
		lista.add(String.valueOf(total.getvNf()));
		lista.add(String.valueOf(total.getvDesc()));
		lista.add(String.valueOf(total.getvII()));
		lista.add(String.valueOf(total.getvPis()));
		lista.add(String.valueOf(total.getvCofins()));
		lista.add(String.valueOf(total.getvTotTrib()));
		lista.add("");// icms fcp
		lista.add("");// icms uf destino
		lista.add("");// icms uf remetente
		return lista;
	}
}
