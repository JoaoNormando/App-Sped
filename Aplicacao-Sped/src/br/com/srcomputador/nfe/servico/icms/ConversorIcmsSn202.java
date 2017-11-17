package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn202Dto;

@Service
public class ConversorIcmsSn202 implements ConversorIcms<IcmsSn202Dto>{

	@Override
	public Icms converter(IcmsSn202Dto classe) {
		Icms icms = new Icms();
		icms.setcSoSn(classe.getcSoSn());
		icms.setModBcSt(classe.getModBcSt());
		icms.setOrig(classe.getOrig());
		icms.setpIcmsSt(classe.getpIcmsSt());
		icms.setpMvaSt(classe.getpMvaSt());
		icms.setpRedBcSt(classe.getpRedBcSt());
		icms.setvBcSt(classe.getvBcSt());
		icms.setvIcmsSt(classe.getvIcmsSt());
		return icms;
	}

}
