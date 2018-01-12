package br.com.srcomputador.nfe.entidade;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
@XStreamAlias("infAic")
public class InformacaoAdicional {
	
	@Column(name = "informacao_complementar", length = 6555, columnDefinition = "TEXT")
	@XStreamAlias("infCpl")
	private String infCpl;

	public String getInfCpl() {
		return infCpl;
	}

	public void setInfCpl(String infCpl) {
		this.infCpl = infCpl;
	}

}
