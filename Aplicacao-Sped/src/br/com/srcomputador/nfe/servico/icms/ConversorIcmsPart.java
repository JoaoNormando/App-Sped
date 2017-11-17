package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsPartDto;

@Service
public class ConversorIcmsPart implements ConversorIcms<IcmsPartDto>{

	@Override
	public Icms converter(IcmsPartDto classe) {
		Icms icms = new Icms();
		icms.setCst(classe.getCst());
		icms.setModBc(classe.getModBc());
		icms.setModBcSt(classe.getModBcSt());
		icms.setOrig(classe.getOrig());
		icms.setpBcOp(classe.getpBcOp());
		icms.setpIcms(classe.getpIcms());
		icms.setpIcmsSt(classe.getpIcmsSt());
		icms.setpMvaSt(classe.getpMvaSt());
		icms.setpRedBc(classe.getpRedBc());
		icms.setpRedBcSt(classe.getpRedBcSt());
		icms.setUfSt(classe.getUfSt());
		icms.setvBc(classe.getvBc());
		icms.setvBcSt(classe.getvBcSt());
		icms.setvIcms(classe.getvIcms());
		icms.setvIcmsSt(classe.getvIcmsSt());
		return icms;
	}

}
