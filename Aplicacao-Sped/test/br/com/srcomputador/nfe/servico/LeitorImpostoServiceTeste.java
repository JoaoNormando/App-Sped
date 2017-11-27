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
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.ImpostoDto;
import br.com.srcomputador.servico.OperacaoXmlService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { LeitorImpostoService.class, LeitorNFeService.class, LeitorCofinsService.class,
		OperacaoXmlService.class, XStreamConfig.class, Imposto.class, Cofins.class, Ipi.class, Icms.class,
		Pis.class, LeitorPisService.class })
public class LeitorImpostoServiceTeste {

	@Autowired
	private LeitorNFeService leitorNFe;
	@Autowired
	private LeitorImpostoService leitorImposto;

	private NotaFiscalEletronica nfe;
	private ImpostoDto impostoDto;
	private Imposto imposto;

	@Before
	public void init() throws IllegalAccessException, InvocationTargetException {
		File xml = new File("/home/joao/Área de Trabalho/aut@7649@20120125.xml");
		this.nfe = leitorNFe.lerDadosNfe(xml);
		this.impostoDto = nfe.getInfNfe().getDet().get(0).getImpostoDto();
		imposto = leitorImposto.lerImposto(impostoDto);
	}

	@Test
	public void deveriaCriarUmImposto() {
		Assert.assertTrue(imposto != null);
	}

	@Test
	public void deveriaLerUmCofins() {
		Assert.assertTrue(imposto.getCofins().getCst() == 1);
		Assert.assertTrue(imposto.getCofins().getvBc() == 0D);
		Assert.assertTrue(imposto.getCofins().getpCofins() == 0D);
		Assert.assertTrue(imposto.getCofins().getvCofins() == 0D);
	}

	@Test
	public void deveriaLerUmIcms() {

	}

	@Test
	public void deveriaLerUmPis() {
		Assert.assertTrue(imposto.getPis().getCst() == 1);
	}

}
