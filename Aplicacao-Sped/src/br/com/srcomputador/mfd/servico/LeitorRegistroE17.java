package br.com.srcomputador.mfd.servico;

import br.com.srcomputador.mfd.entidade.Registro;
import br.com.srcomputador.mfd.entidade.RegistroE17;

public class LeitorRegistroE17 implements Leitor{

	@Override
	public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
		
		RegistroE17 e17 = new RegistroE17();
		e17.setTipoRegistro(arg.substring(0, 3));
		e17.setNumeroFabricacao(arg.substring(3, 23));
		e17.setMfAdicional(arg.substring(23, 24).charAt(0));
		e17.setModelo(arg.substring(23, 44));
		e17.setNumeroDoUsuario(Integer.parseInt(arg.substring(44, 46)));
		e17.setNumeroDoCRZ(Integer.parseInt(arg.substring(46, 52)));
		e17.setDescTotalizadorNaoFiscal(arg.substring(52, 67));
		e17.setValorAcumulado(Double.parseDouble(arg.substring(67, 80)));
		
		return e17;
	}

}
