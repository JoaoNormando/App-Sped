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
		gerador = new GeracaoDataHora();
		RegistroE02 e02 = new RegistroE02();
		e02.setTipoRegistro(arg.substring(0, 3).trim());
		e02.setNumeroFabricacao(arg.substring(3, 23).trim());
		e02.setMfAdicional(arg.substring(23, 24).charAt(0));
		e02.setModelo(arg.substring(24, 44).trim());
		e02.setCnpj(arg.substring(44, 58).trim());
		e02.setInscricaoEstadual(arg.substring(58, 72).trim());
		e02.setNomeContribuinte(arg.substring(72, 112).trim());
		e02.setEndereco(arg.substring(112, 232).trim());
		e02.setDataHoraCadastro(gerador.gerarDataHora(arg.substring(232, 246)));
		e02.setValorCro(Integer.parseInt(arg.substring(246, 252)));
		e02.setValorGt(Integer.parseInt(arg.substring(252, 270)));
		e02.setNumeroUsuario(Integer.parseInt(arg.substring(270, 272)));
		
		return e02;
	}

	
}
