package br.com.srcomputador.nfe.persistencia;

import br.com.srcomputador.cliente.entidade.Cliente;

public class Filtro {

	private Cliente cliente;
	private String descricao;

	public Filtro() {
	}
	
	public Filtro(Cliente cliente, String descricao) {
		super();
		this.cliente = cliente;
		this.descricao = descricao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
