package br.com.srcomputador.sped.entidade.blocoC;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC170 extends Registro {

	private String numeroItem;
	private String codigoItem;
	private String descricaoComplementar;
	private double quantidadeItem;
	private String unidadeItem;
	private double valorItem;
	private double valorDesconto;

	private char indicadorMovimentacao;

	private String cfop;
	private String codigoNatOperacao;

	private ImpostoIcms icms;
	private ImpostoIcmsSt icmsSt;
	private ImpostoIpi ipi;
	private ImpostoPis pis;
	private ImpostoCofins cofins;

	private String codigoContaAnalitica;

	public String getNumeroItem() {
		return numeroItem;
	}

	public void setNumeroItem(String numeroItem) {
		this.numeroItem = numeroItem;
	}

	public String getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	public String getDescricaoComplementar() {
		return descricaoComplementar;
	}

	public void setDescricaoComplementar(String descricaoComplementar) {
		this.descricaoComplementar = descricaoComplementar;
	}

	public double getQuantidadeItem() {
		return quantidadeItem;
	}

	public void setQuantidadeItem(double quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}

	public String getUnidadeItem() {
		return unidadeItem;
	}

	public void setUnidadeItem(String unidadeItem) {
		this.unidadeItem = unidadeItem;
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

	public char getIndicadorMovimentacao() {
		return indicadorMovimentacao;
	}

	public void setIndicadorMovimentacao(char indicadorMovimentacao) {
		this.indicadorMovimentacao = indicadorMovimentacao;
	}

	public String getCfop() {
		return cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	public String getCodigoNatOperacao() {
		return codigoNatOperacao;
	}

	public void setCodigoNatOperacao(String codigoNatOperacao) {
		this.codigoNatOperacao = codigoNatOperacao;
	}

	public ImpostoIcms getIcms() {
		return icms;
	}

	public void setIcms(ImpostoIcms icms) {
		this.icms = icms;
	}

	public ImpostoIpi getIpi() {
		return ipi;
	}

	public void setIpi(ImpostoIpi ipi) {
		this.ipi = ipi;
	}

	public ImpostoPis getPis() {
		return pis;
	}

	public void setPis(ImpostoPis pis) {
		this.pis = pis;
	}

	public ImpostoCofins getCofins() {
		return cofins;
	}

	public void setCofins(ImpostoCofins cofins) {
		this.cofins = cofins;
	}

	public String getCodigoContaAnalitica() {
		return codigoContaAnalitica;
	}

	public void setCodigoContaAnalitica(String codigoContaAnalitica) {
		this.codigoContaAnalitica = codigoContaAnalitica;
	}

	public ImpostoIcmsSt getIcmsSt() {
		return icmsSt;
	}

	public void setIcmsSt(ImpostoIcmsSt icmsSt) {
		this.icmsSt = icmsSt;
	}

}
