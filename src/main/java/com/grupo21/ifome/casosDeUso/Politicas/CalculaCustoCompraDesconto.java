package com.grupo21.ifome.casosDeUso.Politicas;

import java.util.List;

import com.grupo21.ifome.entidades.ItemPedido;
import com.grupo21.ifome.entidades.Pedido;

import org.springframework.stereotype.Component;

@Component
public class CalculaCustoCompraDesconto implements CustoCompra{
    @Override
    public double get_valor(List<ItemPedido> p){
        double total = 0;
        
        for (ItemPedido produto : p) {
            total += (produto.getValorUnitario() * produto.getQuantidade());
        }
        return total*0.9;
    }
}