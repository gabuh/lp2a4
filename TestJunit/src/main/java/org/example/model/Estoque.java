package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String loja;

    private List<Produto> produtos;


    public Estoque(String loja, List<Produto> produtos) {
        this.loja = loja;
        this.produtos = produtos;
    }

    public Estoque(String loja) {
        this.loja = loja;
        produtos = new ArrayList<Produto>();
    }


    public void armazena(Produto produto){
        if(exist(produto)){
            System.out.println("Produto Já existente.");
        }else{
            this.produtos.add(produto);
        }
    }


    public String getLoja() {
        return loja;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }


    public boolean exist(Produto p){
        for (Produto pList:
             this.produtos) {
            if (p.getNome().equals(p.getNome()))
                return true;
        }
        return false;
    }


}
