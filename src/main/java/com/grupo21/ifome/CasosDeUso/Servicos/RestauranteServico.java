package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.RestauranteRepositorio;
import com.grupo21.ifome.Entidades.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteServico {
    @Autowired
    private RestauranteRepositorio restauranteRepositorio;

    public List<Restaurante> buscaTodosRestaurantes(){
        return restauranteRepositorio.findAll();
    }
}
