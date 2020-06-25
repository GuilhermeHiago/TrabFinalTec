package com.grupo21.ifome.casosDeUso.Politicas;

import java.util.List;
import com.grupo21.ifome.entidades.Produto;

public interface CustoCompra {
    double get_valor(List<Produto> p);
}