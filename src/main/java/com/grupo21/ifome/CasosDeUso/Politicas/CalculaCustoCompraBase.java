package com.grupo21.ifome.CasosDeUso.Politicas;

import java.util.List;
import com.grupo21.ifome.Entidades.Produto;
import org.springframework.stereotype.Component;

@Component
public class CalculaCustoCompraBase implements CustoCompra{
    @Override
    public double get_valor(List<Produto> p) {
        double total = 0;

        for (Produto produto : p) {
            total += produto.getPreco();
        }
        return total;
    }
}