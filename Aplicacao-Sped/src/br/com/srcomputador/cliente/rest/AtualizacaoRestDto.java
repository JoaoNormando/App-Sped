package br.com.srcomputador.cliente.rest;

public class AtualizacaoRestDto {

	private String razaoSocial;
	private String nomeFantasia;
	private ClienteEnderecoRestDto endereco;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
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
