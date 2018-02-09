package br.com.srcomputador.relatorio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.Destinatario;
import br.com.srcomputador.nfe.entidade.Emitente;
import br.com.srcomputador.nfe.entidade.IcmsTotal;
import br.com.srcomputador.nfe.entidade.IdentificacaoDaNfe;
import br.com.srcomputador.nfe.entidade.InformacaoAdicional;
import br.com.srcomputador.nfe.entidade.InformacaoDaNfe;
import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.entidade.Total;
import br.com.srcomputador.nfe.entidade.detalheProduto.Cofins;
import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.Ipi;
import br.com.srcomputador.nfe.entidade.detalheProduto.Pis;
import br.com.srcomputador.nfe.entidade.detalheProduto.Produto;
import br.com.srcomputador.servico.ConversorDataService;

@Service
public class RelatorioCSV {

	private ConversorDataService dataService;
	private StringBuilder sb;
	
	@Autowired
	public RelatorioCSV(ConversorDataService dataService) {
		this.dataService = dataService;
	}

	public File criarRelatorio(List<NotaFiscalEletronica> nfe) throws IOException {
		sb = new StringBuilder();
		File f = new File("RelatorioTotal.csv");
		f.createNewFile();
		FileWriter writer = new FileWriter(f);
		
		nfe.forEach(n -> {
			this.escreveDadosIde(n.getInfNfe().getIde(), n.getInfNfe().getTotal());
			this.escreverChaveDeAcesso(n.getInfNfe());
			this.escreverEmitente(n.getInfNfe().getEmit());
			this.escreverDestinatario(n.getInfNfe().getDest());
			this.escreverEmissao(n.getInfNfe().getIde());
			this.escreverSituacaoAtual();
			this.escreverDadosEmitenteAdicionais(n.getInfNfe().getEmit());
			this.escreverDadosDestinatarioAdicionais(n.getInfNfe().getDest());
			this.escreverDadosTotais(n.getInfNfe().getTotal().getIcmsTot());
			this.escreverDadosComplementares(n.getInfNfe().getInfAdic());
			sb.append("\n");
		});
		
		writer.write(sb.toString());
		writer.flush();
		writer.close();
		return f;
	}
	
	public File criarRelatorioProduto(List<Detalhamento> det) throws IOException {
		this.sb = new StringBuilder();
		File f = new File("RelatorioProduto.csv");
		f.createNewFile();
		FileWriter writer = new FileWriter(f);
		det.forEach(d -> {
			NotaFiscalEletronica nfe = d.getNfe();
			this.escreveDadosIde(nfe.getInfNfe().getIde(), nfe.getInfNfe().getTotal());
			this.escreverEmitente(nfe.getInfNfe().getEmit());
			this.escreverDestinatario(nfe.getInfNfe().getDest());
			this.escreverEmissao(nfe.getInfNfe().getIde());
			this.escreverSituacaoAtual();
			this.escreverDadosEmitenteAdicionais(nfe.getInfNfe().getEmit());
			this.escreverDadosDestinatarioAdicionais(nfe.getInfNfe().getDest());
			this.escreverChaveDeAcesso(nfe.getInfNfe());
			this.escreverProdutosEServicos(d);
			this.escreverIcmsNormalSt(d.getImposto().getIcms());
			this.escreverIpi(d.getImposto().getIpi());
			this.escreverPis(d.getImposto().getPis());
			this.escreverCofins(d.getImposto().getCofins());
			sb.append("\n");
		});
		writer.write(sb.toString());
		writer.flush();
		writer.close();
		return f;
	}
	
	private void escreverDadosComplementares(InformacaoAdicional infAdic) {
		if(infAdic == null) {
			sb.append(";");
			return;
		}
		sb.append(infAdic.getInfCpl().replaceAll(";", " ")+";");
	}

	public void escreveDadosIde(IdentificacaoDaNfe ide, Total total) {
		sb.append(ide.getnNf()+";");
		sb.append(ide.getSerie()+";");
		sb.append(ide.getMod()+";");
		sb.append(this.dataService.transformarData(ide.getDhEmi())+";");
		if(ide.getDhSaiEnt() != null)
			sb.append(this.dataService.transformarData(ide.getDhSaiEnt()) + ";");
		else if(ide.getdSaiEnt() != null)
			sb.append(this.dataService.transformarData(ide.getdSaiEnt()) + ";");
		else
			sb.append("Data de saida/entrada inexistente;");
		sb.append(total.getIcmsTot().getvNf()+ ";");
	}

	public void escreverChaveDeAcesso(InformacaoDaNfe inf) {
		sb.append(inf.getChaveAcesso() + ";");
	}
	
	public void escreverEmitente(Emitente emite) {
		sb.append(emite.getCnpj()+";");
		sb.append(emite.getxNome()+";");
		sb.append(emite.getIe()+";");
		sb.append(emite.getEnderEmit().getUf()+";");
	}

