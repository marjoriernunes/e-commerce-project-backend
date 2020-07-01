package com.ecommerce.missmarge.api.entities;

import javax.persistense.Id;
import javax.persistense.Column;

public class Produto {
    @Id
    private Long id;

    @Column(name = "quantidade_estoque")
    private Int quantidadeEstoque;

    @Column(name = "nome_produto")
    private String nomeDoProduto;

    @Column(name = "descricao_produto")
    private String descricaoProduto;

    @Column(name = "valor_produto")
    private DecimalFormat valorProduto;

    @Column(name = "caminho_imagem")
    private String pathImagem;

    @Column(name = "descricao_imagem")
    private String descricaoImagem;

    public Produto(Int id,
                   Int quantidadeEstoque,
                   String nomeDoProduto,
                   String descricaoProduto,
                   DecimalFormat valorProduto,
                   String pathImagem,
                   String descricaoImagem)

    public Int getId() {
        return id;
    }

    public void setId(Int id) {
        this.id = id;
    }

    public Int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public DecimalFormat getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(DecimalFormat valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getPathImagem() {
        return pathImagem;
    }

    public void setPathImagem(String pathImagem) {
        this.pathImagem = pathImagem;
    }

    public String getDescricaoImagem() {
        return descricaoImagem;
    }

    public void setDescricaoImagem(String descricaoImagem) {
        this.descricaoImagem = descricaoImagem;
    }
}