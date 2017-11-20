package br.com.srcomputador.nfe.servico.cofins;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Cofins;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.CofinsDto;

@Service
public class LeitorCofinsDtoService {

	/**
	 * Retorna um objeto cofins totalmente populado, pronto para ser persistido no banco
	 * @param cofinsDto
	 * @return 
	 * <b>Cofins</b> -> Objeto para ser persistido no banco
	 * <br/>
	 * <b>Null</b> -> Caso não consiga indentificar o objeto e fazer o copy dos dados, então retornará nullo.
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * */
	public Cofins lerCofins(CofinsDto cofinsDto) throws IllegalAccessException, InvocationTargetException {
		
		Cofins cofins = new Cofins();
		
		if(cofinsDto.getCofinsAliq() != null) {
			BeanUtils.copyProperties(cofins, cofinsDto.getCofinsAliq());
			return cofins;
		}
		
		if(cofinsDto.getCofinsNt() != null) {
			BeanUtils.copyProperties(cofins, cofinsDto.getCofinsNt());
			return cofins;
		}
		
		if(cofinsDto.getCofinsOutr() != null) {
			BeanUtils.copyProperties(cofins, cofinsDto.getCofinsOutr());
			return cofins;
		}
		
		if(cofinsDto.getCofinsQtde() != null) {
			BeanUtils.copyProperties(cofins, cofinsDto.getCofinsQtde());
			return cofins;
		}
		
		if(cofinsDto.getCofinsSt() != null) {
			BeanUtils.copyProperties(cofins, cofinsDto.getCofinsSt());
			return cofins;
		}
		
		return null;
		
	}
	
}
