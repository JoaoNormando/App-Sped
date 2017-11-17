package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsStDto;

@Service
public class ConversorIcmsSt implements ConversorIcms<IcmsStDto>{

	@Override
	public Icms converter(IcmsStDto classe) {
		Icms icms = new Icms();
		icms.setCst(classe.getCst());
		icms.setOrig(classe.getOrig());
		icms.setvBcStDest(classe.getvBcStDest());
		icms.setvBcStRet(classe.getvBcStRet());
		icms.setvIcmsStDest(classe.getvIcmsStDest());
		icms.setvIcmsStRet(classe.getvIcmsStRet());
		return icms;
	}

}
