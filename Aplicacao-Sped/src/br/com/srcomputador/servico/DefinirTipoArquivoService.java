package br.com.srcomputador.servico;

import java.io.File;

import org.springframework.stereotype.Service;

@Service
public class DefinirTipoArquivoService {
	
	public TipoArquivo definirTipoArquivo(File file) {
		String nome = file.getName().toLowerCase();
		
		if(nome.endsWith(".zip")) {
			return TipoArquivo.ZIP;
		}
		
		if(nome.endsWith(".xml")) {
			return TipoArquivo.XML;
		}
		
		return null;
	}
	
}
