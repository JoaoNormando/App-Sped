package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ISSQN")
public class IssqnDto {

	@XStreamAlias("vBC")
	private double vBc; // Valor da Base de Cálculo do ISSQN
	@XStreamAlias("vAliq")
	private double vAliq; // Alíquota do ISSQN
	@XStreamAlias("vISSQN")
	private double vIssqn; // Valor do ISSQN
	@XStreamAlias("cMunFG")
	private int cMunFg; // Código do município de ocorrência do fato gerador do ISSQN
	@XStreamAlias("cListServ")
	private String cListServ; // Item da Lista de Serviços
	@XStreamAlias("vDeducao")
	private double vDeducao; // Valor dedução para redução da Base de Cálculo
	@XStreamAlias("vOutro")
	private double vOutro; // Valor outras retenções
	@XStreamAlias("vDescIncond")
	private double vDescIncond; // Valor desconto incondicionado
	@XStreamAlias("vDescCond")
	private double vDescCond; // Valor desconto condicionado
	@XStreamAlias("vISSRet")
	private double vIssRet; // Valor retenção ISS
	@XStreamAlias("indISS")
	private int indIss; // Indicador da exigibilidade do ISS
	@XStreamAlias("cServico")
	private String cServico; // Código do serviço prestado dentro do município
	@XStreamAlias("cMun")
	private int cMun; // Código do Município de incidência do imposto
	@XStreamAlias("cPais")
	private int cPais; // Código do País onde o serviço foi prestado
	@XStreamAlias("nProcesso")
	private String nProcesso; // Número do processo judicial ou administrativo de suspensão da exigibilidade
	@XStreamAlias("indIncentivo")
	private int indIncentivo; // Indicador de incentivo Fiscal

	public double getvBc() {
		return vBc;
	}

	public void setvBc(double vBc) {
		this.vBc = vBc;
	}

	public double getvAliq() {
		return vAliq;
	}

	public void setvAliq(double vAliq) {
		this.vAliq = vAliq;
	}

	public double getvIssqn() {
		return vIssqn;
	}

	public void setvIssqn(double vIssqn) {
		this.vIssqn = vIssqn;
	}

	public int getcMunFg() {
		return cMunFg;
	}

	public void setcMunFg(int cMunFg) {
		this.cMunFg = cMunFg;
	}

	public String getcListServ() {
		return cListServ;
	}

	public void setcListServ(String cListServ) {
		this.cListServ = cListServ;
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

	public int getIndIss() {
		return indIss;
	}

	public void setIndIss(int indIss) {
		this.indIss = indIss;
	}

	public String getcServico() {
		return cServico;
	}

	public void setcServico(String cServico) {
		this.cServico = cServico;
	}

	public int getcMun() {
		return cMun;
	}

	public void setcMun(int cMun) {
		this.cMun = cMun;
	}

	public int getcPais() {
		return cPais;
	}

	public void setcPais(int cPais) {
		this.cPais = cPais;
	}

	public String getnProcesso() {
		return nProcesso;
	}

	public void setnProcesso(String nProcesso) {
		this.nProcesso = nProcesso;
	}

	public int getIndIncentivo() {
		return indIncentivo;
	}

	public void setIndIncentivo(int indIncentivo) {
		this.indIncentivo = indIncentivo;
	}

}
