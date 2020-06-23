package com.grupo21.casosDeUso.Servicos;

import java.util.List;
import com.grupo21.casosDeUso.Repositorios.RepositorioPosicao;
import com.grupo21.entidades.Pedido;
import com.grupo21.entidades.FormaPagamento;
import com.grupo21.entidades.ItemPedido;
import com.grupo21.entidades.Posicao;
import com.grupo21.entidades.Produto;

public class ServicosCliente {
    public ServicosCliente(RepositorioPosicao pos){

    }

    public Pedido criaPedido(Posicao posCliente, FormaPagamento formaPagamento, List<Produto> produtos){
        Pedido c = null;

        // Terminar func

        return c;
    }

    public ItemPedido addItemCompra(Produto p){
        ItemPedido item = new ItemPedido(p.getNome(), 1, p.getValor());
        return item;
    }

    public Pedido finalizaCompra(){
        Pedido p = null;
        return p;
    }

    public boolean pontuarProduto(int idProduto, int avaliacao){
        if(avaliacao > 5 || avaliacao < 0){
            return false;
        }

        // Construir Avaliacao

        return true;
    }
}