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
import br.com.srcomputador.nfe.entidade.detalheProduto.Imposto;
import br.com.srcomputador.nfe.entidade.detalheProduto.Ipi;
import br.com.srcomputador.nfe.entidade.detalheProduto.Pis;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsDto;
import br.com.srcomputador.servico.OperacaoXmlService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { LeitorIcmsService.class, LeitorNFeService.class, XStreamConfig.class,
		LeitorCofinsService.class, LeitorPisService.class, OperacaoXmlService.class, Imposto.class, Cofins.class,
		Icms.class, Pis.class, Ipi.class, LeitorImpostoService.class })
public class LeitorIcmsTeste {

	@Autowired
	private LeitorNFeService leitorNFe;
	@Autowired
	private LeitorIcmsService leitorIcms;

	private NotaFiscalEletronica NFe;
	private IcmsDto icmsDto;

	@Before
	public void init() throws IllegalAccessException, InvocationTargetException {
		File xml = new File("/home/joao/Área de Trabalho/aut@7649@20120125.xml");
		this.NFe = leitorNFe.lerDadosNfe(xml);
		icmsDto = NFe.getInfNfe().getDet().get(0).getImpostoDto().getIcms();
	}

	@Test
	public void deveriaLerUmIcms() throws IllegalAccessException, InvocationTargetException {
		Icms icms = leitorIcms.lerIcms(icmsDto);
		Assert.assertTrue(icms.getModBc() == 3D);
	}

}
