package br.com.srcomputador.mfd.servico;

import br.com.srcomputador.mfd.entidade.Registro;
import br.com.srcomputador.mfd.entidade.RegistroE20;

public class LeitorRegistroE20 implements Leitor{

	@Override
	public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {

		RegistroE20 e20 = new RegistroE20();
		e20.setTipoRegistro(arg.substring(0, 3));
		e20.setNumeroFabricacao(arg.substring(3, 23));
		e20.setMfAdicional(arg.substring(23, 24).charAt(0));
		e20.setModelo(arg.substring(24, 44));
		e20.setNumeroDoUsuario(Integer.parseInt(arg.substring(44, 46)));
		e20.setNumeroDoCOO(Integer.parseInt(arg.substring(46, 52)));
		e20.setNumeroDoGNF(Integer.parseInt(arg.substring(52, 58)));
		e20.setNumeroDoItem(Integer.parseInt(arg.substring(58, 61)));
		e20.setDenominacaoOperacao(arg.substring(61, 76));
		e20.setValorOperacao(Double.parseDouble(arg.substring(76, 89)));
		e20.setDescontoSobreItem(Double.parseDouble(arg.substring(89, 102)));
		e20.setAcrescimoSobreItem(Double.parseDouble(arg.substring(102, 115)));
		e20.setValorTotalLiquido(Double.parseDouble(arg.substring(115, 128)));
		e20.setIndicadorCancelamento(arg.substring(128, 129).charAt(0));
		e20.setCancelamentoAcrescimoItem(Integer.parseInt(arg.substring(129, 142)));
		
		return e20;
	}

}
