package br.com.srcomputador.nfe.entidade.detalheProduto.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PIS")
public class PisDto {

	@XStreamAlias("PISAliq")
	private PisAliquotaDto pisAliq;
	@XStreamAlias("PISQtde")
	private PisQtdeDto pisQtde;
	@XStreamAlias("PISNT")
	private PisNtDto pisNt;
	@XStreamAlias("PISOutr")
	private PisOutrDto pisOutr;
	@XStreamAlias("PISST")
	private PisStDto pisSt;
	
	public PisAliquotaDto getPisAliq() {
		return pisAliq;
	}

	public void setPisAliq(PisAliquotaDto pisAliq) {
		this.pisAliq = pisAliq;
	}

	public PisQtdeDto getPisQtde() {
		return pisQtde;
	}

	public void setPisQtde(PisQtdeDto pisQtde) {
		this.pisQtde = pisQtde;
	}

	public PisNtDto getPisNt() {
		return pisNt;
	}

	public void setPisNt(PisNtDto pisNt) {
		this.pisNt = pisNt;
	}

	public PisOutrDto getPisOutr() {
		return pisOutr;
	}

	public void setPisOutr(PisOutrDto pisOutr) {
		this.pisOutr = pisOutr;
	}

	public PisStDto getPisSt() {
		return pisSt;
	}

	public void setPisSt(PisStDto pisSt) {
		this.pisSt = pisSt;
	}

}
