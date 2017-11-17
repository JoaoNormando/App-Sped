package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMSPart")
public class IcmsPartDto extends GenericIcms {

	@XStreamAlias("CST")
	private int cst; // Tributação do ICMS
	@XStreamAlias("modBC")
	private int modBc; // Modalidade de determinação da BC do ICMS
	@XStreamAlias("vBC")
	private double vBc; // Valor da BC do ICMS
	@XStreamAlias("pRedBC")
	private double pRedBc; // Percentual da Redução de BC
	@XStreamAlias("pICMS")
	private double pIcms; // Alíquota do imposto
	@XStreamAlias("vICMS")
	private double vIcms; // Valor do ICMS
	@XStreamAlias("modBCST")
	private int modBcSt; // Modalidade de determinação da BC do ICMS ST
	@XStreamAlias("pMVAST")
	private double pMvaSt; // Percentual da margem de valor Adicionado do ICMS ST
	@XStreamAlias("pRedBCST")
	private double pRedBcSt; // Percentual da Redução de BC do ICMS ST
	@XStreamAlias("vBCST")
	private double vBcSt; // Valor da BC do ICMS ST
	@XStreamAlias("pICMSST")
	private double pIcmsSt; // Alíquota do imposto do ICMS ST
	@XStreamAlias("vICMSST")
	private double vIcmsSt; // Valor do ICMS ST
	@XStreamAlias("pBCOp")
	private double pBcOp; // Percentual da BC operação própria
	@XStreamAlias("UFST")
	private String ufSt; // UF para qual é devido o ICMS ST

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

}
