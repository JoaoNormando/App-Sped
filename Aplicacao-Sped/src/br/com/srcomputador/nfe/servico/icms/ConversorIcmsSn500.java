package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn500Dto;

@Service
public class ConversorIcmsSn500 implements ConversorIcms<IcmsSn500Dto>{

	@Override
	public Icms converter(IcmsSn500Dto classe) {
		Icms icms = new Icms();
		icms.setcSoSn(classe.getcSoSn());
		icms.setOrig(classe.getOrig());
		icms.setvBcStRet(classe.getvBcStRet());
		icms.setvIcmsStRet(classe.getvIcmsStRet());
		return icms;
	}

}
