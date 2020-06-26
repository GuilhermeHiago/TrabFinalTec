package com.grupo21.ifome.Entidades;

import javax.persistence.*;

@Entity
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @Column(unique=true)
    private String cnpj;

    private Posicao pos;

    public Restaurante(Integer id, String nome, String cnpj, Posicao pos){
        this.id = id;
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
}
