package br.com.srcomputador.configuracao;

import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SXSSFWorkbookConfig {

	@Bean
	public SXSSFWorkbook workbook() {
		return new SXSSFWorkbook();
	}
	
}
