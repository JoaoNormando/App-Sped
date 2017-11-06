package br.com.srcomputador.sped.entidade.blocoC;

public class ImpostoIpi extends Imposto {

	private String cst;
	private String codigoEnquadramentoIpi;
	private char indicadorApuracaoIpi;

	public String getCst() {
		return cst;
	}

	public void setCst(String cst) {
		this.cst = cst;
	}

	public String getCodigoEnquadramentoIpi() {
		return codigoEnquadramentoIpi;
	}

	public void setCodigoEnquadramentoIpi(String codigoEnquadramentoIpi) {
		this.codigoEnquadramentoIpi = codigoEnquadramentoIpi;
	}

	public char getIndicadorApuracaoIpi() {
		return indicadorApuracaoIpi;
	}

	public void setIndicadorApuracaoIpi(char indicadorApuracaoIpi) {
		this.indicadorApuracaoIpi = indicadorApuracaoIpi;
	}

}
