package com.grupo21.ifome.casosDeUso.Politicas;

import java.util.List;

import com.grupo21.ifome.entidades.ItemPedido;
import com.grupo21.ifome.entidades.Pedido;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CalculaCustoCompraBase implements CustoCompra{
    @Override
    public double get_valor(List<ItemPedido> p){
        double total = 0;
        
        for (ItemPedido produto : p) {
            total += (produto.getValorUnitario() * produto.getQuantidade());
        }
        return total;
    }
}