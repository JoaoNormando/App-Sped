package br.com.srcomputador.nfe.entidade.detalheProduto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Embeddable
@Component
public class Ipi {

	@Transient
	private final String TABELA = "ipi_";
	
	@Column(name = TABELA + "cl_enq")
	private String clEnq;
	@Column(name = TABELA + "cnpj")
	private String cnpj;
	@Column(name = TABELA + "cselo")
	private String cSelo;
	@Column(name = TABELA + "qselo")
	private int qSelo;
	@Column(name = TABELA + "ceqn")
	private String cEnq;
	@Column(name = TABELA + "cst")
	private int cst;
	@Column(name = TABELA + "vbc")
	private double vBc;
	@Column(name = TABELA + "p_ipi")
	private double pIpi;
	@Column(name = TABELA + "qunid")
	private double qUnid;
	@Column(name = TABELA + "vunid")
	private double vUnid;
	@Column(name = TABELA + "vipi")
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
