package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;

@Service
public class DadosChaveDeAcesso {

	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoChaveDeAcesso() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Chave de acesso");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("Chave de acesso");
			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> getRelatorioChaveDeAcesso(NotaFiscalEletronica nfe){
		List<String> lista = new ArrayList<>();
		lista.add(nfe.getInfNfe().getChaveAcesso());
		return lista;
	}
	
}
