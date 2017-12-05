package br.com.srcomputador.nfe.rest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.srcomputador.nfe.rest.dtorequest.FiltroRelatorioNFeRequest;
import br.com.srcomputador.nfe.servico.RelatorioService;

@RestController
@RequestMapping("relatorio/nfe")
public class RelatorioNFeRest {

	private RelatorioService relatorioService;

	@Autowired
	public RelatorioNFeRest(RelatorioService relatorioService) {
		this.relatorioService = relatorioService;
	}
	
	@PostMapping
	public HttpEntity<?> downloadExcel(@RequestBody FiltroRelatorioNFeRequest filtroRequest) {
		try {
			File relatorio = this.relatorioService.gerarRelatorio(filtroRequest);
			this.relatorioService.fecharArquivo();
			byte[] bytesRelatorio = Files.readAllBytes(Paths.get(relatorio.getPath()));
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Disposition", "attachment;filename=\"relatorio.xls\"");
			return new HttpEntity<byte[]>(bytesRelatorio, headers);
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().build();
		}
	}
	
}
