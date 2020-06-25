package com.grupo21.ifome.interfaces.WebService;

import java.util.List;

import com.grupo21.ifome.casosDeUso.Servicos.ServicosCliente;
import com.grupo21.ifome.entidades.ItemPedido;
import com.grupo21.ifome.entidades.Pedido;
import com.grupo21.ifome.interfaces.Persistencia.RepositorioProdutoImpMem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/consultacliente")
public class ClienteFachadaRemota {
    ServicosCliente servicoCliente;
    RepositorioProdutoImpMem repProd;

    @Autowired
    public ClienteFachadaRemota(final ServicosCliente servicosCliente, final RepositorioProdutoImpMem repProd) {
        this.servicoCliente = servicosCliente;
        this.repProd = repProd;
    }

    @GetMapping("/criapedido")
    public Pedido criaPedido() {
        return servicoCliente.criaPedido();
    }

    @GetMapping("/additem")
    public ItemPedido addItem(@RequestParam final String nome, @RequestParam final int qtd) {
        return servicoCliente.addItemCompra(repProd.recuperaPorNome(nome), qtd);
    }

    @GetMapping("/removeitem")
    public List<ItemPedido> removeItem() {
        return servicoCliente.removeUltimo();
    }

    /*@GetMapping("/dadoscompra")
    public DadosCompraDTO getDadosCompra(final int id) {
        final DadosCompraDTO dc = null;
        // criar metodo
        return dc;
    }*/
}