package br.com.srcomputador.sped.entidade.blocoC;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC490 extends Registro {

	private double cstIcms;
	private double cfop;
	private double aliquotaIcms;
	private double valorOperacao;
	private double valorBaseCalculoIcms;
	private double valorIcms;
	private String codigoObservacao;

	public double getCstIcms() {
		return cstIcms;
	}

	public void setCstIcms(double cstIcms) {
		this.cstIcms = cstIcms;
	}

	public double getCfop() {
		return cfop;
	}

	public void setCfop(double cfop) {
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

	public String getCodigoObservacao() {
		return codigoObservacao;
	}

	public void setCodigoObservacao(String codigoObservacao) {
		this.codigoObservacao = codigoObservacao;
	}

}
