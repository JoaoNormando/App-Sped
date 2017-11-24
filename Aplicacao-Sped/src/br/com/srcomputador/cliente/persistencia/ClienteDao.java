package br.com.srcomputador.cliente.persistencia;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.persistencia.GenericDao;

@Repository
public class ClienteDao extends GenericDao<Cliente, Long>{

	public ClienteDao() {
		super(Cliente.class);
	}

}
