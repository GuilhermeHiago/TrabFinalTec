package com.grupo21.ifome.CasosDeUso.Politicas;

import com.grupo21.ifome.Entidades.Posicao;

public interface CustoEntrega {
    double get_valor(Posicao restaurante_pos, Posicao cliente_pos);
}
