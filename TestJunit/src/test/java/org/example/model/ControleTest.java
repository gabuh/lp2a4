package org.example.model;


import org.example.model.builder.EstoqueBuilder;
import org.example.model.builder.ProdutoBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ControleTest {
    private Produto produto1, produto2;

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
    }


    @Test
    public void deveRetornarProdutosComEstoqueInsuficiente(){
        Controle controle = new Controle();
        this.produto1.setQuantidade(2); //Estoque minimo é 5 e máximo 10
        controle.controlaEstoque(new EstoqueBuilder()
                .setLoja("Lojão do bras")
                .armazena(produto1)
                .create()
        );
        assertEquals(1,controle.produtosComEstoqueInsuficiente.size());
    }

    @Test
    public void deveRetornarProdutosComEstoqueExcedente(){
        Controle controle = new Controle();
        this.produto1.setQuantidade(15); //Estoque minimo é 5 e máximo 10
        controle.controlaEstoque(new EstoqueBuilder()
                .setLoja("Lojão do bras")
                .armazena(produto1)
                .create()
        );
        assertEquals(1,controle.produtosComEstoqueExcedente.size());
    }

    @Test
    public void deveRetornarProdutosComEstoqueZerado(){
        Controle controle = new Controle();
//        this.produto1.setQuantidade(15); //Estoque minimo é 5 e máximo 10
        controle.controlaEstoque(new EstoqueBuilder()
                .setLoja("Lojão do bras")
                .armazena(produto1)
                .create()
        );
        System.out.println(produto1.getQuantidade()); // quantidade = 0.0
        assertEquals(1,controle.produtosComEstoqueZerado.size());
    }

    @Test
    public void deveRetornarProdutosComEstoqueAdequado() {
        Controle controle = new Controle();
        this.produto1.setQuantidade(10); //Estoque minimo é 5 e máximo 10
        controle.controlaEstoque(new EstoqueBuilder()
                .setLoja("Lojão do bras")
                .armazena(produto1)
                .create()
        );
        assertEquals(1,controle.produtosComEstoqueAdequado.size());
    }


    @Test
    public void deveRetornarTodasListasVaziasParaEstoqueSemProdutos(){

    }

    @Test
    public void deveRetornarListaVaziaParaEstoqueQueNaoContemProdutosComEstoqueZerado(){
        Estoque estoque = new Estoque("Lojao");
        Controle controle = new Controle();
        assertEquals(true, estoque.getProdutos().isEmpty());

    }



    @Test(expected = IllegalArgumentException.class)
    public void naoDeveControlarEstoquesSemNenhumProduto(){
        Estoque estoque = new Estoque("Lojão Vazio");
        Controle controle = new Controle();

        controle.controlaEstoque(estoque);
    }


}