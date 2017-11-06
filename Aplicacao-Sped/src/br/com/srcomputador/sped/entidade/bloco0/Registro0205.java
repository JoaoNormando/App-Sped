package br.com.srcomputador.sped.entidade.bloco0;

import java.util.Calendar;

import br.com.srcomputador.sped.entidade.Registro;

public class Registro0205 extends Registro{

	private String descricaoItemAnterior;
	private Calendar dataInicial;
	private Calendar dataFinal;
	private String codigoItemAnterior;
	
	public String getDescricaoItemAnterior() {
		return descricaoItemAnterior;
	}
	public void setDescricaoItemAnterior(String descricaoItemAnterior) {
		this.descricaoItemAnterior = descricaoItemAnterior;
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
	public String getCodigoItemAnterior() {
		return codigoItemAnterior;
	}
	public void setCodigoItemAnterior(String codigoItemAnterior) {
		this.codigoItemAnterior = codigoItemAnterior;
	}
	
	
	
}
