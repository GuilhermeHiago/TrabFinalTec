package com.grupo21.interfaces.WebService;

import java.util.List;

import com.grupo21.casosDeUso.Servicos.ServicosCliente;
import com.grupo21.entidades.ItemPedido;
import com.grupo21.entidades.Pedido;
import com.grupo21.interfaces.Persistencia.RepositorioProdutoImpMem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/consultacliente")
public class ClienteFachadaRemota {
    ServicosCliente servicoCliente;
    RepositorioProdutoImpMem repProd;

    @Autowired
    public ClienteFachadaRemota(ServicosCliente servicosCliente, RepositorioProdutoImpMem repProd){
        this.servicoCliente = servicosCliente;
        this.repProd = repProd;
    }

    @GetMapping("/criapedido")
    public Pedido criaPedido(){
        return servicoCliente.criaPedido();
    }

    @GetMapping("/additem")
    public ItemPedido addItem(@RequestParam  String nome, @RequestParam int qtd){
        return servicoCliente.addItemCompra(repProd.recuperaPorNome(nome), qtd);
    }

    @GetMapping("/removeitem")
    public List<ItemPedido> removeItem(){
        return servicoCliente.removeUltimo();
    }

    @GetMapping("/dadoscompra")
    public DadosCompraDTO getDadosCompra(int id){
        DadosCompraDTO dc = null;
        // criar metodo
        return dc;
    }
}