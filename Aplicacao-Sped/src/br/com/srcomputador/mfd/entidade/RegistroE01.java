package br.com.srcomputador.mfd.entidade;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Component;

/*
 * REGISTRO TIPO E01 - IDENTIFICAÇÃO DO ECF
 * */

@Embeddable
@Component
public class RegistroE01 extends Registro {

	@Column(name = "TIPO_REGISTRO", length = 3)
	private String tipoRegistro;
	@Column(name = "NUMERO_FABRICACAO", length = 20)
	private String numeroFabricacao;
	@Column(name = "MF_ADICIONAL")
	private char mfAdicional;
	@Column(name = "MODELO", length = 20)
	private String modelo;
	@Column(length = 7)
	private String tipoEcf;
	@Column(length = 20)
	private String marca;
	@Column(length = 10)
	private String versaoSb;
	@Temporal(TemporalType.DATE)
	private Calendar dataHoraGravacaoSb;
	@Column(length = 3)
	private int numeroEcf;
	@Column(length = 14)
	private String cnpjUsuario;
	@Column(length = 3)
	private String comandoDeGeracao;
	@Column(length = 6)
	private int crzInicial;
	@Column(length = 6)
	private int crzFinal;
	@Temporal(TemporalType.DATE)
	private Calendar dataInicial;
	@Temporal(TemporalType.DATE)
	private Calendar dataFinal;
	@Column(length = 8)
	private String versaoBiblioteca;
	@Column(length = 15)
	private String versaoAtoCotepe;

	public String getTipoEcf() {
		return tipoEcf;
	}

	public void setTipoEcf(String tipoEcf) {
		this.tipoEcf = tipoEcf;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getVersaoSb() {
		return versaoSb;
	}

	public void setVersaoSb(String versaoSb) {
		this.versaoSb = versaoSb;
	}

	public int getNumeroEcf() {
		return numeroEcf;
	}

	public void setNumeroEcf(int numeroEcf) {
		this.numeroEcf = numeroEcf;
	}

	public String getCnpjUsuario() {
		return cnpjUsuario;
	}

	public void setCnpjUsuario(String cnpjUsuario) {
		this.cnpjUsuario = cnpjUsuario;
	}

	public String getComandoDeGeracao() {
		return comandoDeGeracao;
	}

	public void setComandoDeGeracao(String comandoDeGeracao) {
		this.comandoDeGeracao = comandoDeGeracao;
	}

	public int getCrzInicial() {
		return crzInicial;
	}

	public void setCrzInicial(int crzInicial) {
		this.crzInicial = crzInicial;
	}

	public int getCrzFinal() {
		return crzFinal;
	}

	public void setCrzFinal(int crzFinal) {
		this.crzFinal = crzFinal;
	}

	public Calendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Calendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getVersaoBiblioteca() {
		return versaoBiblioteca;
	}

	public void setVersaoBiblioteca(String versaoBiblioteca) {
		this.versaoBiblioteca = versaoBiblioteca;
	}

	public String getVersaoAtoCotepe() {
		return versaoAtoCotepe;
	}

	public void setVersaoAtoCotepe(String versaoAtoCotepe) {
		this.versaoAtoCotepe = versaoAtoCotepe;
	}

	public Calendar getDataHoraGravacaoSb() {
		return dataHoraGravacaoSb;
	}

	public void setDataHoraGravacaoSb(Calendar dataHoraGravacaoSb) {
		this.dataHoraGravacaoSb = dataHoraGravacaoSb;
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

}
