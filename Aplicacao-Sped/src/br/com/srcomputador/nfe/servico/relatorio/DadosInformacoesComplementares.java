package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.InformacaoAdicional;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;

@Service
public class DadosInformacoesComplementares {

	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getDadosCabecalho() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Informações adicionais");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("Informações Complementares de Interesse do Contribuinte");
			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> getInformacoesComplementares(NotaFiscalEletronica nfe){
		List<String> lista = new ArrayList<>();
		InformacaoAdicional informacaoAdicional = nfe.getInfNfe().getInfAdic();
		
		if(informacaoAdicional == null || informacaoAdicional.getInfCpl() == null) {
			lista.add("Informação complementar não encontrada na nota");
			return lista;
		}
		
		lista.add(informacaoAdicional.getInfCpl());
		return lista;
	}
	
}
