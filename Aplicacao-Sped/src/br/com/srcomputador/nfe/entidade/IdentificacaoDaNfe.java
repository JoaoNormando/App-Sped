	package br.com.srcomputador.nfe.entidade;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
public class IdentificacaoDaNfe {

	@Column(length = 2, name = "ide_codigo_Uf")
	@XStreamAlias("cUF")
	private int cUf; // Código da UF do emitente do Documento Fiscal
	@Column(length = 8, name = "ide_codigo_Nf")
	@XStreamAlias("cNF")
	private int cNf; // Código Numérico que compõe a Chave de Acesso
	@Column(length = 60, name = "ide_natureza_Op")
	@XStreamAlias("natOp")
	private String natOp; // Descrição da Natureza da Operação
	@Column(length = 1, name = "ide_indicador_pagamento")
	@XStreamAlias("indPag")
	private int indPag; // Indicador da forma de pagamento
	@Column(length = 2, name = "ide_modelo")
	@XStreamAlias("mod")
	private int mod; // Código do Modelo do Documento Fiscal
	@Column(length = 3, name = "ide_serie")
	@XStreamAlias("serie")
	private int serie; // Série do Documento Fiscal
	@Column(length = 1, name = "ide_numero_nf")
	@XStreamAlias("nNF")
	private int nNf; // Número do Documento Fiscal
	@Column(name = "ide_dh_emi")
	@Temporal(TemporalType.TIMESTAMP)
	@XStreamAlias(value = "dhEmi")
	private Calendar dhEmi; // Data e hora de emissão do Documento Fiscal
	
	//Campo relacionado a data de emissão do Documento Fiscal da versão desatualizada da NFe
	@Column(name = "ide_d_emi")
	@Temporal(TemporalType.DATE)
	@XStreamAlias(value = "dEmi")
	private Calendar dEmi; // Data e hora de emissão do Documento Fiscal
	
	@Column(name = "ide_dh_saida_entrada")
	@Temporal(TemporalType.TIMESTAMP)
	@XStreamAlias("dhSaiEnt")
	private Calendar dhSaiEnt; // Data e hora de Saída ou da Entrada da Mercadoria/Produto
	
	// Campo relacionado a data de saida do Documento fiscal da versão desatualizada da NFe
	@Column(name = "ide_d_saida_entrada")
	@Temporal(TemporalType.DATE)
	@XStreamAlias("dSaiEnt")
	private Calendar dSaiEnt; // Data e hora de Saída ou da Entrada da Mercadoria/Produto
	
	// Campo relacionado a data de saida do Documento fiscal da versão desatualizada da NFe
	@Column(name = "ide_h_saida_entrada")
	@Temporal(TemporalType.TIME)
	@XStreamAlias("hSaiEnt")
	private Date hSaiEnt; // Data e hora de Saída ou da Entrada da Mercadoria/Produto
	
	@Column(length = 1, name = "ide_tipo_operacao")
	@XStreamAlias("tpNF")
	private int tpNf; // Tipo de Operação
	@Column(name = "ide_identificador_destino")
	@XStreamAlias("idDest")
	private int idDestino; // Identificador de local de destino da operação
	@Column(name = "ide_codigo_munFG")
	@XStreamAlias("cMunFG")
	private int cMunFG; // Código do Município de Ocorrência do Fato Gerador
	@Column(name = "ide_tipo_imp")
	@XStreamAlias("tpImp")
	private int tpImp; // Formato de Impressão do DANFE
	@Column(name = "ide_tipo_emis")
	@XStreamAlias("tpEmis")
	private int tpEmis; // Tipo de Emissão da NF-e
	@Column(name = "ide_codigo_dv")
	@XStreamAlias("cDV")
	private int cDV; // Dígito Verificador da Chave de Acesso da NF-e
	@Column(name = "ide_tp_ambiente")
	@XStreamAlias("tpAmb")
	private int tpAmb; // Identificação do Ambiente
	@Column(name = "ide_fin_nfe")
	@XStreamAlias("finNFe")
	private int finNfe; // Finalidade de emissão da NF-e
	@Column(name = "ide_ind_final")
	@XStreamAlias("indFinal")
	private int indFinal; // Indica operação com Consumidor final
	
