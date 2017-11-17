package br.com.srcomputador.nfe.entidade;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
public class Endereco {

	@Column(length = 60)
	@XStreamAlias("xLgr")
	private String xLgr; // Logradouro
	@Column(length = 60)
	@XStreamAlias("nro")
	private String nro; // Número
	@Column(length = 60)
	@XStreamAlias("xCpl")
	private String xCpl; // Complemento
	@Column(length = 60)
	@XStreamAlias("xBairro")
	private String xBairro; // Bairro
	@Column(length = 7)
	@XStreamAlias("cMun")
	private int cMun; // Código do município
	@Column(length = 60)
	@XStreamAlias("xMun")
	private String xMun; // Nome do município
	@Column(length = 2)
	@XStreamAlias("UF")
	private String uf; // Sigla da UF
	@Column(length = 8)
	@XStreamAlias("CEP")
	private int cep; // Código do CEP
	@Column(length = 4)
	@XStreamAlias("cPais")
	private int cPais; // Código do País
	@Column(length = 60)
	@XStreamAlias("xPais")
	private String xPais; // Nome do País
	@Column(length = 14)
	@XStreamAlias("fone")
	private String fone; // Telefone

	public String getxLgr() {
		return xLgr;
	}

	public void setxLgr(String xLgr) {
		this.xLgr = xLgr;
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public String getxCpl() {
		return xCpl;
	}

	public void setxCpl(String xCpl) {
		this.xCpl = xCpl;
	}

	public String getxBairro() {
		return xBairro;
	}

	public void setxBairro(String xBairro) {
		this.xBairro = xBairro;
	}

	public int getcMun() {
		return cMun;
	}

	public void setcMun(int cMun) {
		this.cMun = cMun;
	}

	public String getxMun() {
		return xMun;
	}

	public void setxMun(String xMun) {
		this.xMun = xMun;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getcPais() {
		return cPais;
	}

	public void setcPais(int cPais) {
		this.cPais = cPais;
	}

	public String getxPais() {
		return xPais;
	}

	public void setxPais(String xPais) {
		this.xPais = xPais;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

}
