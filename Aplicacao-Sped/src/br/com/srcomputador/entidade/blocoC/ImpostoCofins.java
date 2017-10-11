package br.com.srcomputador.entidade.blocoC;

public class ImpostoCofins extends Imposto {

	private String cst;
	private double quantidadeBaseCalculoCofins;
	private double valorAliquotaCofinsPerc;
	
	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public double getQuantidadeBaseCalculoCofins() {
		return quantidadeBaseCalculoCofins;
	}

	public void setQuantidadeBaseCalculoCofins(double quantidadeBaseCalculoCofins) {
		this.quantidadeBaseCalculoCofins = quantidadeBaseCalculoCofins;
	}

	public double getValorAliquotaCofinsPerc() {
		return valorAliquotaCofinsPerc;
	}

	public void setValorAliquotaCofinsPerc(double valorAliquotaCofinsPerc) {
		this.valorAliquotaCofinsPerc = valorAliquotaCofinsPerc;
	}

}
