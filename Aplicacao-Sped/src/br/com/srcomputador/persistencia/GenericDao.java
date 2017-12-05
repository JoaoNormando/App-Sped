package br.com.srcomputador.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

public abstract class GenericDao<T, ID> {

	@PersistenceContext
	protected EntityManager em;
	
	private final Class<T> classe;
	
	public GenericDao(Class<T> classe) {
		this.classe = classe;
	}
	
	@Transactional
	public T salvar(T entidade) {
		return em.merge(entidade);
	}
	
	@Transactional
	public void remover(T entidade) {
		T entidadeMergede = em.merge(entidade);
		em.remove(entidadeMergede);
	}
	
	@Transactional
	public void removerPeloId(ID id) {
		T usuario = this.buscarPeloId(id);
		
		if(usuario == null) {
			throw new NullPointerException("Entidade não encontrada");
		}		
		em.remove(usuario);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> listar(){
		return em.createQuery("from "+ classe.getName()).getResultList();
	}
	
	public T buscarPeloId(ID id) {
		return em.find(classe, id);
	}
	
}
