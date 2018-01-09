package br.com.srcomputador.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.usuario.entidade.Estado;

@CrossOrigin
@RestController
@RequestMapping("estado")
public class EstadoController {

	
	@GetMapping
	public Estado[] getEstados() {
		Estado[] values = Estado.values();
		return values;
	}
	
}
