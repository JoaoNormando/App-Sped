package br.com.srcomputador.mfd.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.mfd.entidade.Registro;
import br.com.srcomputador.mfd.entidade.RegistroE01;

@Service
public class LeitorRegistroE01 {
	
	@Autowired
	private GeracaoDataHora gerador;
	
	/**
	 * @exception StringIndexOutOfBoundsException
	 * */
	public Registro lerRegistro(String texto) throws StringIndexOutOfBoundsException{
		gerador = new GeracaoDataHora();
		RegistroE01 e01 = new RegistroE01();
		e01.setTipoRegistro(texto.substring(0, 3).trim());
		e01.setNumeroFabricacao(texto.substring(3,23).trim());
		e01.setMfAdicional(texto.substring(23, 24).charAt(0));
		e01.setTipoEcf(texto.substring(24, 31).trim());
		e01.setMarca(texto.substring(31, 51).trim());
		e01.setModelo(texto.substring(51, 71).trim());
		e01.setVersaoSb(texto.substring(71, 81).trim());
		e01.setDataHoraGravacaoSb(gerador.gerarDataHora(texto.substring(81, 95)));
		e01.setNumeroEcf(Integer.parseInt(texto.substring(95, 98)));
		e01.setCnpjUsuario(texto.substring(98, 112).trim());
		e01.setComandoDeGeracao(texto.substring(112, 115).trim());
		e01.setCrzInicial(Integer.parseInt(texto.substring(115, 121)));
		e01.setCrzFinal(Integer.parseInt(texto.substring(121, 127)));
		e01.setDataInicial(gerador.gerarData(texto.substring(127, 135)));
		e01.setDataFinal(gerador.gerarData(texto.substring(135, 143)));
		e01.setVersaoBiblioteca(texto.substring(143, 151).trim());
		e01.setVersaoAtoCotepe(texto.substring(151, 166).trim());
		return e01;
	}
	
}
