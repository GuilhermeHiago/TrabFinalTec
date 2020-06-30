package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.grupo21.ifome.Entidades.Posicao;
import com.grupo21.ifome.Entidades.Restaurante;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RestauranteTest {
    private Restaurante r1, r2;
    private Posicao p;

    @BeforeEach
    public void initialize() {
        p = mock(Posicao.class);
        when(p.getX()).thenReturn(23);
        when(p.getY()).thenReturn(23);

        r1 = new Restaurante();
        r2 = new Restaurante(1234, "nome", "12345678", p);
    }

    @Test
    public void testGetNome() {
        assertEquals("nome", r2.getNome());
    }

    @Test
    public void testGetCNPJ() {
        assertEquals("12345678", r2.getCnpj());
    }

    @Test
    public void testGetPosicao() {
        assertEquals(p, r2.getPos());
    }

    @Test
    public void testSetNome() {
        r1.setNome("nome");

        assertEquals("nome", r1.getNome());
    }

    @Test
    public void testSetCNPJ() {
        r1.setCnpj("12345678");

        assertEquals("12345678", r1.getCnpj());
    }
}