package br.com.srcomputador.mfd.entidade;

import java.util.Calendar;

public class RelatorioMfdDTO {

	// Dados do relatorio do registro E01
	private String tipoRegistroE01;
	private String numeroFabricacaoE01;
	private char mfAdicionalE01;
	private String tipoEcfE01;
	private String marcaE01;
	private String modeloE01;
	private int numeroEcfE01;
	private String cnpjUsuarioE01;
	private int crzInicialE01;
	private int crzFinalE01;
	private Calendar dataInicialE01;
	private Calendar dataFinalE01;
	// FIM Dados do relatorio do registro E01

	// Dados do relatorio do registro E02
	private String cnpjE02;
	private String inscricaoEstadualE02;
	private String nomeContribuinteE02;
	// FIM Dados do relatorio do registro E02

	// Dados do relatorio do registro E14
	private String tipoRegistroE14;
	private Calendar dataInicioEmissaoE14;
	private double valorTotalDoDocumentoE14;
	private double valorDoDescontoE14;
	private double valorAcrescimoPercAplicadoE14;
	private double valorTotalLiquidoE14;
	private char indicadorDeCancelamentoE14;
	private double valorCancelamentoE14;
	// FIM Dados do relatorio do registro E14

	// Dados do relatorio do registro E15
	private String tipoRegistroE15;
	private int numeroDoItemE15;
	private String codigoDoProdutoE15;
	private String descricaoProdutoE15;
	private int quantidadeComercializadaE15;
	private String unidadeMedidaE15;
	private int valorUnitarioE15;
	private double valorDescontoE15;
	private double valorAcrescimoE15;
	private double valorTotalLiquidoE15;
	private String codTotalizadorParcialE15;
	private int quantidadeCanceladaE15;
	private double valorCanceladoE15;
	private double valorCanceladoAcrescimoE15;
	// FIM Dados do relatorio do registro E15
	
	
	

	public RelatorioMfdDTO(
			
			String tipoRegistroE01, String numeroFabricacaoE01, char mfAdicionalE01, String tipoEcfE01,
			String marcaE01, String modeloE01, int numeroEcfE01, String cnpjUsuarioE01, int crzInicialE01,
			int crzFinalE01, Calendar dataInicialE01, Calendar dataFinalE01, 
			
			String cnpjE02, String inscricaoEstadualE02, String nomeContribuinteE02,
			
			String tipoRegistroE14,	Calendar dataInicioEmissaoE14, double valorTotalDoDocumentoE14, 
			double valorDoDescontoE14, double valorAcrescimoPercAplicadoE14, double valorTotalLiquidoE14,
			char indicadorDeCancelamentoE14, double valorCancelamentoE14,
			
			String tipoRegistroE15, int numeroDoItemE15, String codigoDoProdutoE15,
			String descricaoProdutoE15, int quantidadeComercializadaE15, String unidadeMedidaE15, int valorUnitarioE15,
			double valorDescontoE15, double valorAcrescimoE15, double valorTotalLiquidoE15,
			String codTotalizadorParcialE15, int quantidadeCanceladaE15, double valorCanceladoE15,
			double valorCanceladoAcrescimoE15
			)
	{
		super();
		this.tipoRegistroE01 = tipoRegistroE01;
		this.numeroFabricacaoE01 = numeroFabricacaoE01;
		this.mfAdicionalE01 = mfAdicionalE01;
		this.tipoEcfE01 = tipoEcfE01;
		this.marcaE01 = marcaE01;
		this.modeloE01 = modeloE01;
		this.numeroEcfE01 = numeroEcfE01;
		this.cnpjUsuarioE01 = cnpjUsuarioE01;
		this.crzInicialE01 = crzInicialE01;
		this.crzFinalE01 = crzFinalE01;
		this.dataInicialE01 = dataInicialE01;
		this.dataFinalE01 = dataFinalE01;
		this.cnpjE02 = cnpjE02;
		this.inscricaoEstadualE02 = inscricaoEstadualE02;
		this.nomeContribuinteE02 = nomeContribuinteE02;
		this.tipoRegistroE14 = tipoRegistroE14;
		this.dataInicioEmissaoE14 = dataInicioEmissaoE14;
		this.valorTotalDoDocumentoE14 = valorTotalDoDocumentoE14;
		this.valorDoDescontoE14 = valorDoDescontoE14;
		this.valorAcrescimoPercAplicadoE14 = valorAcrescimoPercAplicadoE14;
		this.valorTotalLiquidoE14 = valorTotalLiquidoE14;
		this.indicadorDeCancelamentoE14 = indicadorDeCancelamentoE14;
		this.valorCancelamentoE14 = valorCancelamentoE14;
		this.tipoRegistroE15 = tipoRegistroE15;
		this.numeroDoItemE15 = numeroDoItemE15;
		this.codigoDoProdutoE15 = codigoDoProdutoE15;
		this.descricaoProdutoE15 = descricaoProdutoE15;
		this.quantidadeComercializadaE15 = quantidadeComercializadaE15;
		this.unidadeMedidaE15 = unidadeMedidaE15;
		this.valorUnitarioE15 = valorUnitarioE15;
		this.valorDescontoE15 = valorDescontoE15;
		this.valorAcrescimoE15 = valorAcrescimoE15;
		this.valorTotalLiquidoE15 = valorTotalLiquidoE15;
		this.codTotalizadorParcialE15 = codTotalizadorParcialE15;
		this.quantidadeCanceladaE15 = quantidadeCanceladaE15;
		this.valorCanceladoE15 = valorCanceladoE15;
		this.valorCanceladoAcrescimoE15 = valorCanceladoAcrescimoE15;
	}
	
