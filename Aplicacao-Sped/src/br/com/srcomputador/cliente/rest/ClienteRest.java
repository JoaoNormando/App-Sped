package br.com.srcomputador.cliente.rest;

import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.cliente.service.ClienteService;
import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.entidade.ModulosImportacao;
import br.com.srcomputador.nfe.rest.MensagemErro;
import br.com.srcomputador.nfe.rest.dtorequest.ImportacaoClienteRequest;
import br.com.srcomputador.persistencia.ImportacaoDao;

@CrossOrigin
@RestController
@RequestMapping("cliente")
public class ClienteRest {

	private ClienteService clienteService;
	private ImportacaoDao importacaoDao;
	
	@Autowired
	public ClienteRest(ClienteService clienteService, ImportacaoDao importacaoDao) {
		this.clienteService = clienteService;
		this.importacaoDao = importacaoDao;
	}
	@CrossOrigin
	@GetMapping
	public List<GetClienteRestDto> getClientes() throws IllegalAccessException, InvocationTargetException {
		return this.clienteService.listarPeloRequest();
	}

	@GetMapping("{id}/importacoes")
	public ResponseEntity<?> recuperarImportacoesPeloCliente(@PathVariable("id") Long id) {
		Cliente cliente = this.clienteService.recuperarPeloId(id);
		List<ImportacaoClienteRequest> lista = this.clienteService.listarImportacoesDoCliente(cliente);
		return ResponseEntity.ok(lista);
	}

	@GetMapping("{id}/importacao/mfd")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Importacao> recuperarImportacoesMFD(@PathVariable("id") Long id) {
		Cliente cliente = this.clienteService.recuperarPeloId(id);
		List<Importacao> importacao = this.importacaoDao.recuperarImportacoesPeloClienteEPeloModulo(cliente, ModulosImportacao.MFD);
		importacao.iterator().forEachRemaining(i -> {
			i.setCliente(null);
			i.setListaMFD(null);
			i.setListaNfe(null);
		});
		return importacao;
	}
	
	@GetMapping("{id}")
	public ResponseEntity<?> getClienteById(@PathVariable("id") Long id)
			throws IllegalAccessException, InvocationTargetException {
		GetClienteRestDto cliente = this.clienteService.recuperarClienteRestPeloId(id);
		if (cliente == null) {
			return new ResponseEntity<>(new MensagemErro("Cliente n�o encontrado"), HttpStatus.NOT_FOUND);
		}
		return ResponseEntity.ok(cliente);
	}
	
	@CrossOrigin
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public ResponseEntity<?> criarCliente(@RequestBody @Validated PostClienteRestDto post) {
		try {
			Cliente cliente = this.clienteService.salvar(post);
			return ResponseEntity.created(URI.create("cliente/" + cliente.getId())).build();
		} catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException e) {
			e.printStackTrace(); 
			return ResponseEntity.badRequest().build();
		}
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> deletarCliente(@PathVariable("id") Long id) {
		Cliente cliente = this.clienteService.recuperarPeloId(id);

		if (cliente == null) {
			return new ResponseEntity<>(new MensagemErro("Cliente n�o encontrado"), HttpStatus.NOT_FOUND);
		}

		if(!cliente.getImportacoes().isEmpty()) {
			return new ResponseEntity<>(new MensagemErro("O cliente n�o pode ser removido devido a suas dependencias"), HttpStatus.CONFLICT);
		}
		this.clienteService.excluirPeloId(id);

		return ResponseEntity.noContent().build();
	}

	@PutMapping("{id}")
	public ResponseEntity<?> atualizarCliente(@PathVariable("id") Long id, @RequestBody AtualizacaoRestDto put) {
		Cliente cliente = this.clienteService.recuperarPeloId(id);

		if (cliente == null) {
			return new ResponseEntity<>(new MensagemErro("Cliente não encontrado"), HttpStatus.NOT_FOUND);
		}
		this.clienteService.atualizarCliente(id, put);
		return ResponseEntity.noContent().build();
	}

}
