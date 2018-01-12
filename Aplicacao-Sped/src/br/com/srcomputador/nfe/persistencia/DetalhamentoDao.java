package br.com.srcomputador.nfe.persistencia;

import java.util.List;

import javax.persistence.TypedQuery;

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
		TypedQuery<Detalhamento> typedQuery = this.em.createQuery("from Detalhamento as d join fetch d.nfe as nfe where nfe.importacao = :importacao and nfe.importacao.cliente = :cliente" , Detalhamento.class);
		typedQuery.setParameter("importacao", filtro.getImportacao());
		typedQuery.setParameter("cliente", filtro.getCliente());
		return typedQuery.getResultList();
	}
	
}
