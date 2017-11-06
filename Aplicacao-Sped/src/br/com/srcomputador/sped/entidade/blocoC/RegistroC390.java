package br.com.srcomputador.sped.entidade.blocoC;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC390 extends Registro {

	private int cstIcms;
	private String cfop;
	private double aliquotaIcms;
	private double valorAcumulado;
	private double valorBaseCalculoIcms;
	private double valorIcms;
	private double valorBaseCalculoReducao;

	private String codigoObservacao;

	public int getCstIcms() {
		return cstIcms;
	}

	public void setCstIcms(int cstIcms) {
		this.cstIcms = cstIcms;
	}

	public String getCfop() {
		return cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	public double getAliquotaIcms() {
		return aliquotaIcms;
	}

	public void setAliquotaIcms(double aliquotaIcms) {
		this.aliquotaIcms = aliquotaIcms;
	}

	public double getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(double valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
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

	public double getValorBaseCalculoReducao() {
		return valorBaseCalculoReducao;
	}

	public void setValorBaseCalculoReducao(double valorBaseCalculoReducao) {
		this.valorBaseCalculoReducao = valorBaseCalculoReducao;
	}

	public String getCodigoObservacao() {
		return codigoObservacao;
	}

	public void setCodigoObservacao(String codigoObservacao) {
		this.codigoObservacao = codigoObservacao;
	}

}
