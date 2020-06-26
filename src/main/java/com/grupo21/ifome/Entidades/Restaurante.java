package com.grupo21.ifome.Entidades;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @Column(unique=true)
    private String cnpj;

    private Posicao pos;
    private List<Produto> produtos;

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
