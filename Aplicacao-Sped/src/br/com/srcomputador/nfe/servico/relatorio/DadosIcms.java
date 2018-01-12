package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;

@Service
public class DadosIcms {

	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoIcms() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("ICMS Normal e ST");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("Origem da Mercadoria");
				add("Tributa��o do ICMS");
				add("Modalidade Defini��o da BC ICMS Normal");
				add("Base de C�lculo ICMS Normal");
				add("Al�quota do ICMS Normal");
				add("Valor do ICMS Normal");
		
				add("Base de C�lculo do ICMS ST");
				add("Al�quota do ICMS ST");
				add("Valor do ICMS ST");
				add("Percentual Redu��o de BC do ICMS ST");
				add("Percentual do MVA do ICMS ST");
				add("Modalidade Defini��o da BC ICMS ST");

			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> relatorioIcms(Detalhamento detalhamento) {
		List<String> lista = new ArrayList<>();
		Icms icms = detalhamento.getImposto().getIcms();
		lista.add(String.valueOf(icms.getOrig()));
		lista.add(String.valueOf(icms.getCst()));
		lista.add(String.valueOf(icms.getModBc()));
		lista.add(String.valueOf(icms.getvBc()));
		lista.add(String.valueOf(icms.getpIcms()));
		lista.add(String.valueOf(icms.getvIcms()));
		
		lista.add(String.valueOf(icms.getvBcSt()));
		lista.add(String.valueOf(icms.getpIcmsSt()));
		lista.add(String.valueOf(icms.getvIcmsSt()));
		lista.add(String.valueOf(icms.getpRedBcSt()));
		lista.add(String.valueOf(icms.getpMvaSt()));
		lista.add(String.valueOf(icms.getModBcSt()));
		
		return lista;
	}
	
}
