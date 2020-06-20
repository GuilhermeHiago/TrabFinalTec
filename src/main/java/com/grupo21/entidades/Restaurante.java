package com.grupo21.entidades;

public class Restaurante {
    String nome;
    int cnpj;
    Posicao pos;

    public Restaurante(String nome, int cnpj, Posicao pos){
        this.nome = nome;
        this.cnpj = cnpj;
        this.pos = pos;
    }

    public String getNome() {
        return nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public Posicao getPos() {
        return pos;
    }
}