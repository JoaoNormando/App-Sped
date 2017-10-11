package br.com.srcomputador.entidade.bloco0;

import br.com.srcomputador.entidade.Registro;

/* 
 * Dados do contribuinte substituto 
 * ou responsável pelo ICMS destino do Sped-Fiscal.
 * 
 * */

public class Registro0015 extends Registro {

	private String siglaUfSt;
	private String inscricaoEstadualSt;

	public String getSiglaUfSt() {
		return siglaUfSt;
	}

	public void setSiglaUfSt(String siglaUfSt) {
		this.siglaUfSt = siglaUfSt;
	}

	public String getInscricaoEstadualSt() {
		return inscricaoEstadualSt;
	}

	public void setInscricaoEstadualSt(String inscricaoEstadualSt) {
		this.inscricaoEstadualSt = inscricaoEstadualSt;
	}

}
