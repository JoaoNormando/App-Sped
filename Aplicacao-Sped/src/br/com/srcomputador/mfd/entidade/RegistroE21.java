package br.com.srcomputador.mfd.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RegistroE21")
public class RegistroE21 extends Registro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NUMERO_USUARIO")
	private int numeroDoUsuario;
	@Column(name = "NUMERO_COO")
	private int numeroDoCOO;
	@Column(name = "NUMERO_CCF")
	private int numeroDoCCF;
	@Column(name = "NUMERO_GNF")
	private int numeroDoGNF;
	@Column(name = "DESCRICAO_MEIO_PAGAMENTO", length = 15)
	private String descricaoMeioPagamento;
	@Column(name = "VALOR_PAGO")
	private double valorPago;
	@Column(name = "INDICADOR_ESTORNO")
	private char indicadorEstorno;
	@Column(name = "VALOR_ESTORNADO")
	private double valorEstornado;

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

	public int getNumeroDoCCF() {
		return numeroDoCCF;
	}

	public void setNumeroDoCCF(int numeroDoCCF) {
		this.numeroDoCCF = numeroDoCCF;
	}

	public int getNumeroDoGNF() {
		return numeroDoGNF;
	}

	public void setNumeroDoGNF(int numeroDoGNF) {
		this.numeroDoGNF = numeroDoGNF;
	}

	public String getDescricaoMeioPagamento() {
		return descricaoMeioPagamento;
	}

	public void setDescricaoMeioPagamento(String descricaoMeioPagamento) {
		this.descricaoMeioPagamento = descricaoMeioPagamento;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public char getIndicadorEstorno() {
		return indicadorEstorno;
	}

	public void setIndicadorEstorno(char indicadorEstorno) {
		this.indicadorEstorno = indicadorEstorno;
	}

	public double getValorEstornado() {
		return valorEstornado;
	}

	public void setValorEstornado(double valorEstornado) {
		this.valorEstornado = valorEstornado;
	}

	public MFD getMfd() {
		return mfd;
	}

	public void setMfd(MFD mfd) {
		this.mfd = mfd;
	}

}
