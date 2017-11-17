package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PIS")
public class PisDto {
	
	@XStreamAlias("PISAliq")
	private PisAliquotaDto pisAliq;

	public PisAliquotaDto getPisAliq() {
		return pisAliq;
	}

	public void setPisAliq(PisAliquotaDto pisAliq) {
		this.pisAliq = pisAliq;
	}
	
}
