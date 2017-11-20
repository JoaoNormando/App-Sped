package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("imposto")
public class ImpostoDto {

	@XStreamAlias("ICMS")
	private IcmsDto icms;
	@XStreamAlias("PIS")
	private PisDto pis;
	@XStreamAlias("COFINS")
	private CofinsDto cofins;
	@XStreamAlias("IPI")
	private IpiDto ipi;
	
	public IcmsDto getIcms() {
		return icms;
	}

	public void setIcms(IcmsDto icms) {
		this.icms = icms;
	}

	public PisDto getPis() {
		return pis;
	}

	public void setPis(PisDto pis) {
		this.pis = pis;
	}

	public CofinsDto getCofins() {
		return cofins;
	}

	public void setCofins(CofinsDto cofins) {
		this.cofins = cofins;
	}
	
	
}
