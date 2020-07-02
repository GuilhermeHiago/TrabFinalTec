package com.grupo21.ifome.casosDeUso.Politicas;

import java.util.List;

import com.grupo21.ifome.entidades.ItemPedido;
import com.grupo21.ifome.entidades.Pedido;

public interface CustoCompra {
    double get_valor(List<ItemPedido> p);
}