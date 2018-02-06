package br.com.srcomputador.nfe.persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.persistencia.GenericDao;

@Repository
public class DetalhamentoDao extends GenericDao<Detalhamento, Long>{

	public DetalhamentoDao() {
		super(Detalhamento.class);
	}
	
	public List<Detalhamento> recuperarTodosOsElementos() {
		TypedQuery<Detalhamento> typedQuery = this.em.createQuery("from Detalhamento as d join fetch d.nfe", Detalhamento.class);
		return typedQuery.getResultList();
	}
	
	public List<Detalhamento> recuperarTodosOsElementos(FiltroRelatorio filtro) {
		CriteriaBuilder builder = this.em.getCriteriaBuilder();
		CriteriaQuery<Detalhamento> query = builder.createQuery(Detalhamento.class);
		Root<Detalhamento> fromDetalhamento = query.from(Detalhamento.class);
		List<Predicate> predicados = new ArrayList<Predicate>();
		predicados.add(builder.equal(fromDetalhamento.get("nfe").get("importacao"), filtro.getImportacao()));
		predicados.add(builder.equal(fromDetalhamento.get("nfe").get("importacao").get("cliente"), filtro.getCliente()));
		
		if(filtro.getDataInicial() != null && filtro.getDataFinal() != null) {
			predicados.add(builder.between(fromDetalhamento.get("nfe").get("infNfe").get("ide").get("dhEmi"), filtro.getDataInicial(), filtro.getDataFinal()));			
		}
		query.select(fromDetalhamento).where(predicados.toArray(new Predicate[]{}));
		return this.em.createQuery(query).getResultList();
	}
	
}
