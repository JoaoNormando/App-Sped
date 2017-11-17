package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMSSN101")
public class IcmsSn101Dto extends GenericIcms {

	@XStreamAlias("CSOSN")
	private int cSoSn;
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
