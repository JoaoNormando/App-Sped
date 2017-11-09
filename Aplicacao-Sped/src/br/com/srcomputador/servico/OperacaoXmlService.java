package br.com.srcomputador.servico;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thoughtworks.xstream.XStream;

@Service
public class OperacaoXmlService {

	@Autowired
	private XStream xStream;
	
	
	public Object consumirXml(File xml) {
		return this.xStream.fromXML(xml);
	}
	
	public Object consumirXml(String stringXml) {
		return this.xStream.fromXML(stringXml);
	}
	
}
