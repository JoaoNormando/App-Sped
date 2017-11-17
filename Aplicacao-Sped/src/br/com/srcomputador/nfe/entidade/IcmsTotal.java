package br.com.srcomputador.nfe.entidade;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
@XStreamAlias("ICMSTot")
public class IcmsTotal {

	@Transient
	private final String PREFIXO = "icmsTotal_";

	@Column(name = PREFIXO + "valor_bc")
	@XStreamAlias("vBC")
	private double vBc; // Base de Cálculo do ICMS
	@Column(name = PREFIXO + "valor_icms")
	@XStreamAlias("vICMS")
	private double vIcms; // Valor Total do ICMS
	@Column(name = PREFIXO + "valor_icms_deson")
	@XStreamAlias("vICMSDeson")
	private double vIcmsDeson; // Valor Total do ICMS desonerado
	@Column(name = PREFIXO + "valor_bc_st")
	@XStreamAlias("vBCST")
	private double vBcSt; // Base de Cálculo do ICMS ST
	@Column(name = PREFIXO + "valor_st")
	@XStreamAlias("vST")
	private double vSt; // Valor Total do ICMS ST
	@Column(name = PREFIXO + "valor_prod")
	@XStreamAlias("vProd")
	private double vProd; // Valor Total dos produtos e serviços
	@Column(name = PREFIXO + "valor_frete")
	@XStreamAlias("vFrete")
	private double vFrete; // Valor Total do Frete
	@Column(name = PREFIXO + "valor_seg")
	@XStreamAlias("vSeg")
	private double vSeg; // Valor Total do Seguro
	@Column(name = PREFIXO + "valor_desc")
	@XStreamAlias("vDesc")
	private double vDesc; // Valor Total do Desconto
	@Column(name = PREFIXO + "valor_ii")
	@XStreamAlias("vII")
	private double vII; // Valor Total do II
	@Column(name = PREFIXO + "valor_ipi")
	@XStreamAlias("vIPI")
	private double vIpi; // Valor Total do IPI
	@Column(name = PREFIXO + "valor_pis")
	@XStreamAlias("vPIS")
	private double vPis; // Valor do PIS
	@Column(name = PREFIXO + "valor_cofins")
	@XStreamAlias("vCOFINS")
	private double vCofins; // Valor da COFINS
	@Column(name = PREFIXO + "valor_outro")
	@XStreamAlias("vOutro")
	private double vOutro; // Outras Despesas acessórias
	@Column(name = PREFIXO + "valor_nf")
	@XStreamAlias("vNF")
	private double vNf; // Valor Total da NF-e
	@Column(name = PREFIXO + "valor_tot_trib")
	@XStreamAlias("vTotTrib")
	private double vTotTrib; // Valor aproximado total de tributos federais, estaduais e municipais.

	public double getvBc() {
		return vBc;
	}

	public void setvBc(double vBc) {
		this.vBc = vBc;
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

	public double getvBcSt() {
		return vBcSt;
	}

	public void setvBcSt(double vBcSt) {
		this.vBcSt = vBcSt;
	}

	public double getvSt() {
		return vSt;
	}

	public void setvSt(double vSt) {
		this.vSt = vSt;
	}

	public double getvProd() {
		return vProd;
	}

	public void setvProd(double vProd) {
		this.vProd = vProd;
	}

	public double getvFrete() {
		return vFrete;
	}

	public void setvFrete(double vFrete) {
		this.vFrete = vFrete;
	}

	public double getvSeg() {
		return vSeg;
	}

	public void setvSeg(double vSeg) {
		this.vSeg = vSeg;
	}

	public double getvDesc() {
		return vDesc;
	}

	public void setvDesc(double vDesc) {
		this.vDesc = vDesc;
	}

	public double getvII() {
		return vII;
	}

	public void setvII(double vII) {
		this.vII = vII;
	}

	public double getvIpi() {
		return vIpi;
	}

	public void setvIpi(double vIpi) {
		this.vIpi = vIpi;
	}

	public double getvPis() {
		return vPis;
	}

	public void setvPis(double vPis) {
		this.vPis = vPis;
	}

	public double getvCofins() {
		return vCofins;
	}

	public void setvCofins(double vCofins) {
		this.vCofins = vCofins;
	}

	public double getvOutro() {
		return vOutro;
	}

	public void setvOutro(double vOutro) {
		this.vOutro = vOutro;
	}

	public double getvNf() {
		return vNf;
	}

	public void setvNf(double vNf) {
		this.vNf = vNf;
	}

	public double getvTotTrib() {
		return vTotTrib;
	}

	public void setvTotTrib(double vTotTrib) {
		this.vTotTrib = vTotTrib;
	}

	public String getPREFIXO() {
		return PREFIXO;
	}

}
