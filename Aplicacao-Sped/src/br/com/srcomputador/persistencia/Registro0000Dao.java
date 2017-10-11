package br.com.srcomputador.persistencia;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.entidade.bloco0.Registro0000;

@Repository
public class Registro0000Dao extends GenericDao<Registro0000, Long>{

	public Registro0000Dao() {
		super(Registro0000.class);
	}
	
}
