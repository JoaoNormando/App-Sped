package br.com.srcomputador.nfe.entidade.detalheProduto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class Cofins {

	@Transient
	private final String TABELA = "cofins_";

	@Column(name = TABELA + "cst")
	private int cst;
	@Column(name = TABELA + "vbc")
	private double vBc;
	@Column(name = TABELA + "pcofins")
	private double pCofins;
	@Column(name = TABELA + "qbc_prod")
	private double qBcProd;
	@Column(name = TABELA + "valiq_prod")
	private double vAliqProd;
	@Column(name = TABELA + "vcofins")
	private double vCofins;

	public int getCst() {
		return cst;
	}

	public void setCst(int cst) {
		this.cst = cst;
	}

	public double getvBc() {
		return vBc;
	}

	public void setvBc(double vBc) {
		this.vBc = vBc;
	}

	public double getpCofins() {
		return pCofins;
	}

	public void setpCofins(double pCofins) {
		this.pCofins = pCofins;
	}

	public double getqBcProd() {
		return qBcProd;
	}

	public void setqBcProd(double qBcProd) {
		this.qBcProd = qBcProd;
	}

	public double getvAliqProd() {
		return vAliqProd;
	}

	public void setvAliqProd(double vAliqProd) {
		this.vAliqProd = vAliqProd;
	}

	public double getvCofins() {
		return vCofins;
	}

	public void setvCofins(double vCofins) {
		this.vCofins = vCofins;
	}

}
