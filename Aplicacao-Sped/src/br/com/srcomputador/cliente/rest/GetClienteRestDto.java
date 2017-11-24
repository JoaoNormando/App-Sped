package br.com.srcomputador.cliente.rest;

public class GetClienteRestDto {
	private Long id;
	private String razaoSocial;
	private String cnpj;
	private String nomeFantasia;
	private ClienteEnderecoRestDto endereco;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
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
