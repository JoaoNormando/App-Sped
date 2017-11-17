package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms20Dto;

@Service
public class ConversorIcms20 implements ConversorIcms<Icms20Dto>{

	@Override
	public Icms converter(Icms20Dto classe) {
		Icms icms = new Icms();
		icms.setCst(classe.getCst());
		icms.setModBc(classe.getModBc());
		icms.setMotDesIcms(classe.getMotDesIcms());
		icms.setOrig(classe.getOrig());
		icms.setpIcms(classe.getpIcms());
		icms.setpRedBc(classe.getpRedBc());
		icms.setvBc(classe.getvBc());
		icms.setvIcms(classe.getvIcms());
		icms.setvIcmsDeson(classe.getvIcmsDeson());
		return icms;
	}

}
