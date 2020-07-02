package com.grupo21.ifome.casosDeUso.Repositorios;

import java.util.List;

import com.grupo21.ifome.entidades.Restaurante;

public interface RepositorioRestaurantes {
    public Restaurante recuperaCNPJ(String cnpj);

    public List<Restaurante> getAll();
}