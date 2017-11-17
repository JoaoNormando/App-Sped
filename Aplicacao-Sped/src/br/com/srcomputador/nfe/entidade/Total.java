package br.com.srcomputador.nfe.entidade;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
public class Total {
	
	@Embedded
	@XStreamAlias("ICMSTot")
	private IcmsTotal icmsTot;
	
	@Embedded
	@XStreamAlias("ISSQNtot")
	private ISSQNTot issqnTot;
	
	@Embedded
	@XStreamAlias("retTrib")
	private RetTrib retTrib; 
	
	public IcmsTotal getIcmsTot() {
		return icmsTot;
	}

	public void setIcmsTot(IcmsTotal icmsTot) {
		this.icmsTot = icmsTot;
	}

	public ISSQNTot getIssqnTot() {
		return issqnTot;
	}

	public void setIssqnTot(ISSQNTot issqnTot) {
		this.issqnTot = issqnTot;
	}

	public RetTrib getRetTrib() {
		return retTrib;
	}

	public void setRetTrib(RetTrib retTrib) {
		this.retTrib = retTrib;
	}

	

}
