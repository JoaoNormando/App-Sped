package br.com.srcomputador.configuracao;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HSSFWorkbookConfig {

	@Bean
	public HSSFWorkbook workbook() {
		return new HSSFWorkbook();
	}
	
}
