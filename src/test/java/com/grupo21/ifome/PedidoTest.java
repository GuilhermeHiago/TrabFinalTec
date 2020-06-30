package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import com.grupo21.ifome.Entidades.Cliente;
import com.grupo21.ifome.Entidades.ItemPedido;
import com.grupo21.ifome.Entidades.Pedido;
import com.grupo21.ifome.Entidades.Posicao;
import com.grupo21.ifome.Entidades.Restaurante;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch.qos.logback.core.net.server.Client;

public class PedidoTest {
    private Pedido p1, p2;
    private Cliente c;
    private Restaurante r;
    private Posicao pos;
    private Set<ItemPedido> pedidos;

    @BeforeEach
    public void initialize() {
        c = mock(Cliente.class);
        r = mock(Restaurante.class);
        pos = mock(Posicao.class);
        pedidos = new HashSet<>();

        ItemPedido it = mock(ItemPedido.class);
        when(it.getSubTotal()).thenReturn(60.0);
        pedidos.add(it);

        p1 = new Pedido();
        p2 = new Pedido(123, 1, c, pos, r);
        p2.setItens(pedidos);
    }

    @Test
    public void testGetId() {
        assertEquals(123, p2.getId());
    }

    @Test
    public void testGetCliente() {
        assertEquals(c, p2.getCliente());
    }

    @Test
    public void testGetPagamento() {
        assertEquals(1, p2.getPagamento());
    }

    @Test
    public void testGetItens() {
        assertEquals(pedidos, p2.getItens());
    }

    @Test
    public void testGetPos() {
        assertEquals(pos, p2.getPosicaoEntrega());
    }

    @Test
    public void testGetImgRestaurante() {
        assertEquals(r, p2.getRestaurante());
    }

    @Test
    public void testGetValorTotal() {
        assertEquals(60, p2.getValorTotal());
    }

    @Test
    public void testSetId() {
        p1.setId(123);
    
        assertEquals(123, p1.getId());
    }

    @Test
    public void testSetCliente() {
        p1.setCliente(c);

        assertEquals(c, p1.getCliente());
    }

    @Test
    public void testSetItens() {
        p1.setItens(pedidos);

        assertEquals(pedidos, p1.getItens());
    }

    @Test
    public void testSetPagamento() {
        p1.setPagamento(1);
        
        assertEquals(1, p1.getPagamento());
    }

    @Test
    public void testSetImgDetails() {
        p1.setPosicaoEntrega(pos);
        
        assertEquals(pos, p1.getPosicaoEntrega());
    }

    @Test
    public void testSetRestaurante() {
        p1.setRestaurante(r);

        assertEquals(r, p1.getRestaurante());
    }
}