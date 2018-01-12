package br.com.srcomputador.nfe.persistencia;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
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
	
}
