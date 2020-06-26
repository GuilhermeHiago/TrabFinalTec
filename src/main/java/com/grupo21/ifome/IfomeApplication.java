package com.grupo21.ifome;

import com.grupo21.ifome.CasosDeUso.Repositorios.*;
import com.grupo21.ifome.Entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = {"com.grupo21"})
public class IfomeApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepositorio categoriaRepositorio;

	@Autowired
	private ProdutoRepositorio produtoRepositorio;

	@Autowired
	private ClienteRepositorio clienteRepositorio;

	@Autowired
	private PedidoRepositorio pedidoRepositorio;

	@Autowired
	private ItemPedidoRepositorio itemPedidoRepositorio;

	@Autowired
	private PosicaoRepositorio posicaoRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(IfomeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//instanciando categorias
		Categoria cat1 = new Categoria(null, "pizza");
		Categoria cat2 = new Categoria(null, "sopas");

		//instanciando produtos
		Produto p1 = new Produto(null, "sopa de tomate", "sopinha feita de tomates frescos", "https://i.imgur.com/IGmthUT.png", 200, 18.90);
		Produto p2 = new Produto(null, "sopa de cenoura", "sopinha feita de tomates frescos", "https://i.imgur.com/IGmthUT.png", 200, 18.90);
		Produto p3 = new Produto(null, "pizza calabresa", "pizza de calabresa", "https://i.imgur.com/IGmthUT.png", 200, 18.90);

		cat1.getProdutos().addAll(Arrays.asList(p3));
		cat2.getProdutos().addAll(Arrays.asList(p1, p2));

		p1.getCategorias().addAll(Arrays.asList(cat2));
		p2.getCategorias().addAll(Arrays.asList(cat2));
		p2.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepositorio.saveAll(Arrays.asList(cat1, cat2));
		produtoRepositorio.saveAll(Arrays.asList(p1,p2,p3));

		Posicao pos1 = new Posicao(null,56,78);

		//instanciando cliente
		Cliente c1 = new Cliente(null, "Alanzoka", "alanzoka@gmail.com", "888888888888", pos1);

		posicaoRepositorio.saveAll(Arrays.asList(pos1));
		clienteRepositorio.saveAll(Arrays.asList(c1));



		//fazendo o pedido
		Pedido ped1 = new Pedido(null, 1, c1);

		//pedidos do cliente
		c1.getPedidos().addAll(Arrays.asList(ped1));

		pedidoRepositorio.saveAll(Arrays.asList(ped1));

		ItemPedido ip1 = new ItemPedido(ped1, p1, 5, 18.00);

		ped1.getItens().addAll(Arrays.asList(ip1));

		itemPedidoRepositorio.saveAll(Arrays.asList(ip1));
	}
}
