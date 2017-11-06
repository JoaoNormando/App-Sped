package br.com.srcomputador.mfd.servico;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.Registro;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {GeracaoDataHora.class, LeitorRegistro.class })
public class LeitorRegistroTeste {

	private final String valor = "E01BE091010100010043667 ECF-IF BEMATECH            MP-4000 TH FI       01.00.02  2011052411525300203459827000156TDM001365001390201501012015013102.01.02AC1704 01.00.00\n"
			+ "";

	@Autowired
	private LeitorRegistro leitor;

	@Test
	public void deveriaIdentificarUmRegistro() {
		Registros registro = leitor.identificarRegistro(valor);
		Assert.assertEquals(true, registro != null);
	}

	@Test
	public void deveriaGerarUmRegistroE17() {
		Registro registro = leitor.gerarRegistro(valor);
		Assert.assertEquals(true, registro != null);
	}

	@Test(expected = NullPointerException.class)
	public void deveriaDispararUmNullPointerException() {
		leitor.gerarRegistro(null);
	}

	@Test
	public void deveriaGerarUmRegistroE14() {
		Registros registro = leitor.identificarRegistro("E14");
		System.out.println(registro.getClass());
		Assert.assertEquals(0, registro.compareTo(Registros.REGISTRO_E14));
	}

//	@Test
//	public void deveriaCriarUmObjetoDoTipoE14() {
//
//		Registro registro = leitor.gerarRegistro(
//				"E14BE091010100010043667 MP-4000 TH FI       0104876205975120150102000000000027700000000000000V0000000000000V00000000002770N0000000000000                                         00000000000000\n"
//						+ "");
//		Assert.assertTrue(registro.getClass() == RegistroE14.class);
//	}

}
