package br.com.srcomputador.nfe.rest.dtorequest;

public class FiltroRelatorioNFeRequest {

	private Long idImportacao;
	private Long idCliente;

	public FiltroRelatorioNFeRequest() {
	}

	public FiltroRelatorioNFeRequest(Long idImportacao, Long idCliente) {
		super();
		this.idImportacao = idImportacao;
		this.idCliente = idCliente;
	}

	public Long getIdImportacao() {
		return idImportacao;
	}

	public void setIdImportacao(Long idImportacao) {
		this.idImportacao = idImportacao;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

}
