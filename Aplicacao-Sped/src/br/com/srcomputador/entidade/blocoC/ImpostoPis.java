package br.com.srcomputador.entidade.blocoC;

public class ImpostoPis extends Imposto {

	private String cst;
	private double quantidadeBaseCalculoPis;

	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public double getQuantidadeBaseCalculoPis() {
		return quantidadeBaseCalculoPis;
	}

	public void setQuantidadeBaseCalculoPis(double quantidadeBaseCalculoPis) {
		this.quantidadeBaseCalculoPis = quantidadeBaseCalculoPis;
	}

}
