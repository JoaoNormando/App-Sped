package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("COFINS")
public class CofinsDto {

	@XStreamAlias("COFINSAliq")
	private CofinsAliqDto cofinsAliq; // Grupo COFINS tributado pela alíquota
	@XStreamAlias("COFINSNT")
	private CofinsNtDto cofinsNt; // Grupo COFINS não tributado
	@XStreamAlias("COFINSOutr")
	private CofinsOutrDto cofinsOutr; // Grupo COFINS Outras Operações
	@XStreamAlias("COFINSQtde")
	private CofinsQtdeDto cofinsQtde; // Grupo de COFINS tributado por Qtde
	@XStreamAlias("COFINSST")
	private CofinsStDto cofinsSt; // Grupo COFINS Substituição Tributária

	public CofinsAliqDto getCofinsAliq() {
		return cofinsAliq;
	}

	public void setCofinsAliq(CofinsAliqDto cofinsAliq) {
		this.cofinsAliq = cofinsAliq;
	}

	public CofinsNtDto getCofinsNt() {
		return cofinsNt;
	}

	public void setCofinsNt(CofinsNtDto cofinsNt) {
		this.cofinsNt = cofinsNt;
	}

	public CofinsOutrDto getCofinsOutr() {
		return cofinsOutr;
	}

	public void setCofinsOutr(CofinsOutrDto cofinsOutr) {
		this.cofinsOutr = cofinsOutr;
	}

	public CofinsQtdeDto getCofinsQtde() {
		return cofinsQtde;
	}

	public void setCofinsQtde(CofinsQtdeDto cofinsQtde) {
		this.cofinsQtde = cofinsQtde;
	}

	public CofinsStDto getCofinsSt() {
		return cofinsSt;
	}

	public void setCofinsSt(CofinsStDto cofinsSt) {
		this.cofinsSt = cofinsSt;
	}

}
