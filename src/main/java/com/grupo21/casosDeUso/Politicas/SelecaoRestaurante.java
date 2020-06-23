package com.grupo21.casosDeUso.Politicas;

import java.util.List;
import com.grupo21.entidades.Restaurante;

public interface SelecaoRestaurante {
    Restaurante escolheRestaurante(List<Restaurante> r);
}