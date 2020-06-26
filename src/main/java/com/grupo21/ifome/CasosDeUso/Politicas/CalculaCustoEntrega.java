package com.grupo21.ifome.CasosDeUso.Politicas;

import com.grupo21.ifome.Entidades.Posicao;

import org.springframework.stereotype.Component;

import java.lang.Math;

@Component
public class CalculaCustoEntrega implements CustoEntrega{
    @Override
    public double get_valor(Posicao restaurante_pos, Posicao cliente_pos) {
        double x_pow = Math.pow(restaurante_pos.getX() - cliente_pos.getX(), 2);
        double y_pow = Math.pow(restaurante_pos.getY() - cliente_pos.getY(), 2);

        double dist = Math.sqrt(x_pow + y_pow);

        // Converte para km
        dist = (int)dist / 1000;

        if (dist > 5){
            return 10 + (dist-5);
        }
        else{
            return 10;
        }
    }
}