package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.grupo21.ifome.CasosDeUso.Politicas.CalculaCustoCompraBase;
import com.grupo21.ifome.CasosDeUso.Politicas.CalculaCustoCompraDesconto;
import com.grupo21.ifome.Entidades.ItemPedido;
import com.grupo21.ifome.Entidades.Produto;

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
        when(p.getPreco()).thenReturn(50.0);

        pp = mock(ItemPedido.class);
        when(pp.getPreco()).thenReturn(50.0);

        p2 = new ArrayList<>();
        p2.add(p);
        p2.add(pp);
    }

    @Test
    public void testGetValor() {
        assertEquals(100.0, calc.get_valor(p2));
    }
}