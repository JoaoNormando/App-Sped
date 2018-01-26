package br.com.srcomputador.mfd.rest;

import java.io.IOException;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.cliente.persistencia.ClienteDao;
import br.com.srcomputador.exception.ConteudoVazioException;
import br.com.srcomputador.mfd.servico.ImportacaoMFDService;
import net.lingala.zip4j.exception.ZipException;

@RestController
@RequestMapping("importacao/mfd")
public class ImportacaoMFDRest {

	private ClienteDao clienteDao;
	private ImportacaoMFDService importacaoService;

	@Autowired
	public ImportacaoMFDRest(ClienteDao clienteDao, ImportacaoMFDService importacaoService) {
		this.clienteDao = clienteDao;
		this.importacaoService = importacaoService;
	}
	
	@CrossOrigin
	@PostMapping
	@ResponseStatus(code = HttpStatus.OK)
	public void importar(@RequestParam("arquivo") MultipartFile[] arquivos, @RequestParam("descricao") String descricao,
			@RequestParam("cliente") Long cliente, MultipartHttpServletRequest request) throws IllegalStateException, IOException, ZipException {

		if(arquivos.length == 0) throw new ConteudoVazioException("Nenhum arquivo valido informado");
		
		Cliente clienteRecuperado = this.clienteDao.buscarPeloId(cliente);
		if(clienteRecuperado == null) throw new EntityNotFoundException();
		
		String path = request.getServletContext().getRealPath("/");
		this.importacaoService.importar(descricao, clienteRecuperado, arquivos, path);
	}
	
	@ExceptionHandler(value = { ConteudoVazioException.class})
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public String handleConteudoVazioException() {
		return "Nenhum arquivo valido informado";
	}

	@ExceptionHandler(value = { EntityNotFoundException.class })
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ResponseBody
	public String handleEntityNotFoundException() {
		return "Cliente inexistente";
	}
	
	@ExceptionHandler(value = {IllegalStateException.class, IOException.class, ZipException.class })
	@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE)
	public void handleImportacaoErro() {}
}
