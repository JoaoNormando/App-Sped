package br.com.srcomputador.mfd.entidade;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Registro {
	
	@Column(name = "TIPO_REGISTRO", length = 3)
	protected String tipoRegistro;
	@Column(name = "NUMERO_FABRICACAO", length = 20)
	protected String numeroFabricacao;
	@Column(name = "MF_ADICIONAL")
	protected char mfAdicional;
	@Column(name = "MODELO", length = 20)
	protected String modelo;
	
	public String getTipoRegistro() {
		return tipoRegistro;
	}

	public void setTipoRegistro(String tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	public String getNumeroFabricacao() {
		return numeroFabricacao;
	}

	public void setNumeroFabricacao(String numeroFabricacao) {
		this.numeroFabricacao = numeroFabricacao;
	}

	public char getMfAdicional() {
		return mfAdicional;
	}

	public void setMfAdicional(char mfAdicional) {
		this.mfAdicional = mfAdicional;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
