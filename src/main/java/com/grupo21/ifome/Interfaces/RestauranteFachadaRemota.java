package com.grupo21.ifome.Interfaces;

import com.grupo21.ifome.CasosDeUso.Servicos.*;
import com.grupo21.ifome.Entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/categorias/{id}")
    public Categoria buscaCategoriaPorID(@PathVariable Integer id) {
        Categoria categoria = categoriaServico.buscaCategoriaPorID(id);
        return categoria;
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

    @GetMapping("/cliente/{id}")
    public Cliente buscaCliente(@PathVariable Integer id){
        Cliente cliente = clienteServico.buscaCliente(id);
        return cliente;
    }

    @GetMapping("/cliente/{email}")
    public Cliente buscaClientePorEmail(@PathVariable String email) {
        Cliente cliente = clienteServico.buscaClientePorEmail(email);
        return cliente;
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
