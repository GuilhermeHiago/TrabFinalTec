package com.grupo21.ifome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.grupo21.ifome.CasosDeUso.Repositorios.PedidoRepositorio;
import com.grupo21.ifome.CasosDeUso.Repositorios.ProdutoRepositorio;
import com.grupo21.ifome.CasosDeUso.Repositorios.RestauranteRepositorio;
import com.grupo21.ifome.Interfaces.RestauranteFachadaRemota;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testRestauranteFachada {
    PedidoRepositorio repPed;
    ProdutoRepositorio repProd;
    RestauranteRepositorio repRest;
    RestauranteFachadaRemota rFachada;

    @BeforeEach
    public void initialize() {
    }

    @Test
    public void testBuscaTodosPedidos(){
        assertEquals(repPed, rFachada.BuscaTodosPedidos());
    }

    @Test
    public void testBuscaTodasCategorias(){
        assertEquals(repPed, rFachada.buscaTodasCategorias());
    }

    @Test
    public void testBuscaTodosProdutos(){
        assertEquals(repPed, rFachada.buscaTodosProdutos());
    }
}