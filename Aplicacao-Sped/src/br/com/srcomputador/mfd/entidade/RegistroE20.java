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
@Table(name = "MFD_RegistroE20")
public class RegistroE20 extends Registro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NUMERO_USUARIO")
	private int numeroDoUsuario;
	@Column(name = "NUMERO_COO")
	private int numeroDoCOO;
	@Column(name = "NUMERO_GNF")
	private int numeroDoGNF;
	@Column(name = "NUMERO_ITEM")
	private int numeroDoItem;
	@Column(name = "DENOMINACAO_OPERACAO", length = 15)
	private String denominacaoOperacao;
	@Column(name = "VALOR_OPERACAO")
	private double valorOperacao;
	@Column(name = "DESCONTO_SOBRE_ITEM")
	private double descontoSobreItem;
	@Column(name = "ACRESCIMO_SOBRE_ITEM")
	private double acrescimoSobreItem;
	@Column(name = "VALOR_TOTAL_LIQUIDO")
	private double valorTotalLiquido;
	@Column(name = "INDICADOR_CANCELAMENTO")
	private char indicadorCancelamento;
	@Column(name = "CANCELAMENTO_ACRESCIMO_ITEM")
	private int cancelamentoAcrescimoItem;

	@ManyToOne
	@JoinColumn(name = "MFD_ID", foreignKey = @ForeignKey(name = "fk_mfd_registroE20"))
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

	public int getNumeroDoItem() {
		return numeroDoItem;
	}

	public void setNumeroDoItem(int numeroDoItem) {
		this.numeroDoItem = numeroDoItem;
	}

	public String getDenominacaoOperacao() {
		return denominacaoOperacao;
	}

	public void setDenominacaoOperacao(String denominacaoOperacao) {
		this.denominacaoOperacao = denominacaoOperacao;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public double getDescontoSobreItem() {
		return descontoSobreItem;
	}

	public void setDescontoSobreItem(double descontoSobreItem) {
		this.descontoSobreItem = descontoSobreItem;
	}

	public double getAcrescimoSobreItem() {
		return acrescimoSobreItem;
	}

	public void setAcrescimoSobreItem(double acrescimoSobreItem) {
		this.acrescimoSobreItem = acrescimoSobreItem;
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

	public int getCancelamentoAcrescimoItem() {
		return cancelamentoAcrescimoItem;
	}

	public void setCancelamentoAcrescimoItem(int cancelamentoAcrescimoItem) {
		this.cancelamentoAcrescimoItem = cancelamentoAcrescimoItem;
	}

	public MFD getMfd() {
		return mfd;
	}

	public void setMfd(MFD mfd) {
		this.mfd = mfd;
	}

}
