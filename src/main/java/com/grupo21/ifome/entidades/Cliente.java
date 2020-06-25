package com.grupo21.ifome.entidades;

public class Cliente {
    private String cpf;
    private String nome;
    private Posicao pos;

    public Cliente(String nome, String cpf, Posicao pos){
        this.nome = nome;
        this.cpf = cpf;
        this.pos = pos;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public Posicao getPos() {
        return pos;
    }
}