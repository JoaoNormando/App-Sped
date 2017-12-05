package br.com.srcomputador.importacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.importacao.dto.ConsultaImportacao;
import br.com.srcomputador.importacao.exception.ImportacaoInexistenteException;
import br.com.srcomputador.importacao.persistencia.ImportacaoDao;

@Service
public class ImportacaoService {

	private ImportacaoDao importacaoDao;

	@Autowired
	public ImportacaoService(ImportacaoDao importacaoDao) {
		this.importacaoDao = importacaoDao;	
	}
	
	public List<ConsultaImportacao> recuperarImportacoes(){
		return this.importacaoDao.recuperarImportacoes();
	}
	
	public void removerPeloId(Long id) {
		Importacao importacao = this.importacaoDao.buscarPeloId(id);
		
		if(importacao == null)
			throw new ImportacaoInexistenteException("Importacao nao encontrada!");
		
		this.importacaoDao.remover(importacao);
		
	}
	
}
