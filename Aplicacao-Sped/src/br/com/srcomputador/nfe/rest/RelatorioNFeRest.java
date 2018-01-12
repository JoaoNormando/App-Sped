package br.com.srcomputador.nfe.rest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.cliente.persistencia.ClienteDao;
import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.importacao.persistencia.ImportacaoDao;
import br.com.srcomputador.nfe.persistencia.FiltroRelatorio;
import br.com.srcomputador.nfe.servico.RelatorioService;

@RestController
@RequestMapping("relatorio/nfe")
public class RelatorioNFeRest {

	private RelatorioService relatorioService;
	private ClienteDao clienteDao;
	private ImportacaoDao importacaoDao;
	
	
	@Autowired
	public RelatorioNFeRest(RelatorioService relatorioService, ClienteDao clienteDao, ImportacaoDao importacaoDao) {
		this.relatorioService = relatorioService;
		this.clienteDao = clienteDao;
		this.importacaoDao = importacaoDao;
	}
	
	@CrossOrigin
	@GetMapping("{idCliente}/{idImportacao}")
	public ResponseEntity<?> downloadRelatorio(@PathVariable("idCliente") Long idCliente, @PathVariable("idImportacao") Long idImportacao) {
		Cliente cliente = this.clienteDao.buscarPeloId(idCliente);
		Importacao importacao = this.importacaoDao.buscarPeloId(idImportacao);
		if(cliente == null || importacao == null) {
			return ResponseEntity.badRequest().build();
		}
//		FiltroRelatorioNFeRequest filtro = new FiltroRelatorioNFeRequest(idImportacao, idCliente);
		FiltroRelatorio filtroRelatorio = new FiltroRelatorio();
		filtroRelatorio.setCliente(cliente);
		filtroRelatorio.setImportacao(importacao);
		try {
//			File relatorio = this.relatorioService.gerarRelatorio(filtro);
			File relatorio = this.relatorioService.gerarRelatorio(filtroRelatorio);
			this.relatorioService.fecharArquivo();
			Path path = Paths.get(relatorio.getAbsolutePath());
			ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
			return ResponseEntity
					.ok()
					.header("Content-Disposition:","attachment; filename=\"Relatorio.xls\"")
					.contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
					.body(resource);
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().build();
		}
	}
	
}
