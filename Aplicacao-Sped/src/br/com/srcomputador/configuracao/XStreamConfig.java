package br.com.srcomputador.configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.extended.ISO8601DateConverter;
import com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;

@Component
public class XStreamConfig {

	@Bean
	public XStream xStream() {
		XStream xstream = new XStream(new Dom4JDriver());
		xstream.autodetectAnnotations(true);
		xstream.registerConverter(new IntEmptyTagConverter());
		xstream.registerConverter(new ISO8601DateConverter());
		xstream.registerConverter(new ISO8601GregorianCalendarConverter());
		return xstream;
	}
	
}
