package br.com.srcomputador.nfe.rest.dtorequest;

import org.springframework.web.multipart.MultipartFile;

public class NfeZipRequest {

	private String descricao;
	private MultipartFile multiPartFile;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public MultipartFile getMultiPartFile() {
		return multiPartFile;
	}

	public void setMultiPartFile(MultipartFile multiPartFile) {
		this.multiPartFile = multiPartFile;
	}

}
