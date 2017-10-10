package br.com.srcomputador.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Registro0000 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 4, name = "REGISTRO", nullable = false)
	private String registro;
	@Column(name = "CODIGO_VERSAO", nullable = false)
	private int codigoVersao;
	@Column(name = "CODIGO_FINALIDADE", nullable = false)
	private int codigoFinalidade;
	@Column(name = "DATA_INICIAL", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataInicial;
	@Column(name = "DATA_FINAL", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataFinal;
	@Column(length = 100, name = "NOME", nullable = false)
	private String nome;
	@Column(name = "CNPJ")
	private String cnpj;
	@Column(name = "CPF")
	private String cpf;
	@Column(length = 2, name = "SIGLA_UF", nullable = false)
	private String siglaUf;
	@Column(length = 14, name = "INSCRICAO_ESTADUAL", nullable = false)
	private String inscricaoEstadual;
	@Column(name = "CODIGO_MUNICIPAL", nullable = false)
	private int codigoMunicipal;
	@Column(name = "INSCRICAO_MUNICIPAL")
	private String inscricaoMunicipal;
	@Column(name = "INSCRICAO_SUFRAMA")
	private String inscricaoSuframa;
	@Column(name = "INDICADOR_PERFIL", nullable = false)
	private char indicadorPerfil;
	@Column(name = "INDICADOR_ATIVIDADE", nullable = false)
	private char indicadorAtividade;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
