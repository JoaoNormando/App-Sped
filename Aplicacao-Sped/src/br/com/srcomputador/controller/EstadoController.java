package br.com.srcomputador.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.entidade.usuario.Estado;

@CrossOrigin
@RestController
public class EstadoController {

	
	@GetMapping("/estados")
	public Estado[] getEstados() {
		Estado[] values = Estado.values();
		return values;
	}
	
}
