package br.com.srcomputador.nfe.persistencia;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.entidade.ModulosImportacao;
import br.com.srcomputador.persistencia.GenericDao;

@Repository
public class ImportacaoDao extends GenericDao<Importacao, Long>{

	public ImportacaoDao() {
		super(Importacao.class);
	}

	@SuppressWarnings("unchecked")
	public List<Importacao> listarImportacoesPorModulo(ModulosImportacao modulo) {
		Query query = this.em.createQuery("from Importacao as i where i.modulo = :modulo");
		query.setParameter("modulo", modulo);
		return query.getResultList();
	}
	
}
