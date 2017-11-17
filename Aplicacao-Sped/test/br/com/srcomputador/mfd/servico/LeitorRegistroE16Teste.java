package br.com.srcomputador.mfd.servico;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Calendar;

import org.junit.Assert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.RegistroE16;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LeitorRegistroE16.class, GeracaoDataHora.class})
public class LeitorRegistroE16Teste {

	@Autowired
	private LeitorRegistroE16 leitor;
	
	private final String TEXTO = "E16BE091010100010043667 MP-4000 TH FI       010597480000000000000000000000MF20141231170802";
	private RegistroE16 registro;
	
	@Before
	public void startUp() {
		registro = (RegistroE16) leitor.lerRegistro(this.TEXTO);
	}
	
	@Test
	public void deveriaLerOTipoDoRegistro() {
		Assert.assertEquals(registro.getTipoRegistro(), "E16");
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
		Assert.assertEquals(registro.getNumeroDoCOO(), 59748);
	}
	
	@Test
	public void deveriaLerONumeroDoGNF() {
		Assert.assertEquals(registro.getNumeroDoGNF(), 000000);
	}
	
	@Test
	public void deveriaLerONumeroDoGRG() {
		Assert.assertEquals(registro.getNumeroDoGRG(), 000000);
	}
	
	@Test
	public void deveriaLerONumeroDoCDC() {
		Assert.assertEquals(registro.getNumeroDoCDC(), 0000);
	}
	
	@Test
	public void deveriaLerONumeroDoCRZ() {
		Assert.assertEquals(registro.getNumeroDoCRZ(), 000000);
	}
	
	@Test
	public void deveriaLerADenominacaoDoDocumentoFiscal() {
		Assert.assertEquals(registro.getDenominacaoDocFiscal(), "MF");
	}
	
	@Test
	public void deveriaLerADataHoraFinalEmissao() {
		//2014 12 31 17 08 02
		
		Calendar data = registro.getDataHoraFinalEmissao();
		Assert.assertEquals(data.get(Calendar.YEAR), 2014);
		Assert.assertEquals(Calendar.DECEMBER, data.get(Calendar.MONTH));
		Assert.assertEquals(data.get(Calendar.DAY_OF_MONTH), 31);
		Assert.assertEquals(data.get(Calendar.HOUR_OF_DAY), 17);
		Assert.assertEquals(data.get(Calendar.MINUTE), 8);
		Assert.assertEquals(data.get(Calendar.SECOND), 2);
	
	}
}
