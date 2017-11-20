package br.com.srcomputador.nfe.entidade.detalheProduto;

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

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.ImpostoDto;

@Entity
@Table(name = "NFe_detalhe_produto")
@XStreamAlias("det")
public class Detalhamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@XStreamAlias("nItem")
	private int numeroItem;

	@Embedded
	@XStreamAlias("prod")
	private Produto produto;
	
	@Transient
	@XStreamAlias("imposto")
	private ImpostoDto impostoDto;
	
	@Embedded
	@XStreamOmitField
	private Imposto imposto;
	
	@Embedded
	@XStreamAlias("impostoDevol")
	private ImpostoDevolvido impostoDevol;
	
	@ManyToOne
	@JoinColumn(name = "nfe_id", foreignKey = @ForeignKey(name = "fk_nfe_detalhamento"))
	private NotaFiscalEletronica nfe;
	
	public Detalhamento() {
		imposto = new Imposto();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Imposto getImposto() {
		return imposto;
	}
	
	@Autowired
	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public ImpostoDto getImpostoDto() {
		return impostoDto;
	}

	public void setImpostoDto(ImpostoDto impostoDto) {
		this.impostoDto = impostoDto;
	}

	public NotaFiscalEletronica getNfe() {
		return nfe;
	}

	public void setNfe(NotaFiscalEletronica nfe) {
		this.nfe = nfe;
	}

	public ImpostoDevolvido getImpostoDevol() {
		return impostoDevol;
	}

	public void setImpostoDevol(ImpostoDevolvido impostoDevol) {
		this.impostoDevol = impostoDevol;
	}
	
	

}
