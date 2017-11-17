package br.com.srcomputador.mfd.servico;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.RegistroE21;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LeitorRegistroE21.class})
public class LeitorRegistroE21Teste {

	@Autowired
	private LeitorRegistroE21 leitor;
	private final String TEXTO = "E21BE091010100010043667 MP-4000 TH FI       01059750000000007126Dinheiro       0000000016110N0000000000000";
	private RegistroE21 registro;
	
	@Before
	public void startUp() {
		registro = (RegistroE21) leitor.lerRegistro(this.TEXTO);
	}
	
	@Test
	public void deveriaLerOTipoDoRegistro() {
		Assert.assertEquals(registro.getTipoRegistro(), "E21");
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
		Assert.assertTrue(registro.getNumeroDoCOO() == 59750);
	}
	
	@Test
	public void deveriaLerONumeroDoCCF() {
		Assert.assertTrue(registro.getNumeroDoCCF() == 000000);
	}
	
	@Test
	public void deveriaLerONumeroDoGnf() {
		Assert.assertTrue(registro.getNumeroDoGNF() == 7126);
	}
	
	@Test
	public void deveriaLerADescricaoDoMeioDePagamento() {
		Assert.assertEquals(registro.getDescricaoMeioPagamento(), "Dinheiro       ");
	}
	
	@Test
	public void deveriaLerOValorPago() {
		Assert.assertTrue(registro.getValorPago() == 0000000016110D);
	}
	
	@Test
	public void deveriaLerOIndicadorDoEstorno() {
		Assert.assertEquals(registro.getIndicadorEstorno(), 'N');
	}
	
	@Test
	public void deveriaLerOValorEstornado() {
		Assert.assertTrue(registro.getValorEstornado() == 0000000000000D);
	}
}
