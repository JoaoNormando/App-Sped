package br.com.srcomputador.entidade;

public enum ModulosImportacao {

	NFE("Nota Fiscal Eletronica"), MFD("Memoria Fita Detalhe"), PROC_NFE("Processo de Nota Fiscal Eletronica");

	private ModulosImportacao(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
