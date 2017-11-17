package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMS00")
public class Icms00Dto extends GenericIcms{

	@XStreamAlias("CST")
	private int cst; // Tributação do ICMS = 00
	@XStreamAlias("modBC")
	private int modBc; // Modalidade de determinação da BC do ICMS
	@XStreamAlias("vBC")
	private double vBc; // Valor da BC do ICMS
	@XStreamAlias("pICMS")
	private double pIcms; // Alíquota do imposto
	@XStreamAlias("vICMS")
	private double vIcms; // Valor do ICMS
	
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

}
