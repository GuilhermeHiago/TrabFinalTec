package com.grupo21.ifome.entidades;

public class Cliente {
    private String cpf;
    private String nome;
    private Posicao pos;

    public Cliente(){}

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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPos(Posicao pos) {
        this.pos = pos;
    }
}