package br.com.srcomputador.mfd.servico;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.RegistroE15;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LeitorRegistroE15.class})
public class LeitorRegistroE15Teste {

	
	@Autowired
	private LeitorRegistroE15 leitor;
	
	private final String TEXTO = "E15BE091010100010043667 MP-4000 TH FI       010597510487620015498          SABONETE P USO FLORAL LAV                                                                           0001000LT 00000490000000000000000000000000000490F1     N000000000000000000000000000000000T32";

	private RegistroE15 registro;
	
	@Before
	public void startUp() {
		registro = (RegistroE15) leitor.lerRegistro(this.TEXTO);
	}
	
	@Test
	public void deveriaLerOTipoDoRegistro() {
		Assert.assertEquals(registro.getTipoRegistro(), "E15");
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
		Assert.assertEquals(registro.getNumeroDoCOO(), 59751);
	}
	
	@Test
	public void deveriaLerONumeroDoContador() {
		Assert.assertEquals(registro.getNumeroDoContador(), 48762);
	}
	
	@Test
	public void deveriaLerONumeroDoItem() {
		Assert.assertEquals(registro.getNumeroDoItem(), 001);
	}
	
	@Test
	public void deveriaLerOCodigoDoProduto() {
		Assert.assertEquals(registro.getCodigoDoProduto(), "5498          ");
	}
	
	@Test
	public void deveriaLerADescricaoDoProduto() {
		Assert.assertEquals(registro.getDescricaoProduto(), "SABONETE P USO FLORAL LAV                                                                           ".trim());
	}
	
	@Test
	public void deveriaLerAQuantidadeComercializada() {
		Assert.assertEquals(registro.getQuantidadeComercializada(), 1000);
	}
	
	@Test
	public void deveriaLerAUnidadeDeMedida() {
		Assert.assertEquals(registro.getUnidadeMedida(), "LT ");
	}
	
	@Test
	public void deveriaLerOValorUnitario() {
		Assert.assertEquals(registro.getValorUnitario(), 490);
	}
	
	@Test
	public void deveriaLerODesconto() {
		Assert.assertTrue(registro.getValorDesconto() == 00000000);
	}
	
	@Test
	public void deveriaLerOAcrescimo() {
		Assert.assertTrue(registro.getValorAcrescimo() == 00000000);
	}
	
	@Test
	public void deveriaLerOValorTotalLiquido() {
		Assert.assertTrue(registro.getValorTotalLiquido() == 00000000000490D);
	}
	
	@Test
	public void deveriaLerOTotalizadorParcial() {
		Assert.assertEquals(registro.getCodTotalizadorParcial(), "F1     ");
	}
	
	@Test
	public void deveriaLerOIndicadorDeCancelamento() {
		Assert.assertEquals(registro.getIndicadorDeCancelamento(), 'N');
	}
	
	@Test
	public void deveriaLerAQuantidadeCancelada() {
		Assert.assertEquals(registro.getQuantidadeCancelada(), 0000000);
	}
	
	@Test
	public void deveriaLerOValorCancelado() {
		Assert.assertTrue(registro.getValorCancelado() == 0000000000000);
	}
	
	@Test
	public void deveriaLerOValorCanceladoDeAcrescimo() {
		Assert.assertTrue(registro.getValorCanceladoAcrescimo() == 0000000000000);
	}
	
	@Test
	public void deveriaLerOIndicadorDeArredondamento() {
		Assert.assertEquals(registro.getIndicadorDeArredondamento(), 'T');
	}
	
	@Test
	public void deveriaLerAsCasasDecimais() {
		Assert.assertEquals(registro.getCasasDecimais(), 3);
	}
	
	@Test
	public void deveriaLerAsCasasDecimaisValorUnitario() {
		Assert.assertTrue(registro.getCasasDecimaisValorUnitario() == 2);
	}
}
