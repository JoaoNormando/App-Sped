package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn201Dto;

@Service
public class ConversorIcmsSn201 implements ConversorIcms<IcmsSn201Dto>{

	@Override
	public Icms converter(IcmsSn201Dto classe) {
		Icms icms = new Icms();
		icms.setcSoSn(classe.getcSoSn());
		icms.setModBcSt(classe.getModBcSt());
		icms.setOrig(classe.getOrig());
		icms.setpCredSn(classe.getpCredSn());
		icms.setpIcmsSt(classe.getpIcmsSt());
		icms.setpMvaSt(classe.getpMvaSt());
		icms.setpRedBcSt(classe.getpRedBcSt());
		icms.setvBcSt(classe.getvBcSt());
		icms.setvCredIcmsSn(classe.getvCredIcmsSn());
		icms.setvIcmsSt(classe.getvIcmsSt());
		return icms;
	}

}
