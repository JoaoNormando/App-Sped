package br.com.srcomputador.nfe.servico.icms;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;

public interface ConversorIcms<T> {
	
	Icms converter(T classe);
	
}
