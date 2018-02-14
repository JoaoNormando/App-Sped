package br.com.srcomputador.persistencia;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.mfd.entidade.RegistroE14;

@Repository
public class RegistroE14Dao extends GenericDao<RegistroE14, Long>{

	public RegistroE14Dao() {
		super(RegistroE14.class);
	}

	public List<RegistroE14> recuperarRegistrosPaginados(int primResult, int maxResults) {
		return this.em.createQuery("from RegistroE14 as e14 join fetch e14.mfd", RegistroE14.class)
				.setFirstResult(primResult)
				.setMaxResults(maxResults)
				.getResultList();
	}
	
}
