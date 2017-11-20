package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("COFINSQtde")
public class CofinsQtdeDto {
	
	@XStreamAlias("CST")
	private int cst; // Código de Situação Tributária da COFINS
	@XStreamAlias("qBCProd")
	private double qBcProd; // Quantidade Vendida
	@XStreamAlias("vAliqProd")
	private double vAliqProd; // Alíquota da COFINS (em reais)
	@XStreamAlias("vCOFINS")
	private double vCofins; // Valor da COFINS

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

	public double getvCofins() {
		return vCofins;
	}

	public void setvCofins(double vCofins) {
		this.vCofins = vCofins;
	}

}
