package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("IPI")
public class IpiDto {

	@XStreamAlias("clEnq")
	private String clEnq;
	@XStreamAlias("CNPJProd")
	private String cnpjProd;
	@XStreamAlias("cSelo")
	private String cSelo;
	@XStreamAlias("qSelo")
	private int qSelo;
	@XStreamAlias("cEnq")
	private int cEqn;
	@XStreamAlias("IPITrib")
	private IpiTribDto ipiTrib;
	@XStreamAlias("IPINT")
	private IpiNtDto ipiNt;

	public String getClEnq() {
		return clEnq;
	}

	public void setClEnq(String clEnq) {
		this.clEnq = clEnq;
	}

	public String getCnpjProd() {
		return cnpjProd;
	}

	public void setCnpjProd(String cnpjProd) {
		this.cnpjProd = cnpjProd;
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

	public int getcEqn() {
		return cEqn;
	}

	public void setcEqn(int cEqn) {
		this.cEqn = cEqn;
	}

	public IpiTribDto getIpiTrib() {
		return ipiTrib;
	}

	public void setIpiTrib(IpiTribDto ipiTrib) {
		this.ipiTrib = ipiTrib;
	}

	public IpiNtDto getIpiNt() {
		return ipiNt;
	}

	public void setIpiNt(IpiNtDto ipiNt) {
		this.ipiNt = ipiNt;
	}

}
