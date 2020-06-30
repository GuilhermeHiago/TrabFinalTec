package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.ClienteRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.Exceptions.ObjectNotFoundException;
import com.grupo21.ifome.Entidades.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServico {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public List<Cliente> getAll() {
        return clienteRepositorio.findAll();
    }

    public Cliente buscaCliente(Integer id){
        Optional<Cliente> buscaCliente = clienteRepositorio.findById(id);
        return buscaCliente.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: "+id+", Tipo: "+ Cliente.class.getName()));
    }

    public Cliente buscaClientePorEmail(String email) {
        Cliente cliente = clienteRepositorio.findByEmail(email);
        if (cliente == null) {
            throw new ObjectNotFoundException(
                    "Objeto não encontrado! Tipo: " + Cliente.class.getName());
        }
        return cliente;
    }


}
