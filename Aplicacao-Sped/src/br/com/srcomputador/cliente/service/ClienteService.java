package br.com.srcomputador.cliente.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.srcomputador.cliente.entidade.Cliente;
import br.com.srcomputador.cliente.entidade.Endereco;
import br.com.srcomputador.cliente.persistencia.ClienteDao;
import br.com.srcomputador.cliente.rest.AtualizacaoRestDto;
import br.com.srcomputador.cliente.rest.ClienteEnderecoRestDto;
import br.com.srcomputador.cliente.rest.GetClienteRestDto;
import br.com.srcomputador.cliente.rest.PostClienteRestDto;

@Service
public class ClienteService {

	private ClienteDao dao;
	
	@Autowired
	public ClienteService (ClienteDao dao) {
		this.dao = dao;
	}
	
	public List<GetClienteRestDto> listar() throws IllegalAccessException, InvocationTargetException {
		List<Cliente> lista = this.dao.listar();
		List<GetClienteRestDto> listaRest = new ArrayList<>();
		for(Cliente c : lista) {
			GetClienteRestDto cliente = new GetClienteRestDto();
			ClienteEnderecoRestDto endereco = new ClienteEnderecoRestDto();
			BeanUtils.copyProperties(endereco, c.getEndereco());
			parse(c, cliente, endereco);
			listaRest.add(cliente);
		}
		return listaRest;
	}

	private void parse(Cliente c, GetClienteRestDto cliente, ClienteEnderecoRestDto endereco) {
		cliente.setId(c.getId());
		cliente.setCnpj(c.getCnpj());
		cliente.setNomeFantasia(c.getNomeFantasia());
		cliente.setRazaoSocial(c.getRazaoSocial());
		cliente.setEndereco(endereco);
	}
	
	public GetClienteRestDto recuperarClienteRestPeloId(Long id) throws IllegalAccessException, InvocationTargetException {
		Cliente cliente = this.dao.buscarPeloId(id);
		
		if(cliente == null) {
			return null;
		}
		
		GetClienteRestDto clienteRequest = new GetClienteRestDto();
		ClienteEnderecoRestDto endereco = new ClienteEnderecoRestDto();
		BeanUtils.copyProperties(endereco, cliente.getEndereco());
		this.parse(cliente, clienteRequest, endereco);
		
		return clienteRequest;
	}
	
	public Cliente salvar(PostClienteRestDto post) throws IllegalAccessException, InvocationTargetException {
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		BeanUtils.copyProperties(endereco, post.getEndereco());
		cliente.setCnpj(post.getCnpj());
		cliente.setNomeFantasia(post.getNomeFantasia());
		cliente.setRazaoSocial(post.getRazaoSocial());
		cliente.setEndereco(endereco);
		return dao.salvar(cliente);
	}
	
	public void atualizarCliente(Long id, AtualizacaoRestDto put) {
		Cliente cliente = this.dao.buscarPeloId(id);
		Endereco endereco = new Endereco();
		try {
			BeanUtils.copyProperties(endereco, put.getEndereco());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		cliente.setNomeFantasia(put.getNomeFantasia());
		cliente.setRazaoSocial(put.getRazaoSocial());
		cliente.setEndereco(endereco);
		this.dao.salvar(cliente);
	}
	
	public void excluirPeloId(Long id) {
		this.dao.removerPeloId(id);
	}
	
	public Cliente recuperarPeloId(Long id) {
		return this.dao.buscarPeloId(id);
	}
}
