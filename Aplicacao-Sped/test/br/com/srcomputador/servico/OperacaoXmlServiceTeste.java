package br.com.srcomputador.servico;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.XStreamConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { XStreamConfig.class, OperacaoXmlService.class })
public class OperacaoXmlServiceTeste {

	@Autowired
	private OperacaoXmlService operacao;

	@Test
	public void deveDeserializarUmObjeto() {
		String nome = (String) this.operacao.consumirXml("<string>Fulano</string>");
		Assert.assertEquals("Fulano", nome);
	}

}
