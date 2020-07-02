package com.grupo21.ifome.entidades;

public class ItemPedido {
    private String nome;
    private int quantidade;
    private double valorUnitario;

    public ItemPedido(){}

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

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}