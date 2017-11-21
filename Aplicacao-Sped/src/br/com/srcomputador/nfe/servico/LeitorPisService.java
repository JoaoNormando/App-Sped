package br.com.srcomputador.nfe.servico;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Pis;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.PisDto;

@Service
public class LeitorPisService {

	/**
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * */
	public Pis lerPis(PisDto pisDto) throws IllegalAccessException, InvocationTargetException {
		Pis pis = new Pis();
		
		if(pisDto.getPisAliq() != null) {
			BeanUtils.copyProperties(pis, pisDto.getPisAliq());
			return pis;
		}
		
		if(pisDto.getPisNt() != null) {
			BeanUtils.copyProperties(pis, pisDto.getPisNt());
			return pis;
		}
		
		if(pisDto.getPisOutr() != null) {
			BeanUtils.copyProperties(pis, pisDto.getPisOutr());
			return pis;
		}
		
		if(pisDto.getPisQtde() != null) {
			BeanUtils.copyProperties(pis, pisDto.getPisQtde());
			return pis;
		}
		
		if(pisDto.getPisSt() != null) {
			BeanUtils.copyProperties(pis, pisDto.getPisSt());
			return pis;
		}
		
		return null;
	}
	
}
