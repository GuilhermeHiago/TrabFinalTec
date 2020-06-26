package com.grupo21.ifome.Entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Posicao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int x;
    private int y;

    @ManyToOne
    @JoinColumn(name="cliente_id")
     Cliente cliente; //um endereço tem um cliente, um cliente pode ter varios endereços

    public Posicao() {}

    public Posicao(Integer id, int x, int y, Cliente cliente) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.cliente=cliente;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
