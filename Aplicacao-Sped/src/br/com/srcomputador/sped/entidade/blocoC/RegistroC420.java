package br.com.srcomputador.sped.entidade.blocoC;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC420 extends Registro {

	private String codigoTotalizador;
	private double valorAcumuladoTotalizador;
	private int numeroTotalizador;
	private String descricaoTotalizador;

	public String getCodigoTotalizador() {
		return codigoTotalizador;
	}

	public void setCodigoTotalizador(String codigoTotalizador) {
		this.codigoTotalizador = codigoTotalizador;
	}

	public double getValorAcumuladoTotalizador() {
		return valorAcumuladoTotalizador;
	}

	public void setValorAcumuladoTotalizador(double valorAcumuladoTotalizador) {
		this.valorAcumuladoTotalizador = valorAcumuladoTotalizador;
	}

	public int getNumeroTotalizador() {
		return numeroTotalizador;
	}

	public void setNumeroTotalizador(int numeroTotalizador) {
		this.numeroTotalizador = numeroTotalizador;
	}

	public String getDescricaoTotalizador() {
		return descricaoTotalizador;
	}

	public void setDescricaoTotalizador(String descricaoTotalizador) {
		this.descricaoTotalizador = descricaoTotalizador;
	}

}
