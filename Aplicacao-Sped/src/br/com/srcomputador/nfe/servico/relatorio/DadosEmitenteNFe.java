package br.com.srcomputador.nfe.servico.relatorio;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.Emitente;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;

@Service
public class DadosEmitenteNFe {

	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoEmitenteNFe() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Emitente");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("CNPJ/CPF");
				add("Nome/Razão Social");
				add("Inscrição Estadual");
				add("UF");
			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> relatorioEmitenteNFe(NotaFiscalEletronica nfe) {
		List<String> lista = new ArrayList<>();
		Emitente emitente = nfe.getInfNfe().getEmit();
		
		String cpfCnpj;
		if(emitente.getCnpj() != null) {
			cpfCnpj = emitente.getCnpj();
		} else {
			cpfCnpj = emitente.getCpf();
		}
		lista.add(cpfCnpj);
		lista.add(emitente.getxNome());
		lista.add(emitente.getIe());
		lista.add(emitente.getEnderEmit().getUf());
		return lista;
	}
	
	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel getCabecalhoEmitenteNFeAdicional() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Dados do Emitente");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("Município");
				add("Código de Regime Tributário");
				
			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> relatorioEmitenteAdicional(NotaFiscalEletronica nfe){
		List<String> lista = new ArrayList<>();
		Emitente emitente = nfe.getInfNfe().getEmit();
		
		lista.add(emitente.getEnderEmit().getxMun());
		lista.add(String.valueOf(emitente.getCrt()));
		
		return lista;
	}
	
}
