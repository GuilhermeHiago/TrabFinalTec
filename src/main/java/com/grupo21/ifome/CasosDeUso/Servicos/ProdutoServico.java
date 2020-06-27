package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.CategoriaRepositorio;
import com.grupo21.ifome.CasosDeUso.Repositorios.ProdutoRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.Exceptions.ObjectNotFoundExpection;
import com.grupo21.ifome.Entidades.Categoria;
import com.grupo21.ifome.Entidades.Pedido;
import com.grupo21.ifome.Entidades.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServico {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    private Produto produto;

    public Produto get(Integer id){
        Optional<Produto> buscaProduto = produtoRepositorio.findById(id);
        return buscaProduto.orElseThrow(() -> new ObjectNotFoundExpection("Objeto nao encontradp! Id: "+id+", Tipo: "+ Produto.class.getName()));
    }

    public List<Produto> getAll() {
        return produtoRepositorio.findAll();
    }

    public Page<Produto> search(String nome, List<Integer> ids, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        List<Categoria> categorias = categoriaRepositorio.findAllById(ids);
        return produtoRepositorio.findDistinctByNomeContainingAndCategoriasIn(nome, categorias, pageRequest);
    }

}
