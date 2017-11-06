package br.com.srcomputador.mfd.servico;

import br.com.srcomputador.mfd.entidade.Registro;
import br.com.srcomputador.mfd.entidade.RegistroE18;

public class LeitorRegistroE18 implements Leitor{

	@Override
	public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
		
		if(arg.length() < 80) {
			throw new StringIndexOutOfBoundsException();
		}
		
		RegistroE18 e18 = new RegistroE18();
		e18.setTipoRegistro(arg.substring(0, 3));
		e18.setNumeroFabricacao(arg.substring(3, 23));
		e18.setMfAdicional(arg.substring(23, 24).charAt(0));
		e18.setModelo(arg.substring(24, 44));
		e18.setNumeroDoUsuario(Integer.parseInt(arg.substring(44, 46)));
		e18.setNumeroDoCRZ(Integer.parseInt(arg.substring(46, 52)));
		e18.setDescricaoTotalizador(arg.substring(52, 67));
		e18.setValorAcumulado(Double.parseDouble(arg.substring(67, 80)));
		
		return e18;
	}

}
