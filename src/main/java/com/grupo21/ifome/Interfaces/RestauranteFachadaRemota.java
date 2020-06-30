package com.grupo21.ifome.Interfaces;

import com.grupo21.ifome.CasosDeUso.Servicos.*;
import com.grupo21.ifome.Entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestauranteFachadaRemota {

    @Autowired
    CategoriaServico categoriaServico;

    @Autowired
    RestauranteServico restauranteServico;

    @Autowired
    PedidoServico pedidoServico;

    @Autowired
    ClienteServico clienteServico;

    @Autowired
    PosicaoServico posicaoServico;

    @Autowired
    private ProdutoServico produtoServico;

    public RestauranteFachadaRemota() {
    }

    @GetMapping("/categorias")
    public List<Categoria> buscaTodasCategorias() {
        return categoriaServico.buscaTodasCategorias();
    }

    @GetMapping("/restaurantes")
    public List<Restaurante> listaRestaurantes() { return restauranteServico.buscaTodosRestaurantes(); }

    @GetMapping("/pedidos")
    public List<Pedido> BuscaTodosPedidos() {
        return pedidoServico.buscaTodosPedidos();
    }

    @GetMapping("/adiciona-pedido")
    public ResponseEntity<Void> insereNovoPedido(@RequestBody Pedido novoPedido) {
        novoPedido = pedidoServico.insereNovoPedido(novoPedido);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(novoPedido.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/cadastro-cliente")
    public ResponseEntity<Void> cadastraNovoCliente(@RequestBody Cliente novacliente) {
        novacliente = clienteServico.cadastraNovoCliente(novacliente);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(novacliente.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/posicao/{id}")
    public Posicao buscaPosicaoPorID(@PathVariable Integer id) {
        Posicao res = posicaoServico.buscarPorId(id);
        return res;
    }

    @GetMapping("/produtos/{id}")
    public Produto buscaProdutos(@PathVariable Integer id) {
        Produto produto = produtoServico.get(id);
        return produto;
    }

    @GetMapping("/produtos")
    public List<Produto> buscaTodosProdutos(){
        return produtoServico.buscaTodosProdutos();
    }

}
