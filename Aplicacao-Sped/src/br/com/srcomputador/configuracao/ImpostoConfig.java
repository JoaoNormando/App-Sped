package br.com.srcomputador.configuracao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import br.com.srcomputador.nfe.entidade.detalheProduto.Imposto;

@Component
public class ImpostoConfig {

	@Bean
	public Imposto imposto() {
		return new Imposto();
	}
	
	
}
