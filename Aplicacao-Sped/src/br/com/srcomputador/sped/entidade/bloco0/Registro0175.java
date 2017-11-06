package br.com.srcomputador.sped.entidade.bloco0;

import java.util.Calendar;

import br.com.srcomputador.sped.entidade.Registro;

public class Registro0175 extends Registro{
	
	private Calendar dataAlteracaoCadastro;
	private String indentificadorCampoAlterado;
	private String conteudoCampoAnterior;
	
	public Calendar getDataAlteracaoCadastro() {
		return dataAlteracaoCadastro;
	}
	public void setDataAlteracaoCadastro(Calendar dataAlteracaoCadastro) {
		this.dataAlteracaoCadastro = dataAlteracaoCadastro;
	}
	public String getIndentificadorCampoAlterado() {
		return indentificadorCampoAlterado;
	}
	public void setIndentificadorCampoAlterado(String indentificadorCampoAlterado) {
		this.indentificadorCampoAlterado = indentificadorCampoAlterado;
	}
	public String getConteudoCampoAnterior() {
		return conteudoCampoAnterior;
	}
	public void setConteudoCampoAnterior(String conteudoCampoAnterior) {
		this.conteudoCampoAnterior = conteudoCampoAnterior;
	}

}
