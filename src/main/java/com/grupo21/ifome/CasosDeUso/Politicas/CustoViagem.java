package com.grupo21.ifome.casosDeUso.Politicas;

import com.grupo21.ifome.entidades.Posicao;

public interface CustoViagem {
    double get_valor(Posicao restaurante_pos, Posicao cliente_pos);
}