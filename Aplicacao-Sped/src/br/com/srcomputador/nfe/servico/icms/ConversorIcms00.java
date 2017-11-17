package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms00Dto;

@Service
public class ConversorIcms00 implements ConversorIcms<Icms00Dto>{

	@Override
	public Icms converter(Icms00Dto classe) {
		Icms icms = new Icms();
		icms.setCst(classe.getCst());
		icms.setModBc(classe.getModBc());
		icms.setOrig(classe.getOrig());
		icms.setpIcms(classe.getpIcms());
		icms.setvBc(classe.getvBc());
		icms.setvIcms(classe.getvIcms());
		return icms;
	}



	
}
