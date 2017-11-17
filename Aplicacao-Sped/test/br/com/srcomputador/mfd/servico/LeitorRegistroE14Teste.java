package br.com.srcomputador.mfd.servico;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Calendar;

import org.junit.Assert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.RegistroE14;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LeitorRegistroE14.class, GeracaoDataHora.class})
public class LeitorRegistroE14Teste {
	
	@Autowired
	private LeitorRegistroE14 leitor;
	
	private final String TEXTO = "E14BE091010100010043667 MP-4000 TH FI       0104971806090520150131000000000199200000000000000V0000000000000V00000000019920N0000000000000                                         00000000000000";

	private RegistroE14 registro;
	
	@Before
	public void startUp() {
		registro = (RegistroE14) leitor.lerRegistro(this.TEXTO);
	}
	
	@Test
	public void deveriaLerOTipoDoRegistro() {
		Assert.assertEquals("E14", registro.getTipoRegistro());
	}
	
	@Test
	public void deveriaLerNumeroDeFabricacao() {
		Assert.assertEquals("BE091010100010043667", registro.getNumeroFabricacao());
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
		Assert.assertTrue(registro.getNumeroDoUsuario() == 01);
	}
	
	@Test
	public void deveriaLerONumeroDoDocumentoDoContador() {
		Assert.assertTrue(registro.getNumeroDocumentoContador() == 49718);
	}
	
	@Test
	public void deveriaLerONumeroDoCOO() {
		Assert.assertTrue(registro.getNumeroDoCOO() == 60905);
	}
	
	@Test
	public void deveriaLerADataInicioEmissao() {
		//2015 01 31
		Calendar data = registro.getDataInicioEmissao();
		Assert.assertEquals(2015, data.get(Calendar.YEAR));
		Assert.assertEquals(Calendar.JANUARY, data.get(Calendar.MONTH));
		Assert.assertEquals(31, data.get(Calendar.DAY_OF_MONTH));
	}
	
	@Test
	public void deveriaLerOValorTotalDoDocumento() {
		Assert.assertTrue(registro.getValorTotalDoDocumento() == 00000000019920D);
	}
	
	@Test
	public void deveriaLerOValorDoDesconto() {
		Assert.assertTrue(registro.getValorDoDesconto() == 0000000000000);
	}
	
	@Test
	public void deveriaLerOTipoDoDesconto() {
		Assert.assertEquals(registro.getTipoDesconto(), 'V');
	}
	
	@Test
	public void deveriaLerOAcrescimoPercAplicado() {
		Assert.assertTrue(registro.getValorAcrescimoPercAplicado() == 0000000000000);
	}
	
	@Test
	public void deveriaLerOTipoDoAcrescimo() {
		Assert.assertEquals(registro.getIndicadorTipoAcrescimo(), 'V');
	}
	
	@Test
	public void deveriaLerOValorTotalLiquido() {
		Assert.assertTrue(registro.getValorTotalLiquido() == 00000000019920D);
	}
	
	@Test
	public void deveriaLerOIndicadorDeCancelamento() {
		Assert.assertEquals(registro.getIndicadorDeCancelamento(), 'N');
	}
	
	@Test
	public void deveriaLerOValorDoCancelamento() {
		Assert.assertTrue(registro.getValorCancelamento() == 0000000000000D);
	}
	
	@Test
	public void deveriaLerAOrdemAplicadaDoDesconto() {
		Assert.assertEquals(registro.getOrdemAplicacaoDesconto(), ' ');
	}
	
	@Test
	public void deveriaLerONomeDoAdquirente() {
		Assert.assertEquals("                                        ", registro.getNomeAdquirinte());
	}
	
	@Test
	public void deveriaLerOCpfCnpjDoAdquirente() {
		Assert.assertEquals("00000000000000", registro.getCnpjCpfAdquirente());
	}
}
