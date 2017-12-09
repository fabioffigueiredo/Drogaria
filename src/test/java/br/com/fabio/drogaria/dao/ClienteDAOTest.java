package br.com.fabio.drogaria.dao;

import java.util.Date;

import br.com.fabio.drogaria.domain.Cliente;
import br.com.fabio.drogaria.domain.Pessoa;

public class ClienteDAOTest {
  public void salvar() {
	  PessoaDAO pessoaDAO = new PessoaDAO();
	  Pessoa pessoa = pessoaDAO.buscar(1L);
	  Cliente cliente = new Cliente();
	  cliente.setDataCadastro(new Date());
	  cliente.setLiberado(true);
	  cliente.setPessoa(pessoa);
	  
	  ClienteDAO clienteDAO = new ClienteDAO();
	  clienteDAO.salvar(cliente);
	  System.out.println("Cliente salvo com sucesso");
  }
}
