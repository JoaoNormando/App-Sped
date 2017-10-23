package br.com.srcomputador.mfd.entidade;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RegistroE16")
public class RegistroE16 extends Registro {
	
	@Column(name = "NUMERO_USUARIO")
	private int numeroDoUsuario;
	@Column(name = "NUMERO_COO")
	private int numeroDoCOO;
	@Column(name = "NUMERO_GNF")
	private int numeroDoGNF;
	@Column(name = "NUMERO_GRG")
	private int numeroDoGRG;
	@Column(name = "NUMERO_CDC")
	private int numeroDoCDC;
	@Column(name = "NUMERO_CRZ")
	private int numeroDoCRZ;
	@Column(name = "DENOMINACAO_DOC_FISCAL")
	private String denominacaoDocFiscal;
	@Column(name = "DATA_HORA_FINAL_EMISSAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataHoraFinalEmissao;

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

	public int getNumeroDoGRG() {
		return numeroDoGRG;
	}

	public void setNumeroDoGRG(int numeroDOGRG) {
		this.numeroDoGRG = numeroDOGRG;
	}

	public int getNumeroDoCDC() {
		return numeroDoCDC;
	}

	public void setNumeroDoCDC(int numeroDoCDC) {
		this.numeroDoCDC = numeroDoCDC;
	}

	public int getNumeroDoCRZ() {
		return numeroDoCRZ;
	}

	public void setNumeroDoCRZ(int numeroDoCRZ) {
		this.numeroDoCRZ = numeroDoCRZ;
	}

	public String getDenominacaoDocFiscal() {
		return denominacaoDocFiscal;
	}

	public void setDenominacaoDocFiscal(String denominacaoDocFiscal) {
		this.denominacaoDocFiscal = denominacaoDocFiscal;
	}

	public Calendar getDataHoraFinalEmissao() {
		return dataHoraFinalEmissao;
	}

	public void setDataHoraFinalEmissao(Calendar dataHoraFinalEmissao) {
		this.dataHoraFinalEmissao = dataHoraFinalEmissao;
	}

}
