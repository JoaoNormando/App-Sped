package br.com.srcomputador.nfe.servico.relatorio;

import java.util.List;

public class CabecalhoRelatorioExcel {

	private String titulo;
	private List<String> campos;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getCampos() {
		return campos;
	}

	public void setCampos(List<String> campos) {
		this.campos = campos;
	}

}
