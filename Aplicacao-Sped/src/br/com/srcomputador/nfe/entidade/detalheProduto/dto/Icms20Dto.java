package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMS20")
public class Icms20Dto extends GenericIcms {

	@XStreamAlias("CST")
	private int cst; // Tributação do ICMS = 20
	@XStreamAlias("modBC")
	private int modBc; // Modalidade de determinação da BC do ICMS
	@XStreamAlias("pRedBC")
	private double pRedBc; // Percentual da Redução de BC
	@XStreamAlias("vBC")
	private double vBc; // Valor da BC do ICMS
	@XStreamAlias("pICMS")
	private double pIcms; // Alíquota do imposto
	@XStreamAlias("vICMS")
	private double vIcms; // Valor do ICMS
	@XStreamAlias("vICMSDeson")
	private double vIcmsDeson; // Valor do ICMS desonerado
	@XStreamAlias("motDesICMS")
	private double motDesIcms; // Motivo da desoneração do ICMS

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

	public double getpRedBc() {
		return pRedBc;
	}

	public void setpRedBc(double pRedBc) {
		this.pRedBc = pRedBc;
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

}
