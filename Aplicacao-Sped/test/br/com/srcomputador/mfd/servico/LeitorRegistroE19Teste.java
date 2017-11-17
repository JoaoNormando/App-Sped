package br.com.srcomputador.mfd.servico;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.RegistroE19;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LeitorRegistroE19.class, GeracaoDataHora.class})
public class LeitorRegistroE19Teste {

	
	@Autowired
	private LeitorRegistroE19 leitor;
	
	private final String TEXTO = "E19BE091010100010043667 MP-4000 TH FI       0105993100714920150107000000000200000000000000000V0000000000000V00000000020000N0000000000000                                         00000000000000\n" + 
			"";

	private RegistroE19 registro;
	
	@Before
	public void startUp() {
		registro = (RegistroE19) leitor.lerRegistro(this.TEXTO);
	}
	
	@Test
	public void deveriaLerOTipoDoRegistro() {
		Assert.assertEquals(registro.getTipoRegistro(), "E19");
	}
	
	@Test
	public void deveriaLerONumeroDaFabricacao() {
		Assert.assertEquals(registro.getNumeroFabricacao(), "BE091010100010043667");
	}
	
	@Test
	public void deveriaLerOMfAdicional() {
		Assert.assertEquals(registro.getMfAdicional(), ' ');
	}
	
	@Test
	public void deveriaLerOModelo() {
		Assert.assertEquals(registro.getModelo(), "MP-4000 TH FI       ");
	}
	
	@Test
	public void deveriaLerONumeroDoUsuario() {
		Assert.assertEquals(registro.getNumeroDoUsuario(), 01);
	}
	
	@Test
	public void deveriaLerONumeroDoCOO() {
		Assert.assertEquals(registro.getNumeroDoCOO(), 59931);
	}
	
	@Test
	public void deveriaLerONumeroDoGNF() {
		Assert.assertEquals(registro.getNumeroDoGNF(), 7149);
	}
	
	@Test
	public void deveriaLerADataInicioEmissao() {
		// 2015 01 07
		Calendar data = registro.getDataInicioEmissao();
		Assert.assertEquals(data.get(Calendar.YEAR), 2015);
		Assert.assertEquals(data.get(Calendar.MONTH), 01);
		Assert.assertEquals(data.get(Calendar.DAY_OF_MONTH), 07);
	}
	
	@Test
	public void deveriaLerOValorSubtotal() {
		Assert.assertTrue(registro.getValorSubtotal() == 20000D);
	}
	
	@Test
	public void deveriaLerOValorDoDescontoSubtotal() {
		Assert.assertTrue(registro.getDescontoSubtotal() == 0000000000000);
	}
	
	@Test
	public void deveriaLerOIndicadorTipoDesconto() {
		Assert.assertEquals(registro.getIndicadorTipoDesconto(), 'V');
	}
	
	@Test
	public void deveriaLerOValorDoAcrescimoSubtotal() {
		Assert.assertTrue(registro.getAcrescimoSubtotal() == 0000000000000);
	}
	
	@Test
	public void deveriaLerOIndicadorTipoAcrescimo() {
		Assert.assertEquals(registro.getIndicadorTipoAcrescimo(), 'V');
	}
	
	@Test
	public void deveriaLerOValorTotalLiquido() {
		Assert.assertTrue(registro.getValorTotalLiquido() == 00000000020000D);
	}
	
	@Test
	public void deveriaLerOIndicadorDeCancelamento() {
		Assert.assertEquals(registro.getIndicadorCancelamento(), 'N');
	}
	
	@Test
	public void deveriaLerOValorCancelamento() {
		Assert.assertTrue(registro.getValorCancelamento() == 0000000000000D);
	}
	
	@Test
	public void deveriaLerAOrdemDoDesconto() {
		Assert.assertEquals(registro.getOrdemDesconto(), ' ');
	}
	
	@Test
	public void deveriaLerONomeDoAdquirente() {
		Assert.assertEquals(registro.getNomeAdquirente(), "                                        ");
	}
	
	@Test
	public void deveriaLerOCnpjCpfDoAdquirente() {
		Assert.assertEquals(registro.getCnpjCpfAdquirente(), "00000000000000");
	}
}
