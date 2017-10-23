package br.com.srcomputador.mfd.entidade;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class RegistroE02 extends Registro {

	@Column(name = "TIPO_REGISTRO", length = 3)
	private String tipoRegistro;
	@Column(name = "NUMERO_FABRICACAO", length = 20)
	private String numeroFabricacao;
	@Column(name = "MF_ADICIONAL")
	private char mfAdicional;
	@Column(name = "MODELO", length = 20)
	private String modelo;
	@Column(length = 14)
	private String cnpj;
	@Column(length = 14)
	private String inscricaoEstadual;
	@Column(length = 40)
	private String nomeContribuinte;
	@Column(length = 120)
	private String endereco;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataHoraCadastro;
	private int valorCro;
	private int valorGt;

	private int numeroDoUsuario;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getNomeContribuinte() {
		return nomeContribuinte;
	}

	public void setNomeContribuinte(String nomeContribuinte) {
		this.nomeContribuinte = nomeContribuinte;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getValorCro() {
		return valorCro;
	}

	public void setValorCro(int valorCro) {
		this.valorCro = valorCro;
	}

	public int getValorGt() {
		return valorGt;
	}

	public void setValorGt(int valorGt) {
		this.valorGt = valorGt;
	}

	public int getNumeroUsuario() {
		return numeroDoUsuario;
	}

	public void setNumeroUsuario(int numeroUsuario) {
		this.numeroDoUsuario = numeroUsuario;
	}

	public Calendar getDataHoraCadastro() {
		return dataHoraCadastro;
	}

	public void setDataHoraCadastro(Calendar dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}

	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getNumeroFabricacao() {
		return numeroFabricacao;
	}

	public void setNumeroFabricacao(String numeroFabricacao) {
		this.numeroFabricacao = numeroFabricacao;
	}

	public char getMfAdicional() {
		return mfAdicional;
	}

	public void setMfAdicional(char mfAdicional) {
		this.mfAdicional = mfAdicional;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumeroDoUsuario() {
		return numeroDoUsuario;
	}

	public void setNumeroDoUsuario(int numeroDoUsuario) {
		this.numeroDoUsuario = numeroDoUsuario;
	}

}
