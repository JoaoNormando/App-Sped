package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.servico.DefinirTipoArquivoService;
import br.com.srcomputador.servico.TipoArquivo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DefinirTipoArquivoService.class})
public class DefinirTipoArquivoServiceTeste {

	@Autowired
	private DefinirTipoArquivoService service;
	
	@Test
	public void deveriaDefinirOTipoDoArquivoComoZip() throws IOException {
		File f = new File("arquivo.zip");
		f.createNewFile();
		TipoArquivo tipoArquivo = this.service.definirTipoArquivo(f);
		Assert.assertEquals(TipoArquivo.ZIP, tipoArquivo);
		f.delete();
	}
	
	@Test
	public void deveriaDefinirOTipoDoArquivoComoXml() throws IOException {
		File f = new File("arquivo.xml");
		f.createNewFile();
		TipoArquivo tipoArquivo = this.service.definirTipoArquivo(f);
		Assert.assertEquals(TipoArquivo.XML, tipoArquivo);
		f.delete();
	}
	
	@Test
	public void deveriaRetornarNullQuandoNaoConhecerOTipoDoArquivo() throws IOException {
		File f = new File("arquivo.xls");
		f.createNewFile();
		TipoArquivo tipoArquivo = this.service.definirTipoArquivo(f);
		Assert.assertEquals(null, tipoArquivo);
		f.delete();
	}
	
}
