package com.grupo21.casosDeUso.Politicas;

import com.grupo21.entidades.Posicao;

public interface CustoViagem {
    double get_valor(Posicao restaurante_pos, Posicao cliente_pos);
}