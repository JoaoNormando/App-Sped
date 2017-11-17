package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms30Dto;

@Service
public class ConversorIcms30 implements ConversorIcms<Icms30Dto>{

	@Override
	public Icms converter(Icms30Dto classe) {
		Icms icms = new Icms();
		icms.setCst(classe.getCst());
		icms.setModBcSt(classe.getModBcSt());
		icms.setMotDesIcms(classe.getMotDesIcms());
		icms.setOrig(classe.getOrig());
		icms.setpIcmsSt(classe.getpIcmsSt());
		icms.setpMvaSt(classe.getpMvaSt());
		icms.setpRedBcSt(classe.getpRedBcSt());
		icms.setvBcSt(classe.getvBcSt());
		icms.setvIcmsDeson(classe.getvIcmsDeson());
		icms.setvIcmsSt(classe.getvIcmsSt());
		return icms;
	}

}
