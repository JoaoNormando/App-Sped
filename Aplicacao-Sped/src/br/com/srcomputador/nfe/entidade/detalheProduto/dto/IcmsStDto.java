package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMSST")
public class IcmsStDto extends GenericIcms {

	@XStreamAlias("CST")
	private int cst;
	@XStreamAlias("vBCSTRet")
	private double vBcStRet;
	@XStreamAlias("vICMSSTRet")
	private double vIcmsStRet;
	@XStreamAlias("vBCSTDest")
	private double vBcStDest;
	@XStreamAlias("vICMSSTDest")
	private double vIcmsStDest;

	public int getCst() {
		return cst;
	}

	public void setCst(int cst) {
		this.cst = cst;
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

}
