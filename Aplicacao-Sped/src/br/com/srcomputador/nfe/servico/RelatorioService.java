
package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.cliente.persistencia.ClienteDao;
import br.com.srcomputador.importacao.persistencia.ImportacaoDao;
import br.com.srcomputador.nfe.persistencia.Filtro;
import br.com.srcomputador.nfe.rest.dtorequest.FiltroRelatorioNFeRequest;
import br.com.srcomputador.nfe.servico.relatorio.RelatorioNFeExcelService;

@Service
public class RelatorioService {

	private ClienteDao clienteDao;
	private RelatorioNFeExcelService relatorioNFeExcelService;
	private ImportacaoDao importacaoDao;

	@Autowired
	public RelatorioService(ClienteDao clienteDao, RelatorioNFeExcelService relatorioNFeExcelService, ImportacaoDao importacaoDao) {
		this.clienteDao = clienteDao;
		this.relatorioNFeExcelService = relatorioNFeExcelService;
		this.importacaoDao = importacaoDao;
	}

	public File gerarRelatorio(FiltroRelatorioNFeRequest filtro) throws IOException {
		String descricao = this.importacaoDao.buscarPeloId(filtro.getIdImportacao()).getDescricao();
		Cliente cliente = this.clienteDao.buscarPeloId(filtro.getIdCliente());
		File relatorio = this.relatorioNFeExcelService.gerarRelatorio(new Filtro(cliente, descricao));
		return relatorio;
	}

	public void fecharArquivo() throws IOException {
		this.relatorioNFeExcelService.fecharArquivo();
	}
}
