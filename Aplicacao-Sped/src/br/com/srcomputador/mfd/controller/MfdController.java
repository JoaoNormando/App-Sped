
package br.com.srcomputador.mfd.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.srcomputador.mfd.servico.ImportacaoMFDBanco;
import net.lingala.zip4j.exception.ZipException;

@RestController
@RequestMapping("mfd")
public class MfdController {
	
	@Autowired
	private ImportacaoMFDBanco importacao;
	
	@PostMapping("uploadFileZip")
	public ResponseEntity<String> uploadFileZip(@RequestParam("uploadedFile") MultipartFile file, HttpServletRequest request) {
		
		if(!file.isEmpty()) {
			String path = request.getServletContext().getRealPath("/");
			try {
				importacao.importarZip(file, path);
				return new ResponseEntity<String>("Upload realizado com sucesso!", HttpStatus.OK);
			} catch (IllegalStateException | IOException | ZipException e) {
				e.printStackTrace();
			}			
		}
		
		return new ResponseEntity<String>("Não foi possivel realizar o upload do arquivo, verifique a integridade!", HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("uploadFiles")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile [] files){
		
		if(files.length > 0) {
			try {
				importacao.importar(files);
				return new ResponseEntity<String>("Upload realizado com sucesso!", HttpStatus.OK);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		}
		
		return new ResponseEntity<String>("Não foi possivel realizar o upload do arquivo, verifique a integridade!", HttpStatus.BAD_REQUEST);
	}
}
