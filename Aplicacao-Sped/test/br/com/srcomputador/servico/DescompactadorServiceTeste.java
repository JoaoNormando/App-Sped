package br.com.srcomputador.servico;

import java.io.File;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.lingala.zip4j.exception.ZipException;

public class DescompactadorServiceTeste {

	private OperacaoZipService descompactador;
	private OperacaoDiretorioService operacaoDiretorioService;
	@Before
	public void setUp() {
		descompactador = new OperacaoZipService();
		this.operacaoDiretorioService = new OperacaoDiretorioService();
	}

	@Test
	public void deveriaDescompactarAArvoreDeArquivosZipado() throws ZipException {
		File arquivo = new File("/home/joao/Área de Trabalho/UltraPesado.zip");
		File destino = new File("destino");
		long tamanhoInicial = destino.getTotalSpace();
		this.descompactador.descompactarArvoreDeDiretorio(arquivo, destino);
		long tamanhoFinal = destino.getTotalSpace();
		Assert.assertTrue(tamanhoFinal > tamanhoInicial);
		this.operacaoDiretorioService.apagarArquivos(destino);
	}
	

}
