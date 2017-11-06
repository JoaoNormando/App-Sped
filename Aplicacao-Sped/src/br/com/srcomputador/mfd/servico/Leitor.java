package br.com.srcomputador.mfd.servico;

import org.springframework.stereotype.Component;

import br.com.srcomputador.mfd.entidade.Registro;

@Component
public interface Leitor {

	Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException;
	
}
