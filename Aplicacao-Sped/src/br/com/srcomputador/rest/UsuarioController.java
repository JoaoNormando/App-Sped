package br.com.srcomputador.rest;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.persistencia.UsuarioDao;
import br.com.srcomputador.usuario.entidade.Usuario;

@CrossOrigin
@RestController
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	private UsuarioDao dao;
	
	@CrossOrigin
	@GetMapping
	public List<Usuario> getAll() {
		return dao.listar();
	}
	
	@CrossOrigin
	@PostMapping
	public ResponseEntity<?> criarUsuario(@Valid @RequestBody Usuario usuario, BindingResult result) {

		if (result.hasErrors()) {
			return new ResponseEntity<>("Confira se os campos foram preenchidos corretamente", HttpStatus.BAD_REQUEST);
		}

		usuario = dao.salvar(usuario);
		return ResponseEntity.created(URI.create("usuario/" + usuario.getId())).build();

	}

	@DeleteMapping(value = "{id}")
	@CrossOrigin
	public ResponseEntity<Object> removerUsuario(@PathVariable("id") Long id) {

		try {
			dao.removerPeloId(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NullPointerException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		
	}

	public ResponseEntity<Object> atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {

		Usuario usuarioEncontrado = dao.buscarPeloId(id);
		if (usuarioEncontrado == null) {
			return new ResponseEntity<>("Usuário passado não encontrado", HttpStatus.NOT_FOUND);
		}

		dao.salvar(usuarioEncontrado);
		return new ResponseEntity<>(usuario, HttpStatus.OK);
	}
	
}
