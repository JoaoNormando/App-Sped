package br.com.srcomputador.mfd.servico;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {GeracaoDataHora.class})
public class GeracaoDataHoraTeste {
	
	@Autowired
	private GeracaoDataHora gerador;

	@Test
	public void deveriaGerarUmCalendarTodoPopulado() {
		Calendar calendario = gerador.gerarDataHora("20150407112341");
		GregorianCalendar temp = new GregorianCalendar();
		temp.set(2015, 04, 07, 11, 23, 41);
		
		Assert.assertEquals(2015, calendario.get(Calendar.YEAR));
		Assert.assertEquals(Calendar.APRIL, calendario.get(Calendar.MONTH));
		Assert.assertEquals(07, calendario.get(Calendar.DAY_OF_MONTH));
		Assert.assertEquals(11, calendario.get(Calendar.HOUR_OF_DAY));
		Assert.assertEquals(23, calendario.get(Calendar.MINUTE));
		Assert.assertEquals(41, calendario.get(Calendar.SECOND));
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void deveriaDispararUmaStringOfBoundsException() {
		gerador.gerarDataHora("20140102");
	}
	
	@Test
	public void deveriaGerarUmCalendarComADataPopulada() {
		Calendar data = gerador.gerarData("20150407");
		
		Assert.assertEquals(2015, data.get(Calendar.YEAR));
		Assert.assertEquals(Calendar.APRIL, data.get(Calendar.MONTH));
		Assert.assertEquals(07, data.get(Calendar.DAY_OF_MONTH));
	}
	
}
