package br.com.srcomputador.mfd.servico;

import org.junit.Test;

import br.com.srcomputador.mfd.entidade.Registro;

import org.junit.Assert;

public class LeitorRegistroTeste {
	
	private final String valor = "E01BE091010100010043667 ECF-IF BEMATECH            MP-4000 TH FI       01.00.02  2011052411525300203459827000156TDM001365001390201501012015013102.01.02AC1704 01.00.00\n" + 
			"";
	
	@Test
	public void deveriaIdentificarUmRegistro() {
		
		LeitorRegistro leitor = new LeitorRegistro();
		Registros registro = leitor.identificarRegistro(valor);
		
		Assert.assertEquals(true, registro != null);
	}
	
	@Test
	public void deveriaGerarUmRegistro() {
		LeitorRegistro leitor = new LeitorRegistro();
		Registro registro = leitor.gerarRegistro(valor);
		
		Assert.assertEquals(true, registro != null);
	}

	@Test(expected = NullPointerException.class)
	public void deveriaDispararUmNullPointerException() {
		LeitorRegistro leitor = new LeitorRegistro();
		leitor.gerarRegistro(null);
	}
	
}
