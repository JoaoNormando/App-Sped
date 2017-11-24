package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.entidade.ModulosImportacao;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.persistencia.ImportacaoDao;
import br.com.srcomputador.nfe.rest.ConteudoVazioException;
import br.com.srcomputador.nfe.rest.dtorequest.RequestImportacao;

@Service
public class ImportacaoService {
	
	private ImportacaoDao dao;
	private LeitorNFeService leitorNFeService;
	
	@Autowired
	public ImportacaoService(ImportacaoDao dao, LeitorNFeService leitorNFeService) {
		this.dao = dao;
		this.leitorNFeService = leitorNFeService;
	}
	
	public List<Importacao> listarImportacoes(ModulosImportacao modulo) {
		return this.dao.listarImportacoesPorModulo(modulo);
	}
	
	public void salvar(String descricao, MultipartFile[] arquivos, ModulosImportacao modulo, Cliente cliente) throws IllegalStateException, IOException, IllegalAccessException, InvocationTargetException, ConteudoVazioException {
		File temp = new File("importacao");
		Importacao importacao = new Importacao();
		importacao.setDescricao(descricao);
		importacao.setListaNfe(new ArrayList<NotaFiscalEletronica>());
		importacao.setModulo(modulo);
		importacao.setCliente(cliente);
		for(MultipartFile f : arquivos) {
			f.transferTo(temp);
			NotaFiscalEletronica nfe = this.leitorNFeService.lerDadosNfe(temp);
			if(nfe.getInfNfe().getEmit().getCnpj().equals(cliente.getCnpj())) {
				nfe.setImportacao(importacao);
				importacao.getListaNfe().add(nfe);
			}
		}
		if(importacao.getListaNfe().isEmpty()) {
			throw new ConteudoVazioException("Arquivos importados sem conteudo válido");
		}
		dao.salvar(importacao);
	}
	
	public List<RequestImportacao> listarImportacoes() {
		 List<Importacao> lista = dao.listar();
		 
		 List<RequestImportacao> listaRequest = new ArrayList<>();
		 for(Importacao importacao : lista) {
			 RequestImportacao request = new RequestImportacao();
			 request.setId(importacao.getId());
			 request.setDescricao(importacao.getDescricao());
			 listaRequest.add(request);
		 }
		 return listaRequest;
	}
	
	public void remover(Long id) {
		dao.removerPeloId(id);
	}
	
}
