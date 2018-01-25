package br.com.srcomputador.nfe.persistencia;

import java.util.Calendar;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Assert;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.cliente.persistencia.ClienteDao;
import br.com.srcomputador.configuracao.PersistenceConfig;
import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.importacao.persistencia.ImportacaoDao;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class, NotaFiscalEletronicaDao.class, ImportacaoDao.class, ClienteDao.class})
public class NotaFiscalEletronicaDaoTeste {

	@Autowired
	private NotaFiscalEletronicaDao nfeDao;
	@Autowired
	private ImportacaoDao importacaoDao;
	@Autowired
	private ClienteDao clienteDao;
	
//	@Test
	public void deveriaRealizarUmaConsultaNoBanco() {
		Importacao importacao = this.importacaoDao.buscarPeloId(17L);
		Cliente cliente = this.clienteDao.buscarPeloId(1L);
		FiltroRelatorio filtroRelatorio = new FiltroRelatorio();
		filtroRelatorio.setImportacao(importacao);
		filtroRelatorio.setCliente(cliente);
		List<NotaFiscalEletronica> lista = this.nfeDao.recuperarTodosOsElementosComFiltragem(filtroRelatorio);
		Assert.assertTrue(lista != null);
	}
	
	@Test
	public void deveriaRealizarUmaConsultaComBaseNoFiltroPassado() {
		FiltroRelatorio filtroRelatorio = new FiltroRelatorio();
		filtroRelatorio.setDataInicial(Calendar.getInstance());
		this.nfeDao.recuperarPeloFiltro(filtroRelatorio);
	}
	
}
