package br.com.srcomputador.configuracao;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class XSSFWorkbookConfig {

	@Bean
	public XSSFWorkbook workbook() {
		return new XSSFWorkbook();
	}
	
}
