package br.com.srcomputador.entidade.blocoC;

import br.com.srcomputador.entidade.Registro;

public class RegistroC197 extends Registro {
	
	private String codigoAjuste;
	private String descricaoComplementar;
	private String codigoItem;

	private double valorBaseCalculoIcms;
	private double valorAliquotaIcms;
	private double valorIcms;

	private double valorOutros;

	public String getCodigoAjuste() {
		return codigoAjuste;
	}

	public void setCodigoAjuste(String codigoAjuste) {
		this.codigoAjuste = codigoAjuste;
	}

	public String getDescricaoComplementar() {
		return descricaoComplementar;
	}

	public void setDescricaoComplementar(String descricaoComplementar) {
		this.descricaoComplementar = descricaoComplementar;
	}

	public String getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	public double getValorBaseCalculoIcms() {
		return valorBaseCalculoIcms;
	}

	public void setValorBaseCalculoIcms(double valorBaseCalculoIcms) {
		this.valorBaseCalculoIcms = valorBaseCalculoIcms;
	}

	public double getValorAliquotaIcms() {
		return valorAliquotaIcms;
	}

	public void setValorAliquotaIcms(double valorAliquotaIcms) {
		this.valorAliquotaIcms = valorAliquotaIcms;
	}

	public double getValorIcms() {
		return valorIcms;
	}

	public void setValorIcms(double valorIcms) {
		this.valorIcms = valorIcms;
	}

	public double getValorOutros() {
		return valorOutros;
	}

	public void setValorOutros(double valorOutros) {
		this.valorOutros = valorOutros;
	}
	
}
