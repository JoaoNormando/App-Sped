package br.com.srcomputador.persistencia;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.PersistenceConfig;
import br.com.srcomputador.mfd.entidade.RelatorioMfdDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RelatorioMfdDTODao.class, PersistenceConfig.class})
public class RelatorioMfdDTODaoTest {

	@Autowired
	private RelatorioMfdDTODao dao;
	
	@Test
	public void deveBuscarOsRegistrosNoBanco() {
		List<RelatorioMfdDTO> lista = dao.recuperarTodos();
		System.out.println(lista.size());
		Assert.assertFalse(lista == null);
	}
	
}
