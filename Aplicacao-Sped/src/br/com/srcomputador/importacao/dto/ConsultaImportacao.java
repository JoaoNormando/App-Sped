package br.com.srcomputador.importacao.dto;

import br.com.srcomputador.entidade.ModulosImportacao;

public class ConsultaImportacao {

	private Long id;
	private String descricao;
	private ModulosImportacao modulo;
	private String nomeCliente;

	public ConsultaImportacao() {
	
	}
	
	public ConsultaImportacao(Long id, String descricao, ModulosImportacao modulo, String nomeCliente) {
		this.id = id;
		this.descricao = descricao;
		this.modulo = modulo;
		this.nomeCliente = nomeCliente;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ModulosImportacao getModulo() {
		return modulo;
	}

	public void setModulo(ModulosImportacao modulo) {
		this.modulo = modulo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
