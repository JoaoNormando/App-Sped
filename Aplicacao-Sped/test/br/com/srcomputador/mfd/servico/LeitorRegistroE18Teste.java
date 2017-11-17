package br.com.srcomputador.mfd.servico;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.RegistroE18;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LeitorRegistroE18.class})
public class LeitorRegistroE18Teste {

	@Autowired
	private LeitorRegistroE18 leitor;
	
	private final String TEXTO = "E18BE091010100010043667 MP-4000 TH FI       01001365Dinheiro       0000000066625\n" + 
			"";

	private RegistroE18 registro;
	
	@Before
	public void startUp() {
		registro = (RegistroE18) leitor.lerRegistro(this.TEXTO);
	}
	
	@Test
	public void deveriaLerOTipoDoRegistro() {
		Assert.assertTrue(registro.getTipoRegistro().equals("E18"));
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
	public void deveriaLerONumeroDoCrz() {
		Assert.assertEquals(registro.getNumeroDoCRZ(), 1365);
	}
	
	@Test
	public void deveriaLerADescricaoDoTotalizador() {
		Assert.assertEquals(registro.getDescricaoTotalizador(), "Dinheiro       ");
	}

	@Test
	public void deveriaLerOValorAcumulado() {
		Assert.assertTrue(registro.getValorAcumulado() == 0000000066625D);
	}
}
