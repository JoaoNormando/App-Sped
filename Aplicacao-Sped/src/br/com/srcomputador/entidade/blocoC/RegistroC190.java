package br.com.srcomputador.entidade.blocoC;

import br.com.srcomputador.entidade.Registro;

public class RegistroC190 extends Registro {

	private int cstIcms;
	private int cfop;
	private double aliquotaIcms;
	private double valorOperacao;
	private double valorBaseCalculoIcms;
	private double valorIcms;
	private double valorBaseCalculoIcmsSt;
	private double valorIcmsSt;
	private double valorReducaoBaseCalculo;
	private double valorIpi;
	private String codigoObsLancamento;

	public int getCstIcms() {
		return cstIcms;
	}

	public void setCstIcms(int cstIcms) {
		this.cstIcms = cstIcms;
	}

	public int getCfop() {
		return cfop;
	}

	public void setCfop(int cfop) {
		this.cfop = cfop;
	}

	public double getAliquotaIcms() {
		return aliquotaIcms;
	}

	public void setAliquotaIcms(double aliquotaIcms) {
		this.aliquotaIcms = aliquotaIcms;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public double getValorBaseCalculoIcms() {
		return valorBaseCalculoIcms;
	}

	public void setValorBaseCalculoIcms(double valorBaseCalculoIcms) {
		this.valorBaseCalculoIcms = valorBaseCalculoIcms;
	}

	public double getValorIcms() {
		return valorIcms;
	}

	public void setValorIcms(double valorIcms) {
		this.valorIcms = valorIcms;
	}

	public double getValorBaseCalculoIcmsSt() {
		return valorBaseCalculoIcmsSt;
	}

	public void setValorBaseCalculoIcmsSt(double valorBaseCalculoIcmsSt) {
		this.valorBaseCalculoIcmsSt = valorBaseCalculoIcmsSt;
	}

	public double getValorIcmsSt() {
		return valorIcmsSt;
	}

	public void setValorIcmsSt(double valorIcmsSt) {
		this.valorIcmsSt = valorIcmsSt;
	}

	public double getValorReducaoBaseCalculo() {
		return valorReducaoBaseCalculo;
	}

	public void setValorReducaoBaseCalculo(double valorReducaoBaseCalculo) {
		this.valorReducaoBaseCalculo = valorReducaoBaseCalculo;
	}

	public double getValorIpi() {
		return valorIpi;
	}

	public void setValorIpi(double valorIpi) {
		this.valorIpi = valorIpi;
	}

	public String getCodigoObsLancamento() {
		return codigoObsLancamento;
	}

	public void setCodigoObsLancamento(String codigoObsLancamento) {
		this.codigoObsLancamento = codigoObsLancamento;
	}

}
