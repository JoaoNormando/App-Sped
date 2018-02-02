package br.com.srcomputador.mfd.servico;

import org.springframework.stereotype.Service;

import br.com.srcomputador.mfd.entidade.Registro;
import br.com.srcomputador.mfd.entidade.RegistroE15;

@Service
public class LeitorRegistroE15 implements Leitor{

	@Override
	public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
		
		if(arg.length() < 267) {
			throw new StringIndexOutOfBoundsException();
		}
		
		RegistroE15 e15 = new RegistroE15();
		e15.setTipoRegistro(arg.substring(0, 3));
		e15.setNumeroFabricacao(arg.substring(3, 23));
		e15.setMfAdicional(arg.substring(23, 24).charAt(0));
		e15.setModelo(arg.substring(24, 44));
		e15.setNumeroDoUsuario(Integer.parseInt(arg.substring(44, 46)));
		e15.setNumeroDoCOO(Integer.parseInt(arg.substring(46, 52)));
		e15.setNumeroDoContador(Integer.parseInt(arg.substring(52, 58)));
		e15.setNumeroDoItem(Integer.parseInt(arg.substring(58, 61)));
		e15.setCodigoDoProduto(arg.substring(61, 75));
		e15.setDescricaoProduto(arg.substring(75, 175).trim());
		e15.setQuantidadeComercializada(Integer.parseInt(arg.substring(175, 182)));
		e15.setUnidadeMedida(arg.substring(182, 185));
		e15.setValorUnitario(Integer.parseInt(arg.substring(185, 192)));
		e15.setValorDesconto(Double.parseDouble(arg.substring(192, 201)));
		e15.setValorAcrescimo(Double.parseDouble(arg.substring(201, 209)));
		e15.setValorTotalLiquido(Double.parseDouble(arg.substring(209, 224)));
		e15.setCodTotalizadorParcial(arg.substring(224, 230));
		e15.setIndicadorDeCancelamento(arg.substring(230, 231).charAt(0));
		e15.setQuantidadeCancelada(Integer.parseInt(arg.substring(231, 238)));
		e15.setValorCancelado(Double.parseDouble(arg.substring(238, 251)));
		e15.setValorCanceladoAcrescimo(Double.parseDouble(arg.substring(251, 264)));
		e15.setIndicadorDeArredondamento(arg.substring(264, 265).charAt(0));
		e15.setCasasDecimais(Integer.parseInt(arg.substring(265, 266)));
		e15.setCasasDecimaisValorUnitario(Integer.parseInt(arg.substring(266, 267)));
	
		return e15;
	}

}
