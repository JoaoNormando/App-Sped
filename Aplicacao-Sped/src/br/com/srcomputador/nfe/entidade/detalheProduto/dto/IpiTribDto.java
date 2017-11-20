package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("IPITrib")
public class IpiTribDto {

	@XStreamAlias("CST")
	private int cst;
	@XStreamAlias("vBC")
	private double vBc;
	@XStreamAlias("pIPI")
	private double pIpi;
	@XStreamAlias("qUnid")
	private double qUnid;
	@XStreamAlias("vUnid")
	private double vUnid;
	@XStreamAlias("vIPI")
	private double vIpi;

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

	public double getpIpi() {
		return pIpi;
	}

	public void setpIpi(double pIpi) {
		this.pIpi = pIpi;
	}

	public double getqUnid() {
		return qUnid;
	}

	public void setqUnid(double qUnid) {
		this.qUnid = qUnid;
	}

	public double getvUnid() {
		return vUnid;
	}

	public void setvUnid(double vUnid) {
		this.vUnid = vUnid;
	}

	public double getvIpi() {
		return vIpi;
	}

	public void setvIpi(double vIpi) {
		this.vIpi = vIpi;
	}

}
