package br.com.srcomputador.nfe.entidade.detalheProduto;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Embeddable
@Component
public class Ipi {

	private String clEnq;
	private String cnpj;
	private String cSelo;
	private int qSelo;
	private String cEnq;
	private int cst;
	private double vBc;
	private double pIpi;
	private double qUnid;
	private double vUnid;
	private double vIpi;
	
	public String getClEnq() {
		return clEnq;
	}

	public void setClEnq(String clEnq) {
		this.clEnq = clEnq;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getcSelo() {
		return cSelo;
	}

	public void setcSelo(String cSelo) {
		this.cSelo = cSelo;
	}

	public int getqSelo() {
		return qSelo;
	}

	public void setqSelo(int qSelo) {
		this.qSelo = qSelo;
	}

	public String getcEnq() {
		return cEnq;
	}

	public void setcEnq(String cEnq) {
		this.cEnq = cEnq;
	}

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
