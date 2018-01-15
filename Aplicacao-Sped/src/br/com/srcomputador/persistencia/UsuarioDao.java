package br.com.srcomputador.persistencia;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.usuario.entidade.Usuario;

@Repository
public class UsuarioDao extends GenericDao<Usuario, Long>{

	public UsuarioDao() {
		super(Usuario.class);
	}
	
	public Usuario recuperarPeloUsuarioESenha(String usuario, String senha) throws NoResultException{
		TypedQuery<Usuario> query = this.em.createQuery("from Usuario u where u.nome = :usuario and u.senha = :senha", Usuario.class);
		query.setParameter("usuario", usuario);
		query.setParameter("senha", senha);
		Usuario usuarioEncontrado = query.getSingleResult();
		return usuarioEncontrado;
	}
	
	public Usuario recuperarPeloEmailESenha(String email, String senha) throws NoResultException{
		TypedQuery<Usuario> typedQuery = this.em.createQuery("from Usuario u where u.email = :email and u.senha = :senha", Usuario.class);
		typedQuery.setParameter("email", email);
		typedQuery.setParameter("senha", senha);
		return typedQuery.getSingleResult();
	}
	
}
