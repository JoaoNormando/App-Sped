package br.com.srcomputador.nfe.servico;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.XStreamConfig;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.servico.icms.LeitorNFe;
import br.com.srcomputador.servico.OperacaoXmlService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { LeitorNFe.class, OperacaoXmlService.class, XStreamConfig.class })
public class LeitorNFeTeste {

	@Autowired
	private LeitorNFe leitorNFe;

	@Test
	public void deveriaLerOsDadosDeUmaNFe() {
		File xml = new File("/home/joao/Área de Trabalho/aut@7649@20120125.xml");
		NotaFiscalEletronica dadosNfe = leitorNFe.lerDadosNfe(xml);
		Assert.assertTrue(dadosNfe != null);
	}
	
}
