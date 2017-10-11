package br.com.srcomputador.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.entidade.Registro;

public class RegistroC114 extends Registro {

	private String codigoDocumentoFiscal;
	private String numeroEcf;
	private String numeroCxEcf;
	private String numeroDocumentoFiscal;
	private Calendar dataEmissao;

	public String getCodigoDocumentoFiscal() {
		return codigoDocumentoFiscal;
	}

	public void setCodigoDocumentoFiscal(String codigoDocumentoFiscal) {
		this.codigoDocumentoFiscal = codigoDocumentoFiscal;
	}

	public String getNumeroEcf() {
		return numeroEcf;
	}

	public void setNumeroEcf(String numeroEcf) {
		this.numeroEcf = numeroEcf;
	}

	public String getNumeroCxEcf() {
		return numeroCxEcf;
	}

	public void setNumeroCxEcf(String numeroCxEcf) {
		this.numeroCxEcf = numeroCxEcf;
	}

	public String getNumeroDocumentoFiscal() {
		return numeroDocumentoFiscal;
	}

	public void setNumeroDocumentoFiscal(String numeroDocumentoFiscal) {
		this.numeroDocumentoFiscal = numeroDocumentoFiscal;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

}
