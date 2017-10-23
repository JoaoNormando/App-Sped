package br.com.srcomputador.mfd.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RegistroE18")
public class RegistroE18 extends Registro {
	
	@Column(name = "NUMERO_USUARIO")
	private int numeroDoUsuario;
	@Column(name = "NUMERO_CRZ")
	private int numeroDoCRZ;
	@Column(name = "DESCRICAO_TOTALIZADOR", length = 15)
	private String descricaoTotalizador;
	@Column(name = "VALOR_ACUMULADO")
	private double valorAcumulado;

	@ManyToOne
	@JoinColumn(name = "MFD_ID")
	private MFD mfd;
	
	public int getNumeroDoUsuario() {
		return numeroDoUsuario;
	}

	public void setNumeroDoUsuario(int numeroDoUsuario) {
		this.numeroDoUsuario = numeroDoUsuario;
	}

	public int getNumeroDoCRZ() {
		return numeroDoCRZ;
	}

	public void setNumeroDoCRZ(int numeroDoCRZ) {
		this.numeroDoCRZ = numeroDoCRZ;
	}

	public String getDescricaoTotalizador() {
		return descricaoTotalizador;
	}

	public void setDescricaoTotalizador(String descricaoTotalizador) {
		this.descricaoTotalizador = descricaoTotalizador;
	}

	public double getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(double valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}

}
