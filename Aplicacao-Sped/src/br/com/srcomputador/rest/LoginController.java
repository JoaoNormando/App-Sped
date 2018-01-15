package br.com.srcomputador.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.persistencia.UsuarioDao;
import br.com.srcomputador.usuario.entidade.Usuario;

@RestController
@RequestMapping("login")
public class LoginController {

	private UsuarioDao usuarioDao;

	@Autowired
	public LoginController(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	
	@CrossOrigin
	@PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<?> efetuarLogin(@RequestBody UsuarioLoginModel usuario) {
		try{
			Usuario usuarioModel = this.usuarioDao.recuperarPeloEmailESenha(usuario.getEmail(), usuario.getSenha());
			if(usuarioModel == null) {
				return ResponseEntity.notFound().build();
			}
			return ResponseEntity.ok(usuarioModel);
		} catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
		
	}
	
}
