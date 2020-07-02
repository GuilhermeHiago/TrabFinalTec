package com.grupo21.ifome.casosDeUso.Politicas;

import java.util.List;

import com.grupo21.ifome.entidades.Cliente;
import com.grupo21.ifome.entidades.Pedido;
import com.grupo21.ifome.entidades.Restaurante;

public interface SelecaoRestaurante {
    Restaurante escolheRestaurante(Cliente c, Pedido p, List<Restaurante> listRest);
}