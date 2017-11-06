package br.com.srcomputador.mfd.entidade;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RegistroE19")
public class RegistroE19 extends Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NUMERO_USUARIO")
	private int numeroDoUsuario;
	@Column(name = "NUMERO_COO")
	private int numeroDoCOO;
	@Column(name = "NUMERO_GNF")
	private int numeroDoGNF;
	@Column(name = "DATA_INICIO_EMISSAO")
	@Temporal(TemporalType.DATE)
	private Calendar dataInicioEmissao;
	@Column(name = "VALOR_SUBTOTAL")
	private double valorSubtotal;
	@Column(name = "DESCONTO_SUBTOTAL")
	private double descontoSubtotal;
	@Column(name = "INDICADOR_TIPO_DESCONTO")
	private char indicadorTipoDesconto;
	@Column(name = "ACRESCIMO_SUBTOTAL")
	private double acrescimoSubtotal;
	@Column(name = "INDICADOR_TIPO_ACRESCIMO")
	private char indicadorTipoAcrescimo;
	@Column(name = "VALOR_TOTAL_LIQUIDO")
	private double valorTotalLiquido;
	@Column(name = "INDICADOR_CANCELAMENTO")
	private char indicadorCancelamento;
	@Column(name = "VALOR_CANCELAMENTO")
	private double valorCancelamento;
	@Column(name = "ORDEM_DESCONTO")
	private char ordemDesconto;
	@Column(name = "NOME_ADQUIRENTE", length = 40)
	private String nomeAdquirente;
	@Column(name = "CNPJ_CPF_ADQUIRENTE", length = 14)
	private String cnpjCpfAdquirente;

	@ManyToOne
	@JoinColumn(name = "MFD_ID")
	private MFD mfd;

	public int getNumeroDoUsuario() {
		return numeroDoUsuario;
	}

	public void setNumeroDoUsuario(int numeroDoUsuario) {
		this.numeroDoUsuario = numeroDoUsuario;
	}

	public int getNumeroDoCOO() {
		return numeroDoCOO;
	}

	public void setNumeroDoCOO(int numeroDoCOO) {
		this.numeroDoCOO = numeroDoCOO;
	}

	public int getNumeroDoGNF() {
		return numeroDoGNF;
	}

	public void setNumeroDoGNF(int numeroDoGNF) {
		this.numeroDoGNF = numeroDoGNF;
	}

	public Calendar getDataInicioEmissao() {
		return dataInicioEmissao;
	}

	public void setDataInicioEmissao(Calendar dataInicioEmissao) {
		this.dataInicioEmissao = dataInicioEmissao;
	}

	public double getValorSubtotal() {
		return valorSubtotal;
	}

	public void setValorSubtotal(double valorSubtotal) {
		this.valorSubtotal = valorSubtotal;
	}

	public double getDescontoSubtotal() {
		return descontoSubtotal;
	}

	public void setDescontoSubtotal(double descontoSubtotal) {
		this.descontoSubtotal = descontoSubtotal;
	}

	public char getIndicadorTipoDesconto() {
		return indicadorTipoDesconto;
	}

	public void setIndicadorTipoDesconto(char indicadorTipoDesconto) {
		this.indicadorTipoDesconto = indicadorTipoDesconto;
	}

	public double getAcrescimoSubtotal() {
		return acrescimoSubtotal;
	}

	public void setAcrescimoSubtotal(double acrescimoSubtotal) {
		this.acrescimoSubtotal = acrescimoSubtotal;
	}

	public char getIndicadorTipoAcrescimo() {
		return indicadorTipoAcrescimo;
	}

	public void setIndicadorTipoAcrescimo(char indicadorTipoAcrescimo) {
		this.indicadorTipoAcrescimo = indicadorTipoAcrescimo;
	}

	public double getValorTotalLiquido() {
		return valorTotalLiquido;
	}

	public void setValorTotalLiquido(double valorTotalLiquido) {
		this.valorTotalLiquido = valorTotalLiquido;
	}

	public char getIndicadorCancelamento() {
		return indicadorCancelamento;
	}

	public void setIndicadorCancelamento(char indicadorCancelamento) {
		this.indicadorCancelamento = indicadorCancelamento;
	}

	public double getValorCancelamento() {
		return valorCancelamento;
	}

	public void setValorCancelamento(double valorCancelamento) {
		this.valorCancelamento = valorCancelamento;
	}

	public char getOrdemDesconto() {
		return ordemDesconto;
	}

	public void setOrdemDesconto(char ordemDesconto) {
		this.ordemDesconto = ordemDesconto;
	}

	public String getNomeAdquirente() {
		return nomeAdquirente;
	}

	public void setNomeAdquirente(String nomeAdquirente) {
		this.nomeAdquirente = nomeAdquirente;
	}

	public String getCnpjCpfAdquirente() {
		return cnpjCpfAdquirente;
	}

	public void setCnpjCpfAdquirente(String cnpjCpfAdquirente) {
		this.cnpjCpfAdquirente = cnpjCpfAdquirente;
	}

	public MFD getMfd() {
		return mfd;
	}

	public void setMfd(MFD mfd) {
		this.mfd = mfd;
	}

}
