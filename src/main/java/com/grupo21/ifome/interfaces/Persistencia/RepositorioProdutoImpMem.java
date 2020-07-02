package com.grupo21.ifome.interfaces.Persistencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.grupo21.ifome.casosDeUso.Repositorios.RepositorioProdutos;
import com.grupo21.ifome.entidades.Produto;

import org.springframework.stereotype.Component;

@Component
public class RepositorioProdutoImpMem implements RepositorioProdutos {
    private final Map<String, Produto> produtos;

    public RepositorioProdutoImpMem() {
        produtos = new HashMap<>();

        produtos.put("Prato1", new Produto("Prato1", 35.50));
        produtos.put("Prato2", new Produto("Prato2", 15.50));
        produtos.put("Prato3", new Produto("Prato3", 55.50));
        produtos.put("Prato4", new Produto("Prato4", 25.50));
        produtos.put("Prato5", new Produto("Prato5", 17.50));
        produtos.put("Prato6", new Produto("Prato6", 40.50));
        produtos.put("Prato7", new Produto("Prato7", 55.50));
        produtos.put("Prato8", new Produto("Prato8", 25.50));
        produtos.put("Prato9", new Produto("Prato9", 17.50));
        //produtos.put("Prato10", new Produto("Prato10", 40.50));
    }

    public Produto recuperaPorNome(final String nome) {
        return produtos.get(nome);
    }

    @Override
    public List<Produto> getAll() {
        return new ArrayList<Produto>(produtos.values());
    }

}