package com.grupo21.casosDeUso.Servicos;

import java.util.List;
import com.grupo21.casosDeUso.Repositorios.RepositorioPosicao;
import com.grupo21.entidades.Compra;
import com.grupo21.entidades.FormaPagamento;
import com.grupo21.entidades.Posicao;
import com.grupo21.entidades.Produto;

public class ServicosCliente {
    public ServicosCliente(RepositorioPosicao pos){

    }

    public Compra criaCompra(Posicao posCliente, FormaPagamento formaPagamento, List<Produto> produtos){
        Compra c = null;

        // Terminar func

        return c;
    }

    public boolean pontuarProduto(int idProduto, int avaliacao){
        if(avaliacao > 5 || avaliacao < 0){
            return false;
        }

        // Construir Avaliacao

        return true;
    }
}