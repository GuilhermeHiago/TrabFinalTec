package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.ClienteRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.Exceptions.ObjectNotFoundExpection;
import com.grupo21.ifome.Entidades.Cliente;
import com.grupo21.ifome.Interfaces.WebService.ResourceExceptionHandler.DataIntegrityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServico {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public List<Cliente> getAll() {
        return clienteRepositorio.findAll();
    }

    public Cliente get(Integer id){
        Optional<Cliente> buscaCliente = clienteRepositorio.findById(id);
        return buscaCliente.orElseThrow(() -> new ObjectNotFoundExpection("Objeto nao encontradp! Id: "+id+", Tipo: "+ Cliente.class.getName()));
    }

    public Cliente insere(Cliente novaCliente) {
        novaCliente.setId(null);
        return clienteRepositorio.save(novaCliente);
    }

    public Cliente update(Cliente Cliente) {
        get(Cliente.getId());
        return clienteRepositorio.save(Cliente);
    }

    public void delete(Integer id) {
        get(id);
        try {
            clienteRepositorio.deleteById(id);
        } catch(DataIntegrityViolationException e) {
            throw new DataIntegrityException("Não é possivel excluir uma Cliente que possui produtos");
        }
    }
}
