package br.com.srcomputador.nfe.rest;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.fileupload.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.cliente.service.ClienteService;
import br.com.srcomputador.entidade.Importacao;
import br.com.srcomputador.entidade.ModulosImportacao;
import br.com.srcomputador.exception.ConteudoVazioException;
import br.com.srcomputador.nfe.rest.dtorequest.RequestImportacao;
import br.com.srcomputador.nfe.servico.ImportacaoNFeService;
import br.com.srcomputador.persistencia.ImportacaoDao;
import net.lingala.zip4j.exception.ZipException;

@CrossOrigin
@RestController
@RequestMapping("importacao/nfe")
public class ImportacaoNFeRest {

	private ImportacaoNFeService importacaoService;
	private ClienteService clienteService;
	private ImportacaoDao importacaoDao;

	@Autowired
	public ImportacaoNFeRest(ImportacaoNFeService importacaoService, ClienteService clienteService, ImportacaoDao importacaoDao) {
		this.importacaoService = importacaoService;
		this.clienteService = clienteService;
		this.importacaoDao = importacaoDao;
	}

	@GetMapping
	public List<RequestImportacao> listarImportacoes() {
		List<Importacao> lista = this.importacaoService.listarImportacoes(ModulosImportacao.NFE);
		List<RequestImportacao> listaRequest = new ArrayList<>();
		for (Importacao i : lista) {
			RequestImportacao requestImportacao = new RequestImportacao();
			requestImportacao.setId(i.getId());
			requestImportacao.setDescricao(i.getDescricao());
			listaRequest.add(requestImportacao);
		}
		return listaRequest;
	}

	@CrossOrigin
	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<?> importar(@RequestParam("descricao") String descricao,
			@RequestParam("arquivo") MultipartFile[] multiPart, @RequestParam("cliente") Long idCliente, MultipartHttpServletRequest request) throws MaxUploadSizeExceededException, FileUploadException {
		
		if (multiPart.length == 0)
			return ResponseEntity.badRequest().body("Deve existir algum arquivo para importação");
		
		Cliente cliente = this.clienteService.recuperarPeloId(idCliente);

		if (cliente == null) {
			return ResponseEntity.badRequest().body("Cliente informado nao encontrado");
		}
		
		if(this.importacaoDao.verificarExistenciaDeDescricaoComCliente(descricao, cliente))
			return ResponseEntity.badRequest().body("Essa descrição já existe para este cliente");
		
		String path = request.getServletContext().getRealPath("/");
		try {
			this.importacaoService.salvarImportacao(descricao, multiPart, cliente, path);
		} catch (IllegalStateException | IllegalAccessException | InvocationTargetException | IOException
				| ZipException e) {
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		} catch (ConteudoVazioException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().body("Ocorreu um erro na importação: Formato de arquivo inválido.");

		}
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> deletarImportacao(@PathVariable("id") Long id) {
		try {
			importacaoService.remover(id);
		} catch (NullPointerException e) {
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().build();
	}
	
	@ExceptionHandler({MaxUploadSizeExceededException.class, FileUploadException.class})
	public ResponseEntity<?> handleMaxFileSizeException() {
		return ResponseEntity.badRequest().body("Tamanho da importação excede o limite máximo");
	}

}
