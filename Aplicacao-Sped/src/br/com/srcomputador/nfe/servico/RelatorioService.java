package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.cliente.persistencia.ClienteDao;
import br.com.srcomputador.nfe.persistencia.Filtro;
import br.com.srcomputador.nfe.rest.dtorequest.FiltroRelatorioNFeRequest;
import br.com.srcomputador.nfe.servico.relatorio.RelatorioNFeExcelService;

@Service
public class RelatorioService {

	private ClienteDao clienteDao;
	private RelatorioNFeExcelService relatorioNFeExcelService;

	@Autowired
	public RelatorioService(ClienteDao clienteDao, RelatorioNFeExcelService relatorioNFeExcelService) {
		this.clienteDao = clienteDao;
		this.relatorioNFeExcelService = relatorioNFeExcelService;
	}

	public File gerarRelatorio(FiltroRelatorioNFeRequest filtroRequest) throws IOException {
		Filtro filtro = new Filtro();
		Cliente cliente = this.clienteDao.buscarPeloId(filtroRequest.getCliente());
		if (cliente == null) {
			// Lança uma exception
		}
		filtro.setCliente(cliente);
		filtro.setDescricao(filtroRequest.getDescricao());
		File relatorio = this.relatorioNFeExcelService.gerarRelatorio(filtro);
		return relatorio;
	}

	public void fecharArquivo() throws IOException {
		this.relatorioNFeExcelService.fecharArquivo();
	}
}
