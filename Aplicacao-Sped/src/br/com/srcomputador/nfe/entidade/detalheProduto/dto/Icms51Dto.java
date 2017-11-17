package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMS51")
public class Icms51Dto extends GenericIcms {

	@XStreamAlias("CST")
	private int cst; // Tributação do ICMS = 51
	@XStreamAlias("modBC")
	private int modBc; // Modalidade de determinação da BC do ICMS
	@XStreamAlias("pRedBC")
	private double pRedBc; // Percentual da Redução de BC
	@XStreamAlias("vBC")
	private double vBc; // Valor da BC do ICMS
	@XStreamAlias("pICMS")
	private double pIcms; // Alíquota do imposto
	@XStreamAlias("vICMSOp")
	private double vIcmsOp; // Valor do ICMS da Operação
	@XStreamAlias("pDif")
	private double pDif; // Percentual do diferimento
	@XStreamAlias("vICMSDif")
	private double vIcmsDif; // Valor do ICMS diferido
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

	public double getvIcmsOp() {
		return vIcmsOp;
	}

	public void setvIcmsOp(double vIcmsOp) {
		this.vIcmsOp = vIcmsOp;
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

	public double getvIcms() {
		return vIcms;
	}

	public void setvIcms(double vIcms) {
		this.vIcms = vIcms;
	}

}
