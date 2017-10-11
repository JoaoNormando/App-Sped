package br.com.srcomputador.entidade.bloco0;

import br.com.srcomputador.entidade.Registro;

/*
 * Este Registro tem por objetivo codificar todas as informações
 * complementares dos documentos fiscais exigidas pela legislação fiscal.
 * 
 * */

public class Registro0450 extends Registro {

	private String codigoInfoComplementar;
	private String infoComplementar;

	public String getCodigoInfoComplementar() {
		return codigoInfoComplementar;
	}

	public void setCodigoInfoComplementar(String codigoInfoComplementar) {
		this.codigoInfoComplementar = codigoInfoComplementar;
	}

	public String getInfoComplementar() {
		return infoComplementar;
	}

	public void setInfoComplementar(String infoComplementar) {
		this.infoComplementar = infoComplementar;
	}

}
