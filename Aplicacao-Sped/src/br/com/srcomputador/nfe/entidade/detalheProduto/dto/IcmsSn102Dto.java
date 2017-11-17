package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ICMSSN102")
public class IcmsSn102Dto extends GenericIcms {

	@XStreamAlias("CSOSN")
	private int cSoSn; // Código de Situação da Operação – Simples Nacional

	public int getcSoSn() {
		return cSoSn;
	}

	public void setcSoSn(int cSoSn) {
		this.cSoSn = cSoSn;
	}
	
	
}
