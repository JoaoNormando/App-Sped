package br.com.srcomputador.cliente.rest;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

public class PostClienteRestDto {

	@NotBlank
	private String razaoSocial;
	@NotBlank
	@CNPJ
	private String cnpj;
	private String nomeFantasia;
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

	public ClienteEnderecoRestDto getEndereco() {
		return endereco;
	}

	public void setEndereco(ClienteEnderecoRestDto endereco) {
		this.endereco = endereco;
	}

}
