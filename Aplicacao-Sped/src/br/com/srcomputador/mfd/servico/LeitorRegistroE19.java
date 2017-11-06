package br.com.srcomputador.mfd.servico;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.srcomputador.mfd.entidade.Registro;
import br.com.srcomputador.mfd.entidade.RegistroE19;

public class LeitorRegistroE19 implements Leitor{

	@Autowired
	private GeracaoDataHora gerador;
	
	@Override
	public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
		gerador = new GeracaoDataHora();		
		RegistroE19 e19 = new RegistroE19();
		e19.setTipoRegistro(arg.substring(0, 3));
		e19.setNumeroFabricacao(arg.substring(3, 23));
		e19.setMfAdicional(arg.substring(23, 24).charAt(0));
		e19.setModelo(arg.substring(24, 44));
		e19.setNumeroDoUsuario(Integer.parseInt(arg.substring(44, 46)));
		e19.setNumeroDoCOO(Integer.parseInt(arg.substring(46, 52)));
		e19.setNumeroDoGNF(Integer.parseInt(arg.substring(52, 58)));
		e19.setDataInicioEmissao(gerador.gerarData(arg.substring(58, 66)));
		e19.setValorSubtotal(Double.parseDouble(arg.substring(66, 80)));
		e19.setDescontoSubtotal(Double.parseDouble(arg.substring(80, 93)));
		e19.setIndicadorTipoDesconto(arg.substring(93, 94).charAt(0));
		e19.setAcrescimoSubtotal(Double.parseDouble(arg.substring(94, 107)));
		e19.setIndicadorTipoAcrescimo(arg.substring(107, 108).charAt(0));
		e19.setValorTotalLiquido(Double.parseDouble(arg.substring(108, 122)));
		e19.setIndicadorCancelamento(arg.substring(122, 123).charAt(0));
		e19.setValorCancelamento(Double.parseDouble(arg.substring(123, 136)));
		e19.setOrdemDesconto(arg.substring(136, 137).charAt(0));
		e19.setNomeAdquirente(arg.substring(137, 177));
		e19.setCnpjCpfAdquirente(arg.substring(177, 191));
		
		return e19;
	}

}
