package com.grupo21.ifome.Entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Restaurante implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @Column(unique=true)
    private String cnpj;

    private Posicao pos;

    @JsonBackReference
    @OneToMany(mappedBy = "restaurante")
    private List<Pedido> pedidos = new ArrayList<>();

    public Restaurante() {}

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

    public void setNome(String nome) { this.nome = nome; }

    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
