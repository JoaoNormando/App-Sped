package br.com.srcomputador.mfd.servico;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.srcomputador.mfd.entidade.RegistroE01;

public class LeitorRegistroE01Teste {
/*	
E01BE091010100010043667 ECF-IF BEMATECH            MP-4000 TH FI       01.00.02  2011052411525300203459827000156TDM001365001390201501012015013102.01.02AC1704 01.00
*/
	private String texto = "E01BE091010100010043667 ECF-IF BEMATECH            MP-4000 TH FI       01.00.02  2011052411525300203459827000156TDM001365001390201501012015013102.01.02AC1704 01.00.00\n"
			+ "";
	private LeitorRegistroE01 leitor;
	private RegistroE01 registro;

	@Before
	public void setUp() {
		leitor = new LeitorRegistroE01();
		registro = leitor.lerRegistro(texto);
	}

	@Test
	public void deveriaLerOTipoDoRegistro() {
		Assert.assertEquals(registro.getTipoRegistro(), "E01");
	}
	
	@Test
	public void deveriaLerONumeroDeFabricacao() {
		Assert.assertEquals(registro.getNumeroFabricacao(), "BE09101010001004366");
	}
	
	@Test
	public void deveriaLerOMfAdicional() {
		Assert.assertEquals(registro.getNumeroFabricacao(), "BE09101010001004366");
	}
	
	@Test
	public void deveriaLerOTipoDoEcf() {
		Assert.assertEquals(registro.getTipoEcf(), "ECF-IF ");
	}
	
	@Test
	public void deveriaLerAMarca() {		
		Assert.assertEquals(registro.getMarca(), "BEMATECH           ");
	}
	
	@Test
	public void deveriaLerOModelo() {
		Assert.assertEquals(registro.getModelo(), "MP-4000 TH FI      ");
	}
	@Test
	public void deveriaLerAVersaoDoSb() {
		Assert.assertEquals(registro.getVersaoSb(), "01.00.02 ");
	}
	
//	@Test
//	public void deveriaLerADataDaGravacaoSb() {
//		Calendar data = new GregorianCalendar();
//		data.set(Calendar.YEAR, 2011);
//		data.set(Calendar.MONTH, 05);
//		data.set(Calendar.DAY_OF_MONTH, 24);
//		Assert.assertEquals(registro.getDataGravacaoSb().get(Calendar.YEAR), data.get(Calendar.YEAR));
//		Assert.assertEquals(registro.getDataGravacaoSb().get(Calendar.MONTH), data.get(Calendar.MONTH));
//		Assert.assertEquals(registro.getDataGravacaoSb().get(Calendar.DAY_OF_MONTH), data.get(Calendar.DAY_OF_MONTH));
//	}
	
//	@Test
//	public void deveriaLerAHoraDaGravacao() {
//		Calendar hora = new GregorianCalendar();
//		
//		hora.set(Calendar.HOUR_OF_DAY, 11);
//		hora.set(Calendar.MINUTE, 52);
//		hora.set(Calendar.SECOND, 53);
//		
//		Assert.assertEquals(registro.getHoraGravacaoSb().get(Calendar.HOUR_OF_DAY), hora.get(Calendar.HOUR_OF_DAY));
//		Assert.assertEquals(registro.getHoraGravacaoSb().get(Calendar.MINUTE), hora.get(Calendar.MINUTE));
//		Assert.assertEquals(registro.getHoraGravacaoSb().get(Calendar.SECOND), hora.get(Calendar.SECOND));	
//		
//	}
	
	@Test
	public void deveriaLerONumeroSequencialDoEcf() {
		Assert.assertEquals(registro.getNumeroEcf(), 002);
	}
	
	@Test
	public void deveriaLerOCnpjDoUsuario() {
		Assert.assertEquals(registro.getCnpjUsuario(), "03459827000156");
	}
	
	@Test
	public void deveriaLerOComandoGeracao() {
		Assert.assertEquals(registro.getComandoDeGeracao(), "TDM");
	}
	
	@Test
	public void deveriaLerOCrzInicial() {
		Assert.assertEquals(registro.getCrzInicial(), 1365);
	}
	
	@Test
	public void deveriaLerOCrzFinal() {
		Assert.assertEquals(registro.getCrzFinal(), 1390);
	}
	
	@Test
	public void deveriaLerADataInicial() {
		Calendar data = new GregorianCalendar();
		data.set(Calendar.YEAR, 2015);
		data.set(Calendar.MONTH, 01);
		data.set(Calendar.DAY_OF_MONTH, 01);
	
		Assert.assertEquals(registro.getDataInicial().get(Calendar.YEAR), data.get(Calendar.YEAR));
		Assert.assertEquals(registro.getDataInicial().get(Calendar.MONTH), data.get(Calendar.MONTH));
		Assert.assertEquals(registro.getDataInicial().get(Calendar.DAY_OF_MONTH), data.get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void deveriaLerADataFinal() {
		Calendar data = new GregorianCalendar();
		data.set(Calendar.YEAR, 2015);
		data.set(Calendar.MONTH, 01);
		data.set(Calendar.DAY_OF_MONTH, 31);
		
		Assert.assertEquals(registro.getDataFinal().get(Calendar.YEAR), data.get(Calendar.YEAR));
		Assert.assertEquals(registro.getDataFinal().get(Calendar.MONTH), data.get(Calendar.MONTH));
		Assert.assertEquals(registro.getDataFinal().get(Calendar.DAY_OF_MONTH), data.get(Calendar.DAY_OF_MONTH));
	
	}
	
	@Test
	public void deveriaLerAVersaoDaBiblioteca() {
		Assert.assertEquals(registro.getVersaoBiblioteca(), "02.01.02");
	}
	
	@Test
	public void deveriaLerAVersaoDoAtoCotepe() {
		Assert.assertEquals(registro.getVersaoAtoCotepe(), "AC1704 01.00.00");
	}
//	2015 01 01
}

