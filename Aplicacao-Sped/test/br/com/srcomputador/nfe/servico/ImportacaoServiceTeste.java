package br.com.srcomputador.nfe.servico;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.PersistenceConfig;
import br.com.srcomputador.configuracao.XStreamConfig;
import br.com.srcomputador.importacao.persistencia.ImportacaoDao;
import br.com.srcomputador.servico.OperacaoXmlService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ImportacaoNFeService.class, ImportacaoDao.class, LeitorNFeService.class, LeitorImpostoService.class
		,OperacaoXmlService.class, PersistenceConfig.class, XStreamConfig.class, LeitorCofinsService.class, LeitorPisService.class, LeitorIcmsService.class})
public class ImportacaoServiceTeste {


	
}
