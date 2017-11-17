package br.com.srcomputador.nfe.entidade;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
public class Destinatario {

	@Column(length = 14, name = "destinatario_cnpj")
	@XStreamAlias("CNPJ")
	private String cnpj; // CNPJ do destinatário
	@Column(length = 11, name = "destinatario_cpf")
	@XStreamAlias("CPF")
	private String cpf; // CPF do destinatário
	@Column(length = 20, name = "destinatario_ident_estrangeiro")
	@XStreamAlias("idEstrangeiro")
	private String idEstrangeiro; // Identificação do destinatário no caso de comprador estrangeiro
	@Column(length = 60, name = "destinatario_nome")
	@XStreamAlias("xNome")
	private String xNome; // Razão Social ou Nome do destinatário

	
	@AttributeOverrides({
		@AttributeOverride(name = "xLgr", column = @Column(name = "destinatario_logradouro")),
		@AttributeOverride(name = "nro", column = @Column(name = "destinatario_numero")),
		@AttributeOverride(name = "xCpl", column = @Column(name = "destinatario_complemento")),
		@AttributeOverride(name = "xBairro", column = @Column(name = "destinatario_bairro")),
		@AttributeOverride(name = "cMun", column = @Column(name = "destinatario_codigo_municipio")),
		@AttributeOverride(name = "xMun", column = @Column(name = "destinatario_nome_municipio")),
		@AttributeOverride(name = "uf", column = @Column(name = "destinatario_uf")),
		@AttributeOverride(name = "cep", column = @Column(name = "destinatario_cep")),
		@AttributeOverride(name = "cPais", column = @Column(name = "destinatario_codigo_pais")),
		@AttributeOverride(name = "xPais", column = @Column(name = "destinatario_nome_pais")),
		@AttributeOverride(name = "fone", column = @Column(name = "destinatario_fone"))
	})
	@Embedded
	@XStreamAlias("enderDest")
	private Endereco enderDest;

	@Column(name = "destinatario_indIe")
	@XStreamAlias("indIEDest")
	private int indIeDest; // Indicador da IE do Destinatário
	@Column(length = 14, name = "destinatario_ie")
	@XStreamAlias("IE")
	private String ie; // Inscrição Estadual do Destinatário
	@Column(length = 9, name = "destinatario_isuf")
	@XStreamAlias("ISUF")
	private int isuf; // Inscrição na SUFRAMA
	@Column(length = 15, name = "destinatario_im")
	@XStreamAlias("IM")
	private int im; // Inscrição Municipal do Tomador do Serviço
	@Column(length = 60, name = "destinatario_email")
	@XStreamAlias("email")
	private String email; // Email

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

	public String getIdEstrangeiro() {
		return idEstrangeiro;
	}

	public void setIdEstrangeiro(String idEstrangeiro) {
		this.idEstrangeiro = idEstrangeiro;
	}

	public String getxNome() {
		return xNome;
	}

	public void setxNome(String xNome) {
		this.xNome = xNome;
	}

	public Endereco getEnderDest() {
		return enderDest;
	}

	public void setEnderDest(Endereco enderDest) {
		this.enderDest = enderDest;
	}

	public int getIndIeDest() {
		return indIeDest;
	}

	public void setIndIeDest(int indIeDest) {
		this.indIeDest = indIeDest;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public int getIsuf() {
		return isuf;
	}

	public void setIsuf(int isuf) {
		this.isuf = isuf;
	}

	public int getIm() {
		return im;
	}

	public void setIm(int im) {
		this.im = im;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
