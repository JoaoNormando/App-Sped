package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.cliente.persistencia.ClienteDao;
import br.com.srcomputador.configuracao.PersistenceConfig;
import br.com.srcomputador.importacao.persistencia.ImportacaoDao;
import br.com.srcomputador.nfe.persistencia.DetalhamentoDao;
import br.com.srcomputador.nfe.persistencia.FiltroRelatorio;
import br.com.srcomputador.nfe.persistencia.NotaFiscalEletronicaDao;
import br.com.srcomputador.servico.ConversorDataService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ClienteDao.class, ImportacaoDao.class, FolhaRelatorioNFeProduto.class, DetalhamentoDao.class, FolhaRelatorioNFeTotal.class, RelatorioNFe.class, NotaFiscalEletronicaDao.class, ConversorDataService.class, PersistenceConfig.class})
public class RelatorioNFeTest {

	@Autowired
	private NotaFiscalEletronicaDao dao;
	@Autowired
	private DetalhamentoDao detDao;
	@Autowired
	private ImportacaoDao importDao;
	@Autowired
	private ClienteDao clienteDao;
	@Autowired
	private RelatorioNFe relatorio;
	
	@Test
	public void deveriaEscreverNoRelatorio() throws IOException {
		FiltroRelatorio filtro = new FiltroRelatorio();
		filtro.setCliente(clienteDao.buscarPeloId(1L));
		filtro.setImportacao(importDao.buscarPeloId(3L));
		
		File file = relatorio.geraRelatorio(dao.recuperarPeloFiltro(filtro), detDao.recuperarTodosOsElementos(filtro));
		Assert.assertTrue(file.exists());
	}
	
}
