package br.com.srcomputador.mfd.servico;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Calendar;

import org.junit.Assert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.RegistroE01;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LeitorRegistroE01.class, GeracaoDataHora.class})
public class LeitorRegistroE01Teste {
	
	@Autowired
	private LeitorRegistroE01 leitor;
	
	private final String TEXTO = "E01BE091010100010043667 ECF-IF BEMATECH            MP-4000 TH FI       01.00.02  2011052411525300203459827000156TDM001365001390201501012015013102.01.02AC1704 01.00.00";
	private RegistroE01 registro;
	
	@Before
	public void startUp() {
		registro = (RegistroE01) leitor.lerRegistro(this.TEXTO);
	}
	
	@Test
	public void deveriaLerOTipoDoRegistro() {
		Assert.assertEquals("E01", registro.getTipoRegistro());
	}
	
	@Test
	public void deveriaLerONumeroDeFabricacao() {
		Assert.assertEquals("BE091010100010043667", registro.getNumeroFabricacao());
	}
	
	@Test
	public void deveriaLerOMfAdicional() {
		Assert.assertEquals(' ', registro.getMfAdicional());
	}
	
	@Test
	public void deveriaLerTipoEcf() {
		Assert.assertEquals("ECF-IF", registro.getTipoEcf());
	}
	
	@Test
	public void deveriaLerAMarca() {
		Assert.assertEquals("BEMATECH", registro.getMarca());
	}
	
	@Test
	public void deveriaLerOModelo() {
		Assert.assertEquals("MP-4000 TH FI", registro.getModelo());
	}
	
	@Test
	public void deveriaLerAVersaoSb() {
		Assert.assertEquals("01.00.02", registro.getVersaoSb());
	}
	
	@Test
	public void deveriaLerDataHoraGravacaoSb() {
		//2011 05 24 || 11 52 53
		Calendar data = registro.getDataHoraGravacaoSb();
		
		Assert.assertEquals(2011, data.get(Calendar.YEAR));
		Assert.assertEquals(Calendar.MAY, data.get(Calendar.MONTH));
		Assert.assertEquals(24, data.get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals(11, data.get(Calendar.HOUR_OF_DAY));
		Assert.assertEquals(52, data.get(Calendar.MINUTE));
		Assert.assertEquals(53, data.get(Calendar.SECOND));
		
	}
	
	@Test
	public void deveriaLerONumeroDoECF() {
		Assert.assertTrue(registro.getNumeroEcf() == 2);
	}
	
	@Test
	public void deveriaLerOCnpjDoUsuario() {
		Assert.assertEquals("03459827000156", registro.getCnpjUsuario());
	}
	
	@Test
	public void deveriaLerOComandoDeGeracao() {
		Assert.assertEquals("TDM", registro.getComandoDeGeracao());
	}

	@Test
	public void deveriaLerOCrzInicial() {
		Assert.assertTrue(registro.getCrzInicial() == 1365);
	}
	
	@Test
	public void deveriaLerOCrzFinal() {
		Assert.assertTrue(registro.getCrzFinal() == 1390);
	}
	
	@Test
	public void deveriaLerADataInicial() {
		//2015 01 01
		Calendar data = registro.getDataInicial();
		Assert.assertEquals(2015, data.get(Calendar.YEAR));
		Assert.assertEquals(Calendar.JANUARY, data.get(Calendar.MONTH));
		Assert.assertEquals(1, data.get(Calendar.DAY_OF_MONTH));
	}
	
	@Test
	public void deveriaLerADataFinal() {
		//2015 01 31
		Calendar data = registro.getDataFinal();
		Assert.assertEquals(2015, data.get(Calendar.YEAR));
		Assert.assertEquals(Calendar.JANUARY, data.get(Calendar.MONTH));
		Assert.assertEquals(31, data.get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void deveriaLerAVersaoDaBiblioteca() {
		Assert.assertEquals("02.01.02", registro.getVersaoBiblioteca());
	}
	
	@Test
	public void deveriaLerAVersaoDoAtoCotepe() {
		Assert.assertEquals("AC1704 01.00.00", registro.getVersaoAtoCotepe());
	}
	
}

