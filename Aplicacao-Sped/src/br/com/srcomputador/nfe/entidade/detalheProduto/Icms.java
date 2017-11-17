package br.com.srcomputador.nfe.entidade.detalheProduto;

import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
public class Icms {

	@XStreamAlias("origem")
	private int orig;

	@XStreamAlias("cst")
	private int cst;

	@XStreamAlias("modBc")
	private int modBc;

	private int modBcSt;
	private double pMvaSt;
	private double pRedBc;
	private double pRedBcSt;
	private double pIcmsSt;
	private double vIcmsSt;

	@XStreamAlias("vBC")
	private double vBc;
	private double vBcSt;
	@XStreamAlias("")
	private double pIcms;
	private double vIcmsStRet;
	@XStreamAlias("")
	private double vIcms;
	private double vIcmsDeson;
	private double motDesIcms;
	private double vIcmsOp;
	private double pDif;
	private double vIcmsDif;
	private double vBcStRet;
	private double pBcOp;
	private String ufSt;
	private double vBcStDest;
	private double vIcmsStDest;
	private int cSoSn;
	private double pCredSn;
	private double vCredIcmsSn;

	public int getOrig() {
		return orig;
	}

	public void setOrig(int origem) {
		this.orig = origem;
	}

	public int getCst() {
		return cst;
	}

	public void setCst(int cst) {
		this.cst = cst;
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

	public double getvBcSt() {
		return vBcSt;
	}

	public void setvBcSt(double vBcSt) {
		this.vBcSt = vBcSt;
	}

	public double getvIcmsDeson() {
		return vIcmsDeson;
	}

	public void setvIcmsDeson(double vIcmsDeson) {
		this.vIcmsDeson = vIcmsDeson;
	}

	public double getMotDesIcms() {
		return motDesIcms;
	}

	public void setMotDesIcms(double motDesIcms) {
		this.motDesIcms = motDesIcms;
	}

	public double getpRedBc() {
		return pRedBc;
	}

	public void setpRedBc(double pRedBc) {
		this.pRedBc = pRedBc;
	}

	public double getpDif() {
		return pDif;
	}

	public void setpDif(double pDif) {
		this.pDif = pDif;
	}

	public double getvIcmsDif() {
		return vIcmsDif;
	}

	public void setvIcmsDif(double vIcmsDif) {
		this.vIcmsDif = vIcmsDif;
	}

	public double getvIcmsOp() {
		return vIcmsOp;
	}

	public void setvIcmsOp(double vIcmsOp) {
		this.vIcmsOp = vIcmsOp;
	}

	public double getvBcStRet() {
		return vBcStRet;
	}

	public void setvBcStRet(double vBcStRet) {
		this.vBcStRet = vBcStRet;
	}

	public double getvIcmsStRet() {
		return vIcmsStRet;
	}

	public void setvIcmsStRet(double vIcmsStRet) {
		this.vIcmsStRet = vIcmsStRet;
	}

	public double getpBcOp() {
		return pBcOp;
	}

	public void setpBcOp(double pBcOp) {
		this.pBcOp = pBcOp;
	}

	public String getUfSt() {
		return ufSt;
	}

	public void setUfSt(String ufSt) {
		this.ufSt = ufSt;
	}

	public double getvBcStDest() {
		return vBcStDest;
	}

	public void setvBcStDest(double vBcStDest) {
		this.vBcStDest = vBcStDest;
	}

	public double getvIcmsStDest() {
		return vIcmsStDest;
	}

	public void setvIcmsStDest(double vIcmsStDest) {
		this.vIcmsStDest = vIcmsStDest;
	}

	public int getcSoSn() {
		return cSoSn;
	}

	public void setcSoSn(int cSoSn) {
		this.cSoSn = cSoSn;
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
