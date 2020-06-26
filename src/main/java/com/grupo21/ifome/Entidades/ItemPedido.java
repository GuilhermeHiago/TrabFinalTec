package com.grupo21.ifome.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ItemPedido {

    @JsonIgnore
    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();

    private int quantidade;
    private double valorUnitario;
    private String nomeProduto;

    public ItemPedido(){};

    public ItemPedido(Pedido pedido, Produto produto, int quantidade, double valorUnitario){
        id.setPedido(pedido);
        id.setProduto(produto);
        this.nomeProduto = id.getProduto().getNome();
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    @JsonIgnore
    public Pedido getPedido() {
        return id.getPedido();
    }

    public Produto getProduto() {
        return id.getProduto();
    }

    public String getNomeProduto() { return this.nomeProduto = id.getProduto().getNome(); }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void aumentaQtd(){
        quantidade += 1;
    }

}
