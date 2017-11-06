package br.com.srcomputador.sped.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC405 extends Registro {

	private Calendar dataDocumento;
	private int posicaoContReinicioOp;
	private int posicaoContReucaoZ;
	private int numeroCooFim;
	private double valorTotal;
	private double valorVendaBruta;

	public Calendar getDataDocumento() {
		return dataDocumento;
	}

	public void setDataDocumento(Calendar dataDocumento) {
		this.dataDocumento = dataDocumento;
	}

	public int getPosicaoContReinicioOp() {
		return posicaoContReinicioOp;
	}

	public void setPosicaoContReinicioOp(int posicaoContReinicioOp) {
		this.posicaoContReinicioOp = posicaoContReinicioOp;
	}

	public int getPosicaoContReucaoZ() {
		return posicaoContReucaoZ;
	}

	public void setPosicaoContReucaoZ(int posicaoContReucaoZ) {
		this.posicaoContReucaoZ = posicaoContReucaoZ;
	}

	public int getNumeroCooFim() {
		return numeroCooFim;
	}

	public void setNumeroCooFim(int numeroCooFim) {
		this.numeroCooFim = numeroCooFim;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorVendaBruta() {
		return valorVendaBruta;
	}

	public void setValorVendaBruta(double valorVendaBruta) {
		this.valorVendaBruta = valorVendaBruta;
	}

}
