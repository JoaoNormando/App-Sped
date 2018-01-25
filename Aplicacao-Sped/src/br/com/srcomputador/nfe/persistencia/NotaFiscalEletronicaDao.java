package br.com.srcomputador.nfe.persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.persistencia.GenericDao;

@Repository
public class NotaFiscalEletronicaDao extends GenericDao<NotaFiscalEletronica, Long>{

	public NotaFiscalEletronicaDao() {
		super(NotaFiscalEletronica.class);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public void removerPelaDescricao(String descricao) {
		Query query = this.em.createQuery("from NotaFiscalEletronica nfe where nfe.descricaoImportacao = :desc");
		List<NotaFiscalEletronica> lista = query.setParameter("desc", descricao).getResultList();
		for(NotaFiscalEletronica n : lista) {
			this.remover(n);
		}
	}
	
	public List<NotaFiscalEletronica> recuperarTodosOsElementosComFiltragem(FiltroRelatorio filtro) {
		TypedQuery<NotaFiscalEletronica> typedQuery = this.em.createQuery("from NotaFiscalEletronica as nfe where nfe.importacao = :importacao and nfe.importacao.cliente = :cliente", NotaFiscalEletronica.class);
		typedQuery.setParameter("importacao", filtro.getImportacao());
		typedQuery.setParameter("cliente", filtro.getCliente());
		return typedQuery.getResultList();
	}
	
	public List<NotaFiscalEletronica> recuperarPeloFiltro(FiltroRelatorio filtro) {
		
		CriteriaBuilder builder = this.em.getCriteriaBuilder();
		CriteriaQuery<NotaFiscalEletronica> query = builder.createQuery(NotaFiscalEletronica.class);
		Root<NotaFiscalEletronica> fromNFe = query.from(NotaFiscalEletronica.class);
		List<Predicate> predicados = new ArrayList<Predicate>();
		
		predicados.add(builder.equal(fromNFe.get("importacao"), filtro.getImportacao()));
		predicados.add(builder.equal(fromNFe.get("importacao").get("cliente"), filtro.getCliente()));
		
		if(filtro.getDataInicial() != null && filtro.getDataFinal() != null) {
			predicados.add(builder.between(fromNFe.get("infNfe").get("ide").get("dhEmi"), filtro.getDataInicial(), filtro.getDataFinal()));			
		}
		
		query.select(fromNFe).where(predicados.toArray(new Predicate[]{}));
		return em.createQuery(query).getResultList();
		
	}
	
}
