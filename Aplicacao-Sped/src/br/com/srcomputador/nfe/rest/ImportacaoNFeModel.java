package br.com.srcomputador.nfe.rest;

import org.springframework.web.multipart.MultipartFile;

public class ImportacaoNFeModel {

	private String descricao;
	private MultipartFile[] arquivo;
	private Long idCliente;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public MultipartFile[] getArquivo() {
		return arquivo;
	}

	public void setArquivo(MultipartFile[] arquivo) {
		this.arquivo = arquivo;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

}
