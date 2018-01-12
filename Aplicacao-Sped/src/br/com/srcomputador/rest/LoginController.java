package br.com.srcomputador.rest;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
//	@PostMapping
//	public ResponseEntity<?> efetuarLogin(@RequestParam("usuario") String usuario, @RequestParam("senha") String senha) {
//		try {
//			Usuario usuarioRecuperado = this.usuarioDao.recuperarPeloUsuarioESenha(usuario, senha);
//			return ResponseEntity.ok(usuarioRecuperado);
//		} catch (NoResultException e) {
//			e.printStackTrace();
//			return ResponseEntity.notFound().build();
//		}
//	}
	
}
