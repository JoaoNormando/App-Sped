package br.com.srcomputador.mfd.servico;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.mfd.entidade.RegistroE01;

@Service
public class LeitorRegistroE01 {
	
	@Autowired
	private RegistroE01 e01;
	/**
	 * @exception StringIndexOutOfBoundsException
	 * */
	public RegistroE01 lerRegistro(String texto) throws StringIndexOutOfBoundsException{
		e01 = new RegistroE01();
		e01.setTipoRegistro(texto.substring(0, 3));
		e01.setNumeroFabricacao(texto.substring(3,22));
		e01.setMfAdicional(texto.substring(23, 24).charAt(0));
		e01.setTipoEcf(texto.substring(24, 31));
		e01.setMarca(texto.substring(31, 50));
		e01.setModelo(texto.substring(51, 70));
		e01.setVersaoSb(texto.substring(71, 80));
//		e01.setDataGravacaoSb(gerarData(texto.substring(81, 89)));
//		e01.setHoraGravacaoSb(gerarHora(texto.substring(89, 95)));
		e01.setNumeroEcf(Integer.parseInt(texto.substring(95, 98)));
		e01.setCnpjUsuario(texto.substring(98, 112));
		e01.setComandoDeGeracao(texto.substring(112, 115));
		e01.setCrzInicial(Integer.parseInt(texto.substring(115, 121)));
		e01.setCrzFinal(Integer.parseInt(texto.substring(121, 127)));
		e01.setDataInicial(gerarData(texto.substring(127, 135)));
		e01.setDataFinal(gerarData(texto.substring(135, 143)));
		e01.setVersaoBiblioteca(texto.substring(143, 151));
		e01.setVersaoAtoCotepe(texto.substring(151, 166));
		return e01;
	}
	
	private Calendar gerarData(String texto) {
		int ano = Integer.parseInt(texto.substring(0, 4));
		int mes = Integer.parseInt(texto.substring(4, 6));
		int dia = Integer.parseInt(texto.substring(6, 8));
		Calendar data = new GregorianCalendar();
		data.set(Calendar.YEAR, ano);
		data.set(Calendar.MONTH, mes);
		data.set(Calendar.DAY_OF_MONTH, dia);
		return data;
	}

	private Calendar gerarHora(String texto) {
		System.out.println(texto);
		Calendar horario = new GregorianCalendar();
		int hora = Integer.parseInt(texto.substring(0, 2));
		int minutos = Integer.parseInt(texto.substring(2, 4));
		int segundos = Integer.parseInt(texto.substring(4, 6));
		horario.set(Calendar.HOUR_OF_DAY, hora);
		horario.set(Calendar.MINUTE, minutos);
		horario.set(Calendar.SECOND, segundos);
		return horario;
	}
	
}
