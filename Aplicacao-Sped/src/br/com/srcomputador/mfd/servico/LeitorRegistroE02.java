package br.com.srcomputador.mfd.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.mfd.entidade.Registro;
import br.com.srcomputador.mfd.entidade.RegistroE02;

@Service
public class LeitorRegistroE02 implements Leitor{
	
	@Autowired
	private GeracaoDataHora gerador;
	
	@Override
	public Registro lerRegistro(String arg) throws StringIndexOutOfBoundsException{
		
		if(arg.length() < 273)
			throw new StringIndexOutOfBoundsException();
		
		RegistroE02 e02 = new RegistroE02();
		e02.setTipoRegistro(arg.substring(0, 3));
		e02.setNumeroFabricacao(arg.substring(3, 23));
		e02.setMfAdicional(arg.substring(23, 24).charAt(0));
		e02.setModelo(arg.substring(24, 44));
		e02.setCnpj(arg.substring(44, 58));
		e02.setInscricaoEstadual(arg.substring(58, 72));
		e02.setNomeContribuinte(arg.substring(72, 112));
		e02.setEndereco(arg.substring(112, 232));
		e02.setDataHoraCadastro(gerador.gerarDataHora(arg.substring(232, 246)));
		e02.setValorCro(Integer.parseInt(arg.substring(246, 252)));
		e02.setValorGt(Integer.parseInt(arg.substring(252, 270)));
		e02.setNumeroUsuario(Integer.parseInt(arg.substring(270, 272)));
		
		return e02;
	}

	
}
