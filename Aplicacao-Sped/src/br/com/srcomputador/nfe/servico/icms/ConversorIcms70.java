package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms70Dto;

@Service
public class ConversorIcms70 implements ConversorIcms<Icms70Dto>{

	@Override
	public Icms converter(Icms70Dto classe) {
		Icms icms = new Icms();
		icms.setCst(classe.getCst());
		icms.setModBc(classe.getModBc());
		icms.setModBcSt(classe.getModBcSt());
		icms.setMotDesIcms(classe.getMotDesIcms());
		icms.setOrig(classe.getOrig());
		icms.setpIcms(classe.getpIcms());
		icms.setpIcmsSt(classe.getpIcmsSt());
		icms.setpMvaSt(classe.getpMvaSt());
		icms.setpRedBc(classe.getpRedBc());
		icms.setpRedBcSt(classe.getpRedBcSt());
		icms.setvBc(classe.getvBc());
		icms.setvBcSt(classe.getvBcSt());
		icms.setvIcms(classe.getvIcms());
		icms.setvIcmsDeson(classe.getvIcmsDeson());
		icms.setvIcmsSt(classe.getvIcmsSt());
		return icms;
	}

}