	public void escreverDestinatario(Destinatario destinatario) {
		if(destinatario == null) {
			for(int i = 0; i < 6; i++)
				sb.append("destinatario vazio;");
			return;
		}
		sb.append(destinatario.getCpf()+";");
		sb.append(destinatario.getxNome()+";");
		sb.append(destinatario.getIe()+";");
		if(destinatario.getEnderDest() != null)
			sb.append(destinatario.getEnderDest().getUf()+";");
		else 
			sb.append("Endereco vazio;");
		sb.append(destinatario.getIndIeDest()+";");
		sb.append(destinatario.getIdEstrangeiro()+";");
		
	}

	public void escreverEmissao(IdentificacaoDaNfe ide) {
		sb.append(ide.getNatOp()+";");
		sb.append(ide.getTpNf()+";");
	}
	
	public void escreverSituacaoAtual() {
		sb.append(";");
	}

	public void escreverDadosEmitenteAdicionais(Emitente emite) {
		sb.append(emite.getEnderEmit().getxMun()+";");
		sb.append(emite.getCrt()+";");
	}
	
	public void escreverDadosDestinatarioAdicionais(Destinatario dest) {
		if(dest == null) {
			for(int i = 0; i< 4; i++) {
				sb.append("destinatario inexistente;");
			}
			return;
		}
		if(dest.getEnderDest() != null) {
			sb.append(dest.getEnderDest().getxMun()+";");
			sb.append(dest.getEnderDest().getxPais()+";");
		} else {
			sb.append("Endereco vazio;");
			sb.append("Endereco vazio;");
		}
		sb.append(dest.getIndIeDest()+";");
		sb.append(dest.getIsuf()+";");
		
	}

	public void escreverDadosTotais(IcmsTotal total) {
		sb.append(total.getvBc()+";"); //Base de calculo ICMS
		sb.append(total.getvIcms()+";"); //Valor do ICMS
		sb.append(total.getvIcmsDeson()+";"); //Valor do ICMS Desonerado
		sb.append(total.getvBcSt()+";"); //Base de calculo ICMS ST
		sb.append(total.getvSt()+";"); //Valor ICMS Substituicao
		sb.append(total.getvProd()+";"); //Valor Total dos Produtos
		sb.append(total.getvFrete()+";"); //Valor do Frete	
		sb.append(total.getvSeg()+";"); //	Valor do Seguro
		sb.append(total.getvOutro()+";"); // Outras Despesas Acessorias
		sb.append(total.getvIpi()+";");// Valor Total do IPI
		sb.append(total.getvNf()+";");// Valor Total da NFe
		sb.append(total.getvDesc()+";");//
		sb.append(total.getvII()+";");//
		sb.append(total.getvPis()+";");//
		sb.append(total.getvCofins()+";");//
		sb.append(total.getvTotTrib()+";");//
		sb.append(total.getvFcpUfDest()+";");//
		sb.append(total.getvIcmsUfDest()+";");//
		sb.append(total.getvIcmsUfRemet()+";");//
	}

	public void escreverProdutosEServicos(Detalhamento detalhamento) {
		sb.append(detalhamento.getNumeroItem()+";");
		Produto produto = detalhamento.getProduto();
		sb.append(produto.getcProd()+";");
		sb.append(produto.getxProd()+";");
		sb.append(produto.getNcm()+";");
		sb.append(produto.getCfop()+";");
		sb.append(produto.getqCom()+";");
		sb.append(produto.getvUnCom()+";");
		sb.append(produto.getvProd()+";");
	}

	public void escreverIcmsNormalSt(Icms icms) {
		sb.append(icms.getOrig()+";");
		sb.append(icms.getCst()+";");
		sb.append(icms.getModBc()+";");
		sb.append(icms.getvBc()+";");
		sb.append(icms.getpIcms()+";");
		sb.append(icms.getvIcms()+";");
		
		sb.append(icms.getvBcSt()+";");
		sb.append(icms.getpIcmsSt()+";");
		sb.append(icms.getvIcmsSt()+";");
		sb.append(icms.getpRedBcSt()+";");
		sb.append(icms.getpMvaSt()+";");
		sb.append(icms.getModBcSt()+";");
	}
	
	public void escreverIpi(Ipi ipi) {
		sb.append(ipi.getqSelo()+";");
		sb.append(ipi.getCst()+";");
		sb.append(ipi.getqUnid()+";");
		sb.append(ipi.getvUnid()+";");
		sb.append(ipi.getvBc()+";");
		sb.append(ipi.getpIpi()+";");
		sb.append(ipi.getvIpi()+";");
	}
	
	public void escreverPis(Pis pis) {
		sb.append(pis.getCst()+";");
		sb.append(pis.getvBc()+";");
		sb.append(pis.getvAliqProd()+";");
		sb.append(pis.getvPis()+";");
	}
	
	public void escreverCofins(Cofins cofins) {
		sb.append(cofins.getCst()+";");
		sb.append(cofins.getvBc()+";");
		sb.append(cofins.getvAliqProd()+";");
		sb.append(cofins.getvCofins()+";");
	}
}
