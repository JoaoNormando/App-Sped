package br.com.srcomputador.sped.entidade.blocoC;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC111 extends Registro {

	private String numeroProcesso;
	private char indicadorProcesso;

	public String getNumeroProcesso() {
		return numeroProcesso;
	}

	public void setNumeroProcesso(String numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}

	public char getIndicadorProcesso() {
		return indicadorProcesso;
	}

	public void setIndicadorProcesso(char indicadorProcesso) {
		this.indicadorProcesso = indicadorProcesso;
	}

}
