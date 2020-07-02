package com.grupo21.ifome.casosDeUso.Servicos;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.grupo21.ifome.entidades.Pedido;
import com.grupo21.ifome.casosDeUso.Politicas.CustoCompra;
import com.grupo21.ifome.casosDeUso.Politicas.CustoViagem;
import com.grupo21.ifome.casosDeUso.Politicas.SelecaoRestaurante;
import com.grupo21.ifome.casosDeUso.Repositorios.RepositorioClientes;
import com.grupo21.ifome.casosDeUso.Repositorios.RepositorioProdutos;
import com.grupo21.ifome.casosDeUso.Repositorios.RepositorioRestaurantes;
import com.grupo21.ifome.entidades.Cliente;
import com.grupo21.ifome.entidades.ItemPedido;
import com.grupo21.ifome.entidades.Produto;
import com.grupo21.ifome.entidades.Restaurante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Service
public class ServicosCliente {
    CustoCompra politicaCompraBasica;
    CustoViagem politicaCustoViagem;
    SelecaoRestaurante politicaRestaurante;
    RepositorioClientes repClientes;
    RepositorioRestaurantes repRestaurantes;
    RepositorioProdutos repProdutos;
    Map<Integer,Pedido> pedidos;
    static int id = 1;

    @Autowired
    public ServicosCliente(CustoCompra custoBase, CustoViagem custoViagem, SelecaoRestaurante selecRestaurante, RepositorioClientes repClie, 
            RepositorioRestaurantes repRes, RepositorioProdutos repProd) {

        pedidos = new HashMap<>();
        politicaCompraBasica = custoBase;
        politicaCustoViagem = custoViagem;
        politicaRestaurante = selecRestaurante;
        repClientes = repClie;
        repRestaurantes = repRes;
        repProdutos = repProd;
    }

    public Pedido criaPedido(){//Posicao posCliente, FormaPagamento formaPagamento, List<Produto> produtos){
        Pedido pedido = new Pedido(id);
        pedidos.put(id, pedido);
        id += 1;
        return pedido;
    }

    public Pedido addItemCompra(int idPedido, Produto p, int qtd){
        pedidos.get(idPedido).addItemPedido(p.getNome(), p.getValor(), qtd);
        System.out.println(pedidos.get(idPedido));
        return pedidos.get(idPedido);
    }

    public Pedido removeUltimo(int idPedido){
        pedidos.get(idPedido).removeItemPedido();

        /*List<ItemPedido> itens = new LinkedList<>();
        for(ItemPedido i:pedidos.get(idPedido).getItens()){
            itens.add(i);
        }*/
        return pedidos.get(idPedido);
    }

    public Pedido finalizaCompra(int idPedido){
        return pedidos.get(idPedido);
    }

    public double calculaCustoBase(int idPedido){
        Pedido p = pedidos.get(idPedido);

        return politicaCompraBasica.get_valor(p.getItens());
    }

    public Restaurante escolheRestaurante(String cpfCliente, int idPedido){
        return politicaRestaurante.escolheRestaurante(repClientes.recuperaPorCPF(cpfCliente), pedidos.get(idPedido), repRestaurantes.getAll());
    }

    public double calculaFrete(String cpfCliente, int idPedido){
        return politicaCustoViagem.get_valor(escolheRestaurante(cpfCliente, idPedido).getPos(), repClientes.recuperaPorCPF(cpfCliente).getPos());
    }

    public boolean pontuarProduto(int idProduto, int avaliacao){
        if(avaliacao > 5 || avaliacao < 0){
            return false;
        }

        // Construir Avaliacao

        return true;
    }

    public List<Cliente> getClientes(){
        return repClientes.getAll();
    }

    public Cliente getCliente(String cpf){
        return repClientes.recuperaPorCPF(cpf);
    }

    public List<Produto> getProdutos(){
        return repProdutos.getAll();
    }

    public Pedido getPedido(int idPedido){
        return pedidos.get(idPedido);
    }
}