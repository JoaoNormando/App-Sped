package br.com.srcomputador.nfe.entidade;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

import br.com.srcomputador.entidade.Importacao;

@Entity
@Table(name = "NFe")
@XStreamAlias("NFe")
@Component
public class NotaFiscalEletronica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	@XStreamAlias("infNFe")
	private InformacaoDaNfe infNfe;

	@ManyToOne
	@JoinColumn(name = "id_descricao", foreignKey = @ForeignKey(name = "fk_descricao_nfe"))
	private Importacao importacao;

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

	public Importacao getImportacao() {
		return importacao;
	}

	public void setImportacao(Importacao importacao) {
		this.importacao = importacao;
	}

	public int getSignature() {
		return signature;
	}

	public void setSignature(int signature) {
		this.signature = signature;
	}

}
