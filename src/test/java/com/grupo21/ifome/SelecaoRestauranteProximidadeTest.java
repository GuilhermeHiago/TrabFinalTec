package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.grupo21.ifome.casosDeUso.Politicas.SelecaoRestauranteProximidade;
import com.grupo21.ifome.entidades.Cliente;
import com.grupo21.ifome.entidades.Pedido;
import com.grupo21.ifome.entidades.Posicao;
import com.grupo21.ifome.entidades.Restaurante;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch.qos.logback.core.net.server.Client;

public class SelecaoRestauranteProximidadeTest {
    private Cliente c;
    private Pedido p;
    private List<Restaurante> r;
    private SelecaoRestauranteProximidade selec;
    private Restaurante r1,r2;

    @BeforeEach
    public void initialize() {
        selec = new SelecaoRestauranteProximidade();

        p = mock(Pedido.class);
        c = mock(Cliente.class);
        Posicao p1 = mock(Posicao.class);
        when(p1.getX()).thenReturn(0);
        when(p1.getY()).thenReturn(0);

        Posicao p2 = mock(Posicao.class);
        when(p2.getX()).thenReturn(10);
        when(p2.getY()).thenReturn(10);

        Posicao p3 = mock(Posicao.class);
        when(p3.getX()).thenReturn(100);
        when(p3.getY()).thenReturn(100);

        r1 = mock(Restaurante.class);
        r2 = mock(Restaurante.class);

        when(c.getPos()).thenReturn(p1);

        when(r1.getPos()).thenReturn(p2);
        when(r2.getPos()).thenReturn(p3);

        r = new ArrayList<>();
        r.add(r1);
        r.add(r2);
    }

    @Test
    public void testEscolheRestaurante() {
        assertEquals(r1, selec.escolheRestaurante(c, p, r));
    }
}