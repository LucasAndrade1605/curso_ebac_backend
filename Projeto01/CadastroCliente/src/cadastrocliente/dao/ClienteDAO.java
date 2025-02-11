package cadastrocliente.dao;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import cadastrocliente.Model.Cliente;

public class ClienteDAO implements IClienteDAO{
	
	private Map<Long, Cliente> clientes;

	public ClienteDAO() {
		this.clientes = new TreeMap<>();
	}

	@Override
	public Boolean cadastrar(Cliente cliente) {
		
		if(this.clientes.containsKey(cliente.getCpf())) return false;
		
		this.clientes.put(cliente.getCpf(),cliente);
		return true;
	}

	@Override
	public Boolean excluir(Long cpf) {
		
		if(!this.clientes.containsKey(cpf)) {
			return false;
		}
		
		this.clientes.remove(cpf);
		
		return true;
	}

	@Override
	public Boolean alterar(Cliente cliente) {
		
		if(!this.clientes.containsKey(cliente.getCpf())) {
			return false;
		}
		
		Cliente clienteTemp = this.clientes.get(cliente.getCpf());
		
		clienteTemp.setNome(cliente.getNome());
		clienteTemp.setCpf(cliente.getCpf());
		clienteTemp.setTel(cliente.getTel());
		clienteTemp.setEndereco(cliente.getEndereco());
		clienteTemp.setNumeroEndereco(cliente.getNumeroEndereco());
		clienteTemp.setCidade(cliente.getCidade());
		clienteTemp.setEstado(cliente.getEstado());
		
		this.clientes.put(cliente.getCpf(), clienteTemp);
		
		return true;
	}

	@Override
	public Cliente consultar(Long cpf) {
		
		if(!this.clientes.containsKey(cpf)) {
			return null;
		}
		
		return this.clientes.get(cpf);
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		return this.clientes.values();
	}

}
