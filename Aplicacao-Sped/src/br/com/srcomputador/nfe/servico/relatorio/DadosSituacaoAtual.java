package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;

@Service
public class DadosSituacaoAtual {

	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoSituacaoAtual() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Situação Atual");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("Situação Atual");
			}
		});
		return cabecalhoRelatorioExcel;
	}

	public List<String> getDadosSitualAtual(NotaFiscalEletronica nfe){
		List<String> lista = new ArrayList<>();
		lista.add("");
		return lista;
	}
	
}
