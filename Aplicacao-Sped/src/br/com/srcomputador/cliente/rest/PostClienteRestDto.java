package br.com.srcomputador.cliente.rest;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

public class PostClienteRestDto {

	@CNPJ
	@NotBlank
	private String cnpj;
	
	@NotBlank
	private String razaoSocial;
	private String nomeFantasia;
	
	@Email
	private String email;
	private String telefone;
	
	private ClienteEnderecoRestDto endereco;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

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
