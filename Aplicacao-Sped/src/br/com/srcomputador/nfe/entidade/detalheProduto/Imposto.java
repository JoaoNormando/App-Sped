package br.com.srcomputador.nfe.entidade.detalheProduto;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Embeddable
@Component
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

	@Autowired
	public void setIcms(Icms icms) {
		this.icms = icms;
	}

	public Pis getPis() {
		return pis;
	}

	@Autowired
	public void setPis(Pis pis) {
		this.pis = pis;
	}

	public Cofins getCofins() {
		return cofins;
	}

	@Autowired
	public void setCofins(Cofins cofins) {
		this.cofins = cofins;
	}

	public Ipi getIpi() {
		return ipi;
	}

	@Autowired
	public void setIpi(Ipi ipi) {
		this.ipi = ipi;
	}

}
