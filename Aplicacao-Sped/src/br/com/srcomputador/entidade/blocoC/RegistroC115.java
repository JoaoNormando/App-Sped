package br.com.srcomputador.entidade.blocoC;

import br.com.srcomputador.entidade.Registro;

public class RegistroC115 extends Registro {

	private int indicadorTransporte;

	private String cnpjColeta;
	private String cpfColeta;
	private String inscricaoEstadualColeta;
	private String codigoMunicipioColeta;

	private String cnpjEntrega;
	private String cpfEntrega;
	private String inscricaoEstadualEntrega;
	private String codigoMunicipioEntrega;

	public int getIndicadorTransporte() {
		return indicadorTransporte;
	}

	public void setIndicadorTransporte(int indicadorTransporte) {
		this.indicadorTransporte = indicadorTransporte;
	}

	public String getCnpjColeta() {
		return cnpjColeta;
	}

	public void setCnpjColeta(String cnpjColeta) {
		this.cnpjColeta = cnpjColeta;
	}

	public String getCpfColeta() {
		return cpfColeta;
	}

	public void setCpfColeta(String cpfColeta) {
		this.cpfColeta = cpfColeta;
	}

	public String getInscricaoEstadualColeta() {
		return inscricaoEstadualColeta;
	}

	public void setInscricaoEstadualColeta(String inscricaoEstadualColeta) {
		this.inscricaoEstadualColeta = inscricaoEstadualColeta;
	}

	public String getCodigoMunicipioColeta() {
		return codigoMunicipioColeta;
	}

	public void setCodigoMunicipioColeta(String codigoMunicipioColeta) {
		this.codigoMunicipioColeta = codigoMunicipioColeta;
	}

	public String getCnpjEntrega() {
		return cnpjEntrega;
	}

	public void setCnpjEntrega(String cnpjEntrega) {
		this.cnpjEntrega = cnpjEntrega;
	}

	public String getCpfEntrega() {
		return cpfEntrega;
	}

	public void setCpfEntrega(String cpfEntrega) {
		this.cpfEntrega = cpfEntrega;
	}

	public String getInscricaoEstadualEntrega() {
		return inscricaoEstadualEntrega;
	}

	public void setInscricaoEstadualEntrega(String inscricaoEstadualEntrega) {
		this.inscricaoEstadualEntrega = inscricaoEstadualEntrega;
	}

	public String getCodigoMunicipioEntrega() {
		return codigoMunicipioEntrega;
	}

	public void setCodigoMunicipioEntrega(String codigoMunicipioEntrega) {
		this.codigoMunicipioEntrega = codigoMunicipioEntrega;
	}

}
