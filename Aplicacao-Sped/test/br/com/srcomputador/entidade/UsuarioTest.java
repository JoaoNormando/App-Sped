package br.com.srcomputador.entidade;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.srcomputador.usuario.entidade.Usuario;

public class UsuarioTest {

	private Validator validator;
	private Usuario usuario;

	@Before
	public void validationConfig() {
		ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
		validator = vf.getValidator();
	}
	
	@Before
	public void usuarioConfig() {
		usuario = new Usuario();
		usuario.setNome("Fulano da Silva");
		usuario.setSenha("Fulano@123");
		usuario.setEmail("fulano.silva@srtecnologia.com");
	}

	@Test
	public void deveCadastrarUmUsuario() {
		Set<ConstraintViolation<Usuario>> erros = this.validator.validate(usuario);
		Assert.assertTrue(erros.isEmpty());
	}

	
	@Test
	public void deveGerarErroDeNomeNulo() {
		usuario.setNome(null);
		Set<ConstraintViolation<Usuario>> erros = this.validator.validate(usuario);
		Assert.assertFalse(erros.isEmpty());
	}
	
	@Test
	public void deveGerarErroDeNomeVazio() {
		usuario.setNome("");
		Set<ConstraintViolation<Usuario>> erros = this.validator.validate(usuario);
		Assert.assertFalse(erros.isEmpty());
	}
	
	@Test
	public void deveGerarErroDeSenhaInvalida() {
		usuario.setSenha("123");
		Set<ConstraintViolation<Usuario>> erros = this.validator.validate(usuario);
		Assert.assertFalse(erros.isEmpty());
	}
	
	@Test
	public void deveGerarErroDeSenhaNula() {
		usuario.setSenha(null);
		Set<ConstraintViolation<Usuario>> erros = this.validator.validate(usuario);
		Assert.assertFalse(erros.isEmpty());
	}
	
	@Test
	public void deveGerarErroDeEmailComSitaxeErrada() {
		usuario.setEmail("email@.com");
		Set<ConstraintViolation<Usuario>> erros = this.validator.validate(usuario);
		Assert.assertFalse(erros.isEmpty());
	}
	
	@Test
	public void deveGerarErroDeEmailNulo() {
		usuario.setEmail(null);
		Set<ConstraintViolation<Usuario>> erros = this.validator.validate(usuario);
		Assert.assertFalse(erros.isEmpty());
		
	}
	
}
