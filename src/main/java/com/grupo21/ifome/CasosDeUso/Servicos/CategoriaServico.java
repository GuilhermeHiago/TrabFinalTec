package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.CategoriaRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.Exceptions.ObjectNotFoundExpection;
import com.grupo21.ifome.Entidades.Categoria;
import com.grupo21.ifome.Interfaces.WebService.ResourceExceptionHandler.DataIntegrityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServico {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    public List<Categoria> getAll() {
        return categoriaRepositorio.findAll();
    }

    public Categoria get(Integer id) {
        Optional<Categoria> buscaCategria = categoriaRepositorio.findById(id);
        return buscaCategria.orElseThrow(() -> new ObjectNotFoundExpection("Objeto nao encontradp! Id: "+id+", Tipo: "+ Categoria.class.getName()));
    }

    public Categoria insere(Categoria novaCategoria) {
        novaCategoria.setId(null);
        return categoriaRepositorio.save(novaCategoria);
    }

    public Categoria update(Categoria categoria) {
        get(categoria.getId());
        return categoriaRepositorio.save(categoria);
    }

    public void delete(Integer id) {
        get(id);
        try {
            categoriaRepositorio.deleteById(id);
        } catch(DataIntegrityViolationException e) {
            throw new DataIntegrityException("Não é possivel excluir uma categoria que possui produtos");
        }

    }
}
