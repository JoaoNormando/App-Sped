package br.com.srcomputador.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

	@PostMapping
	@ResponseStatus(code = HttpStatus.OK)
	public void efetuarLogin(String usuario, String senha) {
		
	}
	
}
