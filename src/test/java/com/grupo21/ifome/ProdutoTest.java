package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.grupo21.ifome.Entidades.Categoria;
import com.grupo21.ifome.Entidades.ItemPedido;
import com.grupo21.ifome.Entidades.Produto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProdutoTest {
    private Produto p1, p2;

    @BeforeEach
    public void initialize() {
        p1 = new Produto();
        p2 = new Produto(1234, "nome", "descricao Test", "img", "img2", "detalhes", "3.5g", 27.3);
    }

    @Test
    public void testGetId() {
        assertEquals(1234, p2.getId());
    }

    @Test
    public void testGetNome() {
        assertEquals("nome", p2.getNome());
    }

    @Test
    public void testGetDescricao() {
        assertEquals("descricao Test", p2.getDescricao());
    }

    @Test
    public void testGetImgCard() {
        assertEquals("img", p2.getImgCard());
    }

    @Test
    public void testGetImgCart() {
        assertEquals("img2", p2.getImgCart());
    }

    @Test
    public void testGetImgDetails() {
        assertEquals("detalhes", p2.getImgDetails());
    }

    @Test
    public void testGetPeso() {
        assertEquals("3.5g", p2.getPeso());
    }

    @Test
    public void testGetPreco() {
        assertEquals(27.3, p2.getPreco());
    }

    @Test
    public void testSetCategorias() {
        final Categoria c = mock(Categoria.class);
        when(c.getId()).thenReturn(123);
        when(c.getImgCategoria()).thenReturn("img");
        when(c.getNome()).thenReturn("categoria");

        final ArrayList<Categoria> cs = new ArrayList<>();
        cs.add(c);

        p1.setCategorias(cs);

        assertEquals(cs, p1.getCategorias());
    }

    @Test
    public void testSetDescricao() {
        p1.setDescricao("descricao");

        assertEquals("descricao", p1.getDescricao());
    }

    @Test
    public void testSetImgCard() {
        p1.setImgCard("imgCard");
        assertEquals("imgCard", p1.getImgCard());
    }

    @Test
    public void testSetImgCart() {
        p1.setImgCart("imgCart");
        assertEquals("imgCart", p1.getImgCart());
    }

    @Test
    public void testSetImgDetails() {
        p1.setImgDetails("imgDetails");
        assertEquals("imgDetails", p1.getImgDetails());
    }

    @Test
    public void testSetItens() {
        ItemPedido i = mock(ItemPedido.class);
        HashSet<ItemPedido> a = new HashSet<>();

        p1.setItens(a);

        Set<ItemPedido> b = p1.getItens();

        assertEquals(a, b);
    }

    @Test
    public void testSetPeso() {
        p1.setPeso("2.3g");
        assertEquals("2.3g", p1.getPeso());
    }

    @Test
    public void testSetPreco() {
        p1.setPreco(33.3);
        assertEquals(33.3, p1.getPreco());
    }
}