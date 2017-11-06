package br.com.srcomputador.sped.entidade.blocoC;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC400 extends Registro {

	private String codigo;
	private String modeloEcf;
	private String serieEcf;
	private String numeroCxEcf;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getModeloEcf() {
		return modeloEcf;
	}

	public void setModeloEcf(String modeloEcf) {
		this.modeloEcf = modeloEcf;
	}

	public String getSerieEcf() {
		return serieEcf;
	}

	public void setSerieEcf(String serieEcf) {
		this.serieEcf = serieEcf;
	}

	public String getNumeroCxEcf() {
		return numeroCxEcf;
	}

	public void setNumeroCxEcf(String numeroCxEcf) {
		this.numeroCxEcf = numeroCxEcf;
	}

}
