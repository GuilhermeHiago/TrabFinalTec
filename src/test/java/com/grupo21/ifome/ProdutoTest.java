package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.grupo21.ifome.entidades.Produto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProdutoTest {
    private Produto p1, p2;

    @BeforeEach
    public void initialize() {
        p1 = new Produto();
        p2 = new Produto("nome", 27.3);
    }

    @Test
    public void testGetNome() {
        assertEquals("nome", p2.getNome());
    }

    @Test
    public void testGetPreco() {
        assertEquals(27.3, p2.getValor());
    }

    @Test
    public void testSetValor() {
        p1.setValor(33.3);
        assertEquals(33.3, p1.getValor());
    }

    @Test
    public void testSetNome() {
        p1.setNome("qualquer");
        assertEquals("qualquer", p1.getNome());
    }
}