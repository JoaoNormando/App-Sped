package br.com.srcomputador.sped.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC350 extends Registro {

	private String serie;
	private String subserie;
	private String numeroDocumento;
	private Calendar dataEmissao;
	private String cnpjCpf;
	private double valorMercadorias;
	private double valorDocumentoFiscal;
	private double valorDesconto;
	private double valorPisPasep;
	private double valorCofins;

	private String codigoContaAnalitica;

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

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getCnpjCpf() {
		return cnpjCpf;
	}

	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}

	public double getValorMercadorias() {
		return valorMercadorias;
	}

	public void setValorMercadorias(double valorMercadorias) {
		this.valorMercadorias = valorMercadorias;
	}

	public double getValorDocumentoFiscal() {
		return valorDocumentoFiscal;
	}

	public void setValorDocumentoFiscal(double valorDocumentoFiscal) {
		this.valorDocumentoFiscal = valorDocumentoFiscal;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
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

	public String getCodigoContaAnalitica() {
		return codigoContaAnalitica;
	}

	public void setCodigoContaAnalitica(String codigoContaAnalitica) {
		this.codigoContaAnalitica = codigoContaAnalitica;
	}

}
