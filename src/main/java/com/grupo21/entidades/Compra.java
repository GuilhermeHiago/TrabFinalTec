package com.grupo21.entidades;

import java.util.List;

public class Compra {
    private int id;
    private List<Produto> produtos; 

    public Compra(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto prod){
        produtos.add(prod);
    }

    public void removeProduto(Produto prod){
        produtos.remove(prod);
    }

}