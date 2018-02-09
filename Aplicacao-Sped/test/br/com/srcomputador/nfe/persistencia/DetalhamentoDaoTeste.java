package br.com.srcomputador.nfe.persistencia;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.cliente.persistencia.ClienteDao;
import br.com.srcomputador.configuracao.PersistenceConfig;
import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.persistencia.ImportacaoDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DetalhamentoDao.class, PersistenceConfig.class, ImportacaoDao.class, ClienteDao.class})
public class DetalhamentoDaoTeste {

	@Autowired
	private DetalhamentoDao detalhamentoDao;
	@Autowired
	private ImportacaoDao importacaoDao;
	@Autowired
	private ClienteDao clienteDao;
	
	public void deveriaListarTodosOsElementosDaNfe() {
		List<Detalhamento> lista = this.detalhamentoDao.recuperarTodosOsElementos();
		Assert.assertTrue(lista != null);
	}
	
	@Test
	public void deveriaListarTodosOsElementosDaNfeComBaseNoFiltro() {
		Importacao importacao = this.importacaoDao.buscarPeloId(17L);
		Cliente cliente = this.clienteDao.buscarPeloId(1L);
		FiltroRelatorio filtroRelatorio = new FiltroRelatorio();
		filtroRelatorio.setImportacao(importacao);
		filtroRelatorio.setCliente(cliente);
		List<Detalhamento> lista = this.detalhamentoDao.recuperarTodosOsElementos(filtroRelatorio);
		System.out.println(lista.size());
		Assert.assertTrue(lista != null);
	}
	
}
