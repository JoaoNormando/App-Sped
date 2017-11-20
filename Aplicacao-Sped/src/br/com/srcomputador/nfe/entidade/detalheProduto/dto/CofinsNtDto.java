package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("COFINSNT")
public class CofinsNtDto {

	@XStreamAlias("CST")
	private int cst; // Código de Situação Tributária da COFINS

	public int getCst() {
		return cst;
	}

	public void setCst(int cst) {
		this.cst = cst;
	}

}
