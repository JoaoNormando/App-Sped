package br.com.srcomputador.persistencia;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.entidade.ModulosImportacao;
import br.com.srcomputador.importacao.dto.ConsultaImportacao;
import br.com.srcomputador.nfe.persistencia.Filtro;
import br.com.srcomputador.nfe.rest.dtorequest.ImportacaoClienteRequest;

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

	public List<Importacao> recuperarImportacoesPeloClienteEPeloModulo(Cliente cliente, ModulosImportacao modulo) {
		return this.em.createQuery("from Importacao as i where i.modulo = :modulo and i.cliente = :cliente", Importacao.class)
					.setParameter("modulo", modulo)
					.setParameter("cliente", cliente)
					.getResultList();
	}
	
	public Importacao listarImportacoesPeloFiltro(Filtro filtro){
		Query query = this.em.createQuery("from Importacao as i join fetch i.cliente as c where c = :cliente and i.descricao = :descricao");
		query.setParameter("cliente", filtro.getCliente());
		query.setParameter("descricao", filtro.getDescricao());
		Importacao importacao = (Importacao) query.getSingleResult();
		return importacao;
	}

	@SuppressWarnings("unchecked")
	public List<ImportacaoClienteRequest> listarImportacaoRequestPeloCliente(Cliente cliente){
		Query query = this.em.createQuery("select new br.com.srcomputador.nfe.rest.dtorequest.ImportacaoClienteRequest(i.id, i.descricao) from Importacao as i where i.cliente = :cliente");
		query.setParameter("cliente", cliente);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<ConsultaImportacao> recuperarImportacoes(){
		Query query = this.em.createQuery("select new br.com.srcomputador.importacao.dto.ConsultaImportacao(i.id, i.descricao, i.modulo, c.razaoSocial) from Importacao as i inner join i.cliente as c");
		return query.getResultList();
	}
	
	public boolean verificarExistenciaDeDescricaoComCliente(String descricao, Cliente cliente) {
		List<Importacao> lista = this.em.createQuery("from Importacao as i where i.descricao = :descricao and i.cliente = :cliente", Importacao.class)
			.setParameter("descricao", descricao)
			.setParameter("cliente", cliente)
			.getResultList();
		return !lista.isEmpty();
	}
	
}
