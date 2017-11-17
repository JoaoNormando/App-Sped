package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("COFINS")
public class CofinsDto {

	@XStreamAlias("COFINSAliq")
	private CofinsAliquotaDto cofinsAliq; // Grupo COFINS tributado pela alíquota

	public CofinsAliquotaDto getCofinsAliq() {
		return cofinsAliq;
	}

	public void setCofinsAliq(CofinsAliquotaDto cofinsAliq) {
		this.cofinsAliq = cofinsAliq;
	}
	
	
}
