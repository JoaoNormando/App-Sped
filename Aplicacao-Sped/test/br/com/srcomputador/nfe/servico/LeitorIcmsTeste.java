package br.com.srcomputador.nfe.servico;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.XStreamConfig;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsDto;
import br.com.srcomputador.nfe.servico.icms.IdentificarIcms;
import br.com.srcomputador.nfe.servico.icms.LeitorNFe;
import br.com.srcomputador.nfe.servico.icms.TiposIcms;
import br.com.srcomputador.servico.OperacaoXmlService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { LeitorNFe.class, IdentificarIcms.class, OperacaoXmlService.class,
		XStreamConfig.class })
public class LeitorIcmsTeste {

	@Autowired
	private LeitorNFe leitorNFe;
	@Autowired
	private IdentificarIcms identificadorIcms;

	private NotaFiscalEletronica NFe;

	@Before
	public void init() {
		File xml = new File("/home/joao/Área de Trabalho/aut@7649@20120125.xml");
		this.NFe = leitorNFe.lerDadosNfe(xml);
	}

	@Test
	public void deveriaRetornarUmIcms00() {
		IcmsDto icmsDto = NFe.getInfNfe().getDet().get(0).getImpostoDto().getIcms();
		TiposIcms icms = identificadorIcms.identificar(icmsDto);
		Assert.assertEquals(0, TiposIcms.ICMS00.compareTo(icms));
	}

}
