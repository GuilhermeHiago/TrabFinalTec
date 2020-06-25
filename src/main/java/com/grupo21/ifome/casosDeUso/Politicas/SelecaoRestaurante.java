package com.grupo21.ifome.casosDeUso.Politicas;

import java.util.List;
import com.grupo21.ifome.entidades.Restaurante;

public interface SelecaoRestaurante {
    Restaurante escolheRestaurante(List<Restaurante> r);
}