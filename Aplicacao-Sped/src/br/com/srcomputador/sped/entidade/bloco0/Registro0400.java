package br.com.srcomputador.sped.entidade.bloco0;

import br.com.srcomputador.sped.entidade.Registro;

/*
 * Este Registro tem por objetivo codificar os textos das
 * diferentes naturezas da operação/prestação discriminadas
 * nos documentos fiscais. Esta codificação e suas descrições
 * são livremente criadas e mantidas pelo contribuinte.
 * 
 * */

public class Registro0400 extends Registro {

	private String codigoNaturezaOperacao;
	private String descricaoNaturezaOperacao;

	public String getCodigoNaturezaOperacao() {
		return codigoNaturezaOperacao;
	}

	public void setCodigoNaturezaOperacao(String codigoNaturezaOperacao) {
		this.codigoNaturezaOperacao = codigoNaturezaOperacao;
	}

	public String getDescricaoNaturezaOperacao() {
		return descricaoNaturezaOperacao;
	}

	public void setDescricaoNaturezaOperacao(String descricaoNaturezaOperacao) {
		this.descricaoNaturezaOperacao = descricaoNaturezaOperacao;
	}

}
