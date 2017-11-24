package br.com.srcomputador.mfd.persistencia;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.mfd.entidade.DadosRelatorio;
import br.com.srcomputador.mfd.entidade.RegistroE14;
import br.com.srcomputador.persistencia.GenericDao;

@Repository
public class DadosRelatorioDao extends GenericDao<DadosRelatorio, Long>{

	public DadosRelatorioDao() {
		super(DadosRelatorio.class);
	}

	public List<String> listar(DadosRelatorio dados){
		CriteriaBuilder builder = this.em.getCriteriaBuilder();
		CriteriaQuery<String> query = builder.createQuery(String.class);
		Root<RegistroE14> from = query.from(RegistroE14.class);
		Path<String> tipo = from.get("tipoRegistro");
		query.select(tipo);
		TypedQuery<String> queryFinal = em.createQuery(query);
		return queryFinal.getResultList();
//		Predicate predicate = builder.and();
//		
//		if(dados.getTipoRegistro() != null) {
//			predicate = builder.and(predicate, builder.like(from.get("tipoRegistro"), dados.getTipoRegistro()));
//		}
		
//		return this.em.createQuery(query.multiselect(from).where(predicate)).getResultList();
	}
	
}
