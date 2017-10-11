package br.com.srcomputador.entidade.bloco0;

import br.com.srcomputador.entidade.Registro;

public class Registro0300 extends Registro{

	private String codigoIndivBem;
	private char indicadorMercadoria;
	private String descricaoItem;
	private String codigoBemPrincipal;
	private String codigoCta;
	private int numeroParcelas;

	public String getCodigoIndivBem() {
		return codigoIndivBem;
	}

	public void setCodigoIndivBem(String codigoIndivBem) {
		this.codigoIndivBem = codigoIndivBem;
	}

	public char getIndicadorMercadoria() {
		return indicadorMercadoria;
	}

	public void setIndicadorMercadoria(char indicadorMercadoria) {
		this.indicadorMercadoria = indicadorMercadoria;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public String getCodigoBemPrincipal() {
		return codigoBemPrincipal;
	}

	public void setCodigoBemPrincipal(String codigoBemPrincipal) {
		this.codigoBemPrincipal = codigoBemPrincipal;
	}

	public String getCodigoCta() {
		return codigoCta;
	}

	public void setCodigoCta(String codigoCta) {
		this.codigoCta = codigoCta;
	}

	public int getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(int numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

}
