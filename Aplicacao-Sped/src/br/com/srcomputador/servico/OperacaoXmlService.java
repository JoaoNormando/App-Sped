package br.com.srcomputador.servico;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtworks.xstream.XStream;

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
	
}
