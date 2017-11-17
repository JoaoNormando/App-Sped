package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms51Dto;

@Service
public class ConversorIcms51 implements ConversorIcms<Icms51Dto>{

	@Override
	public Icms converter(Icms51Dto classe) {
		Icms icms = new Icms();
		icms.setCst(classe.getCst());
		icms.setModBc(classe.getModBc());
		icms.setOrig(classe.getOrig());
		icms.setpDif(classe.getpDif());
		icms.setpIcms(classe.getpIcms());
		icms.setpRedBc(classe.getpRedBc());
		icms.setvBc(classe.getvBc());
		icms.setvIcms(classe.getvIcms());
		icms.setvIcmsDif(classe.getvIcmsDif());
		icms.setvIcmsOp(classe.getvIcmsOp());
		return icms;
	}

}
