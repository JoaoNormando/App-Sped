package br.com.srcomputador.servico;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.basic.IntConverter;
import com.thoughtworks.xstream.converters.basic.LongConverter;

@Service
public class OperacaoXmlService {

	@Autowired
	private XStream xstream;
	
	
	public Object consumirXml(File xml) {
		return this.xstream.fromXML(xml);
	}
	
	public Object consumirXml(String stringXml) {
		return this.xstream.fromXML(stringXml);
	}

	@SuppressWarnings("rawtypes")
	public void informarObjeto(String nomeTag, Class classe) {
		this.xstream.alias(nomeTag, classe);
	}

	public void adicionarConversor(Converter converter) {
		this.xstream.registerConverter(converter);
	}

	public void adicionarConversor(IntConverter intConverter) {
		this.xstream.registerConverter(intConverter);
	}

	public void adicionarConversor(LongConverter longConverter) {
		this.xstream.registerConverter(longConverter);
	}
	
}
