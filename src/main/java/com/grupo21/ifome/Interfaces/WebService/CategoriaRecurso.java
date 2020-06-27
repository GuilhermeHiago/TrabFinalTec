package com.grupo21.ifome.Interfaces.WebService;

import com.grupo21.ifome.CasosDeUso.Servicos.CategoriaServico;
import com.grupo21.ifome.Entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaRecurso {
    @Autowired
    CategoriaServico categoriaServico;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Categoria>> getAll() {
        List<Categoria> categorias = categoriaServico.getAll();
        return ResponseEntity.ok().body(categorias);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Categoria> getById(@PathVariable Integer id) {
        Categoria res = categoriaServico.get(id);
        return ResponseEntity.ok().body(res);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Categoria novaCategoria) {
        novaCategoria = categoriaServico.insere(novaCategoria);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(novaCategoria.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Categoria categoria, @PathVariable Integer id) {
        categoria = categoriaServico.update(categoria);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        categoriaServico.delete(id);
        return ResponseEntity.noContent().build();
    }
}
