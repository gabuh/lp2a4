package org.example.model;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {


    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarProdutosComEstoqueMinimoMenorQueCinco(){
        new Produto("Arroz", 10, 1,20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoDeveAceitarProdutosComEstoqueMaximoMaiorQueCem(){
        new Produto("Arroz", 10, 10,101);
    }

}