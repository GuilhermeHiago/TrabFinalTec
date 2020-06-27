package com.grupo21.ifome.Interfaces;

import com.grupo21.ifome.CasosDeUso.Servicos.RestauranteServico;
import com.grupo21.ifome.Entidades.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/restaurantes")
public class RestauranteRecurso {
    @Autowired
    RestauranteServico restauranteServico;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public List find() {
    return restauranteServico.mostraTodos();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Restaurante res = restauranteServico.buscarPorId(id);
        return ResponseEntity.ok().body(res);
    }
}