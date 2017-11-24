package br.com.srcomputador.entidade;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.srcomputador.cliente.entidade.Endereco;
import br.com.srcomputador.usuario.entidade.Estado;

public class EnderecoTest {

	private Validator validator;
	private Endereco endereco;

	@Before
	public void validatorConfig() {
		ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
		validator = vf.getValidator();
	}
	
	@Before
	public void enderecoConfig() {
		endereco = new Endereco();
		endereco.setRua("Das Flores");
		endereco.setBairro("Floripa");
		endereco.setNumero(557);
		endereco.setEstado(Estado.SP);
		endereco.setComplemento("Informação para facilitar o encontro do local");
	}
	
	@Test
	public void deveCadastrarUmEndereco() {
		Set<ConstraintViolation<Endereco>> erros = this.validator.validate(endereco);
		Assert.assertTrue(erros.isEmpty());
	}
	
	@Test
	public void deveGerarErroDeRua() {
		endereco.setRua("");
		Set<ConstraintViolation<Endereco>> erros = this.validator.validate(endereco);
		Assert.assertFalse(erros.isEmpty());
	}
	
}
