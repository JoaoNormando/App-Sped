package br.com.srcomputador.nfe.servico;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.ProcessoNFe;
import br.com.srcomputador.nfe.entidade.detalheProduto.Detalhamento;
import br.com.srcomputador.nfe.entidade.detalheProduto.Imposto;
import br.com.srcomputador.servico.OperacaoXmlService;

@Service
public class LeitorProcNFeService {

	private OperacaoXmlService operacaoXmlService;
	private LeitorImpostoService leitorImpostoService;
	
	@Autowired
	public LeitorProcNFeService(OperacaoXmlService operacaoXmlService, LeitorImpostoService leitorImpostoService) {
		this.operacaoXmlService = operacaoXmlService;
		this.leitorImpostoService = leitorImpostoService;
	}
	
	public ProcessoNFe lerDadosProcNfe(File file) throws IllegalAccessException, InvocationTargetException {
		this.operacaoXmlService.informarObjeto("nfeProc", ProcessoNFe.class);
		ProcessoNFe procNfe =(ProcessoNFe) this.operacaoXmlService.consumirXml(file);
		
		List<Detalhamento> det = procNfe.getNfe().getInfNfe().getDet();
		
		for (Detalhamento d : det) {
			Imposto impostoFinal = leitorImpostoService.lerImposto(d.getImpostoDto());
			d.setImposto(impostoFinal);
			d.setNfe(procNfe.getNfe());
		}
		
		return procNfe;
	}
	
}
