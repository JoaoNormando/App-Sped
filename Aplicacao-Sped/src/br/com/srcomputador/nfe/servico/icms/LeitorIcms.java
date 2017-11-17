package br.com.srcomputador.nfe.servico.icms;

import br.com.srcomputador.nfe.entidade.detalheProduto.dto.GenericIcms;

public interface LeitorIcms<T> {

	GenericIcms lerIcms(T classe);

}
