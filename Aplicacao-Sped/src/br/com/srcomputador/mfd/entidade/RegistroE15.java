package br.com.srcomputador.mfd.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MFD_RegistroE15")
public class RegistroE15 extends Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NUMERO_USUARIO")
	private int numeroDoUsuario;
	@Column(name = "NUMERO_CONTADOR")
	private int numeroDoContador;
	@Column(name = "NUMERO_COO")
	private int numeroDoCOO;
	@Column(name = "NUMERO_ITEM")
	private int numeroDoItem;
	@Column(name = "CODIGO_PRODUTO", length = 14)
	private String codigoDoProduto;
	@Column(name = "DESCRICAO_PRODUTO", length = 100)
	private String descricaoProduto;
	@Column(name = "QUANTIDADE_COMERCIALIZADA")
	private int quantidadeComercializada;
	@Column(name = "UNIDADE_MEDIDA", length = 3)
	private String unidadeMedida;
	@Column(name = "VALOR_UNITARIO")
	private int valorUnitario;
	@Column(name = "VALOR_DESCONTO")
	private double valorDesconto;
	@Column(name = "VALOR_ACRESCIMO")
	private double valorAcrescimo;
	@Column(name = "VALOR_TOTAL_LIQUIDO")
	private double valorTotalLiquido;
	@Column(name = "COD_TOTALIZADOR_PARCIAL", length = 7)
	private String codTotalizadorParcial;
	@Column(name = "INDICADOR_CANCELAMENTO")
	private char indicadorDeCancelamento;
	@Column(name = "QUANTIDADE_CANCELADA")
	private int quantidadeCancelada;
	@Column(name = "VALOR_CANCELADO")
	private double valorCancelado;
	@Column(name = "VALOR_CANCELADO_ACRESCIMO")
	private double valorCanceladoAcrescimo;
	@Column(name = "INDICADOR_ARREDONDAMENTO")
	private char indicadorDeArredondamento;
	@Column(name = "CASAS_DECIMAIS")
	private int casasDecimais;
	@Column(name = "CASAS_DECIMAIS_VALOR_UNITARIO")
	private int casasDecimaisValorUnitario;

	@ManyToOne
	@JoinColumn(name = "mfd_id", foreignKey = @ForeignKey(name = "fk_mfd_registroE15"))
	private MFD mfd;

	public int getNumeroDoUsuario() {
		return numeroDoUsuario;
	}

	public void setNumeroDoUsuario(int numeroDoUsuario) {
		this.numeroDoUsuario = numeroDoUsuario;
	}

	public int getNumeroDoContador() {
		return numeroDoContador;
	}

	public void setNumeroDoContador(int numeroDoContador) {
		this.numeroDoContador = numeroDoContador;
	}

	public int getNumeroDoCOO() {
		return numeroDoCOO;
	}

	public void setNumeroDoCOO(int numeroDoCOO) {
		this.numeroDoCOO = numeroDoCOO;
	}

	public int getNumeroDoItem() {
		return numeroDoItem;
	}

	public void setNumeroDoItem(int numeroDoItem) {
		this.numeroDoItem = numeroDoItem;
	}

	public String getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(String codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public int getQuantidadeComercializada() {
		return quantidadeComercializada;
	}

	public void setQuantidadeComercializada(int quantidadeComercializada) {
		this.quantidadeComercializada = quantidadeComercializada;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public int getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public double getValorAcrescimo() {
		return valorAcrescimo;
	}

	public void setValorAcrescimo(double valorAcrescimo) {
		this.valorAcrescimo = valorAcrescimo;
	}

	public double getValorTotalLiquido() {
		return valorTotalLiquido;
	}

	public void setValorTotalLiquido(double valorTotalLiquido) {
		this.valorTotalLiquido = valorTotalLiquido;
	}

	public String getCodTotalizadorParcial() {
		return codTotalizadorParcial;
	}

	public void setCodTotalizadorParcial(String codTotalizadorParcial) {
		this.codTotalizadorParcial = codTotalizadorParcial;
	}

	public char getIndicadorDeCancelamento() {
		return indicadorDeCancelamento;
	}

	public void setIndicadorDeCancelamento(char indicadorDeCancelamento) {
		this.indicadorDeCancelamento = indicadorDeCancelamento;
	}

	public int getQuantidadeCancelada() {
		return quantidadeCancelada;
	}

	public void setQuantidadeCancelada(int quantidadeCancelada) {
		this.quantidadeCancelada = quantidadeCancelada;
	}

	public double getValorCancelado() {
		return valorCancelado;
	}

	public void setValorCancelado(double valorCancelado) {
		this.valorCancelado = valorCancelado;
	}

	public double getValorCanceladoAcrescimo() {
		return valorCanceladoAcrescimo;
	}

	public void setValorCanceladoAcrescimo(double valorCanceladoAcrescimo) {
		this.valorCanceladoAcrescimo = valorCanceladoAcrescimo;
	}

	public char getIndicadorDeArredondamento() {
		return indicadorDeArredondamento;
	}

	public void setIndicadorDeArredondamento(char indicadorDeArredondamento) {
		this.indicadorDeArredondamento = indicadorDeArredondamento;
	}

	public int getCasasDecimais() {
		return casasDecimais;
	}

	public void setCasasDecimais(int casasDecimais) {
		this.casasDecimais = casasDecimais;
	}

	public int getCasasDecimaisValorUnitario() {
		return casasDecimaisValorUnitario;
	}

	public void setCasasDecimaisValorUnitario(int casasDecimaisValorUnitario) {
		this.casasDecimaisValorUnitario = casasDecimaisValorUnitario;
	}

	public MFD getMfd() {
		return mfd;
	}

	public void setMfd(MFD mfd) {
		this.mfd = mfd;
	}

}
