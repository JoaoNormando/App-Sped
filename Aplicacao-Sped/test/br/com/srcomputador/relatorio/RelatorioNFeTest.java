package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.cliente.persistencia.ClienteDao;
import br.com.srcomputador.configuracao.PersistenceConfig;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.persistencia.DetalhamentoDao;
import br.com.srcomputador.nfe.persistencia.FiltroRelatorio;
import br.com.srcomputador.nfe.persistencia.NotaFiscalEletronicaDao;
import br.com.srcomputador.persistencia.ImportacaoDao;
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
	
//	@Test
	public void deveriaEscreverNoRelatorio() throws IOException {
		FiltroRelatorio filtro = new FiltroRelatorio();
		filtro.setCliente(clienteDao.buscarPeloId(1L));
		filtro.setImportacao(importDao.buscarPeloId(11L));
		
		File file = relatorio.geraRelatorio(filtro);
		Assert.assertTrue(file.exists());
	}
//	@Test
	public void gera() throws IOException {
		FiltroRelatorio filtro = new FiltroRelatorio();
		filtro.setCliente(clienteDao.buscarPeloId(22L));
		filtro.setImportacao(importDao.buscarPeloId(86L));
		List<NotaFiscalEletronica> nfes = this.dao.recuperarPeloFiltro(filtro);
		RelatorioCSV relatorio = new RelatorioCSV(new ConversorDataService());
		File file = relatorio.criarRelatorio(nfes);
		Assert.assertTrue(file.exists());
	}
	
	@Test
	public void geraProduto() throws IOException {
		FiltroRelatorio filtro = new FiltroRelatorio();
		filtro.setCliente(clienteDao.buscarPeloId(22L));
		filtro.setImportacao(importDao.buscarPeloId(86L));
		RelatorioCSV relatorio = new RelatorioCSV(new ConversorDataService());
		List<Detalhamento> det = this.detDao.recuperarTodosOsElementos(filtro);
		File file = relatorio.criarRelatorioProduto(det);
		Assert.assertTrue(file.exists());
	}
}
