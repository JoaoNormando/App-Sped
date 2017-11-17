package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms60Dto;

@Service
public class ConversorIcms60 implements ConversorIcms<Icms60Dto>{

	@Override
	public Icms converter(Icms60Dto classe) {
		Icms icms = new Icms();
		icms.setCst(classe.getCst());
		icms.setOrig(classe.getOrig());
		icms.setvBcStRet(classe.getvBcStRet());
		icms.setvIcmsStRet(classe.getvIcmsStRet());
		return icms;
	}

}
