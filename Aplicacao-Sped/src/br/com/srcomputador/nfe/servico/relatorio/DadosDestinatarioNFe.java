package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.Destinatario;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;

@Service
public class DadosDestinatarioNFe {
	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoDestinatario() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Destinatario");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("CNPJ/CPF");
				add("Nome/Razao Social");
				add("Inscricao Estadual");
				add("UF");
				add("Destino da Operacao");
				add("Consumidor final");
			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> getDadosDestinatarioNFe(NotaFiscalEletronica nfe){
		Destinatario destinatario = nfe.getInfNfe().getDest();
		List<String> lista = new ArrayList<>();
		
		if(destinatario.getCnpj() != null) {
			lista.add(destinatario.getCnpj());
		} else {
			lista.add(destinatario.getCpf());
		}
		
		lista.add(destinatario.getxNome());
		lista.add(destinatario.getIe());
		lista.add(destinatario.getEnderDest().getUf());
		lista.add(String.valueOf(destinatario.getIndIeDest()));
		lista.add(String.valueOf(nfe.getInfNfe().getIde().getIndFinal()));
		return lista;
	}
	
	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoDestinatarioAdicional() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Dados do Destinatario");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("Municipio");
				add("Pais");
				add("Indicador IE");
				add("Inscricao SUFRAMA");
			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> getDadosDestinatarioNFeAdicional(NotaFiscalEletronica nfe){
		Destinatario destinatario = nfe.getInfNfe().getDest();
		List<String> lista = new ArrayList<>();
		lista.add(destinatario.getEnderDest().getxMun());
		lista.add(destinatario.getEnderDest().getxPais());
		lista.add(String.valueOf(destinatario.getIndIeDest()));
		lista.add(String.valueOf(destinatario.getIsuf()));
		return lista;
	}
	
}
