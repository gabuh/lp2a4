package org.example.model;


import org.example.model.builder.EstoqueBuilder;
import org.example.model.builder.ProdutoBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ControleTest {
    private Produto produto, produtoDiferente;

    @Before
    public void instanciarProdutos(){
        this.produto = new ProdutoBuilder()
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
    public void deveRetornarProdutosComEstoqueInsuficiente(){
        Controle controle = new Controle();
        this.produto.setQuantidade(2); //Estoque minimo é 5 e máximo 10
        controle.controlaEstoque(new EstoqueBuilder()
                .setLoja("Lojão do bras")
                .armazena(produto)
                .create()
        );
        assertEquals(1,controle.produtosComEstoqueInsuficiente.size());
    }

    @Test
    public void deveRetornarProdutosComEstoqueExcedente(){
        Controle controle = new Controle();
        this.produto.setQuantidade(15); //Estoque minimo é 5 e máximo 10
        controle.controlaEstoque(new EstoqueBuilder()
                .setLoja("Lojão do bras")
                .armazena(produto)
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
                .armazena(produto)
                .create()
        );
        System.out.println(produto.getQuantidade()); // quantidade = 0.0
        assertEquals(1,controle.produtosComEstoqueZerado.size());
    }

    @Test
    public void deveRetornarProdutosComEstoqueAdequado() {
        Controle controle = new Controle();
        this.produto.setQuantidade(10); //Estoque minimo é 5 e máximo 10
        controle.controlaEstoque(new EstoqueBuilder()
                .setLoja("Lojão do bras")
                .armazena(produto)
                .create()
        );
        assertEquals(1,controle.produtosComEstoqueAdequado.size());
    }


//    @Test
//    public void deveRetornarTodasListasVaziasParaEstoqueSemProdutos(){
//        Controle controle = new Controle();
//        controle.controlaEstoque(new EstoqueBuilder()
//                .setLoja("Lojao Vazio")
//                .create()
//        );
//
//        assertTrue(
//                controle.getProdutosComEstoqueZerado().isEmpty() &&
//                        controle.getProdutosComEstoqueAdequado().isEmpty() &&
//                        controle.getProdutosComEstoqueExcedente().isEmpty() &&
//                        controle.getProdutosComEstoqueInsuficiente().isEmpty()
//        );
//    }

    @Test
    public void deveRetornarListaVaziaParaEstoqueQueNaoContemProdutosComEstoqueZerado(){
        Controle controle = new Controle();
        produto.setQuantidade(5);
        produtoDiferente.setQuantidade(5);
        controle.controlaEstoque(new EstoqueBuilder()
                .setLoja("Lojão")
                .armazena(produto)
                .armazena(produtoDiferente)
                .create()
        );
        assertTrue(controle.getProdutosComEstoqueZerado().isEmpty());

    }



    @Test(expected = IllegalArgumentException.class)
    public void naoDeveControlarEstoquesSemNenhumProduto(){
        Estoque estoque = new Estoque("Lojão Vazio");
        Controle controle = new Controle();
        controle.controlaEstoque(estoque);
    }


}