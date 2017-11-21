package br.com.srcomputador.nfe.servico;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Imposto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.ImpostoDto;

@Service
public class LeitorImpostoService {

	private LeitorCofinsService leitorCofins;
	private LeitorPisService leitorPis;
	
	@Autowired
	public LeitorImpostoService(LeitorCofinsService leitorCofins, LeitorPisService leitorPis) {
		this.leitorCofins = leitorCofins;
		this.leitorPis = leitorPis;
	}
	
	/**
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * */
	public Imposto lerImposto(ImpostoDto impostoDto) throws IllegalAccessException, InvocationTargetException {
		Imposto imposto = new Imposto();
		imposto.setCofins(leitorCofins.lerCofins(impostoDto.getCofins()));
		imposto.setPis(leitorPis.lerPis(impostoDto.getPis()));
		return imposto;
	}
		
}
