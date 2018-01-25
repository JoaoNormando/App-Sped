package br.com.srcomputador.nfe.persistencia;

import java.util.Calendar;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.entidade.Importacao;

public class FiltroRelatorio {

	private Cliente cliente;
	private Importacao importacao;
	private Calendar dataInicial;
	private Calendar dataFinal;
	
	public FiltroRelatorio() {
	
	}
	
	public FiltroRelatorio(Cliente cliente, Importacao importacao, Calendar dataInicial, Calendar dataFinal) {
		super();
		this.cliente = cliente;
		this.importacao = importacao;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

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

	public Calendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Calendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}
	

}
