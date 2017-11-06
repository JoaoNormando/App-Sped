package br.com.srcomputador.mfd.servico;

import org.springframework.stereotype.Service;

import br.com.srcomputador.mfd.entidade.Registro;

@Service
public class LeitorRegistro {

	/**
	 * @exception NullPointerException
	 */
	public Registro gerarRegistro(String texto) throws NullPointerException, StringIndexOutOfBoundsException {
		Registros registro = this.identificarRegistro(texto);
		return registro.lerRegistro(texto);
	}

	public Registros identificarRegistro(String texto) {
		String registro = texto.substring(0, 3);
		registro = registro.toUpperCase();
		
		switch (registro) {
		case "E01":
			return Registros.REGISTRO_E01;
		case "E02":
			return Registros.REGISTRO_E02;
		case "E14":
			return Registros.REGISTRO_E14;
		case "E15":
			return Registros.REGISTRO_E15;
		case "E16":
			return Registros.REGISTRO_E16;
		case "E17":
			return Registros.REGISTRO_E17;
		case "E18":
			return Registros.REGISTRO_E18;
		case "E19":
			return Registros.REGISTRO_E19;
		case "E20":
			return Registros.REGISTRO_E20;
		case "E21":
			return Registros.REGISTRO_E21;
		default:
			return null;
		}

	}

}
