package com.grupo21.casosDeUso.Politicas;

import java.util.List;
import com.grupo21.entidades.Produto;

public class CalculaCustoCompraBase implements CustoCompra{
    @Override
    public double get_valor(List<Produto> p) {
        double total = 0;
        
        for (Produto produto : p) {
            total += produto.getValor();
        }
        return total;
    }
}