package br.com.srcomputador.nfe.servico;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.nfe.entidade.detalheProduto.Cofins;
import br.com.srcomputador.nfe.entidade.detalheProduto.Imposto;
import br.com.srcomputador.nfe.entidade.detalheProduto.Ipi;
import br.com.srcomputador.nfe.entidade.detalheProduto.Pis;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.ImpostoDto;

@Service
public class LeitorImpostoService {

	private LeitorCofinsService leitorCofins;
	private LeitorPisService leitorPis;
	private LeitorIcmsService leitorIcms;
	private LeitorIpiService leitorIpi;
	
	@Autowired
	public LeitorImpostoService(LeitorCofinsService leitorCofins, LeitorPisService leitorPis, LeitorIcmsService leitorIcms, LeitorIpiService leitorIpi) {
		this.leitorCofins = leitorCofins;
		this.leitorPis = leitorPis;
		this.leitorIcms = leitorIcms;
		this.leitorIpi = leitorIpi;
	}
	
	/**
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * */
	public Imposto lerImposto(ImpostoDto impostoDto) throws IllegalAccessException, InvocationTargetException {
		Imposto imposto = new Imposto();
		if(impostoDto.getCofins() != null) {
			imposto.setCofins(leitorCofins.lerCofins(impostoDto.getCofins()));
		} else {
			imposto.setCofins(new Cofins());
		}
		if(impostoDto.getPis() != null) {
			imposto.setPis(leitorPis.lerPis(impostoDto.getPis()));
		} else {
			imposto.setPis(new Pis());
		}
		imposto.setIcms(leitorIcms.lerIcms(impostoDto.getIcms()));
		if(impostoDto.getIpi() != null) {
			imposto.setIpi(leitorIpi.lerIpi(impostoDto.getIpi()));
		} else {
			imposto.setIpi(new Ipi());
		}
		return imposto;
	}
		
}
