package com.grupo21.casosDeUso.Politicas;

import java.util.List;
import com.grupo21.entidades.Produto;

public interface CustoCompra {
    double get_valor(List<Produto> p);
}