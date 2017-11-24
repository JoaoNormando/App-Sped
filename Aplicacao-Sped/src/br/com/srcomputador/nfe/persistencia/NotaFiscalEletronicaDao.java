package br.com.srcomputador.nfe.persistencia;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.persistencia.GenericDao;

@Repository
public class NotaFiscalEletronicaDao extends GenericDao<NotaFiscalEletronica, Long>{

	public NotaFiscalEletronicaDao() {
		super(NotaFiscalEletronica.class);
	}

	@Transactional
	public void removerPelaDescricao(String descricao) {
		System.out.println("Descricao: "+ descricao);
		Query query = this.em.createQuery("from NotaFiscalEletronica nfe where nfe.descricaoImportacao = :desc");
		List<NotaFiscalEletronica> lista = query.setParameter("desc", descricao).getResultList();
		System.out.println(lista.size());
		for(NotaFiscalEletronica n : lista) {
			this.remover(n);
		}
	}
	
}
