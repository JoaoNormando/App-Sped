package br.com.srcomputador.entidade.blocoC;

import br.com.srcomputador.entidade.Registro;

public class RegistroC120 extends Registro {

	private char codigoDocumentoImportacao;
	private String numeroDocumentoImportacao;
	private double valorPisPasep;
	private double valorCofins;
	private String numeroAtoConcessorio;

	public char getCodigoDocumentoImportacao() {
		return codigoDocumentoImportacao;
	}

	public void setCodigoDocumentoImportacao(char codigoDocumentoImportacao) {
		this.codigoDocumentoImportacao = codigoDocumentoImportacao;
	}

	public String getNumeroDocumentoImportacao() {
		return numeroDocumentoImportacao;
	}

	public void setNumeroDocumentoImportacao(String numeroDocumentoImportacao) {
		this.numeroDocumentoImportacao = numeroDocumentoImportacao;
	}

	public double getValorPisPasep() {
		return valorPisPasep;
	}

	public void setValorPisPasep(double valorPisPasep) {
		this.valorPisPasep = valorPisPasep;
	}

	public double getValorCofins() {
		return valorCofins;
	}

	public void setValorCofins(double valorCofins) {
		this.valorCofins = valorCofins;
	}

	public String getNumeroAtoConcessorio() {
		return numeroAtoConcessorio;
	}

	public void setNumeroAtoConcessorio(String numeroAtoConcessorio) {
		this.numeroAtoConcessorio = numeroAtoConcessorio;
	}

}
