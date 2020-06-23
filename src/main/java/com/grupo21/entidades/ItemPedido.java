package com.grupo21.entidades;

public class ItemPedido {
    private String nome;
    private int quantidade;
    private double valorUnitario;

    public ItemPedido(String nome, int quantidade, double valorUnitario){
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void aumentaQtd(){
        quantidade += 1;
    }
}