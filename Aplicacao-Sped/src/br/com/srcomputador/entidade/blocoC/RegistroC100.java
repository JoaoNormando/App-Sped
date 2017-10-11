package br.com.srcomputador.entidade.blocoC;

import java.util.Calendar;

import br.com.srcomputador.entidade.Registro;

public class RegistroC100 extends Registro {

	private char indicadorOperacao;
	private char indicadorEmitente;
	private String codigoParticipante;
	private String codigoModelo;
	private String codigoSituacao;
	private String serie;
	private String numeroDocumento;
	private String chaveNfe;

	private Calendar dataEmissao;
	private Calendar dataEntradaSaida;

	private double valorTotal;

	private char indicadorTipoPagamento;
	private double valorDesconto;
	private double valorAbatimentoNt;
	private double valorMercadoriaServico;

	private char indicadorFrete;
	private double valorFrete;
	private double valorSeguro;
	private double valorOutrasDespesas;

	private double valorIcms;
	private double valorPis;
	private double valorIpi;
	private double valorCofins;

	private double valorBaseCalculoIcms;
	private double valorBaseCalculoIcmsSt;

	private double valorIcsmSt;
	private double valorPisSt;
	private double valorCofinsSt;

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

	public String getCodigoSituacao() {
		return codigoSituacao;
	}

	public void setCodigoSituacao(String codigoSituacao) {
		this.codigoSituacao = codigoSituacao;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getChaveNfe() {
		return chaveNfe;
	}

	public void setChaveNfe(String chaveNfe) {
		this.chaveNfe = chaveNfe;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Calendar getDataEntradaSaida() {
		return dataEntradaSaida;
	}

	public void setDataEntradaSaida(Calendar dataEntradaSaida) {
		this.dataEntradaSaida = dataEntradaSaida;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public char getIndicadorTipoPagamento() {
		return indicadorTipoPagamento;
	}

	public void setIndicadorTipoPagamento(char indicadorTipoPagamento) {
		this.indicadorTipoPagamento = indicadorTipoPagamento;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public double getValorAbatimentoNt() {
		return valorAbatimentoNt;
	}

	public void setValorAbatimentoNt(double valorAbatimentoNt) {
		this.valorAbatimentoNt = valorAbatimentoNt;
	}

	public double getValorMercadoriaServico() {
		return valorMercadoriaServico;
	}

	public void setValorMercadoriaServico(double valorMercadoriaServico) {
		this.valorMercadoriaServico = valorMercadoriaServico;
	}

	public char getIndicadorFrete() {
		return indicadorFrete;
	}

	public void setIndicadorFrete(char indicadorFrete) {
		this.indicadorFrete = indicadorFrete;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}

	public double getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	public double getValorOutrasDespesas() {
		return valorOutrasDespesas;
	}

	public void setValorOutrasDespesas(double valorOutrasDespesas) {
		this.valorOutrasDespesas = valorOutrasDespesas;
	}

	public double getValorIcms() {
		return valorIcms;
	}

	public void setValorIcms(double valorIcms) {
		this.valorIcms = valorIcms;
	}

	public double getValorPis() {
		return valorPis;
	}

	public void setValorPis(double valorPis) {
		this.valorPis = valorPis;
	}

	public double getValorIpi() {
		return valorIpi;
	}

	public void setValorIpi(double valorIpi) {
		this.valorIpi = valorIpi;
	}

	public double getValorCofins() {
		return valorCofins;
	}

	public void setValorCofins(double valorCofins) {
		this.valorCofins = valorCofins;
	}

	public double getValorBaseCalculoIcms() {
		return valorBaseCalculoIcms;
	}

	public void setValorBaseCalculoIcms(double valorBaseCalculoIcms) {
		this.valorBaseCalculoIcms = valorBaseCalculoIcms;
	}

	public double getValorBaseCalculoIcmsSt() {
		return valorBaseCalculoIcmsSt;
	}

	public void setValorBaseCalculoIcmsSt(double valorBaseCalculoIcmsSt) {
		this.valorBaseCalculoIcmsSt = valorBaseCalculoIcmsSt;
	}

	public double getValorIcsmSt() {
		return valorIcsmSt;
	}

	public void setValorIcsmSt(double valorIcsmSt) {
		this.valorIcsmSt = valorIcsmSt;
	}

	public double getValorPisSt() {
		return valorPisSt;
	}

	public void setValorPisSt(double valorPisSt) {
		this.valorPisSt = valorPisSt;
	}

	public double getValorCofinsSt() {
		return valorCofinsSt;
	}

	public void setValorCofinsSt(double valorCofinsSt) {
		this.valorCofinsSt = valorCofinsSt;
	}

}
