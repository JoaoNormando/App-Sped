package br.com.srcomputador.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.srcomputador.rest.CnpjRequest;

@Service
public class CnpjService {

	private RestTemplate rest;
	private String url = "https://www.receitaws.com.br/v1/cnpj/";
	
	@Autowired
	public CnpjService(RestTemplate rest) {
		this.rest = rest;
	}

	public CnpjRequest recuperarCnpj(String cnpj) {
		String urlRequest = this.url + cnpj;
		CnpjRequest cliente = this.rest.getForObject(urlRequest, CnpjRequest.class);
		return cliente;
	}

}
