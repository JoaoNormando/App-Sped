package br.com.srcomputador.nfe.entidade;

import java.util.Calendar;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
@XStreamAlias("ISSQNTot")
public class ISSQNTot {

	@XStreamAlias("vServ")
	private double vServ; // Valor total dos Serviços sob não-incidência ou não tributados pelo ICMS
	@XStreamAlias("vBC")
	private double vBc; // Valor total Base de Cálculo do ISS
	@XStreamAlias("vISS")
	private double vIss; // Valor total do ISS
	@XStreamAlias("vPIS")
	private double vPis; // Valor total do PIS sobre serviços
	@XStreamAlias("vCOFINS")
	private double vCofins; // Valor total da COFINS sobre serviços
	@Temporal(TemporalType.DATE)
	@XStreamAlias("dCompet")
	private Calendar dCompet; // Data da prestação do serviço
	@XStreamAlias("vDeducao")
	private double vDeducao; // Valor total dedução para redução da Base de Cálculo
	@XStreamAlias("vOutro")
	private double vOutro; // Valor total outras retenções
	@XStreamAlias("vDescIncond")
	private double vDescIncond; // Valor total desconto incondicionado
	@XStreamAlias("vDescCond")
	private double vDescCond; // Valor total desconto condicionado
	@XStreamAlias("vISSRet")
	private double vIssRet; // Valor total retenção ISS
	@XStreamAlias("cRegTrib")
	private int cRegTrib; // Código do Regime Especial de Tributação

	public double getvServ() {
		return vServ;
	}

	public void setvServ(double vServ) {
		this.vServ = vServ;
	}

	public double getvBc() {
		return vBc;
	}

	public void setvBc(double vBc) {
		this.vBc = vBc;
	}

	public double getvIss() {
		return vIss;
	}

	public void setvIss(double vIss) {
		this.vIss = vIss;
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

	public Calendar getdCompet() {
		return dCompet;
	}

	public void setdCompet(Calendar dCompet) {
		this.dCompet = dCompet;
	}

	public double getvDeducao() {
		return vDeducao;
	}

	public void setvDeducao(double vDeducao) {
		this.vDeducao = vDeducao;
	}

	public double getvOutro() {
		return vOutro;
	}

	public void setvOutro(double vOutro) {
		this.vOutro = vOutro;
	}

	public double getvDescIncond() {
		return vDescIncond;
	}

	public void setvDescIncond(double vDescIncond) {
		this.vDescIncond = vDescIncond;
	}

	public double getvDescCond() {
		return vDescCond;
	}

	public void setvDescCond(double vDescCond) {
		this.vDescCond = vDescCond;
	}

	public double getvIssRet() {
		return vIssRet;
	}

	public void setvIssRet(double vIssRet) {
		this.vIssRet = vIssRet;
	}

	public int getcRegTrib() {
		return cRegTrib;
	}

	public void setcRegTrib(int cRegTrib) {
		this.cRegTrib = cRegTrib;
	}

}
