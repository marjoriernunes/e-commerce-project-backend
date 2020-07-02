package com.ecommerce.missmarge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {
	
	@GetMapping(path = "/api/listaProdutos")
	public void listaProdutos() {}
	
	@PostMapping
	public void cadastrarCarrinhoCompras() {}
	
}
