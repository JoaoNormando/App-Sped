package br.com.srcomputador.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.cliente.persistencia.ClienteDao;
import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.mfd.entidade.RelatorioMfdDTO;
import br.com.srcomputador.nfe.persistencia.FiltroRelatorio;
import br.com.srcomputador.persistencia.ImportacaoDao;
import br.com.srcomputador.persistencia.RelatorioMfdDTODao;
import br.com.srcomputador.relatorio.RelatorioMFD;

@RestController
@RequestMapping("relatorio/mfd")
public class RelatorioMFDRest {

	private RelatorioMFD relatorioMFD;
	private RelatorioMfdDTODao dao;
	private ClienteDao clienteDao;
	private ImportacaoDao importacaoDao;
	
	@Autowired
	public RelatorioMFDRest(RelatorioMFD relatorioMFD, RelatorioMfdDTODao dao, ClienteDao clienteDao, ImportacaoDao importacaoDao) {
		this.relatorioMFD = relatorioMFD;
		this.dao = dao;
		this.clienteDao = clienteDao;
		this.importacaoDao = importacaoDao;
	}
	@GetMapping("{idCliente}/{idImportacao}")
	@ResponseStatus(code = HttpStatus.OK)
	public void downloadRelatorio(@PathVariable("idCliente") Long idCliente, @PathVariable("idImportacao") Long idImportacao) {
		Cliente cliente = this.clienteDao.buscarPeloId(idCliente);
		Importacao importacao = this.importacaoDao.buscarPeloId(idImportacao);
		
		FiltroRelatorio filtroRelatorio = new FiltroRelatorio();
		filtroRelatorio.setCliente(cliente);
		filtroRelatorio.setImportacao(importacao);
		
		 List<RelatorioMfdDTO> listaMfd = this.dao.recuperarTodosPeloFiltro(filtroRelatorio);
		
	}
	
}
