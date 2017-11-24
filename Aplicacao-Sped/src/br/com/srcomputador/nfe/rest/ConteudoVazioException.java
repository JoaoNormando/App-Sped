package br.com.srcomputador.nfe.rest;

public class ConteudoVazioException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public ConteudoVazioException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return getMsg();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
