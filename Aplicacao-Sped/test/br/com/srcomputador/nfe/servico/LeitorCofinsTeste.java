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
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.CofinsDto;
import br.com.srcomputador.servico.OperacaoXmlService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { LeitorCofinsService.class, LeitorNFeService.class, OperacaoXmlService.class,
		XStreamConfig.class, LeitorImpostoService.class, LeitorPisService.class, LeitorCofinsService.class })
public class LeitorCofinsTeste {

	@Autowired
	private LeitorCofinsService leitorCofins;
	@Autowired
	private LeitorNFeService leitorNFe;
	private NotaFiscalEletronica NFe;

	@Before
	public void init() throws IllegalAccessException, InvocationTargetException {
		File xml = new File("/home/joao/Área de Trabalho/aut@7649@20120125.xml");
		this.NFe = leitorNFe.lerDadosNfe(xml);
	}

	@Test
	public void deveriaLerUmCofins() throws IllegalAccessException, InvocationTargetException {
		CofinsDto cofins = this.NFe.getInfNfe().getDet().get(0).getImpostoDto().getCofins();
		Cofins cofinsReal = leitorCofins.lerCofins(cofins);
		Assert.assertTrue(cofinsReal != null);
	}

}
