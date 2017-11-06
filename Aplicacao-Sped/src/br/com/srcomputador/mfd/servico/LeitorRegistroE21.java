package br.com.srcomputador.mfd.servico;

import br.com.srcomputador.mfd.entidade.Registro;
import br.com.srcomputador.mfd.entidade.RegistroE21;

public class LeitorRegistroE21 implements Leitor{

	@Override
	public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
		RegistroE21 e21 = new RegistroE21();
		
		e21.setTipoRegistro(arg.substring(0, 3));
		e21.setNumeroFabricacao(arg.substring(3, 23));
		e21.setMfAdicional(arg.substring(23, 24).charAt(0));
		e21.setModelo(arg.substring(24, 44));
		e21.setNumeroDoUsuario(Integer.parseInt(arg.substring(44, 46)));
		e21.setNumeroDoCOO(Integer.parseInt(arg.substring(46, 52)));
		e21.setNumeroDoCCF(Integer.parseInt(arg.substring(52, 58)));
		e21.setNumeroDoGNF(Integer.parseInt(arg.substring(58, 64)));
		e21.setDescricaoMeioPagamento(arg.substring(64, 79));
		e21.setValorPago(Double.parseDouble(arg.substring(79, 92)));
		e21.setIndicadorEstorno(arg.substring(92, 93).charAt(0));
		e21.setValorEstornado(Double.parseDouble(arg.substring(93, 106)));
		
		return e21;
	}

}
