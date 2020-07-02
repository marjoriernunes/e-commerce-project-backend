package com.ecommerce.missmarge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.missmarge.repository.ProdutoRepository;

@RestController
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping(path = "/api/lista-produtos")
	public void listaProdutos() {}
	
//	@GetMapping(path = "/api/historico-compras/{}")
//	public void historicoCompras(
//			@PathVariable(name = "id", required = true) Long idUsuario) {
//		return ResponseEntity.ok(body);
//	}
	
	@PostMapping(path = "/api/cadastrar-carrinho-compras/produtos")
	public void cadastrarCarrinhoCompras() {}
	
}
