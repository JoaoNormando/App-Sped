package br.com.srcomputador.mfd.servico;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.RegistroE20;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LeitorRegistroE20.class})
public class LeitorRegistroE20Teste {

	@Autowired
	private LeitorRegistroE20 leitor;
	
	private final String TEXTO = "E20BE091010100010043667 MP-4000 TH FI       01059750007126001Suprimento     0000000016110000000000000000000000000000000000016110N0000000000000";
	private RegistroE20 registro;
	
	@Before
	public void startUp() {
		registro = (RegistroE20) leitor.lerRegistro(this.TEXTO);
	}
	
	@Test
	public void deveriaLerOTipoDoRegistro() {
		Assert.assertEquals(registro.getTipoRegistro(), "E20");
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
		Assert.assertEquals(registro.getNumeroDoCOO(), 59750);
	}
	
	@Test
	public void deveriaLerONumeroDoGNF() {
		Assert.assertEquals(registro.getNumeroDoGNF(), 7126);
	}
	
	@Test
	public void deveriaLerONumeroDoItem() {
		Assert.assertEquals(registro.getNumeroDoItem(), 1);
	}
	
	@Test
	public void deveriaLerADenominacaoDaOperacao() {
		Assert.assertEquals(registro.getDenominacaoOperacao(), "Suprimento     ");
	}
	
	@Test
	public void deveriaLerOValorDaOperacao() {
		Assert.assertTrue(registro.getValorOperacao() == 0000000016110D);
	}
	
	@Test
	public void deveriaLerODescontoSobreItem() {
		Assert.assertTrue(registro.getDescontoSobreItem() == 0000000000000);
	}
	
	@Test
	public void deveriaLerOAcrescimoSobreOItem() {
		Assert.assertTrue(registro.getDescontoSobreItem() == 0000000000000);
	}
	
	@Test
	public void deveriaLerOValorTotalLiquido() {
		Assert.assertTrue(registro.getValorTotalLiquido() == 0000000016110D);
	}
	
	@Test
	public void deveriaLerOIndicadorCancelamento() {
		Assert.assertEquals(registro.getIndicadorCancelamento(), 'N');
	}
	
	@Test
	public void deveriaLerOCancelamentoAcrescimoItem() {
		Assert.assertTrue(registro.getCancelamentoAcrescimoItem() == 0000000000000);
	}
	
}
