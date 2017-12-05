package br.com.srcomputador.nfe.entidade;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
@XStreamAlias("emit")
public class Emitente {

	@Column(length = 14, name = "emitente_cnpj")
	@XStreamAlias("CNPJ")
	private String cnpj; // CNPJ do emitente
	@Column(length = 11, name = "emitente_cpf")
	@XStreamAlias("CPF")
	private String cpf; // CPF do remetente
	@Column(length = 60, name = "emitente_nome")
	@XStreamAlias("xNome")
	private String xNome; // Razão Social ou Nome do emitente
	@Column(length = 60, name = "emitente_nome_fantasia")
	@XStreamAlias("xFant")
	private String xFant; // Nome fantasia

	@AttributeOverrides({ @AttributeOverride(name = "xLgr", column = @Column(name = "emitente_logradouro")),
			@AttributeOverride(name = "nro", column = @Column(name = "emitente_numero")),
			@AttributeOverride(name = "xCpl", column = @Column(name = "emitente_complemento")),
			@AttributeOverride(name = "xBairro", column = @Column(name = "emitente_bairro")),
			@AttributeOverride(name = "cMun", column = @Column(name = "emitente_codigo_municipio")),
			@AttributeOverride(name = "xMun", column = @Column(name = "emitente_nome_municipio")),
			@AttributeOverride(name = "uf", column = @Column(name = "emitente_uf")),
			@AttributeOverride(name = "cep", column = @Column(name = "emitente_cep")),
			@AttributeOverride(name = "cPais", column = @Column(name = "emitente_codigo_pais")),
			@AttributeOverride(name = "xPais", column = @Column(name = "emitente_nome_pais")),
			@AttributeOverride(name = "fone", column = @Column(name = "emitente_fone")) })
	@Embedded
	@XStreamAlias("enderEmit")
	private Endereco enderEmit;

	@Column(length = 14, name = "emitente_ie")
	@XStreamAlias("IE")
	private String ie; // Inscrição Estadual do Emitente
	@Column(length = 14, name = "emitente_iest")
	@XStreamAlias("IEST")
	private int iest; // IE do Substituto Tributário
	@Column(length = 15, name = "emitente_im")
	@XStreamAlias("IM")
	private String im; // Inscrição Municipal do Prestador de Serviço
	@Column(length = 7, name = "emitente_cnae")
	@XStreamAlias("CNAE")
	private int cnae; // CNAE fiscal
	@Column(length = 1, name = "emitente_crt")
	@XStreamAlias("CRT")
	private int crt; // Código de Regime Tributário

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public String getxFant() {
		return xFant;
	}

	public void setxFant(String xFant) {
		this.xFant = xFant;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public int getIest() {
		return iest;
	}

	public void setIest(int iest) {
		this.iest = iest;
	}

	public String getIm() {
		return im;
	}

	public void setIm(String im) {
		this.im = im;
	}

	public int getCnae() {
		return cnae;
	}

	public void setCnae(int cnae) {
		this.cnae = cnae;
	}

	public int getCrt() {
		return crt;
	}

	public void setCrt(int crt) {
		this.crt = crt;
	}

	public Endereco getEnderEmit() {
		return enderEmit;
	}

	public void setEnderEmit(Endereco enderEmit) {
		this.enderEmit = enderEmit;
	}

}
