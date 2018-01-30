package br.com.srcomputador.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.srcomputador.mfd.entidade.RelatorioMfdDTO;

@Repository
public class RelatorioMfdDTODao {

	@PersistenceContext
	private EntityManager em;

	public  List<RelatorioMfdDTO> recuperarTodos() {
		TypedQuery<RelatorioMfdDTO> typedQuery = this.em.createQuery(this.stringQuery(), RelatorioMfdDTO.class);
		
		return typedQuery.getResultList();
	}

	private String stringQuery() {
		StringBuilder builder = new StringBuilder();
		//Dados do registro E01
		builder.append("select new br.com.srcomputador.mfd.entidade.RelatorioMfdDTO(e01.tipoRegistro, e01.numeroFabricacao, e01.mfAdicional, e01.tipoEcf, e01.marca, e01.modelo, e01.numeroEcf, e01.cnpjUsuario, e01.crzInicial, e01.crzFinal, e01.dataInicial, e01.dataFinal,");
		// Dados do registro E02
		builder.append("e02.cnpj, e02.inscricaoEstadual, e02.nomeContribuinte,");
		// Dados do registro E14
		builder.append("e14.tipoRegistro, e14.dataInicioEmissao, e14.valorTotalDoDocumento, e14.valorDoDesconto, e14.valorAcrescimoPercAplicado, e14.valorTotalLiquido, e14.indicadorDeCancelamento, e14.valorCancelamento,");
		// Dados do registro E15
		builder.append("e15.tipoRegistro, e15.numeroDoItem, e15.codigoDoProduto, e15.descricaoProduto, e15.quantidadeComercializada, e15.unidadeMedida, e15.valorUnitario, e15.valorDesconto, e15.valorAcrescimo, e15.valorTotalLiquido, e15.codTotalizadorParcial, e15.quantidadeCancelada, e15.valorCancelado, e15.valorCanceladoAcrescimo) ");
		// Condicoes
		builder.append("FROM MFD AS mfd JOIN mfd.e01 AS e01 JOIN mfd.e02 AS e02 JOIN mfd.e14 AS e14 JOIN mfd.e15 AS e15");
		return builder.toString();
	}
	
}
