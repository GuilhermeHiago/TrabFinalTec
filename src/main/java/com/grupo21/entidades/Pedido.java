package com.grupo21.entidades;

import java.util.List;

public class Pedido {
    private int id;
    private List<ItemPedido> itens; 

    public Pedido(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<ItemPedido> getItemPedido() {
        return itens;
    }

    public ItemPedido addItemPedido(String nome, double valor, int quantidade){
        ItemPedido item = new ItemPedido(nome, quantidade, valor);
        itens.add(item);
        return item;
    }

    public ItemPedido removeItemPedido(){
        if (itens.size() <= 0){
            return null;
        }
        return itens.remove(itens.size()-1);
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}