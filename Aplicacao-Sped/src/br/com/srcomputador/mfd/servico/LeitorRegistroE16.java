package br.com.srcomputador.mfd.servico;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.srcomputador.mfd.entidade.Registro;
import br.com.srcomputador.mfd.entidade.RegistroE16;

public class LeitorRegistroE16 implements Leitor{

	@Autowired
	private GeracaoDataHora gerador;
	
	@Override
	public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
		gerador = new GeracaoDataHora();
		RegistroE16 e16 = new RegistroE16();
		e16.setTipoRegistro(arg.substring(0, 3));
		e16.setNumeroFabricacao(arg.substring(3, 23));
		e16.setMfAdicional(arg.substring(23, 24).charAt(0));
		e16.setModelo(arg.substring(24, 44));
		e16.setNumeroDoUsuario(Integer.parseInt(arg.substring(44, 46)));
		e16.setNumeroDoCOO(Integer.parseInt(arg.substring(46, 52)));
		e16.setNumeroDoGNF(Integer.parseInt(arg.substring(52, 58)));
		e16.setNumeroDoGRG(Integer.parseInt(arg.substring(58, 64)));
		e16.setNumeroDoCDC(Integer.parseInt(arg.substring(64, 68)));
		e16.setNumeroDoCRZ(Integer.parseInt(arg.substring(68, 74)));
		e16.setDenominacaoDocFiscal(arg.substring(74, 76));
		e16.setDataHoraFinalEmissao(gerador.gerarDataHora(arg.substring(76, 90)));
		
		return e16;	
	}

}
