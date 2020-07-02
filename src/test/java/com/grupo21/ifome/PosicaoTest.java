package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.grupo21.ifome.entidades.Posicao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosicaoTest {
    private Posicao p1, p2;

    @BeforeEach
    public void initialize() {
        p1 = new Posicao();
        p2 = new Posicao( 2,3);
    }

    @Test
    public void testGetX() {
        assertEquals(2, p2.getX());
    }

    @Test
    public void testGetY() {
        assertEquals(3, p2.getY());
    }

    @Test
    public void testGSetX() {
        p1.setX(5);
        assertEquals(5, p1.getX());
    }

    @Test
    public void testSetY() {
        p1.setY(5);
        assertEquals(5, p1.getY());
    }
}