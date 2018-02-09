package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.PersistenceConfig;
import br.com.srcomputador.mfd.entidade.RelatorioMfdDTO;
import br.com.srcomputador.persistencia.RelatorioMfdDTODao;
import br.com.srcomputador.servico.ConversorDataService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {RelatorioMfdDTODao.class, PersistenceConfig.class})
public class RelatorioMFDTest {

	@Autowired
	private RelatorioMfdDTODao dao;
	
	@Test
	public void deveriaEscreverNoRelatorio() throws IOException {
		RelatorioMFD relatorio = new RelatorioMFD(new ConversorDataService());
//		List<RelatorioMfdDTO> lista = dao.recuperarTodos();
		File relatorioFinal = relatorio.gerarRelatorio(new ArrayList<RelatorioMfdDTO>());
	}
	
}
