package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.ItemPedidoRepositorio;
import com.grupo21.ifome.CasosDeUso.Repositorios.PedidoRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.Exceptions.ObjectNotFoundExpection;
import com.grupo21.ifome.Entidades.Cliente;
import com.grupo21.ifome.Entidades.ItemPedido;
import com.grupo21.ifome.Entidades.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServico {

    @Autowired
    private PedidoRepositorio novoPedidoRepositorio;

    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Autowired
    private ClienteServico clienteServico;

    @Autowired
    private ProdutoServico produtoServico;

    private Pedido novoPedido;

    public List<Pedido> getAll() {
        return novoPedidoRepositorio.findAll();
    }

    public Pedido get (Integer id){
        Optional<Pedido> buscaNovoPedido = novoPedidoRepositorio.findById(id);
        return buscaNovoPedido.orElseThrow(() -> new ObjectNotFoundExpection("NovoPedidoeto nao encontradp! Id: "+id+", Tipo: "+ Pedido.class.getName()));
    }

    @Transactional
    public Pedido insert(Pedido novoPedido) {
        novoPedido.setId(null);
        novoPedido.setCliente(clienteServico.get(novoPedido.getCliente().getId()));
        novoPedido = novoPedidoRepositorio.save(novoPedido);
        for (ItemPedido ip : novoPedido.getItens()) {
            ip.setProduto(produtoServico.get(ip.getProduto().getId()));
            ip.setPreco(ip.getProduto().getPreco());
            ip.setPedido(novoPedido);
        }
        itemPedidoRepositorio.saveAll(novoPedido.getItens());
        return novoPedido;
    }
}
