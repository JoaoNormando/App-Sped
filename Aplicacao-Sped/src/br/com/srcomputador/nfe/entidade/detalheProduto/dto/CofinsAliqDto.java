package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("COFINSAliq")
public class CofinsAliqDto {

	@XStreamAlias("CST")
	private int cst; // Código de Situação Tributária da COFINS
	@XStreamAlias("vBC")
	private double vBc; // Valor da Base de Cálculo da COFINS
	@XStreamAlias("pCOFINS")
	private double pCofins; // Alíquota da COFINS (em percentual)
	@XStreamAlias("vCOFINS")
	private double vCofins; // Valor da COFINS

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

	public double getvCofins() {
		return vCofins;
	}

	public void setvCofins(double vCofins) {
		this.vCofins = vCofins;
	}

}
