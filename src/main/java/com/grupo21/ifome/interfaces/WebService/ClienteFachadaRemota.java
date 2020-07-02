package com.grupo21.ifome.interfaces.WebService;

import java.util.List;

import com.grupo21.ifome.casosDeUso.Servicos.ServicosCliente;
import com.grupo21.ifome.entidades.Cliente;
import com.grupo21.ifome.entidades.ItemPedido;
import com.grupo21.ifome.entidades.Pedido;
import com.grupo21.ifome.entidades.Produto;
import com.grupo21.ifome.interfaces.Persistencia.RepositorioProdutoImpMem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/consultacliente")
public class ClienteFachadaRemota {
    ServicosCliente servicoCliente;
    RepositorioProdutoImpMem repProd;

    @Autowired
    public ClienteFachadaRemota(final ServicosCliente servicosCliente, final RepositorioProdutoImpMem repProd) {
        this.servicoCliente = servicosCliente;
        this.repProd = repProd;
    }

    @GetMapping("/criapedido")
    public Pedido criaPedido() {
        return servicoCliente.criaPedido();
    }

    @GetMapping("/additem")
    public Pedido addItem(@RequestParam final int idPedido, @RequestParam final String nome, @RequestParam final int qtd) {
        return servicoCliente.addItemCompra(idPedido, repProd.recuperaPorNome(nome), qtd);
    }

    @GetMapping("/removeitem")
    public Pedido removeItem(@RequestParam int idPedido) {
        return servicoCliente.removeUltimo(idPedido);
    }

    @GetMapping("/getclientes")
    public List<Cliente> getClientes(){
        return servicoCliente.getClientes();
    }

    @GetMapping("/getprodutos")
    public List<Produto> getProdutos(){
        return servicoCliente.getProdutos();
    }

    @GetMapping("fechapedido")
    public DadosCompraDTO finalizaCompra(@RequestParam String cpfCliente, @RequestParam int idPedido){
        servicoCliente.finalizaCompra(idPedido);

        return getDadosCompraDTO(cpfCliente, idPedido);
    }

    @GetMapping("dadoscompraDTO")
    public DadosCompraDTO getDadosCompraDTO(@RequestParam String cpfCliente, @RequestParam int idPedido){
        DadosCompraDTO d = new DadosCompraDTO();
        Pedido p = servicoCliente.getPedido(idPedido);

        for(ItemPedido item : p.getItens()){
            List<String> prod = d.getProdutos();
            prod.add(item.getNome());
            d.setProdutos(prod);
        }

        d.setRestaurante(servicoCliente.escolheRestaurante(cpfCliente, idPedido).getNome());
        d.setValorCompra(servicoCliente.calculaCustoBase(idPedido));
        d.setValorCompraFinal(servicoCliente.calculaCustoBase(idPedido) + servicoCliente.calculaFrete(cpfCliente, idPedido)); // alterar para com desconto
        d.setEntrega(servicoCliente.calculaFrete(cpfCliente, idPedido));
        return d;
    }
}