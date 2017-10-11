package br.com.srcomputador.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.entidade.Registro;

public class RegistroC141 extends Registro {

	private int numeroParcelas;
	private Calendar dataVencimento;
	private double valorParcela;

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}

}
