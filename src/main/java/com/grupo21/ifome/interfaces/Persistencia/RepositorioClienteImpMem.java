package com.grupo21.ifome.interfaces.Persistencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.grupo21.ifome.casosDeUso.Repositorios.RepositorioClientes;
import com.grupo21.ifome.entidades.Cliente;
import com.grupo21.ifome.entidades.Posicao;

import org.springframework.stereotype.Component;

@Component
public class RepositorioClienteImpMem implements RepositorioClientes {
    private Map<String, Cliente> clientes;

    public RepositorioClienteImpMem(){
        clientes = new HashMap<String, Cliente>();
        Cliente c = new Cliente("João das Couves", "12345678", new Posicao(75, 33));

        clientes.put(c.getCpf(), c);
    }

    @Override
    public Cliente recuperaPorCPF(String cpf) {
        return clientes.get(cpf);
    }

    @Override
    public List<Cliente> getAll() {
        return new ArrayList<Cliente>(clientes.values());
    }
    
}