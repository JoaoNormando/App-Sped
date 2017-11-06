package br.com.srcomputador.mfd.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "MFD")
@Component
public class MFD {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@AttributeOverrides({ 
			@AttributeOverride(name = "tipoRegistro", column = @Column(name = "E01_tipo_registro")),
			@AttributeOverride(name = "numeroFabricacao", column = @Column(name = "E01_NUMERO_FABRICACAO")),
			@AttributeOverride(name = "mfAdicional", column = @Column(name = "E01_MF_ADICIONAL")),
			@AttributeOverride(name = "modelo", column = @Column(name = "E01_MODELO")),
			@AttributeOverride(name = "tipoEcf", column = @Column(name = "E01_tipo_ecf")),
			@AttributeOverride(name = "marca", column = @Column(name = "E01_marca")),
			@AttributeOverride(name = "versaoSb", column = @Column(name = "E01_versao_sb")),
			@AttributeOverride(name = "dataHoraGravacaoSb", column = @Column(name = "E01_data_hora_gravacao_sb")),
			@AttributeOverride(name = "numeroEcf", column = @Column(name = "E01_numero_ecf")),
			@AttributeOverride(name = "cnpjUsuario", column = @Column(name = "E01_cnpj_usuario")),
			@AttributeOverride(name = "comandoDeGeracao", column = @Column(name = "E01_comando_geracao")),
			@AttributeOverride(name = "crzInicial", column = @Column(name = "E01_crz_inicial")),
			@AttributeOverride(name = "crzFinal", column = @Column(name = "E01_crz_final")),
			@AttributeOverride(name = "dataInicial", column = @Column(name = "E01_data_inicial")),
			@AttributeOverride(name = "dataFinal", column = @Column(name = "E01_data_final")),
			@AttributeOverride(name = "versaoBiblioteca", column = @Column(name = "E01_versao_biblioteca")),
			@AttributeOverride(name = "versaoAtoCotepe", column = @Column(name = "E01_versao_ato_cotepe"))
	})
	@Embedded
	private RegistroE01 e01;

	@AttributeOverrides({
			@AttributeOverride(name = "tipoRegistro", column = @Column(name = "E02_TIPO_REGISTRO")),
			@AttributeOverride(name = "numeroFabricacao", column = @Column(name = "E02_NUMERO_FABRICACAO")),
			@AttributeOverride(name = "mfAdicional", column = @Column(name = "E02_MF_ADICIONAL")),
			@AttributeOverride(name = "modelo", column = @Column(name = "E02_MODELO")),
			@AttributeOverride(name = "cnpj", column = @Column(name = "E02_cnpj")),
			@AttributeOverride(name = "inscricaoEstadual", column = @Column(name = "E02_inscricao_estadual")),
			@AttributeOverride(name = "nomeContribuinte", column = @Column(name = "E02_nome_contribuinte")),
			@AttributeOverride(name = "endereco", column = @Column(name = "E02_endereco")),
			@AttributeOverride(name = "dataHoraCadastro", column = @Column(name = "E02_data_hora_cadastro")),
			@AttributeOverride(name = "valorCro", column = @Column(name = "E02_valor_cro")),
			@AttributeOverride(name = "valorGt", column = @Column(name = "E02_valor_gt")),
			@AttributeOverride(name = "numeroDoUsuario", column = @Column(name = "E02_numero_usuario"))
	})
	@Embedded
	private RegistroE02 e02;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "mfd", fetch = FetchType.LAZY)
	private List<RegistroE14> e14 = new ArrayList<RegistroE14>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "mfd", fetch = FetchType.LAZY)
	private List<RegistroE15> e15 = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "mfd", fetch = FetchType.LAZY)
	private List<RegistroE16> e16 = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "mfd", fetch = FetchType.LAZY)
	private List<RegistroE17> e17 = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "mfd", fetch = FetchType.LAZY)
	private List<RegistroE18> e18 = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "mfd", fetch = FetchType.LAZY)
	private List<RegistroE19> e19 = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "mfd", fetch = FetchType.LAZY)
	private List<RegistroE20> e20 = new ArrayList<>();
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "mfd", fetch = FetchType.LAZY)
	private List<RegistroE21> e21 = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RegistroE01 getE01() {
		return e01;
	}

	public void setE01(RegistroE01 e01) {
		this.e01 = e01;
	}

	public RegistroE02 getE02() {
		return e02;
	}

	public void setE02(RegistroE02 e02) {
		this.e02 = e02;
	}

	public List<RegistroE14> getE14() {
		return e14;
	}

	public void setE14(List<RegistroE14> e14) {
		this.e14 = e14;
	}

	public List<RegistroE15> getE15() {
		return e15;
	}

	public void setE15(List<RegistroE15> e15) {
		this.e15 = e15;
	}

	public List<RegistroE16> getE16() {
		return e16;
	}

	public void setE16(List<RegistroE16> e16) {
		this.e16 = e16;
	}

	public List<RegistroE17> getE17() {
		return e17;
	}

	public void setE17(List<RegistroE17> e17) {
		this.e17 = e17;
	}

	public List<RegistroE18> getE18() {
		return e18;
	}

	public void setE18(List<RegistroE18> e18) {
		this.e18 = e18;
	}

	public List<RegistroE19> getE19() {
		return e19;
	}

	public void setE19(List<RegistroE19> e19) {
		this.e19 = e19;
	}

	public List<RegistroE20> getE20() {
		return e20;
	}

	public void setE20(List<RegistroE20> e20) {
		this.e20 = e20;
	}

	public List<RegistroE21> getE21() {
		return e21;
	}

	public void setE21(List<RegistroE21> e21) {
		this.e21 = e21;
	}

}
