package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms90Dto;

@Service
public class ConversorIcms90 implements ConversorIcms<Icms90Dto>{

	@Override
	public Icms converter(Icms90Dto classe) {
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
