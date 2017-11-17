package br.com.srcomputador.nfe.entidade;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@Entity
@Table(name = "NFe")
@XStreamAlias("NFe")
public class NotaFiscalEletronica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	@XStreamAlias("infNFe")
	private InformacaoDaNfe infNfe;

	@Transient
	@XStreamAlias("Signature")
	@XStreamOmitField
	private int signature;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public InformacaoDaNfe getInfNfe() {
		return infNfe;
	}

	public void setInfNfe(InformacaoDaNfe infNfe) {
		this.infNfe = infNfe;
	}

}
