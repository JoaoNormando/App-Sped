package br.com.srcomputador.servico;

import org.springframework.stereotype.Service;

import br.com.srcomputador.cliente.rest.ClienteEnderecoRestDto;
import br.com.srcomputador.rest.ClienteCnpjRequest;
import br.com.srcomputador.rest.CnpjRequest;

@Service
public class ConversaoCnpjRequestParaCliente {

	public ClienteCnpjRequest converter(CnpjRequest cr) {
		ClienteCnpjRequest cliente = popularCliente(cr);
		cliente.setEndereco(this.popularEndereco(cr));
		return cliente;
		
	}

	private ClienteEnderecoRestDto popularEndereco(CnpjRequest cr) {
		ClienteEnderecoRestDto endereco = new ClienteEnderecoRestDto();
		endereco.setBairro(cr.getBairro());
		endereco.setCep(cr.getCep());
		endereco.setComplemento(cr.getComplemento());
		endereco.setEstado(cr.getUf());
		endereco.setLogradouro(cr.getLogradouro());
		endereco.setMunicipio(cr.getMunicipio());
		endereco.setNumero(cr.getNumero());
		return endereco;
	}
	
	private ClienteCnpjRequest popularCliente(CnpjRequest cr) {
		ClienteCnpjRequest cliente = new ClienteCnpjRequest();
		cliente.setCnpj(cr.getCnpj());
		cliente.setEmail(cr.getEmail());
		cliente.setNomeFantasia(cr.getFantasia());
		cliente.setRazaoSocial(cr.getNome());
		cliente.setTelefone(cr.getTelefone());
		return cliente;
	}
	
}
