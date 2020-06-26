package com.grupo21.ifome.Interfaces.WebService;

import com.grupo21.ifome.CasosDeUso.Servicos.PedidoServico;
import com.grupo21.ifome.Entidades.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoRecurso {
    @Autowired
    PedidoServico pedidoServico;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Pedido res = pedidoServico.buscarPorId(id);
        return ResponseEntity.ok().body(res);
    }
}
