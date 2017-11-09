package br.com.srcomputador.sped.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.sped.entidade.Registro;

public class RegistroC500 extends Registro {

	private char indicadorOperacao;
	private char indicadorEmitente;
	private String codigoParticipante;
	private String codigoModelo;
	private int codigoSituacao;
	private String serie;
	private int subSerie;
	private String codigoClasseConsumo;
	private int numeroDocumentoFiscal;
	private Calendar dataEmissao;
	private Calendar dataSaidaEntrada;
	private double valorTotal;
	private double valorDesconto;
	private double valorFornecido;
	private double valorServicoNt;
	private double valorTerceiros;
	private double valorDespesasAcessorias;
	private double valorBaseCalculoIcms;
	private double valorIcms;
	private double valorBaseCalculoIcmsSt;
	private double valorIcmsSt;
	private String codigoInformacao;
	private double valorPis;
	private double valorCofins;
	private char tipoLigacao;
	private String codigoGrupoTensao;

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

	public String getCodigoModelo() {
		return codigoModelo;
	}

	public void setCodigoModelo(String codigoModelo) {
		this.codigoModelo = codigoModelo;
	}

	public int getCodigoSituacao() {
		return codigoSituacao;
	}

	public void setCodigoSituacao(int codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public int getSubSerie() {
		return subSerie;
	}

	public void setSubSerie(int subSerie) {
		this.subSerie = subSerie;
	}

	public String getCodigoClasseConsumo() {
		return codigoClasseConsumo;
	}

	public void setCodigoClasseConsumo(String codigoClasseConsumo) {
		this.codigoClasseConsumo = codigoClasseConsumo;
	}

	public int getNumeroDocumentoFiscal() {
		return numeroDocumentoFiscal;
	}

	public void setNumeroDocumentoFiscal(int numeroDocumentoFiscal) {
		this.numeroDocumentoFiscal = numeroDocumentoFiscal;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Calendar getDataSaidaEntrada() {
		return dataSaidaEntrada;
	}

	public void setDataSaidaEntrada(Calendar dataSaidaEntrada) {
		this.dataSaidaEntrada = dataSaidaEntrada;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public double getValorFornecido() {
		return valorFornecido;
	}

	public void setValorFornecido(double valorFornecido) {
		this.valorFornecido = valorFornecido;
	}

	public double getValorServicoNt() {
		return valorServicoNt;
	}

	public void setValorServicoNt(double valorServicoNt) {
		this.valorServicoNt = valorServicoNt;
	}

	public double getValorTerceiros() {
		return valorTerceiros;
	}

	public void setValorTerceiros(double valorTerceiros) {
		this.valorTerceiros = valorTerceiros;
	}

	public double getValorDespesasAcessorias() {
		return valorDespesasAcessorias;
	}

	public void setValorDespesasAcessorias(double valorDespesasAcessorias) {
		this.valorDespesasAcessorias = valorDespesasAcessorias;
	}

	public double getValorBaseCalculoIcms() {
		return valorBaseCalculoIcms;
	}

	public void setValorBaseCalculoIcms(double valorBaseCalculoIcms) {
		this.valorBaseCalculoIcms = valorBaseCalculoIcms;
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

	public double getValorIcmsSt() {
		return valorIcmsSt;
	}

	public void setValorIcmsSt(double valorIcmsSt) {
		this.valorIcmsSt = valorIcmsSt;
	}

	public String getCodigoInformacao() {
		return codigoInformacao;
	}

	public void setCodigoInformacao(String codigoInformacao) {
		this.codigoInformacao = codigoInformacao;
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

	public char getTipoLigacao() {
		return tipoLigacao;
	}

	public void setTipoLigacao(char tipoLigacao) {
		this.tipoLigacao = tipoLigacao;
	}

	public String getCodigoGrupoTensao() {
		return codigoGrupoTensao;
	}

	public void setCodigoGrupoTensao(String codigoGrupoTensao) {
		this.codigoGrupoTensao = codigoGrupoTensao;
	}

}
