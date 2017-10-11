package br.com.srcomputador.entidade.bloco0;

import br.com.srcomputador.entidade.Registro;

/*
 * Dados do contabilista responsável pela 
 * escrita fiscal do estabelecimento informante.
 * 
 * */

public class Registro0100 extends Registro {

	private Pessoa dadosPessoa;

	private String crc;
	private String cep;

	private Endereco endereco;

	private String telefone;
	private String fax;
	private String email;
	private String codigoMunicipal;

	public Pessoa getDadosPessoa() {
		return dadosPessoa;
	}

	public void setDadosPessoa(Pessoa dadosPessoa) {
		this.dadosPessoa = dadosPessoa;
	}

	public String getCrc() {
		return crc;
	}

	public void setCrc(String crc) {
		this.crc = crc;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodigoMunicipal() {
		return codigoMunicipal;
	}

	public void setCodigoMunicipal(String codigoMunicipal) {
		this.codigoMunicipal = codigoMunicipal;
	}

}
