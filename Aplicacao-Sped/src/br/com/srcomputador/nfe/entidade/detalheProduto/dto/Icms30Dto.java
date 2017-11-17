package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMS30")
public class Icms30Dto extends GenericIcms {

	@XStreamAlias("CST")
	private int cst;
	@XStreamAlias("modBCST")
	private int modBcSt;
	@XStreamAlias("pMVAST")
	private double pMvaSt;
	@XStreamAlias("pRedBCST")
	private double pRedBcSt;
	@XStreamAlias("vBCST")
	private double vBcSt;
	@XStreamAlias("pICMSST")
	private double pIcmsSt;
	@XStreamAlias("vICMSST")
	private double vIcmsSt;
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

	public int getModBcSt() {
		return modBcSt;
	}

	public void setModBcSt(int modBcSt) {
		this.modBcSt = modBcSt;
	}

	public double getpMvaSt() {
		return pMvaSt;
	}

	public void setpMvaSt(double pMvaSt) {
		this.pMvaSt = pMvaSt;
	}

	public double getpRedBcSt() {
		return pRedBcSt;
	}

	public void setpRedBcSt(double pRedBcSt) {
		this.pRedBcSt = pRedBcSt;
	}

	public double getvBcSt() {
		return vBcSt;
	}

	public void setvBcSt(double vBcSt) {
		this.vBcSt = vBcSt;
	}

	public double getpIcmsSt() {
		return pIcmsSt;
	}

	public void setpIcmsSt(double pIcmsSt) {
		this.pIcmsSt = pIcmsSt;
	}

	public double getvIcmsSt() {
		return vIcmsSt;
	}

	public void setvIcmsSt(double vIcmsSt) {
		this.vIcmsSt = vIcmsSt;
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
