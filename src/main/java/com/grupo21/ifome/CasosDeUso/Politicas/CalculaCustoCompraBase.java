package com.grupo21.ifome.CasosDeUso.Politicas;

import java.util.List;

import com.grupo21.ifome.Entidades.ItemPedido;
import com.grupo21.ifome.Entidades.Produto;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CalculaCustoCompraBase implements CustoCompra{
    public CalculaCustoCompraBase(){}

    @Override
    public double get_valor(List<ItemPedido> p) {
        double total = 0;

        for (ItemPedido produto : p) {
            total += produto.getPreco();
        }
        return total;
    }
}