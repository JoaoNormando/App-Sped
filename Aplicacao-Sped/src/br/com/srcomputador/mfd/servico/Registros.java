package br.com.srcomputador.mfd.servico;

import br.com.srcomputador.mfd.entidade.Registro;

public enum Registros implements Leitor {

	REGISTRO_E01 {
		@Override
		public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
			return new LeitorRegistroE01().lerRegistro(arg);
		}
	},

	REGISTRO_E02 {
		@Override
		public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
			return new LeitorRegistroE02().lerRegistro(arg);
		}

	},

	REGISTRO_E14 {
		@Override
		public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
			return new LeitorRegistroE14().lerRegistro(arg);
		}
	},

	REGISTRO_E15 {
		@Override
		public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
			return new LeitorRegistroE15().lerRegistro(arg);
		}
	},

	REGISTRO_E16 {
		@Override
		public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
			return new LeitorRegistroE16().lerRegistro(arg);
		}
	},

	REGISTRO_E17 {
		@Override
		public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
			return new LeitorRegistroE17().lerRegistro(arg);
		}
	},

	REGISTRO_E18 {
		@Override
		public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
			return new LeitorRegistroE18().lerRegistro(arg);
		}
	},

	REGISTRO_E19 {
		@Override
		public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
			return new LeitorRegistroE19().lerRegistro(arg);
		}
	},

	REGISTRO_E20 {
		@Override
		public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
			return new LeitorRegistroE20().lerRegistro(arg);
		}
	},

	REGISTRO_E21 {
		@Override
		public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
			return new LeitorRegistroE21().lerRegistro(arg);
		}
	};

}
