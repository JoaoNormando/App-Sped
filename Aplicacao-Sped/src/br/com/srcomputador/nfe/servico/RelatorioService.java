
package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.persistencia.FiltroRelatorio;
import br.com.srcomputador.nfe.servico.relatorio.RelatorioNFeExcelService;

@Service
public class RelatorioService {

	private RelatorioNFeExcelService relatorioNFeExcelService;
	
	@Autowired
	public RelatorioService(RelatorioNFeExcelService relatorioNFeExcelService) {
		this.relatorioNFeExcelService = relatorioNFeExcelService;
	}

	public File gerarRelatorio(FiltroRelatorio filtro) throws IOException {
		File relatorio = this.relatorioNFeExcelService.gerarRelatorio02(filtro);
		return relatorio;
	}

	public void fecharArquivo() throws IOException {
		this.relatorioNFeExcelService.fecharArquivo();
	}
}