	public String getTipoRegistroE01() {
		return tipoRegistroE01;
	}

	public void setTipoRegistroE01(String tipoRegistroE01) {
		this.tipoRegistroE01 = tipoRegistroE01;
	}

	public String getNumeroFabricacaoE01() {
		return numeroFabricacaoE01;
	}

	public void setNumeroFabricacaoE01(String numeroFabricacaoE01) {
		this.numeroFabricacaoE01 = numeroFabricacaoE01;
	}

	public char getMfAdicionalE01() {
		return mfAdicionalE01;
	}

	public void setMfAdicionalE01(char mfAdicionalE01) {
		this.mfAdicionalE01 = mfAdicionalE01;
	}

	public String getTipoEcfE01() {
		return tipoEcfE01;
	}

	public void setTipoEcfE01(String tipoEcfE01) {
		this.tipoEcfE01 = tipoEcfE01;
	}

	public String getMarcaE01() {
		return marcaE01;
	}

	public void setMarcaE01(String marcaE01) {
		this.marcaE01 = marcaE01;
	}

	public String getModeloE01() {
		return modeloE01;
	}

	public void setModeloE01(String modeloE01) {
		this.modeloE01 = modeloE01;
	}

	public int getNumeroEcfE01() {
		return numeroEcfE01;
	}

	public void setNumeroEcfE01(int numeroEcfE01) {
		this.numeroEcfE01 = numeroEcfE01;
	}

	public String getCnpjUsuarioE01() {
		return cnpjUsuarioE01;
	}

	public void setCnpjUsuarioE01(String cnpjUsuarioE01) {
		this.cnpjUsuarioE01 = cnpjUsuarioE01;
	}

	public int getCrzInicialE01() {
		return crzInicialE01;
	}

	public void setCrzInicialE01(int crzInicialE01) {
		this.crzInicialE01 = crzInicialE01;
	}

	public int getCrzFinalE01() {
		return crzFinalE01;
	}

	public void setCrzFinalE01(int crzFinalE01) {
		this.crzFinalE01 = crzFinalE01;
	}

	public Calendar getDataInicialE01() {
		return dataInicialE01;
	}

	public void setDataInicialE01(Calendar dataInicialE01) {
		this.dataInicialE01 = dataInicialE01;
	}

	public Calendar getDataFinalE01() {
		return dataFinalE01;
	}

	public void setDataFinalE01(Calendar dataFinalE01) {
		this.dataFinalE01 = dataFinalE01;
	}

	public String getCnpjE02() {
		return cnpjE02;
	}

	public void setCnpjE02(String cnpjE02) {
		this.cnpjE02 = cnpjE02;
	}

	public String getInscricaoEstadualE02() {
		return inscricaoEstadualE02;
	}

	public void setInscricaoEstadualE02(String inscricaoEstadualE02) {
		this.inscricaoEstadualE02 = inscricaoEstadualE02;
	}

	public String getNomeContribuinteE02() {
		return nomeContribuinteE02;
	}

	public void setNomeContribuinteE02(String nomeContribuinteE02) {
		this.nomeContribuinteE02 = nomeContribuinteE02;
	}

	public String getTipoRegistroE14() {
		return tipoRegistroE14;
	}

	public void setTipoRegistroE14(String tipoRegistroE14) {
		this.tipoRegistroE14 = tipoRegistroE14;
	}

	public Calendar getDataInicioEmissaoE14() {
		return dataInicioEmissaoE14;
	}

	public void setDataInicioEmissaoE14(Calendar dataInicioEmissaoE14) {
		this.dataInicioEmissaoE14 = dataInicioEmissaoE14;
	}

	public double getValorTotalDoDocumentoE14() {
		return valorTotalDoDocumentoE14;
	}

	public void setValorTotalDoDocumentoE14(double valorTotalDoDocumentoE14) {
		this.valorTotalDoDocumentoE14 = valorTotalDoDocumentoE14;
	}

