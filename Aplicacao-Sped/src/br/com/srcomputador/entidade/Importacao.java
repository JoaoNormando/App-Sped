package br.com.srcomputador.entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.mfd.entidade.MFD;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;

@Entity
@Table(name = "importacao", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"cliente_id", "descricao"})
		})
public class Importacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 100)
	private String descricao;

	@OneToMany(mappedBy = "importacao", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@Fetch(FetchMode.SUBSELECT)
	private List<NotaFiscalEletronica> listaNfe;

	@OneToMany(mappedBy = "importacao", cascade = CascadeType.ALL)
	private List<MFD> listaMFD;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Cliente cliente;

	@Enumerated(EnumType.ORDINAL)
	private ModulosImportacao modulo;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<NotaFiscalEletronica> getListaNfe() {
		return listaNfe;
	}

	public void setListaNfe(List<NotaFiscalEletronica> listaNfe) {
		this.listaNfe = listaNfe;
	}

	public Long getId() {
		return id;
	}

	public List<MFD> getListaMFD() {
		return listaMFD;
	}

	public void setListaMFD(List<MFD> listaMFD) {
		this.listaMFD = listaMFD;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ModulosImportacao getModulo() {
		return modulo;
	}

	public void setModulo(ModulosImportacao modulo) {
		this.modulo = modulo;
	}

}
