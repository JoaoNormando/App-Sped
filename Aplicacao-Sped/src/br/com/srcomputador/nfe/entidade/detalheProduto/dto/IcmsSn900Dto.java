package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMSSN900")
public class IcmsSn900Dto extends GenericIcms {

	@XStreamAlias("CSOSN")
	private int cSoSn;
	@XStreamAlias("modBC")
	private int modBc;
	@XStreamAlias("vBC")
	private double vBc;
	@XStreamAlias("pRedBC")
	private double pRedBc;
	@XStreamAlias("pICMS")
	private double pIcms;
	@XStreamAlias("vICMS")
	private double vIcms;
	@XStreamAlias("modBCST")
	private int modBcSt;
	@XStreamAlias("pMVAST")
	private double pMvaSt;
	@XStreamAlias("pRedBCST")
	private double pRedBcSt;
	@XStreamAlias("vBCST")
	private double vbcSt;
	@XStreamAlias("pICMSST")
	private double pIcmsSt;
	@XStreamAlias("vICMSST")
	private double vIcmsSt;
	@XStreamAlias("pCredSN")
	private double pCredSn;
	@XStreamAlias("vCredICMSSN")
	private double vCredIcmsSn;

	public int getcSoSn() {
		return cSoSn;
	}

	public void setcSoSn(int cSoSn) {
		this.cSoSn = cSoSn;
	}

	public int getModBc() {
		return modBc;
	}

	public void setModBc(int modBc) {
		this.modBc = modBc;
	}

	public double getvBc() {
		return vBc;
	}

	public void setvBc(double vBc) {
		this.vBc = vBc;
	}

	public double getpRedBc() {
		return pRedBc;
	}

	public void setpRedBc(double pRedBc) {
		this.pRedBc = pRedBc;
	}

	public double getpIcms() {
		return pIcms;
	}

	public void setpIcms(double pIcms) {
		this.pIcms = pIcms;
	}

	public double getvIcms() {
		return vIcms;
	}

	public void setvIcms(double vIcms) {
		this.vIcms = vIcms;
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

	public double getVbcSt() {
		return vbcSt;
	}

	public void setVbcSt(double vbcSt) {
		this.vbcSt = vbcSt;
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

	public double getpCredSn() {
		return pCredSn;
	}

	public void setpCredSn(double pCredSn) {
		this.pCredSn = pCredSn;
	}

	public double getvCredIcmsSn() {
		return vCredIcmsSn;
	}

	public void setvCredIcmsSn(double vCredIcmsSn) {
		this.vCredIcmsSn = vCredIcmsSn;
	}

}
