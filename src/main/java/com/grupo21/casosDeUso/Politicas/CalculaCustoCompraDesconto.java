package com.grupo21.casosDeUso.Politicas;

import java.util.List;

import com.grupo21.entidades.Produto;

public class CalculaCustoCompraDesconto implements CustoCompra{
    @Override
    public double get_valor(List<Produto> p) {
        // Implementar com desconto
        return 0;
    }
}