package br.com.srcomputador.entidade.bloco0;

import java.util.Date;

public class Registro0000 extends Registro{

	private Pessoa pessoa;
	
	private int codigoVersao;
	private int codigoFinalidade;
	private Date dataInicial;
	private Date dataFinal;

	private String siglaUf;
	private String inscricaoEstadual;
	private int codigoMunicipal;
	private String inscricaoMunicipal;
	private String inscricaoSuframa;
	private char indicadorPerfil;
	private char indicadorAtividade;
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getCodigoVersao() {
		return codigoVersao;
	}

	public void setCodigoVersao(int codigoVersao) {
		this.codigoVersao = codigoVersao;
	}

	public int getCodigoFinalidade() {
		return codigoFinalidade;
	}

	public void setCodigoFinalidade(int codigoFinalidade) {
		this.codigoFinalidade = codigoFinalidade;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public int getCodigoMunicipal() {
		return codigoMunicipal;
	}

	public void setCodigoMunicipal(int codigoMunicipal) {
		this.codigoMunicipal = codigoMunicipal;
	}

	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}

	public String getInscricaoSuframa() {
		return inscricaoSuframa;
	}

	public void setInscricaoSuframa(String inscricaoSuframa) {
		this.inscricaoSuframa = inscricaoSuframa;
	}

	public char getIndicadorPerfil() {
		return indicadorPerfil;
	}

	public void setIndicadorPerfil(char indicadorPerfil) {
		this.indicadorPerfil = indicadorPerfil;
	}

	public char getIndicadorAtividade() {
		return indicadorAtividade;
	}

	public void setIndicadorAtividade(char indicadorAtividade) {
		this.indicadorAtividade = indicadorAtividade;
	}
}
