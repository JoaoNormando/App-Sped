package br.com.srcomputador.mfd.rest;

import java.util.ArrayList;
import java.util.List;

import br.com.srcomputador.mfd.entidade.DadosRelatorio;

public class RequestRegistroE14 {
	
	private List<DadosRelatorio> campos;
	
	public RequestRegistroE14() {
		campos = new ArrayList<>();
		preDefinirCampos();
	}

	private void preDefinirCampos() {
		campos.add(new DadosRelatorio(0, "Numero do usuario"));
		campos.add(new DadosRelatorio(1, "Numero do contador"));
		campos.add(new DadosRelatorio(2, "Numero do coo"));
		campos.add(new DadosRelatorio(3, "data de emissão inicial"));
		campos.add(new DadosRelatorio(4, "Valor total do documento"));
		campos.add(new DadosRelatorio(5, "Valor do desconto"));
		campos.add(new DadosRelatorio(6, "Tipo do desconto"));
		campos.add(new DadosRelatorio(7, "Valor do acrescimo aplicado por porcentagem"));
		campos.add(new DadosRelatorio(8, "Indicador do tipo de acrescimo"));
		campos.add(new DadosRelatorio(9, "Valor total liquido"));
		campos.add(new DadosRelatorio(10, "Indicador de cancelamento"));
		campos.add(new DadosRelatorio(11, "Valor do cancelamento"));
		campos.add(new DadosRelatorio(12, "Ordem de aplicação do desconto"));
		campos.add(new DadosRelatorio(13, "Nome do adquirente"));
		campos.add(new DadosRelatorio(14, "Cnpj ou Cpf do adquirente"));
	}
	
	public List<DadosRelatorio> getCampos() {
		return campos;
	}
	
}
