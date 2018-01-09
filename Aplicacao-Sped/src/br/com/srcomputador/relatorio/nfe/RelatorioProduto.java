package br.com.srcomputador.relatorio.nfe;

import java.sql.Date;
import java.util.Calendar;

public class RelatorioProduto {

	/*
	 * Dados relacionados aos Dados da Nota Fiscal Eletronica
	 */
	private String numeroNotaFiscal; // Número do Documento Fiscal
	private Integer serie; // Série do Documento Fiscal
	private Integer modelo; // Código do Modelo do Documento Fiscal
	private Calendar dataEmissao;
	// Data de emissao e saida/entrada
	private Calendar dataHoraEmissao; // Data e hora de emissão do Documento Fiscal
	private Calendar dataHoraSaidaEntrada; // Data e hora de Saída ou da Entrada da Mercadoria/Produto

	private Double valorTotalNfe; // Valor Total da NF-e
	private Integer identificadorDestino; // Identificador de local de destino da operação
	private Integer consumidorFinal; // Indica operação com Consumidor final

	/*
	 * Dados relacionados aos Dados do Emitente
	 */
	private String cnpjEmitente; // CNPJ do emitente
	private String cpfEmitente; // CPF do remetente
	private String nomeRazaoSocialEmitente; // Razão Social ou Nome do emitente
	private String inscricaoEstadualEmitente; // Inscrição Estadual do Emitente
	private String siglaUfEmitente; // Sigla da UF
	private String nomeMunicipioEmitente; // Nome do município
	private Integer crtEmitente; // Código de Regime Tributário

	/*
	 * Dados relacionados aos Dados do Destinatario
	 */
	private String cnpjDestinatario; // CNPJ do destinatário
	private String cpfDestinatario; // CPF do destinatário
	private String nomeRazaoSocialDestinatario; // Razão Social ou nome do destinatário
	private String inscricaoEstadualDestinatario; // Inscrição Estadual do Destinatário
	private String siglaUfDestinatario; // Sigla da UF
	private String nomeMunicipioDestinatario; // Nome do município
	private String nomePaisDestinatario; // Nome do País
	private Integer idInscricalEstadualDestinatario; // Indicador da IE do Destinatário
	private Integer inscricalSuframaDestinatario; // Inscrição na SUFRAMA

	/*
	 * Dados relacionados a emissao
	 */
	private String naturezaOperacao; // Descrição da Natureza da Operação
	private Integer tipoOperacao; // Tipo de Operação

	// Situacao atual
	// Falta colocar os dados

	// Chave de acesso
	private String chaveDeAcesso;

	/*
	 * Dados relacionados aos produtos e serviços
	 */
	private String numeroItemProduto;
	private String codigoProduto; // Código do produto ou serviço
	private String descricaoProduto; // Descrição do produto ou serviço
	private String codigoNcmProduto; // Código NCM com 8 dígitos
	private Integer cfopProduto; // Código Fiscal de Operações e Prestações
	private Double quantidadeComercialProduto; // Quantidade Comercial
	private Double valorUnitarioComercializacaoProduto; // Valor Unitário de Comercialização
	private Double valorTotalProduto; // Valor Total Bruto dos Produtos ou Serviços

	/*
	 * Dados relacionados ao ICMS
	 */
	// Dados do icms Normal
	private Integer origem; // Origem da mercadoria
	private Integer cstIcms; // Tributação do ICMS
	private Integer modalidadeBaseCalculo; // Modalidade de determinação da BC do ICMS Normal
	private Double valorBaseCalculo; // Valor da BC do ICMS Normal
	private Double valorAliquota; // Valor Alíquota do imposto do ICMS Normal
	private Double valorIcms; // Valor do ICMS Normal
	// Dados do icms St
	private Double valorBaseCalculoSt; // Valor da BC do ICMS ST
	private Double valorAliquotaSt; // Alíquota do imposto do ICMS ST
	private Double valorIcmsSt; // Valor do ICMS ST
	private Double valorReducaoBaseCalculoSt; // Percentual da Redução de BC do ICMS ST
	private Double valorPercentualMargem; // Percentual da margem de valor Adicionado do ICMS ST (MVA)
	private Integer modalidadeBaseCalculoSt; // Modalidade de determinação da BC do ICMS ST

