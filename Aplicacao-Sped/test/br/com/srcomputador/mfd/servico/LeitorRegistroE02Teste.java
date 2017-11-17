package br.com.srcomputador.mfd.servico;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.RegistroE02;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LeitorRegistroE02.class, GeracaoDataHora.class})
public class LeitorRegistroE02Teste {

	@Autowired
	private LeitorRegistroE02 leitor;
	
	private final String TEXTO = "E02BE091010100010043667 MP-4000 TH FI       034598270001566720498790070     DISTRIBUIDORA DIOGO DE SETE LAGOAS       RUA BENEDITO VALADARES, 255 - CENTRO  CEP:35.700-055 - SETE LAGOAS - MINAS GERAIS                                  2010060809485000000100000000035895001201"; 
	private RegistroE02 registro;
	
	@Before
	public void startUp() {
		registro = (RegistroE02) leitor.lerRegistro(this.TEXTO);
	}
	
	@Test
	public void deveriaLerOTipoDoRegistro() {
		Assert.assertEquals("E02", registro.getTipoRegistro());
	}
	
	@Test
	public void deveriaLerONumeroDaFabricacao() {
		Assert.assertEquals("BE091010100010043667", registro.getNumeroFabricacao());
	}
	
	@Test
	public void deveriaLerOMfAdicional() {
		Assert.assertEquals(' ', registro.getMfAdicional());
	}
	
	@Test
	public void deveriaLerOModelo() {
		Assert.assertEquals("MP-4000 TH FI", registro.getModelo());
	}
	
	@Test
	public void deveriaLerOCnpj() {
		Assert.assertEquals("03459827000156", registro.getCnpj());
	}
	
	@Test
	public void deveriaLerAInscricaoEstadual() {
		Assert.assertEquals("6720498790070", registro.getInscricaoEstadual());
	}
	
	@Test
	public void deveriaLerONomeDoContribuinte() {
		System.out.println(registro.getNomeContribuinte());
		System.out.println(registro.getNomeContribuinte().trim());
		Assert.assertEquals("DISTRIBUIDORA DIOGO DE SETE LAGOAS", registro.getNomeContribuinte());
	}
	
	@Test
	public void deveriaLerOEndereco() {
		Assert.assertEquals("RUA BENEDITO VALADARES, 255 - CENTRO  CEP:35.700-055 - SETE LAGOAS - MINAS GERAIS", registro.getEndereco());
	}
	
	@Test
	public void deveriaLerADataHoraDoCadastro() {
		//2010 06 08 || 09 48 50
		Calendar data = registro.getDataHoraCadastro();
		Assert.assertEquals(2010, data.get(Calendar.YEAR));
		Assert.assertEquals(Calendar.JUNE, data.get(Calendar.MONTH));
		Assert.assertEquals(8, data.get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals(9, data.get(Calendar.HOUR_OF_DAY));
		Assert.assertEquals(48, data.get(Calendar.MINUTE));
		Assert.assertEquals(50, data.get(Calendar.SECOND));
	}
	
	@Test
	public void deveriaLerOValorDoCRO() {
		Assert.assertTrue(registro.getValorCro() == 1);
	}
	
	@Test
	public void deveriaLerOValorDoGT() {
		Assert.assertTrue(registro.getValorGt() == 358950012);
	}
	
	@Test
	public void deveriaLerONumeroDoUsuario() {
		Assert.assertTrue(registro.getNumeroDoUsuario() == 01);
	}
}
