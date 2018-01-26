package br.com.srcomputador.relatorio;

import java.util.ArrayList;
import java.util.List;

public class Cabecalho {
	
	private List<String> campos;
	
	public Cabecalho() {
		this.campos = new ArrayList<>();
	}
	
	public Cabecalho adicionarTexto(String texto) {
		this.campos.add(texto);
		return this;
	}
	
	public List<String> ok(){
		return this.campos;
	}
	
}
