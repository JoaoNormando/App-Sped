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
import br.com.srcomputador.nfe.entidade.detalheProduto.Pis;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.PisDto;
import br.com.srcomputador.servico.OperacaoXmlService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { LeitorNFeService.class, LeitorPisService.class, OperacaoXmlService.class,
		XStreamConfig.class, LeitorImpostoService.class, LeitorCofinsService.class })
public class LeitorPisTeste {

	@Autowired
	private LeitorNFeService leitorNFe;
	@Autowired
	private LeitorPisService leitorPis;
	private NotaFiscalEletronica NFe;

	@Before
	public void init() throws IllegalAccessException, InvocationTargetException {
		File xml = new File("/home/joao/Área de Trabalho/aut@7649@20120125.xml");
		this.NFe = leitorNFe.lerDadosNfe(xml);
	}

	@Test
	public void deveriaLerUmPis() throws IllegalAccessException, InvocationTargetException {
		PisDto pisDto = NFe.getInfNfe().getDet().get(0).getImpostoDto().getPis();
		Pis pis = leitorPis.lerPis(pisDto);
		Assert.assertTrue(pis != null);
	}
	
}
