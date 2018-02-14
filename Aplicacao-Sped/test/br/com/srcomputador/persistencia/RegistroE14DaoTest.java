package br.com.srcomputador.persistencia;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.PersistenceConfig;
import br.com.srcomputador.mfd.entidade.RegistroE14;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class, RegistroE14Dao.class})
public class RegistroE14DaoTest {

	@Autowired
	private RegistroE14Dao dao;
	
	@Test
	public void deveriaRecuperarRegistrosPaginados() {
		List<RegistroE14> registros = dao.recuperarRegistrosPaginados(0, 5);		
		List<RegistroE14> registrosPosterior = dao.recuperarRegistrosPaginados(5, 5);
		
		Assert.assertEquals("Esperado uma lista com 5 registros.",5, registros.size());
		Assert.assertEquals("Esperado uma lista com 5 registros.",5, registrosPosterior.size());
		Assert.assertNotEquals("Esperando uma lista diferente da outra", registros, registrosPosterior);		
	}
	
}
