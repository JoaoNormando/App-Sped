package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("IPINT")
public class IpiNtDto {

	@XStreamAlias("CST")
	private int cst; // Código da situação tributária do IPI

	public int getCst() {
		return cst;
	}

	public void setCst(int cst) {
		this.cst = cst;
	}
	
	
	
}
