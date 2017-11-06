package br.com.srcomputador.sped.entidade.blocoC;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC175 extends Registro {

	private int indicadorVeiculo;
	private String cnpj;
	private String siglaUf;
	private String chassi;

	public int getIndicadorVeiculo() {
		return indicadorVeiculo;
	}

	public void setIndicadorVeiculo(int indicadorVeiculo) {
		this.indicadorVeiculo = indicadorVeiculo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

}
