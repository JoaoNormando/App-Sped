package br.com.srcomputador.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.entidade.Registro;

public class RegistroC112 extends Registro {

	private char codigoArrec;
	private String siglaUf;
	private String numeroDocumentoArrec;
	private String codigoAutent;
	private double valorTotalArrec;
	private Calendar dataVencimentoArrec;
	private Calendar dataPagamentoArrec;

	public char getCodigoArrec() {
		return codigoArrec;
	}

	public void setCodigoArrec(char codigoArrec) {
		this.codigoArrec = codigoArrec;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public String getNumeroDocumentoArrec() {
		return numeroDocumentoArrec;
	}

	public void setNumeroDocumentoArrec(String numeroDocumentoArrec) {
		this.numeroDocumentoArrec = numeroDocumentoArrec;
	}

	public String getCodigoAutent() {
		return codigoAutent;
	}

	public void setCodigoAutent(String codigoAutent) {
		this.codigoAutent = codigoAutent;
	}

	public double getValorTotalArrec() {
		return valorTotalArrec;
	}

	public void setValorTotalArrec(double valorTotalArrec) {
		this.valorTotalArrec = valorTotalArrec;
	}

	public Calendar getDataVencimentoArrec() {
		return dataVencimentoArrec;
	}

	public void setDataVencimentoArrec(Calendar dataVencimentoArrec) {
		this.dataVencimentoArrec = dataVencimentoArrec;
	}

	public Calendar getDataPagamentoArrec() {
		return dataPagamentoArrec;
	}

	public void setDataPagamentoArrec(Calendar dataPagamentoArrec) {
		this.dataPagamentoArrec = dataPagamentoArrec;
	}

}
