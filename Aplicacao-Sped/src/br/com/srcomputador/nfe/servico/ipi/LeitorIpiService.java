package br.com.srcomputador.nfe.servico.ipi;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Ipi;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IpiDto;

@Service
public class LeitorIpiService {

	/**
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * */
	public Ipi lerIpi(IpiDto ipiDto) throws IllegalAccessException, InvocationTargetException {
		
		Ipi ipi = new Ipi();
		BeanUtils.copyProperties(ipi, ipiDto);
		
		if(ipiDto.getIpiNt() != null) {
			BeanUtils.copyProperties(ipi, ipiDto.getIpiNt());
			return ipi;
		}
		
		if(ipiDto.getIpiTrib() != null) {
			BeanUtils.copyProperties(ipi, ipiDto.getIpiTrib());
			return ipi;
		}
		
		return ipi;
	}
	
}
