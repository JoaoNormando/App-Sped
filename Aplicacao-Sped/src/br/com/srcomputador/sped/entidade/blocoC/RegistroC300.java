package br.com.srcomputador.sped.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC300 extends Registro {

	private String codigoDocumento;
	private String serie;
	private String subserie;
	private int numeroDocumentoInical;
	private int numeroDocumentoFinal;
	private Calendar dataEmissao;
	private double valorTotal;
	private double valorPis;
	private double valorCofins;
	private String codigoConta;

	public String getCodigoDocumento() {
		return codigoDocumento;
	}

	public void setCodigoDocumento(String codigoDocumento) {
		this.codigoDocumento = codigoDocumento;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getSubserie() {
		return subserie;
	}

	public void setSubserie(String subserie) {
		this.subserie = subserie;
	}

	public int getNumeroDocumentoInical() {
		return numeroDocumentoInical;
	}

	public void setNumeroDocumentoInical(int numeroDocumentoInical) {
		this.numeroDocumentoInical = numeroDocumentoInical;
	}

	public int getNumeroDocumentoFinal() {
		return numeroDocumentoFinal;
	}

	public void setNumeroDocumentoFinal(int numeroDocumentoFinal) {
		this.numeroDocumentoFinal = numeroDocumentoFinal;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorPis() {
		return valorPis;
	}

	public void setValorPis(double valorPis) {
		this.valorPis = valorPis;
	}

	public double getValorCofins() {
		return valorCofins;
	}

	public void setValorCofins(double valorCofins) {
		this.valorCofins = valorCofins;
	}

	public String getCodigoConta() {
		return codigoConta;
	}

	public void setCodigoConta(String codigoConta) {
		this.codigoConta = codigoConta;
	}

}
