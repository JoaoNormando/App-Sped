package br.com.srcomputador.sped.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC165 extends Registro {

	private String codigoParticipante;
	private String placaIdentificacao;
	private String codigoAutorizacao;
	private String numeroPasseFiscal;
	private Calendar horaSaida;
	private double temperatura;
	private int quantidadeVolume;
	private double pesoBruto;
	private double pesoLiquido;
	private String nomeMotorista;
	private String cpfMotorista;
	private String siglaUfMotorista;

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

	public String getCodigoAutorizacao() {
		return codigoAutorizacao;
	}

	public void setCodigoAutorizacao(String codigoAutorizacao) {
		this.codigoAutorizacao = codigoAutorizacao;
	}

	public String getNumeroPasseFiscal() {
		return numeroPasseFiscal;
	}

	public void setNumeroPasseFiscal(String numeroPasseFiscal) {
		this.numeroPasseFiscal = numeroPasseFiscal;
	}

	public Calendar getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Calendar horaSaida) {
		this.horaSaida = horaSaida;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
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

	public String getNomeMotorista() {
		return nomeMotorista;
	}

	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}

	public String getCpfMotorista() {
		return cpfMotorista;
	}

	public void setCpfMotorista(String cpfMotorista) {
		this.cpfMotorista = cpfMotorista;
	}

	public String getSiglaUfMotorista() {
		return siglaUfMotorista;
	}

	public void setSiglaUfMotorista(String siglaUfMotorista) {
		this.siglaUfMotorista = siglaUfMotorista;
	}

}
