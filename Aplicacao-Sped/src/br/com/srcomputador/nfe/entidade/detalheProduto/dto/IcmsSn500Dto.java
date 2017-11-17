package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMSSN500")
public class IcmsSn500Dto extends GenericIcms {

	@XStreamAlias("CSOSN")
	private int cSoSn;
	@XStreamAlias("vBCSTRet")
	private double vBcStRet;
	@XStreamAlias("vICMSSTRet")
	private double vIcmsStRet;

	public int getcSoSn() {
		return cSoSn;
	}

	public void setcSoSn(int cSoSn) {
		this.cSoSn = cSoSn;
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

}
