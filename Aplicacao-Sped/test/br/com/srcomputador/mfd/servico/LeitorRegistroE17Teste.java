package br.com.srcomputador.mfd.servico;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.RegistroE17;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LeitorRegistroE17.class})
public class LeitorRegistroE17Teste {

	@Autowired
	private LeitorRegistroE17 leitor;
	
	private String texto = "E17BE091010100010043667 MP-4000 TH FI       01001365Sangria        0000000171480";

	private RegistroE17 registro;
	
	@Before
	public void startUp() {
		registro = (RegistroE17) leitor.lerRegistro(texto);
	}
	
	@Test
	public void deveriaLerOTipoDoRegistro() {
		Assert.assertTrue(registro.getTipoRegistro().equals("E17"));
	}
	
	@Test
	public void deveriaLerONumeroFabricacao() {
		Assert.assertTrue(registro.getNumeroFabricacao().equals("BE091010100010043667"));
	}
	
	@Test
	public void deveriaLerOMfAdicional() {
		Assert.assertTrue(registro.getMfAdicional() == ' ');
	}
	
	@Test
	public void deveriaLerOModelo() {
		Assert.assertTrue(registro.getModelo().equals(" MP-4000 TH FI       "));
	}
	
	@Test
	public void deveriaLerONumeroDoUsuario() {
		Assert.assertTrue(registro.getNumeroDoUsuario() == 01);
	}
	
	@Test
	public void deveriaLerONumeroDoCrz() {
		Assert.assertEquals(registro.getNumeroDoCRZ(), 1365);
	}
	
	@Test
	public void deveriaLerADescricaoDoTotalizadorFiscal() {
		Assert.assertTrue(registro.getDescTotalizadorNaoFiscal().equals("Sangria        "));
	}
	
	@Test
	public void deveriaLerOValorAcumulado() {
		Assert.assertTrue(registro.getValorAcumulado() == 0000000171480D);
	}
}
