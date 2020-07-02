package com.grupo21.ifome.entidades;

import java.util.List;

public class Restaurante {
    String nome;
    String cnpj;
    Posicao pos;
    List<Produto> produtos;

    public Restaurante(){}

    public Restaurante(String nome, String cnpj, Posicao pos){
        this.nome = nome;
        this.cnpj = cnpj;
        this.pos = pos;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Posicao getPos() {
        return pos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}