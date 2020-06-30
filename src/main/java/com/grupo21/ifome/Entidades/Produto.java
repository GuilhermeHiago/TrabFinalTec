package com.grupo21.ifome.Entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class Produto implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String nome;
    @Column(length = 800)
    private String descricao;
    private String imgCard;
    private String imgCart;
    private String imgDetails;
    private String peso;
    private double preco;

    @JsonBackReference
    @ManyToMany
    @JoinTable(name="PRODUTO_CATEGORIA", joinColumns = @JoinColumn(name = "produto_id"), inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    public List<Categoria> categorias = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "id.produto")
    public Set<ItemPedido> itens = new HashSet<>();

    public Produto() {
    }

    public Produto(Integer id, String nome, String descricao, String imgCard, String imgCart, String imgDetails, String peso, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.imgCard = imgCard;
        this.imgCart = imgCart;
        this.imgDetails = imgDetails;
        this.peso = peso;
        this.preco = preco;
    }

    @JsonIgnore
    public List<Pedido> getPedidos() {
        List<Pedido> lista = new ArrayList<>();

        for(ItemPedido x: itens) {
            lista.add(x.getPedido());
        }
        return lista;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getImgCard() { return imgCard; }

    public void setImgCard(String imgCard) { this.imgCard = imgCard; }

    public String getImgCart() { return imgCart; }

    public void setImgCart(String imgCart) { this.imgCart = imgCart; }

    public String getImgDetails() { return imgDetails; }

    public void setImgDetails(String imgDetails) { this.imgDetails = imgDetails; }

    public void setPeso(String peso) { this.peso = peso; }

    public String getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Set<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(Set<ItemPedido> itens) {
        this.itens = itens;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
