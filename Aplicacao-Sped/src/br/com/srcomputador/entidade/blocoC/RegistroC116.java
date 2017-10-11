package br.com.srcomputador.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.entidade.Registro;

public class RegistroC116 extends Registro {

	private String codigoDocumentoFiscal;
	private String numeroSat;
	private String chaveCfe;
	private String numeroCfe;
	private Calendar dataEmissao;

	public String getCodigoDocumentoFiscal() {
		return codigoDocumentoFiscal;
	}

	public void setCodigoDocumentoFiscal(String codigoDocumentoFiscal) {
		this.codigoDocumentoFiscal = codigoDocumentoFiscal;
	}

	public String getNumeroSat() {
		return numeroSat;
	}

	public void setNumeroSat(String numeroSat) {
		this.numeroSat = numeroSat;
	}

	public String getChaveCfe() {
		return chaveCfe;
	}

	public void setChaveCfe(String chaveCfe) {
		this.chaveCfe = chaveCfe;
	}

	public String getNumeroCfe() {
		return numeroCfe;
	}

	public void setNumeroCfe(String numeroCfe) {
		this.numeroCfe = numeroCfe;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

}
