package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.grupo21.ifome.casosDeUso.Politicas.CalculaCustoCompraBase;
import com.grupo21.ifome.casosDeUso.Politicas.CalculaCustoCompraDesconto;
import com.grupo21.ifome.entidades.ItemPedido;
import com.grupo21.ifome.entidades.Produto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculaCustoCompraBaseTest {
    private List<ItemPedido> p2;
    private CalculaCustoCompraBase calc;
    private ItemPedido p,pp;

    @BeforeEach
    public void initialize() {
        calc = new CalculaCustoCompraBase();

        p = mock(ItemPedido.class);
        when(p.getValorUnitario()).thenReturn(50.0);
        when(p.getQuantidade()).thenReturn(1);

        pp = mock(ItemPedido.class);
        when(pp.getValorUnitario()).thenReturn(50.0);
        when(pp.getQuantidade()).thenReturn(1);

        p2 = new ArrayList<>();
        p2.add(p);
        p2.add(pp);
    }

    @Test
    public void testGetValor() {
        assertEquals(100.0, calc.get_valor(p2));
    }
}