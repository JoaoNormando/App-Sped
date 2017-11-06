package br.com.srcomputador.sped.entidade.bloco0;

import java.util.Date;

import br.com.srcomputador.sped.entidade.Registro;

/*
 * Este Registro tem como objetivo identificar as contas contábeis
 * utilizadas pelo contribuinte informante em sua Contabilidade Geral,
 * relativas às contas referenciadas no Registro 0300.
 * 
 * */

public class Registro0500 extends Registro {

	private Date dataInclusaoAlteracao;
	private String codigoNaturezaContaGrupo;
	private char indicadorTipoConta;
	private int nivelConta;
	private String codigoContaGrupo;
	private String nomeConta;

	public Date getDataInclusaoAlteracao() {
		return dataInclusaoAlteracao;
	}

	public void setDataInclusaoAlteracao(Date dataInclusaoAlteracao) {
		this.dataInclusaoAlteracao = dataInclusaoAlteracao;
	}

	public String getCodigoNaturezaContaGrupo() {
		return codigoNaturezaContaGrupo;
	}

	public void setCodigoNaturezaContaGrupo(String codigoNaturezaContaGrupo) {
		this.codigoNaturezaContaGrupo = codigoNaturezaContaGrupo;
	}

	public char getIndicadorTipoConta() {
		return indicadorTipoConta;
	}

	public void setIndicadorTipoConta(char indicadorTipoConta) {
		this.indicadorTipoConta = indicadorTipoConta;
	}

	public int getNivelConta() {
		return nivelConta;
	}

	public void setNivelConta(int nivelConta) {
		this.nivelConta = nivelConta;
	}

	public String getCodigoContaGrupo() {
		return codigoContaGrupo;
	}

	public void setCodigoContaGrupo(String codigoContaGrupo) {
		this.codigoContaGrupo = codigoContaGrupo;
	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

}
