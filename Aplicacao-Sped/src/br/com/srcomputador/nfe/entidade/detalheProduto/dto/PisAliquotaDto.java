package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PISAliq")
public class PisAliquotaDto {

	@XStreamAlias("CST")
	private int cst; // Código de Situação Tributária do PIS
	@XStreamAlias("vBC")
	private double vBc; // Valor da Base de Cálculo do PIS
	@XStreamAlias("pPIS")
	private double pPis; // Alíquota do PIS (em percentual)
	@XStreamAlias("vPIS")
	private double vPis; // Valor do PIS

	public int getCst() {
		return cst;
	}

	public void setCst(int cst) {
		this.cst = cst;
	}

	public double getvBc() {
		return vBc;
	}

	public void setvBc(double vBc) {
		this.vBc = vBc;
	}

	public double getpPis() {
		return pPis;
	}

	public void setpPis(double pPis) {
		this.pPis = pPis;
	}

	public double getvPis() {
		return vPis;
	}

	public void setvPis(double vPis) {
		this.vPis = vPis;
	}

}
