package org.example.model;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ControleTest {

    @Test
    public void deveRetornarProdutosComEstoqueAdequado() {
        Produto produto = new Produto("Arroz", 80, 10, 80);
        Estoque estoque = new Estoque("Lojao do bras");
        Controle controle = new Controle();
        controle.controlaEstoque(estoque);
        Produto produto1 = controle.getProdutosComEstoqueAdequado().isEmpty();
        assertEquals("Arroz",  produto1.getNome());
    }



}