	/*
	 * Dados relacionados ao IPI
	 */
	private String classeEnquadramento;
	private String codigoEnquadramentoLegal;
	private String codigoSelo;
	private Integer quantidadeSelo;
	private Integer cstIpi;
	private Integer quantidadeUnidadeTotal;
	private Double valorUnidadeTributavel;
	private Double valorBaseCalculoIpi;
	private Double valorAliquotaIpi;
	private Double valorIpi;

	/*
	 * Dados relacionados ao PIS
	 */
	private Integer cstPis; // Código da situação tributária do IPI
	private Double valorBaseCalculoPis; // Valor da Base de Cálculo do PIS
	private Double aliquotaPis; // Alíquota do PIS (em percentual)
	private Double valorPis; // Valor do PIS

	/*
	 * Dados relacionados ao COFINS
	 */
	private Integer cstCofins; // Código de Situação Tributária da COFINS
	private Double valorBaseCalculoCofins; // Valor da Base de Cálculo da COFINS
	private Double aliquotaCofins; // Alíquota da COFINS (em percentual)
	private Double valorAliquotaCofins; // Alíquota da COFINS (em reais)

	public RelatorioProduto() {
		
	}
	
	public RelatorioProduto(String numeroNotaFiscal, Integer serie, Integer modelo, Calendar dataEmissao,
			Calendar dataHoraEmissao, Calendar dataHoraSaidaEntrada, Double valorTotalNfe, Integer identificadorDestino,
			Integer consumidorFinal, String cnpjEmitente, String cpfEmitente, String nomeRazaoSocialEmitente,
			String inscricaoEstadualEmitente, String siglaUfEmitente, String nomeMunicipioEmitente, Integer crtEmitente,
			String cnpjDestinatario, String cpfDestinatario, String nomeRazaoSocialDestinatario,
			String inscricaoEstadualDestinatario, String siglaUfDestinatario, String nomeMunicipioDestinatario,
			String nomePaisDestinatario, Integer idInscricalEstadualDestinatario, Integer inscricalSuframaDestinatario,
			String naturezaOperacao, Integer tipoOperacao, String chaveDeAcesso, String numeroItemProduto,
			String codigoProduto, String descricaoProduto, String codigoNcmProduto, Integer cfopProduto,
			Double quantidadeComercialProduto, Double valorUnitarioComercializacaoProduto, Double valorTotalProduto,
			Integer origem, Integer cstIcms, Integer modalidadeBaseCalculo, Double valorBaseCalculo,
			Double valorAliquota, Double valorIcms, Double valorBaseCalculoSt, Double valorAliquotaSt,
			Double valorIcmsSt, Double valorReducaoBaseCalculoSt, Double valorPercentualMargem,
			Integer modalidadeBaseCalculoSt, String classeEnquadramento, String codigoEnquadramentoLegal,
			String codigoSelo, Integer quantidadeSelo, Integer cstIpi, Integer quantidadeUnidadeTotal,
			Double valorUnidadeTributavel, Double valorBaseCalculoIpi, Double valorAliquotaIpi, Double valorIpi,
			Integer cstPis, Double valorBaseCalculoPis, Double aliquotaPis, Double valorPis, Integer cstCofins,
			Double valorBaseCalculoCofins, Double aliquotaCofins, Double valorAliquotaCofins) {
		
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.serie = serie;
		this.modelo = modelo;
		this.dataEmissao = dataEmissao;
		this.dataHoraEmissao = dataHoraEmissao;
		this.dataHoraSaidaEntrada = dataHoraSaidaEntrada;
		this.valorTotalNfe = valorTotalNfe;
		this.identificadorDestino = identificadorDestino;
		this.consumidorFinal = consumidorFinal;
		this.cnpjEmitente = cnpjEmitente;
		this.cpfEmitente = cpfEmitente;
		this.nomeRazaoSocialEmitente = nomeRazaoSocialEmitente;
		this.inscricaoEstadualEmitente = inscricaoEstadualEmitente;
		this.siglaUfEmitente = siglaUfEmitente;
		this.nomeMunicipioEmitente = nomeMunicipioEmitente;
		this.crtEmitente = crtEmitente;
		this.cnpjDestinatario = cnpjDestinatario;
		this.cpfDestinatario = cpfDestinatario;
		this.nomeRazaoSocialDestinatario = nomeRazaoSocialDestinatario;
		this.inscricaoEstadualDestinatario = inscricaoEstadualDestinatario;
		this.siglaUfDestinatario = siglaUfDestinatario;
		this.nomeMunicipioDestinatario = nomeMunicipioDestinatario;
		this.nomePaisDestinatario = nomePaisDestinatario;
		this.idInscricalEstadualDestinatario = idInscricalEstadualDestinatario;
		this.inscricalSuframaDestinatario = inscricalSuframaDestinatario;
		this.naturezaOperacao = naturezaOperacao;
		this.tipoOperacao = tipoOperacao;
		this.chaveDeAcesso = chaveDeAcesso;
		this.numeroItemProduto = numeroItemProduto;
		this.codigoProduto = codigoProduto;
		this.descricaoProduto = descricaoProduto;
		this.codigoNcmProduto = codigoNcmProduto;
		this.cfopProduto = cfopProduto;
		this.quantidadeComercialProduto = quantidadeComercialProduto;
		this.valorUnitarioComercializacaoProduto = valorUnitarioComercializacaoProduto;
		this.valorTotalProduto = valorTotalProduto;
		this.origem = origem;
		this.cstIcms = cstIcms;
		this.modalidadeBaseCalculo = modalidadeBaseCalculo;
		this.valorBaseCalculo = valorBaseCalculo;
		this.valorAliquota = valorAliquota;
		this.valorIcms = valorIcms;
		this.valorBaseCalculoSt = valorBaseCalculoSt;
		this.valorAliquotaSt = valorAliquotaSt;
		this.valorIcmsSt = valorIcmsSt;
		this.valorReducaoBaseCalculoSt = valorReducaoBaseCalculoSt;
		this.valorPercentualMargem = valorPercentualMargem;
		this.modalidadeBaseCalculoSt = modalidadeBaseCalculoSt;
		this.classeEnquadramento = classeEnquadramento;
		this.codigoEnquadramentoLegal = codigoEnquadramentoLegal;
		this.codigoSelo = codigoSelo;
		this.quantidadeSelo = quantidadeSelo;
		this.cstIpi = cstIpi;
		this.quantidadeUnidadeTotal = quantidadeUnidadeTotal;
		this.valorUnidadeTributavel = valorUnidadeTributavel;
		this.valorBaseCalculoIpi = valorBaseCalculoIpi;
		this.valorAliquotaIpi = valorAliquotaIpi;
		this.valorIpi = valorIpi;
		this.cstPis = cstPis;
		this.valorBaseCalculoPis = valorBaseCalculoPis;
		this.aliquotaPis = aliquotaPis;
		this.valorPis = valorPis;
		this.cstCofins = cstCofins;
		this.valorBaseCalculoCofins = valorBaseCalculoCofins;
		this.aliquotaCofins = aliquotaCofins;
		this.valorAliquotaCofins = valorAliquotaCofins;
	}


