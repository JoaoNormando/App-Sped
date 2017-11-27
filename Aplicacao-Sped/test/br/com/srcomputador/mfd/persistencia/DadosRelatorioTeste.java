package br.com.srcomputador.mfd.persistencia;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.PersistenceConfig;
import br.com.srcomputador.mfd.entidade.DadosRelatorio;
import br.com.srcomputador.mfd.entidade.RegistroE14;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class, DadosRelatorioDao.class})
public class DadosRelatorioTeste {
	
	@Autowired
	private DadosRelatorioDao dao;
	
	@Test
	public void deveriaListarComBaseNosCamposSelecionados() {
		DadosRelatorio dados = new DadosRelatorio();
		List<String> lista = dao.listar(dados);
		System.out.println(lista.size());
		Assert.assertFalse(lista.isEmpty());
	}
	
}
