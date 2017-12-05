package br.com.srcomputador.nfe.rest.dtorequest;

public class FiltroRelatorioNFeRequest {

	private String descricao;
	private Long cliente;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

}
