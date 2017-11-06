package br.com.srcomputador.sped.entidade.blocoC;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC321 extends Registro {

	private String codigoItem;
	private double quantidadeAcomulada;
	private int unidadeItem;
	private double valorItem;
	private double valorDesconto;
	private double valorBaseCalculoIcms;
	private double valorIcms;
	private double valorPis;
	private double valorCofins;

	public String getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	public double getQuantidadeAcomulada() {
		return quantidadeAcomulada;
	}

	public void setQuantidadeAcomulada(double quantidadeAcomulada) {
		this.quantidadeAcomulada = quantidadeAcomulada;
	}

	public int getUnidadeItem() {
		return unidadeItem;
	}

	public void setUnidadeItem(int unidadeItem) {
		this.unidadeItem = unidadeItem;
	}

	public double getValorItem() {
		return valorItem;
	}

	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
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

}
