package com.grupo21.ifome.casosDeUso.Repositorios;

import java.util.List;

import com.grupo21.ifome.entidades.Cliente;

public interface RepositorioClientes {
    public Cliente recuperaPorCPF(String cpf);
    public List<Cliente> getAll();
}