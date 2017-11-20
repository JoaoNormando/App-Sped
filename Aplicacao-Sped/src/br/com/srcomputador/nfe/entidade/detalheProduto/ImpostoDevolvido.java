package br.com.srcomputador.nfe.entidade.detalheProduto;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
@XStreamAlias("impostoDevol")
public class ImpostoDevolvido {

	@Transient
	private final String TABELA = "impostoDevolv_";
	
	@Column(name = TABELA + "pdevol")
	@XStreamAlias("pDevol")
	private double pDevol; // Percentual da mercadoria devolvida
	@Column(name = TABELA + "ipi")
	@XStreamAlias("IPI")
	private String ipi; // Informação do IPI devolvido
	@Column(name = TABELA + "vipi_devolv")
	@XStreamAlias("vIPIDevol")
	private double vIpiDevol; // Valor do IPI devolvido
	@Column(length = 500, name = TABELA + "infadd_prod")
	@XStreamAlias("infAdProd")
	private String infAdProd; // Informações Adicionais do Produto

	public double getpDevol() {
		return pDevol;
	}

	public void setpDevol(double pDevol) {
		this.pDevol = pDevol;
	}

	public String getIpi() {
		return ipi;
	}

	public void setIpi(String ipi) {
		this.ipi = ipi;
	}

	public double getvIpiDevol() {
		return vIpiDevol;
	}

	public void setvIpiDevol(double vIpiDevol) {
		this.vIpiDevol = vIpiDevol;
	}

	public String getInfAdProd() {
		return infAdProd;
	}

	public void setInfAdProd(String infAdProd) {
		this.infAdProd = infAdProd;
	}

}
