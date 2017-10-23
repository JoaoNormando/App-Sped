package br.com.srcomputador.mfd.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.mfd.entidade.Registro;
import br.com.srcomputador.mfd.entidade.RegistroE14;

@Service
public class LeitorRegistroE14 implements Leitor{

	@Autowired
	private GeracaoDataHora gerador;
	
	@Override
	public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException {
		
		if(arg.length() < 190) {
			throw new StringIndexOutOfBoundsException();
		}
		
		RegistroE14 e14 = new RegistroE14();
		e14.setTipoRegistro(arg.substring(0, 3));
		e14.setNumeroFabricacao(arg.substring(3, 23));
		e14.setMfAdicional(arg.substring(23, 24).charAt(0));
		e14.setModelo(arg.substring(23, 44));
		e14.setNumeroDoUsuario(Integer.parseInt(arg.substring(44, 46)));
		e14.setNumeroDocumentoContador(Integer.parseInt(arg.substring(46, 52)));
		e14.setNumeroDoCOO(Integer.parseInt(arg.substring(52, 58)));
		e14.setDataInicioEmissao(gerador.gerarData(arg.substring(58, 66)));
		e14.setValorTotalDoDocumento(Double.parseDouble(arg.substring(66, 80)));
		e14.setValorDoDesconto(Double.parseDouble(arg.substring(80, 93))); 
		e14.setTipoDesconto(arg.substring(93,94).charAt(0));
		e14.setValorAcrescimoPercAplicado(Double.parseDouble(arg.substring(94, 107)));
		e14.setIndicadorTipoAcrescimo(arg.substring(107, 108).charAt(0));
		e14.setValorTotalLiquido(Double.parseDouble(arg.substring(108, 122)));
		e14.setIndicadorDeCancelamento(arg.substring(122, 123).charAt(0));
		e14.setValorCancelamento(Double.parseDouble(arg.substring(123, 136)));
		e14.setOrdemAplicacaoDesconto(arg.substring(136, 137).charAt(0));
		e14.setNomeAdquirinte(arg.substring(137, 177));
		e14.setCnpjCpfAdquirente(arg.substring(177, 191));
		
		return e14;
	}

}
