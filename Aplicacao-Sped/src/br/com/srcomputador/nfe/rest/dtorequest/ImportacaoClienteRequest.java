package br.com.srcomputador.nfe.rest.dtorequest;

public class ImportacaoClienteRequest {
	
	private Long id;
	private String importacao;

	public ImportacaoClienteRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public ImportacaoClienteRequest(Long id, String importacao) {
		super();
		this.id = id;
		this.importacao = importacao;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImportacao() {
		return importacao;
	}

	public void setImportacao(String importacao) {
		this.importacao = importacao;
	}

}
