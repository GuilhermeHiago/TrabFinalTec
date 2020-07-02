package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.grupo21.ifome.entidades.Posicao;
import com.grupo21.ifome.entidades.Produto;
import com.grupo21.ifome.entidades.Restaurante;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RestauranteTest {
    private Restaurante r1, r2;
    private Posicao p;
    private List<Produto> produtos;

    @BeforeEach
    public void initialize() {
        p = mock(Posicao.class);
        when(p.getX()).thenReturn(23);
        when(p.getY()).thenReturn(23);

        r1 = new Restaurante();
        r2 = new Restaurante("nome", "12345678", p);
        produtos = new ArrayList<>();
        r2.setProdutos(produtos);
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
    public void testProdutos() {
        assertEquals(produtos, r2.getProdutos());
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

    @Test
    public void setProdutos(){
        ArrayList<Produto> p = new ArrayList<>();
        r1.setProdutos(p);
        assertEquals(p, r1.getProdutos());
    }
}