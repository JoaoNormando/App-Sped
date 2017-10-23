package br.com.srcomputador.mfd.servico;

import br.com.srcomputador.mfd.entidade.Registro;

public interface Leitor {

	Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException;
	
}
