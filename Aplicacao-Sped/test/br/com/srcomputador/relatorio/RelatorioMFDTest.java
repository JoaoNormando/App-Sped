package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.srcomputador.configuracao.PersistenceConfig;
import br.com.srcomputador.mfd.persistencia.MfdDao;
import br.com.srcomputador.servico.ConversorDataService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class, MfdDao.class})
public class RelatorioMFDTest {
	
	private File relatorio;
	private RelatorioMFD02 relatorioMFD;
	
	@Autowired
	private MfdDao dao;
	
	@Before
	public void onInit() throws IOException {
		relatorioMFD = new RelatorioMFD02();
		relatorio = relatorioMFD.geraRelatorio(dao.recuperarRelatorioE14().get(2).getE14(), dao.recuperarRelatorioE15().get(2).getE15());
	}
	
	@Test
	public void deveriaGerarUmRelatorio() throws IOException {
		Assert.assertTrue(relatorio.exists());
	}
	
	@Test
	public void deveriaCriarUmaFolhaComRegistroE14() throws InvalidFormatException, IOException {
		XSSFWorkbook wb = new XSSFWorkbook(relatorio);
		XSSFSheet folhaE14 = wb.getSheet(new FolhaRelatorioMFDRegistroE14(new ConversorDataService()).NOME_FOLHA);
		wb.close();
		Assert.assertTrue(folhaE14 != null);
	}
	
	@Test
	public void deveriaCriarUmaFolhaComRegistroE15() throws InvalidFormatException, IOException {
		XSSFWorkbook wb = new XSSFWorkbook(relatorio);
		XSSFSheet folhaE15 = wb.getSheet(new FolhaRelatorioMFDRegistroE15(new ConversorDataService()).NOME_FOLHA);
		wb.close();
		Assert.assertTrue(folhaE15 != null);
	}
	
//	@After
	public void deletarRelatorio() {
		if(relatorio.exists())
			relatorio.delete();
	}
	
}
