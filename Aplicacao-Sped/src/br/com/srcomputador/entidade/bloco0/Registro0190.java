package br.com.srcomputador.entidade.bloco0;

/*
 * Objetivo descrever as unidades de medidas (UM) utilizadas no arquivo digital.
 * Não podem ser informados 2 (dois) ou mais registros com o mesmo código de UM
 * */

public class Registro0190 extends Registro {

	private String codigoUm;
	private String descricaoUm;

	public String getCodigoUm() {
		return codigoUm;
	}

	public void setCodigoUm(String codigoUm) {
		this.codigoUm = codigoUm;
	}

	public String getDescricaoUm() {
		return descricaoUm;
	}

	public void setDescricaoUm(String descricaoUm) {
		this.descricaoUm = descricaoUm;
	}

}
