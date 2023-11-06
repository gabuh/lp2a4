package org.example.model;

import org.example.model.builder.EstoqueBuilder;
import org.example.model.builder.ProdutoBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class EstoqueTest {
    private Produto produto1, produto2, produtoDiferente;


    @Before
    public void instanciarProdutos(){
        this.produto1 = new ProdutoBuilder()
                .setNome("Arroz")
                .setEstoqueMinimo(5)
                .setEstoqueMaximo(10)
                .create();
        this.produto2 = new ProdutoBuilder()
                .setNome("Arroz")
                .setEstoqueMinimo(5)
                .setEstoqueMaximo(10)
                .create();
        this.produtoDiferente = new ProdutoBuilder()
                .setNome("Feijão")
                .setEstoqueMinimo(6)
                .setEstoqueMaximo(15)
                .create();
    }

    @Test
    public void naoDeveAceitarProdutosComMesmoNome(){
            Estoque estoque = new EstoqueBuilder()
                    .setLoja("Lojao Ninja")
                    .armazena(produto1)
                    .armazena(produto2)
                    .armazena(produtoDiferente)
                    .create();


            assertEquals(2, estoque.getProdutos().size());

    }




}