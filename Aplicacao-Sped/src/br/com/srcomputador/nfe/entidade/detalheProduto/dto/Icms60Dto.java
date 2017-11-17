package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMS60")
public class Icms60Dto extends GenericIcms {

	@XStreamAlias("CST")
	private int cst; // Tributação do ICMS = 60
	@XStreamAlias("vBCSTRet")
	private double vBcStRet; // Valor da BC do ICMS ST retido
	@XStreamAlias("vICMSSTRet")
	private double vIcmsStRet; // Valor do ICMS ST retido

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

}
