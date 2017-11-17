package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms10Dto;

@Service
public class ConversorIcms10 implements ConversorIcms<Icms10Dto>{

	@Override
	public Icms converter(Icms10Dto classe) {
		Icms icms = new Icms();
		icms.setOrig(classe.getOrig());
		icms.setCst(classe.getCst());
		icms.setModBc(classe.getModBc());
		icms.setModBcSt(classe.getModBcSt());
		icms.setpMvaSt(classe.getpMvaSt());
		icms.setpRedBcSt(classe.getpRedBcSt());
		icms.setpIcms(classe.getpIcms());
		icms.setpIcmsSt(classe.getpIcmsSt());
		icms.setvBc(classe.getvBc());
		icms.setvBcSt(classe.getvBcSt());
		icms.setvIcms(classe.getvIcms());
		icms.setvIcmsSt(classe.getpIcmsSt());
		return icms;
	}
	
}
