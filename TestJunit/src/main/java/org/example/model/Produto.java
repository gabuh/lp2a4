package org.example.model;

public class Produto {
    private String nome;

    private double quantidade;

    private double estoqueMinimo;

    private double estoqueMaximo;

    public Produto(String nome, double quantidade, double estoqueMinimo, double estoqueMaximo) {
        this.nome = nome;
        this.quantidade = quantidade;
        if (estoqueMaximo > 100 || estoqueMinimo < 5){
            throw new IllegalArgumentException("Quantidade minima de pelo ao menos 5 itens. Quantidade maxima 100");
        }
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
        if (estoqueMinimo < 5){
            throw new IllegalArgumentException("Quantidade maxima 100");
        }
    }

    public void setEstoqueMaximo(double estoqueMaximo) {
        if (estoqueMaximo > 100){
            throw new IllegalArgumentException("Quantidade minima de pelo ao menos 5 itens.");
        }
        this.estoqueMaximo = estoqueMaximo;
    }

    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }


    public double getEstoqueMaximo() {
        return estoqueMaximo;
    }
}
