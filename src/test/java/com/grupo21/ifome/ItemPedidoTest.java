package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import com.grupo21.ifome.entidades.ItemPedido;
import com.grupo21.ifome.entidades.Pedido;
import com.grupo21.ifome.entidades.Produto;

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
        ip2 = new ItemPedido("nome", 12, 32.2);
    }

    @Test
    public void testGetNome() {
        assertEquals("nome", ip2.getNome());
    }

    @Test
    public void testAumentaQtd() {
        ip1.setQuantidade(2);
        ip1.aumentaQtd();
        assertEquals(3, ip1.getQuantidade());
    }

    @Test
    public void testGetValorUnitario() {
        assertEquals(32.2, ip2.getValorUnitario());
    }

    @Test
    public void testGetQuantidade() {
        assertEquals(12, ip2.getQuantidade());
    }

    @Test
    public void testSetValorUnitario() {
        ip1.setValorUnitario(15.3);

        assertEquals(15.3, ip1.getValorUnitario());
    }

    @Test
    public void testSetQuantidade() {
        ip1.setQuantidade(13);

        assertEquals(13, ip1.getQuantidade());
    }

    @Test
    public void testSetNome(){
        ip1.setNome("n");
        assertEquals("n", ip1.getNome());
    }
}