	@Column(name = "ide_ind_pres")
	@XStreamAlias("indPres")
	private int indPres; // Indicador de presença do comprador no estabelecimento comercial no momento da
							// operação
	
	@Column(name = "ide_proc_emi")
	@XStreamAlias("procEmi")
	private int procEmi; // Processo de emissão da NF-e
	@Column(length = 20, name = "ide_ver_proc")
	@XStreamAlias("verProc")
	private String verProc; // Versão do Processo de emissão da NF-e
	@Column(name = "ide_dh_cont")
	@Temporal(TemporalType.TIMESTAMP)
	@XStreamAlias("dhCont")
	private Calendar dhCont; // Data e Hora da entrada em contingência
	@Column(length = 256, name = "ide_xJust")
	@XStreamAlias("xJust")
	private String xJust; // Justificativa da entrada em contingência

	public int getcUf() {
		return cUf;
	}

	public void setcUf(int cUf) {
		this.cUf = cUf;
	}

	public int getcNf() {
		return cNf;
	}

	public void setcNf(int cNf) {
		this.cNf = cNf;
	}

	public String getNatOp() {
		return natOp;
	}

	public void setNatOp(String natOp) {
		this.natOp = natOp;
	}

	public int getIndPag() {
		return indPag;
	}

	public void setIndPag(int indPag) {
		this.indPag = indPag;
	}

	public int getMod() {
		return mod;
	}

	public void setMod(int mod) {
		this.mod = mod;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public int getnNf() {
		return nNf;
	}

	public void setnNf(int nNf) {
		this.nNf = nNf;
	}

	public Calendar getDhEmi() {
		return dhEmi;
	}

	public void setDhEmi(Calendar dhEmi) {
		this.dhEmi = dhEmi;
	}

	public Calendar getDhSaiEnt() {
		return dhSaiEnt;
	}

	public void setDhSaiEnt(Calendar dhSaiEnt) {
		this.dhSaiEnt = dhSaiEnt;
	}

	public int getTpNf() {
		return tpNf;
	}

	public void setTpNf(int tpNf) {
		this.tpNf = tpNf;
	}

	public int getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}

	public int getcMunFG() {
		return cMunFG;
	}

	public void setcMunFG(int cMunFG) {
		this.cMunFG = cMunFG;
	}

	public int getTpImp() {
		return tpImp;
	}

	public void setTpImp(int tpImp) {
		this.tpImp = tpImp;
	}

	public int getTpEmis() {
		return tpEmis;
	}

	public void setTpEmis(int tpEmis) {
		this.tpEmis = tpEmis;
	}

	public int getcDV() {
		return cDV;
	}

	public void setcDV(int cDV) {
		this.cDV = cDV;
	}

	public int getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(int tpAmb) {
		this.tpAmb = tpAmb;
	}

	public int getFinNfe() {
		return finNfe;
	}

	public void setFinNfe(int finNfe) {
		this.finNfe = finNfe;
	}

	public int getIndFinal() {
		return indFinal;
	}

	public void setIndFinal(int indFinal) {
		this.indFinal = indFinal;
	}

	public int getIndPres() {
		return indPres;
	}

	public void setIndPres(int indPres) {
		this.indPres = indPres;
	}

	public int getProcEmi() {
		return procEmi;
	}

	public void setProcEmi(int procEmi) {
		this.procEmi = procEmi;
	}

	public String getVerProc() {
		return verProc;
	}

	public void setVerProc(String verProc) {
		this.verProc = verProc;
	}

	public Calendar getDhCont() {
		return dhCont;
	}

	public void setDhCont(Calendar dhCont) {
		this.dhCont = dhCont;
	}

	public String getxJust() {
		return xJust;
	}

	public void setxJust(String xJust) {
		this.xJust = xJust;
	}

	public Calendar getdEmi() {
		return dEmi;
	}

	public void setdEmi(Calendar dEmi) {
		this.dEmi = dEmi;
	}

	public Calendar getdSaiEnt() {
		return dSaiEnt;
	}

	public void setdSaiEnt(Calendar dSaiEnt) {
		this.dSaiEnt = dSaiEnt;
	}

	public Date gethSaiEnt() {
		return hSaiEnt;
	}

	public void sethSaiEnt(Date hSaiEnt) {
		this.hSaiEnt = hSaiEnt;
	}
	
}
