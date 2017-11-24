package br.com.srcomputador.mfd.entidade;

public class DadosRelatorio {

	private int identificador;
	private String descricao;

	public DadosRelatorio() {
		
	}
	
	public DadosRelatorio(int num, String descricao) {
		super();
		this.identificador = num;
		this.descricao = descricao;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int num) {
		this.identificador = num;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
