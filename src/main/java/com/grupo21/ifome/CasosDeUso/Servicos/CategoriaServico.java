package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.CategoriaRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.Exceptions.ObjectNotFoundExpection;
import com.grupo21.ifome.Entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaServico {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    public Categoria buscarPorId(Integer id){
        Optional<Categoria> buscaCategria = categoriaRepositorio.findById(id);
        return buscaCategria.orElseThrow(() -> new ObjectNotFoundExpection("Objeto nao encontradp! Id: "+id+", Tipo: "+ Categoria.class.getName()));
    }
}
