package com.grupo21.ifome.CasosDeUso.Politicas;

import com.grupo21.ifome.Entidades.ItemPedido;
import com.grupo21.ifome.Entidades.Produto;

import java.util.List;

public interface CustoCompra {
    double get_valor(List<ItemPedido> p);
}