	public double getValorDoDescontoE14() {
		return valorDoDescontoE14;
	}

	public void setValorDoDescontoE14(double valorDoDescontoE14) {
		this.valorDoDescontoE14 = valorDoDescontoE14;
	}

	public double getValorAcrescimoPercAplicadoE14() {
		return valorAcrescimoPercAplicadoE14;
	}

	public void setValorAcrescimoPercAplicadoE14(double valorAcrescimoPercAplicadoE14) {
		this.valorAcrescimoPercAplicadoE14 = valorAcrescimoPercAplicadoE14;
	}

	public double getValorTotalLiquidoE14() {
		return valorTotalLiquidoE14;
	}

	public void setValorTotalLiquidoE14(double valorTotalLiquidoE14) {
		this.valorTotalLiquidoE14 = valorTotalLiquidoE14;
	}

	public char getIndicadorDeCancelamentoE14() {
		return indicadorDeCancelamentoE14;
	}

	public void setIndicadorDeCancelamentoE14(char indicadorDeCancelamentoE14) {
		this.indicadorDeCancelamentoE14 = indicadorDeCancelamentoE14;
	}

	public double getValorCancelamentoE14() {
		return valorCancelamentoE14;
	}

	public void setValorCancelamentoE14(double valorCancelamentoE14) {
		this.valorCancelamentoE14 = valorCancelamentoE14;
	}

	public String getTipoRegistroE15() {
		return tipoRegistroE15;
	}

	public void setTipoRegistroE15(String tipoRegistroE15) {
		this.tipoRegistroE15 = tipoRegistroE15;
	}

	public int getNumeroDoItemE15() {
		return numeroDoItemE15;
	}

	public void setNumeroDoItemE15(int numeroDoItemE15) {
		this.numeroDoItemE15 = numeroDoItemE15;
	}

	public String getCodigoDoProdutoE15() {
		return codigoDoProdutoE15;
	}

	public void setCodigoDoProdutoE15(String codigoDoProdutoE15) {
		this.codigoDoProdutoE15 = codigoDoProdutoE15;
	}

	public String getDescricaoProdutoE15() {
		return descricaoProdutoE15;
	}

	public void setDescricaoProdutoE15(String descricaoProdutoE15) {
		this.descricaoProdutoE15 = descricaoProdutoE15;
	}

	public int getQuantidadeComercializadaE15() {
		return quantidadeComercializadaE15;
	}

	public void setQuantidadeComercializadaE15(int quantidadeComercializadaE15) {
		this.quantidadeComercializadaE15 = quantidadeComercializadaE15;
	}

	public String getUnidadeMedidaE15() {
		return unidadeMedidaE15;
	}

	public void setUnidadeMedidaE15(String unidadeMedidaE15) {
		this.unidadeMedidaE15 = unidadeMedidaE15;
	}

	public int getValorUnitarioE15() {
		return valorUnitarioE15;
	}

	public void setValorUnitarioE15(int valorUnitarioE15) {
		this.valorUnitarioE15 = valorUnitarioE15;
	}

	public double getValorDescontoE15() {
		return valorDescontoE15;
	}

	public void setValorDescontoE15(double valorDescontoE15) {
		this.valorDescontoE15 = valorDescontoE15;
	}

	public double getValorAcrescimoE15() {
		return valorAcrescimoE15;
	}

	public void setValorAcrescimoE15(double valorAcrescimoE15) {
		this.valorAcrescimoE15 = valorAcrescimoE15;
	}

	public double getValorTotalLiquidoE15() {
		return valorTotalLiquidoE15;
	}

	public void setValorTotalLiquidoE15(double valorTotalLiquidoE15) {
		this.valorTotalLiquidoE15 = valorTotalLiquidoE15;
	}

	public String getCodTotalizadorParcialE15() {
		return codTotalizadorParcialE15;
	}

	public void setCodTotalizadorParcialE15(String codTotalizadorParcialE15) {
		this.codTotalizadorParcialE15 = codTotalizadorParcialE15;
	}

	public int getQuantidadeCanceladaE15() {
		return quantidadeCanceladaE15;
	}

	public void setQuantidadeCanceladaE15(int quantidadeCanceladaE15) {
		this.quantidadeCanceladaE15 = quantidadeCanceladaE15;
	}

	public double getValorCanceladoE15() {
		return valorCanceladoE15;
	}

	public void setValorCanceladoE15(double valorCanceladoE15) {
		this.valorCanceladoE15 = valorCanceladoE15;
	}

	public double getValorCanceladoAcrescimoE15() {
		return valorCanceladoAcrescimoE15;
	}

	public void setValorCanceladoAcrescimoE15(double valorCanceladoAcrescimoE15) {
		this.valorCanceladoAcrescimoE15 = valorCanceladoAcrescimoE15;
	}

}
