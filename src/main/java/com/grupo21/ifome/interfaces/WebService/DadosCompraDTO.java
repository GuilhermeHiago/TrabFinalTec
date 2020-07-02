package com.grupo21.ifome.interfaces.WebService;

import java.util.ArrayList;
import java.util.List;

public class DadosCompraDTO {
    private String restaurante;
    private List<String> produtos;
    private double valorCompraFinal;
    private double valorCompra;
    private double entrega;

    public DadosCompraDTO(){
        produtos = new ArrayList<String>();
    }

    public double getEntrega() {
        return entrega;
    }
    public List<String> getProdutos() {
        return produtos;
    }
    public String getRestaurante() {
        return restaurante;
    }
    public double getValorCompra() {
        return valorCompra;
    }

    public double getValorCompraFinal() {
        return valorCompraFinal;
    }

    public void setEntrega(double entrega) {
        this.entrega = entrega;
    }
    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }
    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }
    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setValorCompraFinal(double valorCompraFinal) {
        this.valorCompraFinal = valorCompraFinal;
    }
}