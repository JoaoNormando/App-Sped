package br.com.srcomputador.persistencia;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.usuario.entidade.Usuario;

@Repository
public class UsuarioDao extends GenericDao<Usuario, Long>{

	public UsuarioDao() {
		super(Usuario.class);
	}
	
}
