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
	@Embedded
	private Ipi ipi;

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

	public Ipi getIpi() {
		return ipi;
	}

	public void setIpi(Ipi ipi) {
		this.ipi = ipi;
	}

}
