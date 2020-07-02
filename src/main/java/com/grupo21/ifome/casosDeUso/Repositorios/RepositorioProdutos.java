package com.grupo21.ifome.casosDeUso.Repositorios;

import java.util.List;

import com.grupo21.ifome.entidades.Produto;

public interface RepositorioProdutos {
    public Produto recuperaPorNome(String nome);
    public List<Produto> getAll();
}