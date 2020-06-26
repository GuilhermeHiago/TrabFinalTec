package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.PedidoRepositorio;
import com.grupo21.ifome.CasosDeUso.Servicos.Exceptions.ObjectNotFoundExpection;
import com.grupo21.ifome.Entidades.ItemPedido;
import com.grupo21.ifome.Entidades.Pedido;
import com.grupo21.ifome.Entidades.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoServico {

    @Autowired
    private PedidoRepositorio pedidoRepositorio;

    private Pedido pedido;

    public Pedido buscarPorId(Integer id){
        Optional<Pedido> buscaPedido = pedidoRepositorio.findById(id);
        return buscaPedido.orElseThrow(() -> new ObjectNotFoundExpection("Objeto nao encontradp! Id: "+id+", Tipo: "+ Pedido.class.getName()));
    }


    public Pedido criaPedido(){//Posicao posCliente, FormaPagamento formaPagamento, List<Produto> produtos){
        pedido = new Pedido();
        return pedido;
    }

    public ItemPedido addItemCompra(Produto prod, Pedido ped,int qtd){
        return pedido.addItemPedido(ped, prod, prod.getPreco(), qtd);
    }

    public List<ItemPedido> removeUltimo(){
        pedido.removeItemPedido();

        List<ItemPedido> itens = new LinkedList<>();
        for(ItemPedido i:pedido.getItens()){
            itens.add(i);
        }
        return itens;
    }

    public Pedido finalizaCompra(){
        return pedido;
    }

    public boolean pontuarProduto(int idProduto, int avaliacao){
        if(avaliacao > 5 || avaliacao < 0){
            return false;
        }

        // Construir Avaliacao

        return true;
    }
}
