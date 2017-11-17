package br.com.srcomputador.nfe.servico.icms;

import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsDto;

@Service
public class IdentificarIcms {
	
	public TiposIcms identificar(IcmsDto icms) {
		
		if(icms.getIcms00() != null) {
			return TiposIcms.ICMS00;
		}
		
		
		return null;
	}
	
}
