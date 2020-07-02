package com.ecommerce.missmarge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.missmarge.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
