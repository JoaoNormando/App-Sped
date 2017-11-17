package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMSSN201")
public class IcmsSn201Dto extends GenericIcms {

	@XStreamAlias("CSOSN")
	private int cSoSn;
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
