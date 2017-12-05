package br.com.srcomputador.nfe.entidade;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("nfeProc")
public class ProcessoNFe {

	@XStreamAlias("NFe")
	private NotaFiscalEletronica nfe;
	
	@XStreamAlias("protNFe")
	@XStreamOmitField
	private Object protNFe;

	public NotaFiscalEletronica getNfe() {
		return nfe;
	}

	public void setNfe(NotaFiscalEletronica nfe) {
		this.nfe = nfe;
	}

	public Object getProtNFe() {
		return protNFe;
	}

	public void setProtNFe(Object protNFe) {
		this.protNFe = protNFe;
	}
	
	
	
}
