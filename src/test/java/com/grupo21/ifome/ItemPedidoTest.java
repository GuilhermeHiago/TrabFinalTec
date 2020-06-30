package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import com.grupo21.ifome.Entidades.ItemPedido;
import com.grupo21.ifome.Entidades.Pedido;
import com.grupo21.ifome.Entidades.Produto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ItemPedidoTest {
    private ItemPedido ip1, ip2;
    private Pedido p;
    private Produto prod;

    @BeforeEach
    public void initialize() {
        p = mock(Pedido.class);

        prod = mock(Produto.class);

        ip1 = new ItemPedido();
        ip2 = new ItemPedido(p, prod, 12, 32.2);
    }

    @Test
    public void testGetPedido() {
        assertEquals(p, ip2.getPedido());
    }

    @Test
    public void testGetProduto() {
        assertEquals(prod, ip2.getProduto());
    }

    @Test
    public void testGetPreco() {
        assertEquals(32.2, ip2.getPreco());
    }

    @Test
    public void testGetQuantidade() {
        assertEquals(12, ip2.getQuantidade());
    }

    @Test
    public void testGetSubtotal() {
        assertEquals(32.2 * 12, ip2.getSubTotal());
    }

    @Test
    public void testSePedido() {
        ip1.setPedido(p);

        assertEquals(p, ip1.getPedido());
    }

    @Test
    public void testSetProduto() {
        ip1.setProduto(prod);

        assertEquals(prod, ip1.getProduto());
    }

    @Test
    public void testSetPreco() {
        ip1.setPreco(15.3);

        assertEquals(15.3, ip1.getPreco());
    }

    @Test
    public void testSetQuantidade() {
        ip1.setQuantidade(13);

        assertEquals(13, ip1.getQuantidade());
    }
}