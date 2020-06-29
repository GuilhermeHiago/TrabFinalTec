package com.grupo21.ifome.Interfaces.WebService;

import java.util.List;
import java.util.ArrayList;

import com.grupo21.ifome.CasosDeUso.Repositorios.ClienteRepositorio;
import com.grupo21.ifome.CasosDeUso.Repositorios.ProdutoRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.ClienteServico;
import com.grupo21.ifome.CasosDeUso.Servicos.PedidoServico;
import com.grupo21.ifome.CasosDeUso.Servicos.ProdutoServico;
import com.grupo21.ifome.Entidades.Cliente;
import com.grupo21.ifome.Entidades.ItemPedido;
import com.grupo21.ifome.Entidades.Pedido;
import com.grupo21.ifome.Entidades.Produto;

import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/consultacliente")
public class ClienteFachada {
    ClienteServico servicoCliente;
    PedidoServico servicoPedido;
    ClienteRepositorio repCliente;
    ProdutoRepositorio repProd;

    @Autowired
    public ClienteFachada(final ClienteServico servicosCliente, final PedidoServico servicoPedido, final ClienteRepositorio repCliente, final ProdutoRepositorio repProd) {
        this.servicoCliente = servicosCliente;
        this.servicoPedido = servicoPedido;
        this.repCliente = repCliente;
        this.repProd = repProd;
    }

    @GetMapping("/criapedido")
    public Pedido criaPedido(@RequestParam String cpfCliente, @RequestParam int pagamento) {
        Cliente c = null;
        
        // Deve existir cliente
        for(Cliente cliente : repCliente.findAll()){
            if(cliente.getCpf() == cpfCliente){
                c = cliente;
            }
        }

        Pedido p = new Pedido();
        p.setId(null);
        p.setCliente(c);
        p.setPagamento(pagamento);

        return servicoPedido.insert(p);
    }

    @GetMapping("/additem")
    public Pedido addItem(@RequestParam final int idPedido, @RequestParam final String nome, @RequestParam final int qtd) {
        Pedido p = servicoPedido.get(idPedido);
        Produto prod = null;

        for(Produto produto : repProd.findAll()){
            if(produto.getNome() == nome){
                prod = produto;
            }
        }

        java.util.Set<ItemPedido> novoPedido = p.getItens();
        novoPedido.add(new ItemPedido(p, prod, qtd, prod.getPreco()));

        p.setItens(novoPedido);

        return p;
    }

    @GetMapping("/removeitem")
    public Pedido removeItem(@RequestParam final int idPedido) {
        Pedido p = servicoPedido.get(idPedido);

        java.util.Set<ItemPedido> novoPedido = p.getItens();
        Object[] o = novoPedido.toArray();
        novoPedido.remove(o[o.length]);

        return p;
    }

    /*@GetMapping("/dadoscompra")
    public DadosCompraDTO getDadosCompra(final int id) {
        final DadosCompraDTO dc = null;
        // criar metodo
        return dc;
    }*/
}