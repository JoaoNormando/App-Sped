package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn102Dto;

@Service
public class ConversorIcmsSn102 implements ConversorIcms<IcmsSn102Dto>{

	@Override
	public Icms converter(IcmsSn102Dto classe) {
		Icms icms = new Icms();
		icms.setOrig(classe.getOrig());
		icms.setOrig(classe.getcSoSn());
		return icms;
	}

}
