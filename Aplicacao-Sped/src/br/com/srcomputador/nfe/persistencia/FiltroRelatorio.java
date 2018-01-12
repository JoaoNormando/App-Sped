package br.com.srcomputador.nfe.persistencia;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.entidade.Importacao;

public class FiltroRelatorio {

	private Cliente cliente;
	private Importacao importacao;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Importacao getImportacao() {
		return importacao;
	}

	public void setImportacao(Importacao importacao) {
		this.importacao = importacao;
	}

}
