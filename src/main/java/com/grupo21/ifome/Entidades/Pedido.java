package com.grupo21.ifome.Entidades;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Entity
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;

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

    private Posicao posicaoEntrega;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "restaurante_id")
    private Restaurante restaurante;

    public Pedido(){}

    public Pedido(Integer id, int pagamento, Cliente cliente, Posicao posicaoEntrega, Restaurante restaurante) {
        this.id = id;
        this.pagamento = pagamento;
        this.cliente = cliente;
        this.posicaoEntrega = posicaoEntrega;
        this.restaurante = restaurante;
    }
    //politica de custo entrega pode ser aplicada aqui

    public double getValorTotal() {
        double soma = 0.0;
        for(ItemPedido ip : itens){
            soma = soma + ip.getSubTotal();
        }
        return soma;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

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

    public Posicao getPosicaoEntrega() { return posicaoEntrega; }

    public void setPosicaoEntrega(Posicao posicaoEntrega) { this.posicaoEntrega = posicaoEntrega; }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        StringBuilder builder = new StringBuilder();
        builder.append("Pedido número: ");
        builder.append(getId());
        builder.append(", Cliente: ");
        builder.append(getCliente().getNome());

        builder.append("\nDetalhes:\n");
        for (ItemPedido ip : getItens()) {
            builder.append(ip.toString());
        }
        builder.append("Valor total: ");
        builder.append(nf.format(getValorTotal()));
        return builder.toString();
    }
}
