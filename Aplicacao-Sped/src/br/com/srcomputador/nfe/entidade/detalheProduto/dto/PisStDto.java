package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PISST")
public class PisStDto {

	@XStreamAlias("vBC")
	private double vBc;
	@XStreamAlias("pPIS")
	private double pPis;
	@XStreamAlias("qBCProd")
	private double qBcProd;
	@XStreamAlias("vAliqProd")
	private double vAliqProd;
	@XStreamAlias("vPIS")
	private double vPis;

	public double getvBc() {
		return vBc;
	}

	public void setvBc(double vBc) {
		this.vBc = vBc;
	}

	public double getpPis() {
		return pPis;
	}

	public void setpPis(double pPis) {
		this.pPis = pPis;
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

	public double getvPis() {
		return vPis;
	}

	public void setvPis(double vPis) {
		this.vPis = vPis;
	}

}
