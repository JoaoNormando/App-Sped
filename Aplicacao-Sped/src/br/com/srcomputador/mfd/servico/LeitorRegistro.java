package br.com.srcomputador.mfd.servico;

import br.com.srcomputador.mfd.entidade.Registro;

public class LeitorRegistro {

	/**
	 * @exception NullPointerException
	 */
	public Registro gerarRegistro(String texto) throws NullPointerException {

		Registros registro = this.identificarRegistro(texto);

		if (registro == null) {
			throw new NullPointerException();
		}

		switch (registro) {
			case REGISTRO_E01:
				return new LeitorRegistroE01().lerRegistro(texto);
			case REGISTRO_E02:
				return new LeitorRegistroE02().lerRegistro(texto);
			case REGISTRO_E14:
				return new LeitorRegistroE14().lerRegistro(texto);
			case REGISTRO_E15:
				return new LeitorRegistroE15().lerRegistro(texto);
			case REGISTRO_E16:
				return new LeitorRegistroE16().lerRegistro(texto);
			default:
				return null;
		}

	}

	public Registros identificarRegistro(String texto) {
		String registro = texto.substring(0, 3);
		registro = registro.toUpperCase();

		switch (registro) {
		case "E01":
			return Registros.REGISTRO_E01;
		default:
			return null;
		}

	}

}
