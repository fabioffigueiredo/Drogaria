package br.com.fabio.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;


import br.com.fabio.drogaria.domain.Estado;

public class EstadoDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("Minas Gerais");
		estado.setSigla("MG");
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
	}
	@Test
	@Ignore
	public void listar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();
		
		System.out.println("Total de registros Encontrados: " + resultado.size());
		
		for (Estado estado : resultado) {
			System.out.println(estado.getCodigo()+" - "+ estado.getSigla() + " - "+ estado.getNome());
		}
	}
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		if(estado == null) {
			System.out.println("Nenhum registro encontrado");
		}else {
			System.out.println("Registro encontrado: ");
			System.out.println(estado.getCodigo()+" - "+ estado.getSigla() + " - "+ estado.getNome());
		}
		}
	@Test
	public void excluir() {
		Long codigo = 5L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		if(estado == null) {
			System.out.println("Nenhum registro encontrado");
		}else {
			estadoDAO.excLuir(estado);
			System.out.println("Registro removido: ");
			System.out.println(estado.getCodigo()+" - "+ estado.getSigla() + " - "+ estado.getNome());
		}
		
	}
}