	public String getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(String numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Calendar getDataHoraEmissao() {
		return dataHoraEmissao;
	}

	public void setDataHoraEmissao(Calendar dataHoraEmissao) {
		this.dataHoraEmissao = dataHoraEmissao;
	}

	public Calendar getDataHoraSaidaEntrada() {
		return dataHoraSaidaEntrada;
	}

	public void setDataHoraSaidaEntrada(Calendar dataHoraSaidaEntrada) {
		this.dataHoraSaidaEntrada = dataHoraSaidaEntrada;
	}

	public Double getValorTotalNfe() {
		return valorTotalNfe;
	}

	public void setValorTotalNfe(Double valorTotalNfe) {
		this.valorTotalNfe = valorTotalNfe;
	}

	public Integer getIdentificadorDestino() {
		return identificadorDestino;
	}

	public void setIdentificadorDestino(Integer identificadorDestino) {
		this.identificadorDestino = identificadorDestino;
	}

	public Integer getConsumidorFinal() {
		return consumidorFinal;
	}

	public void setConsumidorFinal(Integer consumidorFinal) {
		this.consumidorFinal = consumidorFinal;
	}

	public String getCnpjEmitente() {
		return cnpjEmitente;
	}

	public void setCnpjEmitente(String cnpjEmitente) {
		this.cnpjEmitente = cnpjEmitente;
	}

	public String getCpfEmitente() {
		return cpfEmitente;
	}

	public void setCpfEmitente(String cpfEmitente) {
		this.cpfEmitente = cpfEmitente;
	}

	public String getNomeRazaoSocialEmitente() {
		return nomeRazaoSocialEmitente;
	}

	public void setNomeRazaoSocialEmitente(String nomeRazaoSocialEmitente) {
		this.nomeRazaoSocialEmitente = nomeRazaoSocialEmitente;
	}

	public String getInscricaoEstadualEmitente() {
		return inscricaoEstadualEmitente;
	}

	public void setInscricaoEstadualEmitente(String inscricaoEstadualEmitente) {
		this.inscricaoEstadualEmitente = inscricaoEstadualEmitente;
	}

	public String getSiglaUfEmitente() {
		return siglaUfEmitente;
	}

	public void setSiglaUfEmitente(String siglaUfEmitente) {
		this.siglaUfEmitente = siglaUfEmitente;
	}

	public String getNomeMunicipioEmitente() {
		return nomeMunicipioEmitente;
	}

	public void setNomeMunicipioEmitente(String nomeMunicipioEmitente) {
		this.nomeMunicipioEmitente = nomeMunicipioEmitente;
	}

	public Integer getCrtEmitente() {
		return crtEmitente;
	}

	public void setCrtEmitente(Integer crtEmitente) {
		this.crtEmitente = crtEmitente;
	}

	public String getCnpjDestinatario() {
		return cnpjDestinatario;
	}

	public void setCnpjDestinatario(String cnpjDestinatario) {
		this.cnpjDestinatario = cnpjDestinatario;
	}

	public String getCpfDestinatario() {
		return cpfDestinatario;
	}

	public void setCpfDestinatario(String cpfDestinatario) {
		this.cpfDestinatario = cpfDestinatario;
	}

	public String getNomeRazaoSocialDestinatario() {
		return nomeRazaoSocialDestinatario;
	}

	public void setNomeRazaoSocialDestinatario(String nomeRazaoSocialDestinatario) {
		this.nomeRazaoSocialDestinatario = nomeRazaoSocialDestinatario;
	}

	public String getInscricaoEstadualDestinatario() {
		return inscricaoEstadualDestinatario;
	}

	public void setInscricaoEstadualDestinatario(String inscricaoEstadualDestinatario) {
		this.inscricaoEstadualDestinatario = inscricaoEstadualDestinatario;
	}

	public String getSiglaUfDestinatario() {
		return siglaUfDestinatario;
	}

	public void setSiglaUfDestinatario(String siglaUfDestinatario) {
		this.siglaUfDestinatario = siglaUfDestinatario;
	}

	public String getNomeMunicipioDestinatario() {
		return nomeMunicipioDestinatario;
	}

	public void setNomeMunicipioDestinatario(String nomeMunicipioDestinatario) {
		this.nomeMunicipioDestinatario = nomeMunicipioDestinatario;
	}

	public String getNomePaisDestinatario() {
		return nomePaisDestinatario;
	}

	public void setNomePaisDestinatario(String nomePaisDestinatario) {
		this.nomePaisDestinatario = nomePaisDestinatario;
	}

	public Integer getIdInscricalEstadualDestinatario() {
		return idInscricalEstadualDestinatario;
	}

	public void setIdInscricalEstadualDestinatario(Integer idInscricalEstadualDestinatario) {
		this.idInscricalEstadualDestinatario = idInscricalEstadualDestinatario;
	}

	public Integer getInscricalSuframaDestinatario() {
		return inscricalSuframaDestinatario;
	}

	public void setInscricalSuframaDestinatario(Integer inscricalSuframaDestinatario) {
		this.inscricalSuframaDestinatario = inscricalSuframaDestinatario;
	}

	public String getNaturezaOperacao() {
		return naturezaOperacao;
	}

	public void setNaturezaOperacao(String naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}

	public Integer getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(Integer tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public String getChaveDeAcesso() {
		return chaveDeAcesso;
	}

	public void setChaveDeAcesso(String chaveDeAcesso) {
		this.chaveDeAcesso = chaveDeAcesso;
	}

	public String getNumeroItemProduto() {
		return numeroItemProduto;
	}

	public void setNumeroItemProduto(String numeroItemProduto) {
		this.numeroItemProduto = numeroItemProduto;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getCodigoNcmProduto() {
		return codigoNcmProduto;
	}

	public void setCodigoNcmProduto(String codigoNcmProduto) {
		this.codigoNcmProduto = codigoNcmProduto;
	}

	public Integer getCfopProduto() {
		return cfopProduto;
	}

	public void setCfopProduto(Integer cfopProduto) {
		this.cfopProduto = cfopProduto;
	}

	public Double getQuantidadeComercialProduto() {
		return quantidadeComercialProduto;
	}

	public void setQuantidadeComercialProduto(Double quantidadeComercialProduto) {
		this.quantidadeComercialProduto = quantidadeComercialProduto;
	}

	public Double getValorUnitarioComercializacaoProduto() {
		return valorUnitarioComercializacaoProduto;
	}

	public void setValorUnitarioComercializacaoProduto(Double valorUnitarioComercializacaoProduto) {
		this.valorUnitarioComercializacaoProduto = valorUnitarioComercializacaoProduto;
	}

	public Double getValorTotalProduto() {
		return valorTotalProduto;
	}

	public void setValorTotalProduto(Double valorTotalProduto) {
		this.valorTotalProduto = valorTotalProduto;
	}

	public Integer getOrigem() {
		return origem;
	}

	public void setOrigem(Integer origem) {
		this.origem = origem;
	}

	public Integer getCstIcms() {
		return cstIcms;
	}

	public void setCstIcms(Integer cstIcms) {
		this.cstIcms = cstIcms;
	}

	public Integer getModalidadeBaseCalculo() {
		return modalidadeBaseCalculo;
	}

	public void setModalidadeBaseCalculo(Integer modalidadeBaseCalculo) {
		this.modalidadeBaseCalculo = modalidadeBaseCalculo;
	}

	public Double getValorBaseCalculo() {
		return valorBaseCalculo;
	}

	public void setValorBaseCalculo(Double valorBaseCalculo) {
		this.valorBaseCalculo = valorBaseCalculo;
	}

	public Double getValorAliquota() {
		return valorAliquota;
	}

	public void setValorAliquota(Double valorAliquota) {
		this.valorAliquota = valorAliquota;
	}

	public Double getValorIcms() {
		return valorIcms;
	}

	public void setValorIcms(Double valorIcms) {
		this.valorIcms = valorIcms;
	}

	public Double getValorBaseCalculoSt() {
		return valorBaseCalculoSt;
	}

	public void setValorBaseCalculoSt(Double valorBaseCalculoSt) {
		this.valorBaseCalculoSt = valorBaseCalculoSt;
	}

	public Double getValorAliquotaSt() {
		return valorAliquotaSt;
	}

	public void setValorAliquotaSt(Double valorAliquotaSt) {
		this.valorAliquotaSt = valorAliquotaSt;
	}

	public Double getValorIcmsSt() {
		return valorIcmsSt;
	}

	public void setValorIcmsSt(Double valorIcmsSt) {
		this.valorIcmsSt = valorIcmsSt;
	}

	public Double getValorReducaoBaseCalculoSt() {
		return valorReducaoBaseCalculoSt;
	}

	public void setValorReducaoBaseCalculoSt(Double valorReducaoBaseCalculoSt) {
		this.valorReducaoBaseCalculoSt = valorReducaoBaseCalculoSt;
	}

	public Double getValorPercentualMargem() {
		return valorPercentualMargem;
	}

	public void setValorPercentualMargem(Double valorPercentualMargem) {
		this.valorPercentualMargem = valorPercentualMargem;
	}

	public Integer getModalidadeBaseCalculoSt() {
		return modalidadeBaseCalculoSt;
	}

	public void setModalidadeBaseCalculoSt(Integer modalidadeBaseCalculoSt) {
		this.modalidadeBaseCalculoSt = modalidadeBaseCalculoSt;
	}

	public String getClasseEnquadramento() {
		return classeEnquadramento;
	}

	public void setClasseEnquadramento(String classeEnquadramento) {
		this.classeEnquadramento = classeEnquadramento;
	}

	public String getCodigoEnquadramentoLegal() {
		return codigoEnquadramentoLegal;
	}

	public void setCodigoEnquadramentoLegal(String codigoEnquadramentoLegal) {
		this.codigoEnquadramentoLegal = codigoEnquadramentoLegal;
	}

	public String getCodigoSelo() {
		return codigoSelo;
	}

	public void setCodigoSelo(String codigoSelo) {
		this.codigoSelo = codigoSelo;
	}

	public Integer getQuantidadeSelo() {
		return quantidadeSelo;
	}

	public void setQuantidadeSelo(Integer quantidadeSelo) {
		this.quantidadeSelo = quantidadeSelo;
	}

	public Integer getCstIpi() {
		return cstIpi;
	}

	public void setCstIpi(Integer cstIpi) {
		this.cstIpi = cstIpi;
	}

	public Integer getQuantidadeUnidadeTotal() {
		return quantidadeUnidadeTotal;
	}

	public void setQuantidadeUnidadeTotal(Integer quantidadeUnidadeTotal) {
		this.quantidadeUnidadeTotal = quantidadeUnidadeTotal;
	}

	public Double getValorUnidadeTributavel() {
		return valorUnidadeTributavel;
	}

	public void setValorUnidadeTributavel(Double valorUnidadeTributavel) {
		this.valorUnidadeTributavel = valorUnidadeTributavel;
	}

	public Double getValorBaseCalculoIpi() {
		return valorBaseCalculoIpi;
	}

	public void setValorBaseCalculoIpi(Double valorBaseCalculoIpi) {
		this.valorBaseCalculoIpi = valorBaseCalculoIpi;
	}

	public Double getValorAliquotaIpi() {
		return valorAliquotaIpi;
	}

	public void setValorAliquotaIpi(Double valorAliquotaIpi) {
		this.valorAliquotaIpi = valorAliquotaIpi;
	}

	public Double getValorIpi() {
		return valorIpi;
	}

	public void setValorIpi(Double valorIpi) {
		this.valorIpi = valorIpi;
	}

	public Integer getCstPis() {
		return cstPis;
	}

	public void setCstPis(Integer cstPis) {
		this.cstPis = cstPis;
	}

	public Double getValorBaseCalculoPis() {
		return valorBaseCalculoPis;
	}

	public void setValorBaseCalculoPis(Double valorBaseCalculoPis) {
		this.valorBaseCalculoPis = valorBaseCalculoPis;
	}

	public Double getAliquotaPis() {
		return aliquotaPis;
	}

	public void setAliquotaPis(Double aliquotaPis) {
		this.aliquotaPis = aliquotaPis;
	}

	public Double getValorPis() {
		return valorPis;
	}

	public void setValorPis(Double valorPis) {
		this.valorPis = valorPis;
	}

	public Integer getCstCofins() {
		return cstCofins;
	}

	public void setCstCofins(Integer cstCofins) {
		this.cstCofins = cstCofins;
	}

	public Double getValorBaseCalculoCofins() {
		return valorBaseCalculoCofins;
	}

	public void setValorBaseCalculoCofins(Double valorBaseCalculoCofins) {
		this.valorBaseCalculoCofins = valorBaseCalculoCofins;
	}

	public Double getAliquotaCofins() {
		return aliquotaCofins;
	}

	public void setAliquotaCofins(Double aliquotaCofins) {
		this.aliquotaCofins = aliquotaCofins;
	}

	public Double getValorAliquotaCofins() {
		return valorAliquotaCofins;
	}

	public void setValorAliquotaCofins(Double valorAliquotaCofins) {
		this.valorAliquotaCofins = valorAliquotaCofins;
	}

}
