package br.com.srcomputador.nfe.entidade.detalheProduto;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Imposto {

	@Embedded
	private Icms icms;
	@Embedded
	private Pis pis;
	@Embedded
	private Cofins cofins;
	
	public Icms getIcms() {
		return icms;
	}
	public void setIcms(Icms icms) {
		this.icms = icms;
	}
	public Pis getPis() {
		return pis;
	}
	public void setPis(Pis pis) {
		this.pis = pis;
	}
	public Cofins getCofins() {
		return cofins;
	}
	public void setCofins(Cofins cofins) {
		this.cofins = cofins;
	}
	
	
}
