package br.com.srcomputador.nfe.servico.icms;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.srcomputador.nfe.entidade.detalheProduto.Icms;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms00Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms10Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms20Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms30Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms40Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms51Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms60Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms70Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.Icms90Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsPartDto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn101Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn102Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn201Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn202Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn500Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsSn900Dto;
import br.com.srcomputador.nfe.entidade.detalheProduto.dto.IcmsStDto;

@SuppressWarnings("rawtypes")
public enum TiposIcms implements ConversorIcms {

	ICMS00 {

		@Autowired
		private ConversorIcms00 conversor;

		@Override
		public Icms converter(Object classe) {
			return conversor.converter((Icms00Dto) classe);
		}
	}, ICMS10 {
		
		@Autowired
		private ConversorIcms10 conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((Icms10Dto) classe);
		}
		
	}, ICMS20 {
		@Autowired
		private ConversorIcms20 conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((Icms20Dto) classe);
		}
		
	}, ICMS30 {

		@Autowired
		private ConversorIcms30 conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((Icms30Dto) classe);
		}
		
	}, ICMS40 {

		@Autowired
		private ConversorIcms40 conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((Icms40Dto) classe);
		}
		
	}, ICMS51 {

		@Autowired
		private ConversorIcms51 conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((Icms51Dto) classe);
		}
		
	}, ICMS60 {
		
		@Autowired
		private ConversorIcms60 conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((Icms60Dto) classe);
		}
		
	}, ICMS70 {
		
		@Autowired
		private ConversorIcms70 conversor;

		@Override
		public Icms converter(Object classe) {
			return conversor.converter((Icms70Dto) classe);
		}
		
	}, ICMS90 {
		
		@Autowired
		private ConversorIcms90 conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((Icms90Dto) classe);
		}
		
	}, ICMS_PART {

		@Autowired
		private ConversorIcmsPart conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((IcmsPartDto) classe);
		}
		
	}, ICMS_ST {

		@Autowired
		private ConversorIcmsSt conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((IcmsStDto) classe);
		}
		
	}, ICMS_SN101 {

		@Autowired
		private ConversorIcmsSn101 conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((IcmsSn101Dto) classe);
		}
		
	}, ICMS_SN102 {
		
		@Autowired
		private ConversorIcmsSn102 conversor;

		@Override
		public Icms converter(Object classe) {
			return conversor.converter((IcmsSn102Dto) classe);
		}
		
	}, ICMS_SN201 {
		
		@Autowired
		private ConversorIcmsSn201 conversor;

		@Override
		public Icms converter(Object classe) {
			return conversor.converter((IcmsSn201Dto) classe);
		}
		
	}, ICMS_SN202 {
		
		@Autowired
		private ConversorIcmsSn202 conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((IcmsSn202Dto) classe);
		}
		
	}, ICMS_SN500 {

		@Autowired
		private ConversorIcmsSn500 conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((IcmsSn500Dto) classe);
		}
		
	}, ICMS_SN900 {

		@Autowired
		private ConversorIcmsSn900 conversor;
		
		@Override
		public Icms converter(Object classe) {
			return conversor.converter((IcmsSn900Dto) classe);
		}
		
	};

}
