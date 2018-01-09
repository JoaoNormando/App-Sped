package br.com.srcomputador.persistencia;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.nfe.persistencia.Filtro;
import br.com.srcomputador.relatorio.nfe.RelatorioProduto;

@Repository
public class RelatorioProdutoDao extends GenericDao<RelatorioProduto, Long>{

	public RelatorioProdutoDao() {
		super(RelatorioProduto.class);
	}

	public List<RelatorioProduto> listar(Filtro filtro){
		String sqlQuery = "select new br.com.srcomputador.relatorio.nfe.RelatorioProduto(nfe.nNf, nfe.serie, nfe.mod, nfe.dEmi, nfe.dhEmi, nfe.dhSaiEnt, nfe.vNf )";
		this.em.createQuery("");
		return null;
	}
	
}
