package br.com.fabio.drogaria.dao;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.fabio.drogaria.domain.Fabricante;
import br.com.fabio.drogaria.domain.Produto;

public class ProdutoDAOTest {
	@Test
	public void salvar() {
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(3L);
		Produto produto = new Produto();
		produto.setDescricao("Cataflan 50 mg com 20 comprimidos");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("13.70"));
		produto.setQuantidade(new Short("7"));
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);
		System.out.println("Produto Salvo com sucesso");
	}
	
}
