package br.com.srcomputador.sped.entidade.blocoC;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC470 extends Registro {

	private String codigoItem;
	private double quantidadeItem;
	private double quantidadeCancelada;
	private String unidade;
	private double valorItem;
	private int cstIcms;
	private int cfop;
	private double aliquotaIcms;
	private double valorPis;
	private double valorCofins;

	public String getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	public double getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(double quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}

	public double getQuantidadeCancelada() {
		return quantidadeCancelada;
	}

	public void setQuantidadeCancelada(double quantidadeCancelada) {
		this.quantidadeCancelada = quantidadeCancelada;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public double getValorItem() {
		return valorItem;
	}

	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}

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
