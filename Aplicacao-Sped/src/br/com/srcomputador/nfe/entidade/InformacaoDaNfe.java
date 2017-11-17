package br.com.srcomputador.nfe.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;

@Embeddable
@XStreamAlias("infNFe")
public class InformacaoDaNfe {

	@Column(nullable = false, length = 47, name = "chave_acesso")
	@XStreamAlias("Id")
	@XStreamAsAttribute()
	private String chaveAcesso; // Chave de acesso

	@Embedded
	@XStreamAlias("ide")
	private IdentificacaoDaNfe ide;

	@Embedded
	@XStreamAlias("emit")
	private Emitente emit;
	
	@Embedded
	@XStreamAlias("dest")
	private Destinatario dest;
	
	@OneToMany(mappedBy = "nfe", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@XStreamAlias("det")
	@XStreamImplicit(itemFieldName = "prod")
	private List<Detalhamento> det;
	
	@Embedded
	@XStreamAlias("total")
	private Total total;
	
	@Transient
	@XStreamAlias("transp")
	@XStreamOmitField()
	private int transporte;
	
	@Transient
	@XStreamAlias("cobr")
	@XStreamOmitField
	private int cobr;
	
	@Transient
	@XStreamAlias("infAdic")
	@XStreamOmitField
	private int infAdic;
	
	public String getIdentificadorDaNfe() {
		return chaveAcesso;
	}

	public void setIdentificadorDaNfe(String identificadorDaNfe) {
		this.chaveAcesso = identificadorDaNfe;
	}

	public String getChaveAcesso() {
		return chaveAcesso;
	}

	public void setChaveAcesso(String chaveAcesso) {
		this.chaveAcesso = chaveAcesso;
	}

	public IdentificacaoDaNfe getIde() {
		return ide;
	}

	public void setIde(IdentificacaoDaNfe ide) {
		this.ide = ide;
	}

	public Emitente getEmit() {
		return emit;
	}

	public void setEmit(Emitente emit) {
		this.emit = emit;
	}

	public Destinatario getDest() {
		return dest;
	}

	public void setDest(Destinatario dest) {
		this.dest = dest;
	}

	public List<Detalhamento> getDet() {
		return det;
	}

	public void setDet(List<Detalhamento> det) {
		this.det = det;
	}

	public Total getTotal() {
		return total;
	}

	public void setTotal(Total total) {
		this.total = total;
	}
	
	
}
