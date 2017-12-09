package br.com.fabio.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import br.com.fabio.drogaria.domain.Cliente;
import br.com.fabio.drogaria.domain.Pessoa;

public class ClienteDAOTest {
  @Test
	public void salvar() throws ParseException {
	  PessoaDAO pessoaDAO = new PessoaDAO();
	  Pessoa pessoa = pessoaDAO.buscar(2L);
	  Cliente cliente = new Cliente();
	  cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2017"));
	  cliente.setLiberado(true);
	  cliente.setPessoa(pessoa);
	  
	  ClienteDAO clienteDAO = new ClienteDAO();
	  clienteDAO.salvar(cliente);
	  System.out.println("Cliente salvo com sucesso");
  }
}
