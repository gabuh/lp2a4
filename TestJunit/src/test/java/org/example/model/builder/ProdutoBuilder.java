package org.example.model.builder;

import org.example.model.Produto;
import org.example.model.ProdutoTest;

public class ProdutoBuilder {
    private String nome;
    private double quantidade;
    private double estoqueMinimo;
    private double estoqueMaximo;

    public ProdutoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ProdutoBuilder setQuantidade(double quantidade) {
         this.quantidade = quantidade;
         return this;
    }

    public ProdutoBuilder setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
        return this;
    }

    public ProdutoBuilder setEstoqueMaximo(double estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
        return this;
    }

    public Produto create(){
        return new Produto(nome,quantidade,estoqueMinimo,estoqueMaximo);
    }
}
