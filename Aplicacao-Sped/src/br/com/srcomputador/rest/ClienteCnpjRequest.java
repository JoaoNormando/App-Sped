package br.com.srcomputador.rest;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CNPJ;

import br.com.srcomputador.cliente.rest.ClienteEnderecoRestDto;

public class ClienteCnpjRequest {

	@CNPJ
	private String cnpj;
	private String nomeFantasia;
	private String razaoSocial;

	@Email
	private String email;
	private String telefone;

	private ClienteEnderecoRestDto endereco;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public ClienteEnderecoRestDto getEndereco() {
		return endereco;
	}

	public void setEndereco(ClienteEnderecoRestDto endereco) {
		this.endereco = endereco;
	}

}
