package br.com.fabio.drogaria.dao;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import br.com.fabio.drogaria.domain.Cidade;
import br.com.fabio.drogaria.domain.Estado;

public class CidadeDAOTest {
	@Test
	@Ignore
	public void salvar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(2L);
		Cidade cidade = new Cidade();
		cidade.setNome("Niteroi");
		cidade.setEstado(estado);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);
	}
	@Test
	public void listar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();
	}
}
