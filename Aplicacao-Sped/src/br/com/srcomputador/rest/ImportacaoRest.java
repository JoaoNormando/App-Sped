package br.com.srcomputador.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.importacao.dto.ConsultaImportacao;
import br.com.srcomputador.importacao.exception.ImportacaoInexistenteException;
import br.com.srcomputador.importacao.service.ImportacaoService;

@RestController
@RequestMapping("importacao")
public class ImportacaoRest {

	private ImportacaoService importacaoService;

	@Autowired
	public ImportacaoRest(ImportacaoService importacaoService) {
		this.importacaoService = importacaoService;
	}

	@CrossOrigin
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<ConsultaImportacao> listar() {
		return this.importacaoService.recuperarImportacoes();
	}
	
	
	@CrossOrigin
	@DeleteMapping("{id}")
	public ResponseEntity<?> removerImportacao(@PathVariable("id") Long id) {
		try {
			this.importacaoService.removerPeloId(id);
			return ResponseEntity.ok().build();
		} catch (ImportacaoInexistenteException e) {
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
	}

}
