package com.grupo21.ifome.casosDeUso.Servicos;

import java.util.LinkedList;
import java.util.List;
import com.grupo21.ifome.casosDeUso.Repositorios.RepositorioPosicao;
import com.grupo21.ifome.entidades.Pedido;
import com.grupo21.ifome.entidades.FormaPagamento;
import com.grupo21.ifome.entidades.ItemPedido;
import com.grupo21.ifome.entidades.Posicao;
import com.grupo21.ifome.entidades.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Service
public class ServicosCliente {
    Pedido pedido;
    static int id = 100000;

    @Autowired
    public ServicosCliente(){
    }

    public Pedido criaPedido(){//Posicao posCliente, FormaPagamento formaPagamento, List<Produto> produtos){
        pedido = new Pedido(id);
        id += 1;
        return pedido;
    }

    public ItemPedido addItemCompra(Produto p, int qtd){
        return pedido.addItemPedido(p.getNome(), p.getValor(), qtd);
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