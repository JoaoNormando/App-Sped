package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.entidade.detalheProduto.Imposto;
import br.com.srcomputador.servico.OperacaoXmlService;

@Service
public class LeitorNFeService {

	private final OperacaoXmlService operacaoXml;

	private final LeitorImpostoService leitorImposto;

	@Autowired
	public LeitorNFeService(OperacaoXmlService operacaoXml, LeitorImpostoService leitorImposto) {
		this.operacaoXml = operacaoXml;
		this.leitorImposto = leitorImposto;
	}

	public NotaFiscalEletronica lerDadosNfe(File file) throws IllegalAccessException, InvocationTargetException {
		this.mapearObjetosNFe();
		NotaFiscalEletronica dadosNFe = (NotaFiscalEletronica) this.operacaoXml.consumirXml(file);
		List<Detalhamento> det = dadosNFe.getInfNfe().getDet();

		for (Detalhamento d : det) {
			Imposto impostoFinal = leitorImposto.lerImposto(d.getImpostoDto());
			d.setImposto(impostoFinal);
			d.setNfe(dadosNFe);
		}

		return dadosNFe;
	}

	private void mapearObjetosNFe() {
		operacaoXml.informarObjeto("NFe", NotaFiscalEletronica.class);
	}

}
