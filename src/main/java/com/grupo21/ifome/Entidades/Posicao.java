package com.grupo21.ifome.Entidades;

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

    private Cliente cliente;

    public Posicao() {}

    public Posicao(Integer id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
