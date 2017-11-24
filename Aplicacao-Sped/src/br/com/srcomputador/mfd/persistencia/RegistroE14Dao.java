package br.com.srcomputador.mfd.persistencia;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import br.com.srcomputador.mfd.entidade.RegistroE14;
import br.com.srcomputador.persistencia.GenericDao;

public class RegistroE14Dao extends GenericDao<RegistroE14, Long>{

	public RegistroE14Dao() {
		super(RegistroE14.class);
	}

	
	public List listar(){
		CriteriaBuilder builder = this.em.getCriteriaBuilder();
		CriteriaQuery<RegistroE14> criteriaQuery = builder.createQuery(RegistroE14.class);
		criteriaQuery.from(RegistroE14.class);
		return null;
	}
	
}
