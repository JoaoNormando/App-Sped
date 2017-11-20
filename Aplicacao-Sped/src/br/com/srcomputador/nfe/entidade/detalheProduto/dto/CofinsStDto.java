package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("COFINSST")
public class CofinsStDto {

	@XStreamAlias("vBC")
	private double vBc; // Valor da Base de Cálculo da COFINS
	@XStreamAlias("pCOFINS")
	private double pCofins; // Alíquota da COFINS (em percentual)
	@XStreamAlias("qBCProd")
	private double qBcProd; // Quantidade Vendida
	@XStreamAlias("vAliqProd")
	private double vAliqProd; // Alíquota da COFINS (em reais)
	@XStreamAlias("vCOFINS")
	private double vCofins; // Valor da COFINS

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
