package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.XStreamConfig;
import br.com.srcomputador.nfe.entidade.ProcessoNFe;
import br.com.srcomputador.nfe.entidade.detalheProduto.Imposto;
import br.com.srcomputador.servico.OperacaoXmlService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { LeitorProcNFeService.class, LeitorNFeService.class, XStreamConfig.class,
		OperacaoXmlService.class, LeitorImpostoService.class, LeitorCofinsService.class, LeitorIcmsService.class,
		LeitorPisService.class, LeitorIpiService.class })
public class LeitorProcNFeServiceTeste {

	@Autowired
	private LeitorProcNFeService leitorProcNFeService;

	@Test
	public void deveriaLerUmaProcNfe() throws IllegalAccessException, InvocationTargetException {
		File proc = new File("/home/joao/Área de Trabalho/113140108714756-procNFe.xml");
		ProcessoNFe procNfe = leitorProcNFeService.lerDadosProcNfe(proc);
		Assert.assertTrue(procNfe != null);
	}

	@Test
	public void deveriaLerOCofins() throws IllegalAccessException, InvocationTargetException {
		File proc = new File("/home/joao/Área de Trabalho/113140108714756-procNFe.xml");
		ProcessoNFe procNfe = leitorProcNFeService.lerDadosProcNfe(proc);
		Imposto imposto = procNfe.getNfe().getInfNfe().getDet().get(0).getImposto();
		Assert.assertTrue(imposto.getCofins() != null);
	}

	@Test
	public void deveriaLerOIcms() throws IllegalAccessException, InvocationTargetException {
		File proc = new File("/home/joao/Área de Trabalho/113140108714756-procNFe.xml");
		ProcessoNFe procNfe = leitorProcNFeService.lerDadosProcNfe(proc);
		Imposto imposto = procNfe.getNfe().getInfNfe().getDet().get(0).getImposto();
		Assert.assertTrue(imposto.getIcms() != null);
	}

	@Test
	public void deveriaLerOIpi() throws IllegalAccessException, InvocationTargetException {
		File proc = new File("/home/joao/Área de Trabalho/113140108714756-procNFe.xml");
		ProcessoNFe procNfe = leitorProcNFeService.lerDadosProcNfe(proc);
		Imposto imposto = procNfe.getNfe().getInfNfe().getDet().get(0).getImposto();
		Assert.assertTrue(imposto.getIpi() != null);
	}

	@Test
	public void deveriaLerOPis() throws IllegalAccessException, InvocationTargetException {
		File proc = new File("/home/joao/Área de Trabalho/113140108714756-procNFe.xml");
		ProcessoNFe procNfe = leitorProcNFeService.lerDadosProcNfe(proc);
		Imposto imposto = procNfe.getNfe().getInfNfe().getDet().get(0).getImposto();
		Assert.assertTrue(imposto.getPis() != null);
	}
}
