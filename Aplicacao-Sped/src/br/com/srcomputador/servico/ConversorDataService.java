package br.com.srcomputador.servico;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class ConversorDataService {

	/**
	 * Formata para o padrao pt-br dd/MM/yyyy
	 * */
	public String transformarData(Calendar data) {
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		return fmt.format(data.getTime());
	}
	
}
