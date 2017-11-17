package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms40Dto;

@Service
public class ConversorIcms40 implements ConversorIcms<Icms40Dto>{

	@Override
	public Icms converter(Icms40Dto classe) {
		Icms icms = new Icms();
		icms.setCst(classe.getCst());
		icms.setMotDesIcms(classe.getMotDesIcms());
		icms.setOrig(classe.getOrig());
		icms.setvIcmsDeson(classe.getvIcmsDeson());
		return icms;
	}

}
