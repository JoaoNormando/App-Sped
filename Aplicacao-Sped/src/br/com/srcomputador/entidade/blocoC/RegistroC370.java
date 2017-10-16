package br.com.srcomputador.entidade.blocoC;

import br.com.srcomputador.entidade.Registro;

public class RegistroC370 extends Registro {

	private String numeroItem;
	private String codigoItem;
	private double quantidadeItem;
	private int unidadeItem;
	private double valorTotal;
	private double valorDesconto;

	public String getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(String numeroItem) {
		this.numeroItem = numeroItem;
	}

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

	public int getUnidadeItem() {
		return unidadeItem;
	}

	public void setUnidadeItem(int unidadeItem) {
		this.unidadeItem = unidadeItem;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

}
