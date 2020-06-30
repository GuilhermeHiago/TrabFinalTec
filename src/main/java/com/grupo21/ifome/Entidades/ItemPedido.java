package com.grupo21.ifome.Entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class ItemPedido implements Serializable{
    private static final long serialVersionUID = 1L;

    @JsonIgnore
    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();
    private Integer quantidade;
    private Double preco;

    public ItemPedido(){};

    public ItemPedido(Pedido pedido, Produto produto, Integer quantidade, Double preco){
        id.setPedido(pedido);
        id.setProduto(produto);
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //politica de desconto pode ser aplicada diretamente no subtotal, colocando toda a logica para um desconto, aqui.
    public double getSubTotal() { return preco * quantidade; }

    @JsonIgnore
    public Pedido getPedido() { return id.getPedido(); }

    public Produto getProduto() { return id.getProduto(); }

    public void setPedido(Pedido pedido) { id.setPedido(pedido); }

    public void setProduto(Produto produto) { id.setProduto(produto); }

    public Integer getQuantidade() { return quantidade; }

    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public Double getPreco() { return preco; }

    public void setPreco(Double preco) { this.preco = preco; }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
