package com.grupo21.ifome.Entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int pagamento; //1, 2 ou 3

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToMany(mappedBy = "id.pedido")
    private Set<ItemPedido> itens = new HashSet<>();

    public Pedido(){}

    public Pedido(Integer id, int pagamento, Cliente cliente) {
        this.id = id;
        this.pagamento = pagamento;
        this.cliente = cliente;
    }

    public int getPagamento() {
        return pagamento;
    }

    public void setPagamento(int pagamento) {
        this.pagamento = pagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Set<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(Set<ItemPedido> itens) {
        this.itens = itens;
    }

    public ItemPedido addItemPedido(Pedido ped, Produto prod, double valor, int quantidade){
        ItemPedido item = new ItemPedido(ped, prod, quantidade, valor);
        itens.add(item);
        return item;
    }

    public boolean removeItemPedido(){
        if (itens.size() <= 0){
            return false;
        }
        return itens.remove(itens.size()-1);
    }

}
