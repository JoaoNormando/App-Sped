package br.com.srcomputador.mfd.servico;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;

@Service
public class GeracaoDataHora {

	public Calendar gerarDataHora(String texto) throws StringIndexOutOfBoundsException{
		
		if(texto.length() < 14)
			throw new StringIndexOutOfBoundsException();
		
		Calendar calendar = new GregorianCalendar();
		
		int ano = Integer.parseInt(texto.substring(0, 4));
		int mes = Integer.parseInt(texto.substring(4, 6));
		int dia = Integer.parseInt(texto.substring(6, 8));

		int hora = Integer.parseInt(texto.substring(8, 10));
		int minutos = Integer.parseInt(texto.substring(10, 12));
		int segundos = Integer.parseInt(texto.substring(12, 14));
		
		calendar.set(ano, mes-1, dia, hora, minutos, segundos);
		return calendar;
	}
	
	public Calendar gerarData(String texto) throws StringIndexOutOfBoundsException{
		if(texto.length() < 8)
			throw new StringIndexOutOfBoundsException();
		
		Calendar calendar = new GregorianCalendar();
		
		int ano = Integer.parseInt(texto.substring(0, 4));
		int mes = Integer.parseInt(texto.substring(4, 6));
		int dia = Integer.parseInt(texto.substring(6, 8));
		
		calendar.set(ano, mes-1, dia);
		return calendar;
	}
	
}
