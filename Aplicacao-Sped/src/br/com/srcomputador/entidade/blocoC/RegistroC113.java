package br.com.srcomputador.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.entidade.Registro;

public class RegistroC113 extends Registro {

	private char indicadorOperacao;
	private char indicadorEmitente;
	private String codigoParticipante;
	private String codigoDocumentoFiscal;
	private String serieDocumentoFiscal;
	private String subserieDocumentoFiscal;
	private String numeroDocumentoFiscal;
	private Calendar DataEmissao;
	private String chaveDocumentoEletronico;

	public char getIndicadorOperacao() {
		return indicadorOperacao;
	}

	public void setIndicadorOperacao(char indicadorOperacao) {
		this.indicadorOperacao = indicadorOperacao;
	}

	public char getIndicadorEmitente() {
		return indicadorEmitente;
	}

	public void setIndicadorEmitente(char indicadorEmitente) {
		this.indicadorEmitente = indicadorEmitente;
	}

	public String getCodigoParticipante() {
		return codigoParticipante;
	}

	public void setCodigoParticipante(String codigoParticipante) {
		this.codigoParticipante = codigoParticipante;
	}

	public String getCodigoDocumentoFiscal() {
		return codigoDocumentoFiscal;
	}

	public void setCodigoDocumentoFiscal(String codigoDocumentoFiscal) {
		this.codigoDocumentoFiscal = codigoDocumentoFiscal;
	}

	public String getSerieDocumentoFiscal() {
		return serieDocumentoFiscal;
	}

	public void setSerieDocumentoFiscal(String serieDocumentoFiscal) {
		this.serieDocumentoFiscal = serieDocumentoFiscal;
	}

	public String getSubserieDocumentoFiscal() {
		return subserieDocumentoFiscal;
	}

	public void setSubserieDocumentoFiscal(String subserieDocumentoFiscal) {
		this.subserieDocumentoFiscal = subserieDocumentoFiscal;
	}

	public String getNumeroDocumentoFiscal() {
		return numeroDocumentoFiscal;
	}

	public void setNumeroDocumentoFiscal(String numeroDocumentoFiscal) {
		this.numeroDocumentoFiscal = numeroDocumentoFiscal;
	}

	public Calendar getDataEmissao() {
		return DataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		DataEmissao = dataEmissao;
	}

	public String getChaveDocumentoEletronico() {
		return chaveDocumentoEletronico;
	}

	public void setChaveDocumentoEletronico(String chaveDocumentoEletronico) {
		this.chaveDocumentoEletronico = chaveDocumentoEletronico;
	}

}
