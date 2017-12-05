package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

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
		lista.add("");
		return lista;
	}
	
}
