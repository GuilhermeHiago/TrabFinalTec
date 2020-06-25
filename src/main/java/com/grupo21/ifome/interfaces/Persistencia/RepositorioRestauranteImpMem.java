package com.grupo21.ifome.interfaces.Persistencia;

import java.util.HashMap;
import java.util.Map;

import com.grupo21.ifome.casosDeUso.Repositorios.RepositorioRestaurantes;
import com.grupo21.ifome.entidades.Posicao;
import com.grupo21.ifome.entidades.Restaurante;

import org.springframework.stereotype.Component;

@Component
public class RepositorioRestauranteImpMem implements RepositorioRestaurantes{
    private Map<String, Restaurante> restaurantes;
    
    public RepositorioRestauranteImpMem(){
        restaurantes = new HashMap<>();

        restaurantes.put("12345678", new Restaurante("Casa do Prato", "12345678", new Posicao(50, 100)));
        restaurantes.put("87654321", new Restaurante("Prato da Cada", "87654321", new Posicao(100, 50)));
        restaurantes.put("12345679", new Restaurante("Rest3", "12345679", new Posicao(250, 10)));
    }

    public Restaurante recuperaPorNome(String cnpj){
        return restaurantes.get(cnpj);
    }
}