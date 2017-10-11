package br.com.srcomputador.entidade.blocoC;

import br.com.srcomputador.entidade.Registro;

public class RegistroC140 extends Registro {

	private char indicadorEmitente;
	private String indicadorTitulo;
	private String descricaoTitulo;
	private String codigoNumeroTitulo;
	private int quantidadeParcelas;
	private double valorTotalTitulo;

	public char getIndicadorEmitente() {
		return indicadorEmitente;
	}

	public void setIndicadorEmitente(char indicadorEmitente) {
		this.indicadorEmitente = indicadorEmitente;
	}

	public String getIndicadorTitulo() {
		return indicadorTitulo;
	}

	public void setIndicadorTitulo(String indicadorTitulo) {
		this.indicadorTitulo = indicadorTitulo;
	}

	public String getDescricaoTitulo() {
		return descricaoTitulo;
	}

	public void setDescricaoTitulo(String descricaoTitulo) {
		this.descricaoTitulo = descricaoTitulo;
	}

	public String getCodigoNumeroTitulo() {
		return codigoNumeroTitulo;
	}

	public void setCodigoNumeroTitulo(String codigoNumeroTitulo) {
		this.codigoNumeroTitulo = codigoNumeroTitulo;
	}

	public int getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(int quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public double getValorTotalTitulo() {
		return valorTotalTitulo;
	}

	public void setValorTotalTitulo(double valorTotalTitulo) {
		this.valorTotalTitulo = valorTotalTitulo;
	}

}
