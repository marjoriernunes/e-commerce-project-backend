package com.ecommerce.missmarge.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.missmarge.model.Produto;
import com.ecommerce.missmarge.repository.ProdutoRepository;

public class CadastroCarrinhoCompras {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public void salvarProdutosComprados(Produto produto){
		produtoRepository.saveAndFlush(produto);
	}
}
