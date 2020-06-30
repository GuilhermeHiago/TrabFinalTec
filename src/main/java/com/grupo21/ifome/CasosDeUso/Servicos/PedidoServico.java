package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.ItemPedidoRepositorio;
import com.grupo21.ifome.CasosDeUso.Repositorios.PedidoRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.Exceptions.ObjectNotFoundException;
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
    private PedidoRepositorio PedidoRepositorio;

    @Autowired
    private ItemPedidoRepositorio itemPedidoRepositorio;

    @Autowired
    private ClienteServico clienteServico;

    @Autowired
    private ProdutoServico produtoServico;

    private Pedido novoPedido;

    public Pedido buscaPedidoPorID(Integer id){
        Optional<Pedido> buscaNovoPedido = PedidoRepositorio.findById(id);
        return buscaNovoPedido.orElseThrow(() -> new ObjectNotFoundException("Pedido nao encontradp! Id: "+id+", Tipo: "+ Pedido.class.getName()));
    }

    public List<Pedido> buscaTodosPedidos() {
        return PedidoRepositorio.findAll();
    }

    @Transactional
    public Pedido insereNovoPedido(Pedido novoPedido) {
        novoPedido.setId(null);
        novoPedido.setCliente(clienteServico.buscaCliente(novoPedido.getCliente().getId()));
        novoPedido = PedidoRepositorio.save(novoPedido);
        for (ItemPedido ip : novoPedido.getItens()) {
            ip.setProduto(produtoServico.get(ip.getProduto().getId()));
            ip.setPreco(ip.getProduto().getPreco());
            ip.setPedido(novoPedido);
        }
        itemPedidoRepositorio.saveAll(novoPedido.getItens());
        return novoPedido;
    }

}
