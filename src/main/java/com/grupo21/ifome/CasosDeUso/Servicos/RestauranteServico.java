package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.RestauranteRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.Exceptions.ObjectNotFoundExpection;
import com.grupo21.ifome.Entidades.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestauranteServico {
    @Autowired
    private RestauranteRepositorio restauranteRepositorio;

    public List<Restaurante> getAll(){
        List<Restaurante> buscaRestaurante = restauranteRepositorio.findAll();
        return buscaRestaurante;
    }

    public Restaurante get(Integer id){
        Optional<Restaurante> buscaRestaurante = restauranteRepositorio.findById(id);
        return buscaRestaurante.orElseThrow(() -> new ObjectNotFoundExpection("Objeto nao encontradp! Id: "+id+", Tipo: "+ Restaurante.class.getName()));
    }
}
