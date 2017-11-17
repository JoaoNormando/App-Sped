package br.com.srcomputador.nfe.entidade;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
@XStreamAlias("retTrib")
public class RetTrib {

	@XStreamAlias("vRetPIS")
	private double vRetPIS; // Valor Retido de PIS
	@XStreamAlias("vRetCOFINS")
	private double vRetCofins; // Valor Retido de COFINS
	@XStreamAlias("vRetCSLL")
	private double vRetCsll; // Valor Retido de CSLL
	@XStreamAlias("vBCIRRF")
	private double vBcIrrf; // Base de Cálculo do IRRF
	@XStreamAlias("vIRRF")
	private double vIrrf; // Valor Retido do IRRF
	@XStreamAlias("vBCRetPrev")
	private double vBcRetPrev; // Base de Cálculo da Retenção da Previdência Social
	@XStreamAlias("vRetPrev")
	private double vRetPrev; // Valor da Retenção da Previdência Social

	public double getvRetPIS() {
		return vRetPIS;
	}

	public void setvRetPIS(double vRetPIS) {
		this.vRetPIS = vRetPIS;
	}

	public double getvRetCofins() {
		return vRetCofins;
	}

	public void setvRetCofins(double vRetCofins) {
		this.vRetCofins = vRetCofins;
	}

	public double getvRetCsll() {
		return vRetCsll;
	}

	public void setvRetCsll(double vRetCsll) {
		this.vRetCsll = vRetCsll;
	}

	public double getvBcIrrf() {
		return vBcIrrf;
	}

	public void setvBcIrrf(double vBcIrrf) {
		this.vBcIrrf = vBcIrrf;
	}

	public double getvIrrf() {
		return vIrrf;
	}

	public void setvIrrf(double vIrrf) {
		this.vIrrf = vIrrf;
	}

	public double getvBcRetPrev() {
		return vBcRetPrev;
	}

	public void setvBcRetPrev(double vBcRetPrev) {
		this.vBcRetPrev = vBcRetPrev;
	}

	public double getvRetPrev() {
		return vRetPrev;
	}

	public void setvRetPrev(double vRetPrev) {
		this.vRetPrev = vRetPrev;
	}

}