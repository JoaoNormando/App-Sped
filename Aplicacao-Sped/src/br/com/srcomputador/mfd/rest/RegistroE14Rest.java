package br.com.srcomputador.mfd.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.mfd.entidade.DadosRelatorio;

@RestController
@RequestMapping("relatorio/mfd/registroe14")
public class RegistroE14Rest {

	@GetMapping
	public List<DadosRelatorio> getCampos() {
		return new RequestRegistroE14().getCampos();
	}
	
}
