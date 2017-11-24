package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.XStreamConfig;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.entidade.detalheProduto.Cofins;
import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.Ipi;
import br.com.srcomputador.nfe.entidade.detalheProduto.Pis;
import br.com.srcomputador.servico.OperacaoXmlService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { LeitorNFeService.class, OperacaoXmlService.class, XStreamConfig.class,
		LeitorCofinsService.class, Cofins.class, Icms.class, Pis.class, Ipi.class,
		LeitorImpostoService.class, LeitorPisService.class })
public class LeitorNFeTeste {

	@Autowired
	private LeitorNFeService leitorNFe;

	private NotaFiscalEletronica nfe;

	@Before
	public void init() throws IllegalAccessException, InvocationTargetException {
		File xml = new File("/home/joao/Área de Trabalho/aut@7649@20120125.xml");
		this.nfe = leitorNFe.lerDadosNfe(xml);
	}

	@Test
	public void deveriaLerUmaNfe() {
		Assert.assertTrue(nfe != null);
	}

	@Test
	public void deveriaLerOCofinsDeUmaNFe() {
		Cofins cofins = nfe.getInfNfe().getDet().get(0).getImposto().getCofins();
		Assert.assertTrue(cofins != null);
	}

}
