package com.grupo21.ifome.CasosDeUso.Politicas;

import com.grupo21.ifome.Entidades.Cliente;
import com.grupo21.ifome.Entidades.Pedido;
import com.grupo21.ifome.Entidades.Restaurante;

import java.util.List;

public interface SelecaoRestaurante {
    Restaurante escolheRestaurante(Cliente c, Pedido p, List<Restaurante> listRest);
}