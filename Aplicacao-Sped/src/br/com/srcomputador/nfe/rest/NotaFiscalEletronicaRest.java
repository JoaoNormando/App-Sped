package br.com.srcomputador.nfe.rest;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.srcomputador.nfe.servico.NotaFiscalEletronicaService;
import net.lingala.zip4j.exception.ZipException;

@RestController
@RequestMapping("nfe")
public class NotaFiscalEletronicaRest {

	private NotaFiscalEletronicaService nfeService;

	@Autowired
	public NotaFiscalEletronicaRest(NotaFiscalEletronicaService nfeService) {
		this.nfeService = nfeService;
	}

	@PostMapping
	@CrossOrigin
	public ResponseEntity<?> uploadNFe(@RequestParam ("arquivo") MultipartFile[] multiFile,
			@RequestParam("descricao") String descricao) {
		try {
			nfeService.salvarNfe(multiFile, descricao);
		} catch (IllegalStateException | IllegalAccessException | InvocationTargetException | IOException e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@DeleteMapping("{id}")
	public ResponseEntity<?> deletarNfe(@PathVariable("id") Long id) {
		try {
			nfeService.removerNfe(id);
		} catch (NullPointerException e) {
			e.printStackTrace();
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().build();
	}

	@PostMapping(value = "zip")
	@CrossOrigin
	public ResponseEntity<?> uploadNfeZip(@RequestParam("arquivo") MultipartFile multiFile,
			@RequestParam("descricao") String descricao, HttpServletRequest request) {
		String path = request.getServletContext().getRealPath("/");
		try {
			nfeService.salvarNfe(multiFile, descricao, path);
		} catch (IllegalStateException | IOException | ZipException | IllegalAccessException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
