package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn101Dto;

@Service
public class ConversorIcmsSn101 implements ConversorIcms<IcmsSn101Dto>{

	@Override
	public Icms converter(IcmsSn101Dto classe) {
		Icms icms = new Icms();
		icms.setcSoSn(classe.getcSoSn());
		icms.setOrig(classe.getOrig());
		icms.setpCredSn(classe.getpCredSn());
		icms.setvCredIcmsSn(classe.getvCredIcmsSn());
		return icms;
	}

}
