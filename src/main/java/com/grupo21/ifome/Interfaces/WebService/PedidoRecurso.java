package com.grupo21.ifome.Interfaces.WebService;

import com.grupo21.ifome.CasosDeUso.Servicos.PedidoServico;
import com.grupo21.ifome.Entidades.Cliente;
import com.grupo21.ifome.Entidades.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/pedidos")
public class PedidoRecurso {
    @Autowired
    PedidoServico pedidoServico;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pedido> find(@PathVariable Integer id) {
        Pedido res = pedidoServico.get(id);
        return ResponseEntity.ok().body(res);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Pedido>> getAll() {
        List<Pedido> pedidos = pedidoServico.getAll();
        return ResponseEntity.ok().body(pedidos);
    }

    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<Void> insert(@RequestBody Pedido novoPedido) {
        novoPedido = pedidoServico.insert(novoPedido);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(novoPedido.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
