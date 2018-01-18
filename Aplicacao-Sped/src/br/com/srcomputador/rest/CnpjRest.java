package br.com.srcomputador.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.servico.CnpjService;
import br.com.srcomputador.servico.ConversaoCnpjRequestParaCliente;

@CrossOrigin
@RestController
@RequestMapping("cnpj")
public class CnpjRest {

	private CnpjService cnpjService;
	private ConversaoCnpjRequestParaCliente conversao;

	@Autowired
	public CnpjRest(CnpjService cnpjService, ConversaoCnpjRequestParaCliente conversao) {
		this.cnpjService = cnpjService;
		this.conversao = conversao;
	
	}
	
	@GetMapping("/{cnpj}")
	@ResponseBody
	@ResponseStatus(code = HttpStatus.OK)
	@CrossOrigin
	public ClienteCnpjRequest recuperarPeloCnpj(@PathVariable("cnpj") String cnpj) {
		CnpjRequest cnpjRequest = this.cnpjService.recuperarCnpj(cnpj);
		ClienteCnpjRequest cliente = this.conversao.converter(cnpjRequest);
		return cliente;
	}
	
}
