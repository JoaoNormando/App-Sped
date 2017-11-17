package br.com.srcomputador.nfe.servico.icms;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.NotaFiscalEletronica;
import br.com.srcomputador.servico.OperacaoXmlService;

@Service
public class LeitorNFe {

	@Autowired
	private OperacaoXmlService operacaoXml;
	
	public NotaFiscalEletronica lerDadosNfe(File file) {
		this.mapearObjetosNFe();
		NotaFiscalEletronica dadosNFe = (NotaFiscalEletronica) this.operacaoXml.consumirXml(file);
		return dadosNFe;
	}

	private void mapearObjetosNFe() {
		operacaoXml.informarObjeto("NFe", NotaFiscalEletronica.class);
	}
	
}
