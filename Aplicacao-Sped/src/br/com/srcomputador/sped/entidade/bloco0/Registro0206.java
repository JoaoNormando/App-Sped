package br.com.srcomputador.sped.entidade.bloco0;

import br.com.srcomputador.sped.entidade.Registro;

/*
 * Este Registro tem por objetivo informar o código correspondente 
 * ao produto constante na Tabela da Agência Nacional de Petróleo (ANP).
 * */

public class Registro0206 extends Registro {

	private String codigoProduto;

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

}
