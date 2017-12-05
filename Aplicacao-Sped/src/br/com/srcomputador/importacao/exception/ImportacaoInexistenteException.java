package br.com.srcomputador.importacao.exception;

public class ImportacaoInexistenteException extends RuntimeException{

	private static final long serialVersionUID = -1857200932951416340L;
	
	private String message;
	
	public ImportacaoInexistenteException() {
	}
	
	public ImportacaoInexistenteException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
}
