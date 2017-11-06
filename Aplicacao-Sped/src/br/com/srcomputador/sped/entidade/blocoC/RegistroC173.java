package br.com.srcomputador.sped.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC173 extends Registro {

	private String numeroLote;
	private double quantidadePorLote;
	private Calendar dataFabricacao;
	private Calendar dataValidade;

	private char indicadorMed;
	private char tipoProduto;

	private double valorTabeladoMaximo;

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}

	public double getQuantidadePorLote() {
		return quantidadePorLote;
	}

	public void setQuantidadePorLote(double quantidadePorLote) {
		this.quantidadePorLote = quantidadePorLote;
	}

	public Calendar getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Calendar dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	public char getIndicadorMed() {
		return indicadorMed;
	}

	public void setIndicadorMed(char indicadorMed) {
		this.indicadorMed = indicadorMed;
	}

	public char getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(char tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public double getValorTabeladoMaximo() {
		return valorTabeladoMaximo;
	}

	public void setValorTabeladoMaximo(double valorTabeladoMaximo) {
		this.valorTabeladoMaximo = valorTabeladoMaximo;
	}

}
