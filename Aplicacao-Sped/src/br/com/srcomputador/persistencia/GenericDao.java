package br.com.srcomputador.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public abstract class GenericDao<T, ID> {

	@PersistenceContext
	private EntityManager em;
	
	private final Class<T> classe;
	
	public GenericDao(Class<T> classe) {
		this.classe = classe;
	}
	
	@Transactional
	public void salvar(T entidade) {
		em.merge(entidade);
	}
	
	@Transactional
	public void remover(T entidade) {
		em.remove(entidade);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listar(){
		return em.createQuery("from "+ classe.getName()).getResultList();
	}
	
	public T buscarPeloId(ID id) {
		return em.find(classe, id);
	}
	
}
