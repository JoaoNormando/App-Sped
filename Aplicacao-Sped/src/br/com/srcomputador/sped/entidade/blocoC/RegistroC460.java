package br.com.srcomputador.sped.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC460 extends Registro {

	private String codigoModelo;
	private String codigoSituacao;
	private String numeroDocumento;
	private Calendar dataDocumento;
	private double valorDocumento;
	private double valorPisPasep;
	private double valorCofins;
	private String cnpjCpf;
	private String nomeAdquirente;

	public String getCodigoModelo() {
		return codigoModelo;
	}

	public void setCodigoModelo(String codigoModelo) {
		this.codigoModelo = codigoModelo;
	}

	public String getCodigoSituacao() {
		return codigoSituacao;
	}

	public void setCodigoSituacao(String codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Calendar getDataDocumento() {
		return dataDocumento;
	}

	public void setDataDocumento(Calendar dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	public double getValorDocumento() {
		return valorDocumento;
	}

	public void setValorDocumento(double valorDocumento) {
		this.valorDocumento = valorDocumento;
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

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public String getNomeAdquirente() {
		return nomeAdquirente;
	}

	public void setNomeAdquirente(String nomeAdquirente) {
		this.nomeAdquirente = nomeAdquirente;
	}

}
