package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.grupo21.ifome.entidades.ItemPedido;
import com.grupo21.ifome.entidades.Pedido;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PedidoTest {
    private Pedido p1, p2;
    private List<ItemPedido> pedidos;

    @BeforeEach
    public void initialize() {
        pedidos = new ArrayList<>();

        ItemPedido it = mock(ItemPedido.class);
        pedidos.add(it);

        p1 = new Pedido();
        p2 = new Pedido(123);
        p2.setItens(pedidos);
    }

    @Test
    public void testGetId() {
        assertEquals(123, p2.getId());
    }

    @Test
    public void testGetItens() {
        assertEquals(pedidos, p2.getItens());
    }

    @Test
    public void testSetId() {
        p1.setId(123);
    
        assertEquals(123, p1.getId());
    }

    @Test
    public void testSetItens() {
        p1.setItens(pedidos);

        assertEquals(pedidos, p1.getItens());
    }
}