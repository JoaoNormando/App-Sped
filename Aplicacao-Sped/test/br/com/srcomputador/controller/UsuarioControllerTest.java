package br.com.srcomputador.controller;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Before;
import org.junit.Test;

import com.jayway.restassured.path.json.JsonPath;

import br.com.srcomputador.entidade.usuario.Endereco;
import br.com.srcomputador.entidade.usuario.Estado;
import br.com.srcomputador.entidade.usuario.Usuario;

public class UsuarioControllerTest {

	private Usuario fulano;

	@Before
	public void setUp() {
		Endereco endereco = new Endereco();
		endereco.setBairro("Montreal");
		endereco.setComplemento("Complemeto");
		endereco.setEstado(Estado.MG);
		endereco.setNumero(447);
		endereco.setRua("Palmeiras");

		fulano = new Usuario();
		fulano.setCpf("12345");
		fulano.setEmail("fulano@email.com");
		fulano.setEndereco(endereco);
		fulano.setNome("Fulano da Silva");
		fulano.setSenha("senha@123");
	}

	@Test
	public void deveListarTodosOsUsuarios() {
		JsonPath path = given().header("Accept", "application/json")
				.get("/usuarios")
				.andReturn().jsonPath();
	
		String endereco = path.getObject("nome", String.class);
		System.out.println(endereco);
	}

}
