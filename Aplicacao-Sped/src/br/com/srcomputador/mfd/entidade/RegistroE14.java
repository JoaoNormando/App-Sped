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
@Table(name = "RegistroE14")
public class RegistroE14 extends Registro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "numero_usuario")
	private int numeroDoUsuario;
	@Column(name = "numero_documento_contador")
	private int numeroDocumentoContador;
	@Column(name = "numero_coo")
	private int numeroDoCOO;
	@Column(name = "data_inicio_emissao")
	@Temporal(TemporalType.DATE)
	private Calendar dataInicioEmissao;
	@Column(name = "valor_total_documento")
	private double valorTotalDoDocumento;
	@Column(name = "valor_desconto")
	private double valorDoDesconto;
	@Column(name = "tipo_desconto")
	private char tipoDesconto;
	@Column(name = "valor_ascrecimo_perc_aplicado")
	private double valorAcrescimoPercAplicado;
	@Column(name = "inidicador_tipo_acrescimo")
	private char indicadorTipoAcrescimo;
	@Column(name = "valor_total_liquido")
	private double valorTotalLiquido;
	@Column(name = "indicador_cancelamento")
	private char indicadorDeCancelamento;
	@Column(name = "valor_cancelamento")
	private double valorCancelamento;
	@Column(name = "ordem_aplicacao_desconto")
	private char ordemAplicacaoDesconto;
	@Column(name = "nome_adquirente", length = 40)
	private String nomeAdquirente;
	@Column(name = "cnpj_cpf_adquirente", length = 14)
	private String cnpjCpfAdquirente;

	@ManyToOne
	@JoinColumn(name = "mfd_id")
	private MFD mfd;
	
	public int getNumeroDoUsuario() {
		return numeroDoUsuario;
	}

	public void setNumeroDoUsuario(int numeroDoUsuario) {
		this.numeroDoUsuario = numeroDoUsuario;
	}

	public int getNumeroDocumentoContador() {
		return numeroDocumentoContador;
	}

	public void setNumeroDocumentoContador(int numeroDocumentoContador) {
		this.numeroDocumentoContador = numeroDocumentoContador;
	}

	public int getNumeroDoCOO() {
		return numeroDoCOO;
	}

	public void setNumeroDoCOO(int numeroDoCOO) {
		this.numeroDoCOO = numeroDoCOO;
	}

	public Calendar getDataInicioEmissao() {
		return dataInicioEmissao;
	}

	public void setDataInicioEmissao(Calendar dataInicioEmissao) {
		this.dataInicioEmissao = dataInicioEmissao;
	}

	public double getValorTotalDoDocumento() {
		return valorTotalDoDocumento;
	}

	public void setValorTotalDoDocumento(double valorTotalDoDocumento) {
		this.valorTotalDoDocumento = valorTotalDoDocumento;
	}

	public double getValorDoDesconto() {
		return valorDoDesconto;
	}

	public void setValorDoDesconto(double valorDoDesconto) {
		this.valorDoDesconto = valorDoDesconto;
	}

	public char getTipoDesconto() {
		return tipoDesconto;
	}

	public void setTipoDesconto(char tipoDesconto) {
		this.tipoDesconto = tipoDesconto;
	}

	public double getValorAcrescimoPercAplicado() {
		return valorAcrescimoPercAplicado;
	}

	public void setValorAcrescimoPercAplicado(double valorAcrescimoPercAplicado) {
		this.valorAcrescimoPercAplicado = valorAcrescimoPercAplicado;
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

	public char getIndicadorDeCancelamento() {
		return indicadorDeCancelamento;
	}

	public void setIndicadorDeCancelamento(char indicadorDeCancelamento) {
		this.indicadorDeCancelamento = indicadorDeCancelamento;
	}

	public double getValorCancelamento() {
		return valorCancelamento;
	}

	public void setValorCancelamento(double valorCancelamento) {
		this.valorCancelamento = valorCancelamento;
	}

	public char getOrdemAplicacaoDesconto() {
		return ordemAplicacaoDesconto;
	}

	public void setOrdemAplicacaoDesconto(char ordemAplicacaoDesconto) {
		this.ordemAplicacaoDesconto = ordemAplicacaoDesconto;
	}

	public String getNomeAdquirinte() {
		return nomeAdquirente;
	}

	public void setNomeAdquirinte(String nomeAdquirinte) {
		this.nomeAdquirente = nomeAdquirinte;
	}

	public String getCnpjCpfAdquirente() {
		return cnpjCpfAdquirente;
	}

	public void setCnpjCpfAdquirente(String cnpjCpfAdquirente) {
		this.cnpjCpfAdquirente = cnpjCpfAdquirente;
	}

	public String getNomeAdquirente() {
		return nomeAdquirente;
	}

	public void setNomeAdquirente(String nomeAdquirente) {
		this.nomeAdquirente = nomeAdquirente;
	}

	public MFD getMfd() {
		return mfd;
	}

	public void setMfd(MFD mfd) {
		this.mfd = mfd;
	}

}
