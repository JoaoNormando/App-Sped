package br.com.srcomputador.nfe.servico.relatorio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.IdentificacaoDaNfe;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;

@Service
public class DadosIdeNFe {
	
	private final String MSG_ERRO = "Dado da Identificacao da nota nao encontrado";
	
	@SuppressWarnings("serial")
	public CabecalhoRelatorioExcel cabecalhoIdeDaNFe() {
		CabecalhoRelatorioExcel cabecalhoRelatorioExcel = new CabecalhoRelatorioExcel();
		cabecalhoRelatorioExcel.setTitulo("Dados da NF-e");
		cabecalhoRelatorioExcel.setCampos(new ArrayList<String>() {
			{
				add("N NF");
				add("Serie");
				add("Modelo");
				add("Data de emissao");
				add("Data Saida/Entrada");
				add("Valor Total da Nota Fiscal");
			}
		});
		return cabecalhoRelatorioExcel;
	}
	
	public List<String> relatorioIdeDaNFe(NotaFiscalEletronica nfe) {
		IdentificacaoDaNfe ide = nfe.getInfNfe().getIde();
		int numeroNFe = ide.getnNf();
		int serie = ide.getSerie();
		int modelo = ide.getMod();
		
		Calendar dataEmissao;
		if(ide.getDhEmi() != null) {
			dataEmissao = ide.getDhEmi();
		} else {
			dataEmissao = ide.getdEmi();
		}
		
		Calendar dataSaidaEntrada;
		if(ide.getDhSaiEnt() != null) {
			dataSaidaEntrada = ide.getDhSaiEnt();
		} else {
			dataSaidaEntrada = ide.getdSaiEnt();
		}
		double valorNotaFiscal = nfe.getInfNfe().getTotal().getIcmsTot().getvNf();
		
		List<String> dados = new ArrayList<>();
		dados.add(String.valueOf(numeroNFe));
		dados.add(String.valueOf(serie));
		dados.add(String.valueOf(modelo));
		
		if(dataEmissao != null)
			dados.add(String.valueOf(transformarData(dataEmissao)));
		else
			dados.add(this.MSG_ERRO);
		
		
		if(dataSaidaEntrada != null)
			dados.add(String.valueOf(transformarData(dataSaidaEntrada)));
		else 
			dados.add(this.MSG_ERRO);
		
		dados.add(String.valueOf(valorNotaFiscal));
		
		return dados;
	}
	
	private String transformarData(Calendar data) {
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		return fmt.format(data.getTime());
	}
	
}