package br.com.srcomputador.configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter;

@Component
public class XStreamConfig {

	@Bean
	public XStream xStream() {
		XStream xstream = new XStream();
		xstream.registerConverter(new ISO8601GregorianCalendarConverter());
		return xstream;
	}
	
}
