package br.com.srcomputador.sped.entidade.bloco0;

import br.com.srcomputador.sped.entidade.Registro;

/*
 * O Registro 0200 tem por objetivo informar mercadorias, serviços,
 * produtos ou quaisquer outros itens concernentes às transações fiscais
 * e aos movimentos de estoques em processos produtivos, bem como os insumos.
 * 
 * */

public class Registro0200 extends Registro{

	private String codigoItem;
	private String descricaoItem;
	private String codigoBarras;
	private String codigoAnteriorItem;
	private String unidadeUtilizada;
	private int tipoItem;
	private String codigoNcm;
	private String codigoExIpi;
	private int codigoGeneroItem;
	private String codigoLst;
	private double aliquotaIcms;
	private int cest;

	public String getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getCodigoAnteriorItem() {
		return codigoAnteriorItem;
	}

	public void setCodigoAnteriorItem(String codigoAnteriorItem) {
		this.codigoAnteriorItem = codigoAnteriorItem;
	}

	public String getUnidadeUtilizada() {
		return unidadeUtilizada;
	}

	public void setUnidadeUtilizada(String unidadeUtilizada) {
		this.unidadeUtilizada = unidadeUtilizada;
	}

	public int getTipoItem() {
		return tipoItem;
	}

	public void setTipoItem(int tipoItem) {
		this.tipoItem = tipoItem;
	}

	public String getCodigoNcm() {
		return codigoNcm;
	}

	public void setCodigoNcm(String codigoNcm) {
		this.codigoNcm = codigoNcm;
	}

	public String getCodigoExIpi() {
		return codigoExIpi;
	}

	public void setCodigoExIpi(String codigoExIpi) {
		this.codigoExIpi = codigoExIpi;
	}

	public int getCodigoGeneroItem() {
		return codigoGeneroItem;
	}

	public void setCodigoGeneroItem(int codigoGeneroItem) {
		this.codigoGeneroItem = codigoGeneroItem;
	}

	public String getCodigoLst() {
		return codigoLst;
	}

	public void setCodigoLst(String codigoLst) {
		this.codigoLst = codigoLst;
	}

	public double getAliquotaIcms() {
		return aliquotaIcms;
	}

	public void setAliquotaIcms(double aliquotaIcms) {
		this.aliquotaIcms = aliquotaIcms;
	}

	public int getCest() {
		return cest;
	}

	public void setCest(int cest) {
		this.cest = cest;
	}

}
