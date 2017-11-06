package br.com.srcomputador.mfd.servico;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.mfd.entidade.MFD;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MFD.class, LeitorMFD.class, LeitorRegistro.class})
public class LeitorMFDTeste {

	@Autowired
	private LeitorMFD leitorMFD;
	
	private MFD mfd;

	@Before
	public void startUp() {
		
		try {
			mfd = leitorMFD.lerMfd(new File("/home/joao/Área de Trabalho/MFD.TXT"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void deveriaLerUmArquivoEGerarUmRegistro() {
		Assert.assertTrue(mfd.getE01() != null);
		Assert.assertTrue(mfd.getE02() != null);
		Assert.assertTrue(mfd.getE14().size() > 0);
		Assert.assertTrue(mfd.getE15().size() > 0);
		Assert.assertTrue(mfd.getE16().size() > 0);
		Assert.assertTrue(mfd.getE17().size() > 0);
		Assert.assertTrue(mfd.getE18().size() > 0);
		Assert.assertTrue(mfd.getE19().size() > 0);
		Assert.assertTrue(mfd.getE20().size() > 0);
		Assert.assertTrue(mfd.getE21().size() > 0);
	}
}
