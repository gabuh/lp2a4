package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Controle {
    List<Produto> produtosComEstoqueInsuficiente;
    List<Produto> produtosComEstoqueExcedente;
    List<Produto> produtosComEstoqueZerado;
    List<Produto> produtosComEstoqueAdequado;



    public void controlaEstoque(Estoque estoque){
        for (Produto produto :
            estoque.getProdutos()) {
            if(produto.getQuantidade()  <= produto.getEstoqueMinimo() ){
                this.produtosComEstoqueInsuficiente.add(produto);
            } else if (produto.getQuantidade() > produto.getEstoqueMaximo() ) {
                this.produtosComEstoqueExcedente.add(produto);
            } else if (produto.getQuantidade() == produto.getEstoqueMaximo() ) {
                this.produtosComEstoqueAdequado.add(produto);
            } else if (produto.getQuantidade() == 0) {
                this.produtosComEstoqueZerado.add(produto);
            }
        }
    }

    public Controle() {
        this.produtosComEstoqueInsuficiente = new ArrayList<Produto>();
        this.produtosComEstoqueExcedente = new ArrayList<Produto>();
        this.produtosComEstoqueZerado = new ArrayList<Produto>();
        this.produtosComEstoqueAdequado = new ArrayList<Produto>();
    }

    public List<Produto> getProdutosComEstoqueInsuficiente() {
        return produtosComEstoqueInsuficiente;
    }

    public List<Produto> getProdutosComEstoqueExcedente() {
        return produtosComEstoqueExcedente;
    }

    public List<Produto> getProdutosComEstoqueZerado() {
        return produtosComEstoqueZerado;
    }

    public List<Produto> getProdutosComEstoqueAdequado() {
        return produtosComEstoqueAdequado;
    }
}
