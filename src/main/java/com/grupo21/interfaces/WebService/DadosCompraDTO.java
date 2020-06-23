package com.grupo21.interfaces.WebService;

import java.util.List;

public class DadosCompraDTO {
    private String nomeRestaurante;
    private List<String> nomeProd;
    private double custoCompra;

    public DadosCompraDTO(String nomeRestaurante, List<String> nomdeProd, double custoCompra){
        this.custoCompra = custoCompra;
        this.nomeProd = nomdeProd;
        this.nomeRestaurante = nomeRestaurante;
    }

    public double getCustoCompra() {
        return custoCompra;
    }

    public List<String> getNomeProd() {
        return nomeProd;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }
}