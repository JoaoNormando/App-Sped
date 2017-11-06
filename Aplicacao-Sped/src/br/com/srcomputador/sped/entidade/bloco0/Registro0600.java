package br.com.srcomputador.sped.entidade.bloco0;

import java.util.Calendar;

import br.com.srcomputador.sped.entidade.Registro;

public class Registro0600 extends Registro {

	private Calendar dataInclusaoAlteracao;
	private String codigoCcus;
	private String nomeCcus;

	public Calendar getDataInclusaoAlteracao() {
		return dataInclusaoAlteracao;
	}

	public void setDataInclusaoAlteracao(Calendar dataInclusaoAlteracao) {
		this.dataInclusaoAlteracao = dataInclusaoAlteracao;
	}

	public String getCodigoCcus() {
		return codigoCcus;
	}

	public void setCodigoCcus(String codigoCcus) {
		this.codigoCcus = codigoCcus;
	}

	public String getNomeCcus() {
		return nomeCcus;
	}

	public void setNomeCcus(String nomeCcus) {
		this.nomeCcus = nomeCcus;
	}

}
