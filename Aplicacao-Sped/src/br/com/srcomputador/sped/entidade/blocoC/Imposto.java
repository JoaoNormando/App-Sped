package br.com.srcomputador.sped.entidade.blocoC;

public abstract class Imposto {

	protected double valorBaseCalculo;
	protected double valorAliquota;
	protected double valorTotal;

	public double getValorBaseCalculo() {
		return valorBaseCalculo;
	}

	public void setValorBaseCalculo(double valorBaseCalculo) {
		this.valorBaseCalculo = valorBaseCalculo;
	}

	public double getValorAliquota() {
		return valorAliquota;
	}

	public void setValorAliquota(double valorAliquota) {
		this.valorAliquota = valorAliquota;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
