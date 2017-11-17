package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMS40")
public class Icms40Dto extends GenericIcms {

	@XStreamAlias("CST")
	private int cst;
	@XStreamAlias("vICMSDeson")
	private double vIcmsDeson;
	@XStreamAlias("motDesICMS")
	private int motDesIcms;

	public int getCst() {
		return cst;
	}

	public void setCst(int cst) {
		this.cst = cst;
	}

	public double getvIcmsDeson() {
		return vIcmsDeson;
	}

	public void setvIcmsDeson(double vIcmsDeson) {
		this.vIcmsDeson = vIcmsDeson;
	}

	public int getMotDesIcms() {
		return motDesIcms;
	}

	public void setMotDesIcms(int motDesIcms) {
		this.motDesIcms = motDesIcms;
	}

}
