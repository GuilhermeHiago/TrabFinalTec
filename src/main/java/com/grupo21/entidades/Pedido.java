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

    public void addItemPedido(ItemPedido item){
        itens.add(item);
    }

    public void removeItemPedido(ItemPedido item){
        itens.remove(item);
    }

}