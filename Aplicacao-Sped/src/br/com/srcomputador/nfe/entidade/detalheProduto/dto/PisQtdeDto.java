package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PISQtde")
public class PisQtdeDto {

	@XStreamAlias("CST")
	private int cst;
	@XStreamAlias("qBCProd")
	private double qBcProd;
	@XStreamAlias("vAliqProd")
	private double vAliqProd;
	@XStreamAlias("vPIS")
	private double vPis;

	public int getCst() {
		return cst;
	}

	public void setCst(int cst) {
		this.cst = cst;
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
