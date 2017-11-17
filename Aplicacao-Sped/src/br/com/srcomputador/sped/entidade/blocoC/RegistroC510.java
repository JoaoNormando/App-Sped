package br.com.srcomputador.sped.entidade.blocoC;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC510 extends Registro {

	private int numeroItem;
	private String codigoItem;
	private int codigoClassificacao;
	private double quantidade;
	private String unidade;
	private double valorItem;
	private double valorDesconto;
	private int cstIcms;
	private int cfop;
	private double valorBaseCalculoIcms;
	private double aliquotaIcms;
	private double valorIcms;
	private double valorBaseCalculoIcmsSt;
	private double aliquotaIcmsSt;
	private char indicadorTipoReceita;
	private String codigoParticipante;
	private double valorPis;
	private double valorCofins;
	private String codigoCta;

	public int getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}

	public String getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	public int getCodigoClassificacao() {
		return codigoClassificacao;
	}

	public void setCodigoClassificacao(int codigoClassificacao) {
		this.codigoClassificacao = codigoClassificacao;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public double getValorItem() {
		return valorItem;
	}

	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public int getCstIcms() {
		return cstIcms;
	}

	public void setCstIcms(int cstIcms) {
		this.cstIcms = cstIcms;
	}

	public int getCfop() {
		return cfop;
	}

	public void setCfop(int cfop) {
		this.cfop = cfop;
	}

	public double getValorBaseCalculoIcms() {
		return valorBaseCalculoIcms;
	}

	public void setValorBaseCalculoIcms(double valorBaseCalculoIcms) {
		this.valorBaseCalculoIcms = valorBaseCalculoIcms;
	}

	public double getAliquotaIcms() {
		return aliquotaIcms;
	}

	public void setAliquotaIcms(double aliquotaIcms) {
		this.aliquotaIcms = aliquotaIcms;
	}

	public double getValorIcms() {
		return valorIcms;
	}

	public void setValorIcms(double valorIcms) {
		this.valorIcms = valorIcms;
	}

	public double getValorBaseCalculoIcmsSt() {
		return valorBaseCalculoIcmsSt;
	}

	public void setValorBaseCalculoIcmsSt(double valorBaseCalculoIcmsSt) {
		this.valorBaseCalculoIcmsSt = valorBaseCalculoIcmsSt;
	}

	public double getAliquotaIcmsSt() {
		return aliquotaIcmsSt;
	}

	public void setAliquotaIcmsSt(double aliquotaIcmsSt) {
		this.aliquotaIcmsSt = aliquotaIcmsSt;
	}

	public char getIndicadorTipoReceita() {
		return indicadorTipoReceita;
	}

	public void setIndicadorTipoReceita(char indicadorTipoReceita) {
		this.indicadorTipoReceita = indicadorTipoReceita;
	}

	public String getCodigoParticipante() {
		return codigoParticipante;
	}

	public void setCodigoParticipante(String codigoParticipante) {
		this.codigoParticipante = codigoParticipante;
	}

	public double getValorPis() {
		return valorPis;
	}

	public void setValorPis(double valorPis) {
		this.valorPis = valorPis;
	}

	public double getValorCofins() {
		return valorCofins;
	}

	public void setValorCofins(double valorCofins) {
		this.valorCofins = valorCofins;
	}

	public String getCodigoCta() {
		return codigoCta;
	}

	public void setCodigoCta(String codigoCta) {
		this.codigoCta = codigoCta;
	}

}
