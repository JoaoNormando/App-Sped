package br.com.srcomputador.configuracao;

import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.extended.ISO8601DateConverter;
import com.thoughtworks.xstream.converters.extended.ISO8601GregorianCalendarConverter;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import com.thoughtworks.xstream.security.NoTypePermission;
import com.thoughtworks.xstream.security.NullPermission;
import com.thoughtworks.xstream.security.PrimitiveTypePermission;

@Component
public class XStreamConfig {

	@Bean
	public XStream xStream() {
		XStream xstream = new XStream(new Dom4JDriver());
		xstream.autodetectAnnotations(true);
		xstream.registerConverter(new IntEmptyTagConverter());
		xstream.registerConverter(new ISO8601DateConverter());
		xstream.registerConverter(new ISO8601GregorianCalendarConverter());

		// clear out existing permissions and set own ones
		xstream.addPermission(NoTypePermission.NONE);
		// allow some basics
		xstream.addPermission(NullPermission.NULL);
		xstream.addPermission(PrimitiveTypePermission.PRIMITIVES);
		xstream.allowTypeHierarchy(Collection.class);
		
		// allow any type from the same package
		xstream.allowTypesByWildcard(new String[] {
		    "br.com.srcomputador.nfe.entidade.NotaFiscalEletronica"
		});
		
		return xstream;
	}
	
}
