package com.grupo21.ifome.CasosDeUso.Politicas;

import com.grupo21.ifome.Entidades.Restaurante;

import java.util.List;

public interface SelecaoRestaurante {
    Restaurante escolheRestaurante(List<Restaurante> r);
}