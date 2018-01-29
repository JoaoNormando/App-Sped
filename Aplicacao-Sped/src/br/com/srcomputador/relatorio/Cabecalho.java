package br.com.srcomputador.relatorio;

import java.util.ArrayList;
import java.util.List;

public class Cabecalho {

	private String titulo;
	private List<String> campos;

	public Cabecalho() {
		this.campos = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void definirTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getCampos() {
		return campos;
	}

	public void setCampos(List<String> campos) {
		this.campos = campos;
	}

	public Cabecalho adicionarTexto(String texto) {
		this.campos.add(texto);
		return this;
	}

	public List<String> ok() {
		return this.campos;
	}

}
