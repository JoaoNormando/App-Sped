package br.com.srcomputador.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.entidade.usuario.Usuario;
import br.com.srcomputador.persistencia.UsuarioDao;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioDao dao;
	
	@GetMapping("/usuarios")
	public List<Usuario> getAll() {
		return dao.listar();
	}

	@PostMapping(value = "/novo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> criarUsuario(@Valid @RequestBody Usuario usuario, BindingResult result) {

		if (result.hasErrors()) {
			return new ResponseEntity<>("Confira se os campos foram preenchidos corretamente", HttpStatus.BAD_REQUEST);
		}

		dao.salvar(usuario);
		return new ResponseEntity<>(usuario, HttpStatus.CREATED);

	}

	@DeleteMapping(value = "/remove/{id}")
	public ResponseEntity<Object> removerAluno(@PathVariable Long id) {

		try {
			dao.removerPeloId(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NullPointerException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}

	public ResponseEntity<Object> atualizarAluno(@PathVariable Long id, @RequestBody Usuario usuario) {

		Usuario usuarioEncontrado = dao.buscarPeloId(id);
		if (usuarioEncontrado == null) {
			return new ResponseEntity<>("Usuário passado não encontrado", HttpStatus.NOT_FOUND);
		}

		dao.salvar(usuarioEncontrado);
		return new ResponseEntity<>(usuario, HttpStatus.OK);
	}
}
