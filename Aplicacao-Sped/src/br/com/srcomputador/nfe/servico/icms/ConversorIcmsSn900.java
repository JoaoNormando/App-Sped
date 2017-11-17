package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn900Dto;

@Service
public class ConversorIcmsSn900 implements ConversorIcms<IcmsSn900Dto>{

	@Override
	public Icms converter(IcmsSn900Dto classe) {
		Icms icms = new Icms();
		icms.setcSoSn(classe.getcSoSn());
		icms.setModBc(classe.getModBc());
		icms.setModBcSt(classe.getModBcSt());
		icms.setOrig(classe.getOrig());
		icms.setpCredSn(classe.getpCredSn());
		icms.setpIcms(classe.getpIcms());
		icms.setpIcmsSt(classe.getpIcmsSt());
		icms.setpMvaSt(classe.getpMvaSt());
		icms.setpRedBc(classe.getpRedBc());
		icms.setpRedBcSt(classe.getpRedBcSt());
		icms.setvBc(classe.getvBc());
		icms.setvBcSt(classe.getVbcSt());
		icms.setvCredIcmsSn(classe.getvCredIcmsSn());
		icms.setvIcms(classe.getvIcms());
		icms.setvIcmsSt(classe.getvIcmsSt());
		return icms;
	}

}
