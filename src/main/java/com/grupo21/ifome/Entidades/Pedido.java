package com.grupo21.ifome.entidades;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Pedido {
    private int id;
    private List<ItemPedido> itens; 

    public Pedido(){
    }

    public Pedido(int id){
        itens = new ArrayList<>();
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

    @JsonIgnore
    public List<ItemPedido> getItens() {
        return itens;
    }

    public void fechaPedido(){
        //salva na memoria
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}