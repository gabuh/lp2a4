package org.example.model.builder;

import org.example.model.Estoque;
import org.example.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueBuilder {

    private String loja;
    final private List<Produto> produtos = new ArrayList<Produto>();


    public EstoqueBuilder setLoja(String loja) {
        this.loja = loja;
        return this;
    }


    public EstoqueBuilder armazena(Produto produto){
        if(exist(produto)){
            System.out.println("Produto Já existente.");
        }else{
            this.produtos.add(produto);
        }
        return this;
    }


    public boolean exist(Produto p){
        for (Produto pList:
                this.produtos) {
            if (p.getNome().equals(p.getNome()))
                return true;
        }
        return false;
    }



    public Estoque create(){
        return new Estoque(loja, produtos);
    }

}
