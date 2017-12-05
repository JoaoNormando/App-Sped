package br.com.srcomputador.nfe.entidade;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
@XStreamAlias("retTrib")
public class RetTrib {

	@Transient
	private final String TABELA = "retTrib_";
	
	@Column(name = TABELA + "vRet_pis")
	@XStreamAlias("vRetPIS")
	private double vRetPIS; // Valor Retido de PIS
	@Column(name = TABELA + "vRet_cofins")
	@XStreamAlias("vRetCOFINS")
	private double vRetCofins; // Valor Retido de COFINS
	@Column(name = TABELA + "vRet_csll")
	@XStreamAlias("vRetCSLL")
	private double vRetCsll; // Valor Retido de CSLL
	@Column(name = TABELA + "vbc_irrf")
	@XStreamAlias("vBCIRRF")
	private double vBcIrrf; // Base de Cálculo do IRRF
	@Column(name = TABELA + "v_irrf")
	@XStreamAlias("vIRRF")
	private double vIrrf; // Valor Retido do IRRF
	@Column(name = TABELA + "vbc_retPrev")
	@XStreamAlias("vBCRetPrev")
	private double vBcRetPrev; // Base de Cálculo da Retenção da Previdência Social
	@Column(name = TABELA + "v_retPrev")
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