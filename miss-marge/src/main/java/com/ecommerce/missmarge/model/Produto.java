package com.ecommerce.missmarge.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistense.Id;
import javax.persistense.Column;

@Entity(name = produto)
public class Produto {
	@Id
	private Long id;
	
	@Column(name = quantidade_estoque)
	private BigInteger quantidadeEstoque;
	
	@Column(name = nome_produto)
	private String nomeProduto;
	
	@Column(name = descricao_produto)
	private String descricaoProduto;
	
	@Column(name = valor_produto)
	private BigDecimal valorProduto;
	
	@Column(name = caminho_imagem)
	private String caminhoImagem;
	
	@Column(name = descricao_imagem)
	private String descricaoImagem;
	
	public Produto(BigInteger quantidadeEstoque, String nomeProduto, String descricaoProduto, BigDecimal valorProduto, String caminhoImagem, String descricaoImagem ) {
		this.quantidadeEstoque = quantidadeEstoque;
		this.nomeProduto = nomeProduto;
		this.descricaoProduto = descricaoProduto;
		this.valorProduto = valorProduto;
		this.caminhoImagem = caminhoImagem;
		this.descricaoImagem = descricaoImagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigInteger getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(BigInteger quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProdutoString() {
		return descricaoProdutoString;
	}

	public void setDescricaoProdutoString(String descricaoProdutoString) {
		this.descricaoProdutoString = descricaoProdutoString;
	}

	public BigDecimal getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

	public String getCaminhoImagem() {
		return caminhoImagem;
	}

	public void setCaminhoImagem(String caminhoImagem) {
		this.caminhoImagem = caminhoImagem;
	}

	public String getDescricaoImagem() {
		return descricaoImagem;
	}

	public void setDescricaoImagem(String descricaoImagem) {
		this.descricaoImagem = descricaoImagem;
	}
}
