package br.com.srcomputador.nfe.entidade.detalheProduto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Embeddable
public class Produto {

	@Column(length = 60, name = "produto_codigo_produto")
	@XStreamAlias("cProd")
	private String cProd; // Código do produto ou serviço
	@Column(name = "produto_cEAN")
	@XStreamAlias("cEAN")
	private int cEan; // GTIN do produto, antigo código EAN ou código de barras
	@Column(length = 120, name = "produto_descricao")
	@XStreamAlias("xProd")
	private String xProd; // Descrição do produto ou serviço
	@Column(name = "produto_ncm")
	@XStreamAlias("NCM")
	private int ncm; // Código NCM com 8 dígitos
	@Column(length = 6, name = "produto_nve")
	@XStreamAlias("NVE")
	private String nve; // Nomenclatura de Valor Aduaneiro e Estatística.
	@Column(name = "produto_exTipi")
	@XStreamAlias("EXTIPI")
	private int exTipi;
	@Column(name = "produto_cfop")
	@XStreamAlias("CFOP")
	private int cfop; // Código Fiscal de Operações e Prestações
	@Column(length = 6, name = "produto_unidade_comercial")
	@XStreamAlias("uCom")
	private String uCom; // Unidade Comercial
	@Column(name = "produto_quantidade_comercial")
	@XStreamAlias("qCom")
	private double qCom; // Quantidade Comercial
	@Column(name = "produto_vUni_comercializacao")
	@XStreamAlias("vUnCom")
	private double vUnCom; // Valor Unitário de Comercialização
	@Column(name = "produto_valor_produto")
	@XStreamAlias("vProd")
	private double vProd; // Valor Total Bruto dos Produtos ou Serviços
	@Column(name = "produto_cEan_tri")
	@XStreamAlias("cEANTrib")
	private int cEanTrib; // GTIN da unidade tributável, antigo código EAN ou código de barras
	@Column(name = "produto_unidade_tributavel")
	@XStreamAlias("uTrib")
	private String uTrib; // Unidade Tributável
	@Column(name = "produto_quantidade_trib")
	@XStreamAlias("qTrib")
	private double qTrib; // Quantidade Tributável
	@Column(name = "produto_valor_unitario_trib")
	@XStreamAlias("vUnTrib")
	private double vUnTrib; // Valor Unitário de tributação
	@Column(name = "produto_valor_frete")
	@XStreamAlias("vFrete")
	private double vFrete; // Valor Total do Frete
	@Column(name = "produto_valor_seguro")
	@XStreamAlias("vSeg")
	private double vSeguro; // Valor Total do Seguro
	@Column(name = "produto_valor_outro")
	@XStreamAlias("vOutro")
	private double vOutro; // Outras despesas acessórias
	@Column(name = "produto_ind_total")
	@XStreamAlias("indTot")
	private int indTot; // ndica se valor do Item (vProd) entra no valor total da NF-e (vProd)

	public String getcProd() {
		return cProd;
	}

	public void setcProd(String cProd) {
		this.cProd = cProd;
	}

	public int getcEan() {
		return cEan;
	}

	public void setcEan(int cEan) {
		this.cEan = cEan;
	}

	public String getxProd() {
		return xProd;
	}

	public void setxProd(String xProd) {
		this.xProd = xProd;
	}

	public int getNcm() {
		return ncm;
	}

	public void setNcm(int ncm) {
		this.ncm = ncm;
	}

	public String getNve() {
		return nve;
	}

	public void setNve(String nve) {
		this.nve = nve;
	}

	public int getExTipi() {
		return exTipi;
	}

	public void setExTipi(int exTipi) {
		this.exTipi = exTipi;
	}

	public int getCfop() {
		return cfop;
	}

	public void setCfop(int cfop) {
		this.cfop = cfop;
	}

	public String getuCom() {
		return uCom;
	}

	public void setuCom(String uCom) {
		this.uCom = uCom;
	}

	public double getqCom() {
		return qCom;
	}

	public void setqCom(double qCom) {
		this.qCom = qCom;
	}

	public double getvUnCom() {
		return vUnCom;
	}

	public void setvUnCom(double vUnCom) {
		this.vUnCom = vUnCom;
	}

	public double getvProd() {
		return vProd;
	}

	public void setvProd(double vProd) {
		this.vProd = vProd;
	}

	public int getcEanTrib() {
		return cEanTrib;
	}

	public void setcEanTrib(int cEanTrib) {
		this.cEanTrib = cEanTrib;
	}

	public String getuTrib() {
		return uTrib;
	}

	public void setuTrib(String uTrib) {
		this.uTrib = uTrib;
	}

	public double getqTrib() {
		return qTrib;
	}

	public void setqTrib(double qTrib) {
		this.qTrib = qTrib;
	}

	public double getvUnTrib() {
		return vUnTrib;
	}

	public void setvUnTrib(double vUnTrib) {
		this.vUnTrib = vUnTrib;
	}

	public double getvFrete() {
		return vFrete;
	}

	public void setvFrete(double vFrete) {
		this.vFrete = vFrete;
	}

	public double getvSeguro() {
		return vSeguro;
	}

	public void setvSeguro(double vSeguro) {
		this.vSeguro = vSeguro;
	}

	public double getvOutro() {
		return vOutro;
	}

	public void setvOutro(double vOutro) {
		this.vOutro = vOutro;
	}

	public int getIndTot() {
		return indTot;
	}

	public void setIndTot(int indTot) {
		this.indTot = indTot;
	}

}
