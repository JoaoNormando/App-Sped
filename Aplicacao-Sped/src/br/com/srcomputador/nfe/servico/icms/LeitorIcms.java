package br.com.srcomputador.nfe.servico.icms;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsDto;

public class LeitorIcms {

	public Icms lerIcms(IcmsDto icmsDto) throws IllegalAccessException, InvocationTargetException {
		Icms icms = new Icms();

		if (icmsDto.getIcms00() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcms00());
			return icms;
		}

		if (icmsDto.getIcms10() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcms10());
			return icms;
		}

		if (icmsDto.getIcms20() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcms20());
			return icms;
		}

		if (icmsDto.getIcms30() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcms30());
			return icms;
		}

		if (icmsDto.getIcms40() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcms40());
			return icms;
		}

		if (icmsDto.getIcms51() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcms51());
			return icms;
		}

		if (icmsDto.getIcms60() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcms60());
			return icms;
		}

		if (icmsDto.getIcms70() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcms70());
			return icms;
		}

		if (icmsDto.getIcms90() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcms90());
			return icms;
		}

		if (icmsDto.getIcmsPart() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcmsPart());
			return icms;
		}

		if (icmsDto.getIcmsSn101() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcmsSn101());
			return icms;
		}
		
		if (icmsDto.getIcmsSn102() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcmsSn102());
			return icms;
		}
		
		if (icmsDto.getIcmsSn201() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcmsSn201());
			return icms;
		}
		
		if (icmsDto.getIcmsSn202() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcmsSn202());
			return icms;
		}
		
		if (icmsDto.getIcmsSn500() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcmsSn500());
			return icms;
		}
		
		if (icmsDto.getIcmsSn900() != null) {
			BeanUtils.copyProperties(icms, icmsDto.getIcmsSn900());
			return icms;
		}
		
		return null;
	}

}
