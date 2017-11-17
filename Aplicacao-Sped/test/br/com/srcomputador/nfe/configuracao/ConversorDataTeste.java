package br.com.srcomputador.nfe.configuracao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Assert;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter;

public class ConversorDataTeste {
	
	@Test
	public void deveriaRealizarMarshalDeUmaData() {
		XStream xstream = new XStream();
		xstream.registerConverter(new ISO8601GregorianCalendarConverter());
		Calendar calendar = (GregorianCalendar) xstream.fromXML("<gregorian-calendar>2006-07-28</gregorian-calendar>");
		Assert.assertEquals(2006, calendar.get(Calendar.YEAR));
		Assert.assertTrue(calendar != null);
	}
	
}
