package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.CategoriaRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.Exceptions.ObjectNotFoundException;
import com.grupo21.ifome.Entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServico {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    public List<Categoria> buscaTodasCategorias() {
        return categoriaRepositorio.findAll();
    }

    public Categoria get(Integer id) {
        Optional<Categoria> buscaCategria = categoriaRepositorio.findById(id);
        return buscaCategria.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado! Id: "+id+", Tipo: "+ Categoria.class.getName()));
    }

    public Categoria insere(Categoria novaCategoria) {
        novaCategoria.setId(null);
        return categoriaRepositorio.save(novaCategoria);
    }

}
