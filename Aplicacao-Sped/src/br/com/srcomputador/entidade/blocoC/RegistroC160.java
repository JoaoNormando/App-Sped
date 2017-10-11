package br.com.srcomputador.entidade.blocoC;

import br.com.srcomputador.entidade.Registro;

public class RegistroC160 extends Registro {

	private String codigoParticipante;
	private String placaIdentificacao;
	private int quantidadeVolume;
	private double pesoBruto;
	private double pesoLiquido;
	private String siglaUf;

	public String getCodigoParticipante() {
		return codigoParticipante;
	}

	public void setCodigoParticipante(String codigoParticipante) {
		this.codigoParticipante = codigoParticipante;
	}

	public String getPlacaIdentificacao() {
		return placaIdentificacao;
	}

	public void setPlacaIdentificacao(String placaIdentificacao) {
		this.placaIdentificacao = placaIdentificacao;
	}

	public int getQuantidadeVolume() {
		return quantidadeVolume;
	}

	public void setQuantidadeVolume(int quantidadeVolume) {
		this.quantidadeVolume = quantidadeVolume;
	}

	public double getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(double pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public double getPesoLiquido() {
		return pesoLiquido;
	}

	public void setPesoLiquido(double pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

}
