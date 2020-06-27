package com.grupo21.ifome.Interfaces.WebService;

import com.grupo21.ifome.CasosDeUso.Servicos.ClienteServico;
import com.grupo21.ifome.Entidades.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/clientes")
public class ClienteRecurso {
    @Autowired
    ClienteServico clienteServico;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> get(@PathVariable Integer id) {
        Cliente res = clienteServico.get(id);
        return ResponseEntity.ok().body(res);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Cliente>> getAll() {
        List<Cliente> clientes = clienteServico.getAll();
        return ResponseEntity.ok().body(clientes);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Cliente novacliente) {
        novacliente = clienteServico.insere(novacliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(novacliente.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Void> update(@RequestBody Cliente cliente, @PathVariable Integer id) {
        cliente = clienteServico.update(cliente);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        clienteServico.delete(id);
        return ResponseEntity.noContent().build();
    }
}
