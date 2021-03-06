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
	@Ignore
	public void listar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();
		
		for(Cidade cidade : resultado) {
			System.out.println("Código da Cidade:" + cidade.getCodigo());
			System.out.println("Nome da Cidade:" + cidade.getNome());
			System.out.println("Código do Estado:" + cidade.getEstado().getCodigo());
			System.out.println("Sigla do Estado:" + cidade.getEstado().getSigla());
			System.out.println("Nome do Estado:" + cidade.getEstado().getNome());
			System.out.println();
		}
	}
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo); 
		System.out.println("Código da Cidade:" + cidade.getCodigo());
		System.out.println("Nome da Cidade:" + cidade.getNome());
		System.out.println("Código do Estado:" + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado:" + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado:" + cidade.getEstado().getNome());	
	}
	@Test
	@Ignore
	public void excluir() {
		Long codigo = 1L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		cidadeDAO.excLuir(cidade);
		System.out.println("Cidade removida");
		System.out.println("Código da Cidade:" + cidade.getCodigo());
		System.out.println("Nome da Cidade:" + cidade.getNome());
		System.out.println("Código do Estado:" + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado:" + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado:" + cidade.getEstado().getNome());	
	}
	@Test
	public void editar() {
		Long codigoCidade = 2L;
		long codigoEstado = 6L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigoEstado);
		
		System.out.println("Código do Estado:" + estado.getCodigo());
		System.out.println("Sigla do Estado:" + estado.getSigla());
		System.out.println("Nome do Estado:" + estado.getNome());	
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		System.out.println("Cidade a ser editada");
		System.out.println("Código da Cidade:" + cidade.getCodigo());
		System.out.println("Nome da Cidade:" + cidade.getNome());
		System.out.println("Código do Estado:" + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado:" + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado:" + cidade.getEstado().getNome());	
		
		cidade.setNome("Nova Iguaçu");
		cidade.setEstado(estado);
		cidadeDAO.editar(cidade);
		
		System.out.println("Cidade editada");
		System.out.println("Código da Cidade:" + cidade.getCodigo());
		System.out.println("Nome da Cidade:" + cidade.getNome());
		System.out.println("Código do Estado:" + cidade.getEstado().getCodigo());
		System.out.println("Sigla do Estado:" + cidade.getEstado().getSigla());
		System.out.println("Nome do Estado:" + cidade.getEstado().getNome());	
	}
}
