package com.grupo21.ifome.CasosDeUso.Servicos;

import com.grupo21.ifome.CasosDeUso.Repositorios.*;
import com.grupo21.ifome.Entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBServico {

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

    @Autowired
    private RestauranteRepositorio restauranteRepositorio;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    public void instantiateTestDatabase() {
        //instanciando posicao geografica Restaurantes
        Posicao posicaoRestaurante1 = new Posicao(null,50,35);
        Posicao posicaoRestaurante2 = new Posicao(null,36,45);
        Posicao posicaoRestaurante3 = new Posicao(null,54, 78);
        posicaoRepositorio.saveAll(Arrays.asList(posicaoRestaurante1, posicaoRestaurante2, posicaoRestaurante3));


        //instanciando restaurantes
        Restaurante restauranteFilial1 = new Restaurante(null, "Ifome filial Cidade Baixa", "65872733000161", posicaoRestaurante1);
        Restaurante restauranteFilial2 = new Restaurante(null, "Ifome filial Ipiranga", "12547485000117", posicaoRestaurante2);
        Restaurante restauranteFilial3 = new Restaurante(null, "Ifome filial Barra Shopping Sul", "72305884000101", posicaoRestaurante3);
        restauranteRepositorio.saveAll(Arrays.asList(restauranteFilial1, restauranteFilial2, restauranteFilial3));

        //instanciando categorias
        Categoria categoria1 = new Categoria(null, "Especiais de Inverno", "https://i.imgur.com/l7PfOzS.png");
        Categoria categoria2 = new Categoria(null, "Lanches", "https://i.imgur.com/z61SfxX.png");
        Categoria categoria3 = new Categoria(null, "Vegetariana", "https://i.imgur.com/jvXKKc8.png");
        Categoria categoria4 = new Categoria(null, "Massas", "https://i.imgur.com/pNFjucK.png");
        Categoria categoria5 = new Categoria(null, "Doces e bolos", "https://i.imgur.com/dxTa404.png");
        Categoria categoria6 = new Categoria(null, "Bebidas", "https://i.imgur.com/G08jnOG.png");

//        //instanciando produtos
        Produto p1 = new Produto(
                null,
                "Creme de beterraba",
                "O creme de beterraba faz sucesso independentemente do clima lá fora, e o nosso tem aquele sabor de comida caseira, feita com afeto mesmo, sabe? O sabor da beterraba, apesar de protagonista, deixa espaço pro parmesão e pro toque do louro. Uma comida que mais parece abraço.",
                "https://i.imgur.com/5fP4X2j.png",
                "https://i.imgur.com/dfNAWeM.png",
                "https://i.imgur.com/VuNnGTV.png",
                "350g",
                13.90
        );

        Produto p2 = new Produto(
                null, "Creme de cenoura",
                "Cremoso e saboroso, esse creme sacia a fome e joga o frio pra longe, além de combinar com queijo (principalmente de cabra), mas é bem rico em proteína, então nem precisa se preocupar em complementar o prato. Uma opção saudável pra quando a queremos matar as saudades de quem fazia aquela comida afetiva pra gente. E se quiser deixar essa refeição ainda mais bonita, finalize com croutons ou folhas de salsinha.",
                "https://i.imgur.com/1oxBAzz.png",
                "https://i.imgur.com/g1y2WwB.png",
                "https://i.imgur.com/eyat5ra.png",
                "350g",
                13.90
        );

        Produto p3 = new Produto(
                null, "Creme de abóbora",
                "Este creme de abóbora é muito cremoso e saboroso, para aquecer até os dias mais frios. A abóbora cozida tem muito betacaroteno, traz mais vida porque é um composto protetor.Pra esquentar ainda mais, o gengibre entra e traz um sabor super especial e picante, mas bem de leve. Esta sopa deliciosa é ótima para um jantar levinho, ou como entrada, substituindo a salada no inverno.",
                "https://i.imgur.com/3D3qhcc.png",
                "https://i.imgur.com/jbVDjx0.png",
                "https://i.imgur.com/JYrKf8O.png",
                "350g",
                12.90
        );

        Produto p4 = new Produto(
                null, "Creme de tomate",
                "Um delicioso creme de tomate caseiro e natural, como manda a tradição italiana - mas o nome e a técnica culinária vêm do francês, sabia? Aqui usamos o tomate cozido bem devagar. Esse processo ajuda na absorção do licopeno, o pigmento responsável pela cor vermelha do tomate e por benefícios importantíssimos pra nossa saúde.",
                "https://i.imgur.com/61SXwQr.png",
                "https://i.imgur.com/X5uL5nW.png",
                "https://i.imgur.com/IGmthUT.png",
                "350g",
                13.90
        );

        Produto p5 = new Produto(
                null, "Triplo cheesburguer",
                "Um clássico da culinária mundial que tem apenas o que um hamburguer precisa: pão fofinho, um queijo cheddar(que não pode faltar né?), sal e três camadas de carne de qualidade. Nosso hamburguer é feito com fraldinha de primeira temperada com sal rosa. Esse corte da carne fica ótimo no hambúrguer, porque tem uma certa quantidade de gordura, ideal para deixar bem macio e saboroso. É rico em proteína, zero carboidratos.",
                "https://i.imgur.com/1oxBAzz.png",
                "https://i.imgur.com/HF8GByH.png",
                "https://i.imgur.com/IoDQTkN.png",
                "280g",
                23.90
        );

        Produto p6 = new Produto(
                null, "Hamburguer tradicional",
                "Um clássico da culinária mundial que tem apenas o que um hamburguer precisa: pão fofinho, um queijo cheddar(que não pode faltar né?), sal e três camadas de carne de qualidade. Nosso hamburguer é feito com fraldinha de primeira temperada com sal rosa. Esse corte da carne fica ótimo no hambúrguer, porque tem uma certa quantidade de gordura, ideal para deixar bem macio e saboroso. É rico em proteína, zero carboidratos.",
                "https://i.imgur.com/zqYKoRg.png",
                "https://i.imgur.com/wjWSWkj.png",
                "https://i.imgur.com/XACFMZc.png",
                "280g",
                19.90
        );

        Produto p7 = new Produto(
                null, "Hamburguer vegetariano",
                "Nosso hamburguer vegetariano é feito com um pão integral especial, a proteina, é o falafel, que é um bolinho de grão de bico típico do Oriente Médio que faz sucesso em todo lugar. Nossa versão não é frita, como a receita original, e leva farinha de arroz, ao invés da farinha de trigo, pra dar liga com mais leveza. Além disso, só usamos temperos naturais, que deixam sua refeição mais saudável e saborosa. Que tal experimentar?",
                "https://i.imgur.com/CxAlDex.png",
                "https://i.imgur.com/qX2EIny.png",
                "https://i.imgur.com/ZItpn3t.png",
                "300g",
                22.90
        );

        Produto p8 = new Produto(
                null, "Cachorro quente",
                "A massa amarela do pão por causa da abóbora já convida a gente a dar uma bela mordida, e ainda tem o recheio saboroso, composto por uma salsicha defumada incrivelmente saborosa, molho de tomate da casa, milho e ervilhas orgânicas, com um toque final de batata palha extremamente crocante que é sempre sucesso. Cebolinha e queijo ralado dão seu toque de sabor delicado.",
                "https://i.imgur.com/WQG7mRh.jpg",
                "https://i.imgur.com/O8iuUOF.png",
                "https://i.imgur.com/TmzVYx6.png",
                "180g",
                16.90
        );

        Produto p9 = new Produto(
                null, "Croissant",
                "Tão perfeito que você vai incluir no dia a dia. Macio na medida, e uma delícia com diferentes recheios, como manteiga, creme de avelã ou nossas pastas, por exemplo. E não tem erro: ainda combina com café, chá, suco... Um pão leve, crocante e bem fiel ao que você tem na memória. Se quiser sentir bem o folhado, é só assar no forno, pois no micro-ondas fica mais molhadinho.",
                "https://i.imgur.com/yZtb7jf.jpg",
                "https://i.imgur.com/nnwZRNx.png",
                "https://i.imgur.com/eTSb46A.png",
                "70g",
                7.90
        );

        Produto p10 = new Produto(
                null, "Donut bolo de aniver",
                "Nossa receita é a tradicional massa com baunilha e cobertura do misterioso sabor de bolo de aniversário. Para adoçar, preferimos usar o açúcar de coco que, além de ser bem mais saudável, tem um leve sabor de caramelo. Experimente, vai bem em qualquer momento do dia, do café da manhã à sobremesa.",
                "https://i.imgur.com/YudZYlR.png",
                "https://i.imgur.com/bsdI6zC.png",
                "https://i.imgur.com/1VSuRNu.png",
                "90g",
                6.90
        );

        Produto p11 = new Produto(
                null, "Donut de chocolate",
                "Nossa receita é a tradicional massa com baunilha e cobertura de chocolate. Utilizamos chocolate 70% cacau para gotas com sabor intenso de chocolate.Para adoçar, preferimos usar o açúcar de coco que, além de ser bem mais saudável, tem um leve sabor de caramelo. Experimente, vai bem em qualquer momento do dia, do café da manhã à sobremesa.",
                "https://i.imgur.com/sOH2ALA.png",
                "https://i.imgur.com/Ag8qA8m.png",
                "https://i.imgur.com/ekyzcNa.png",
                "90g",
                6.90
        );

        Produto p12 = new Produto(
                null, "Milkshake de chocolate",
                "O nosso milkshake de chocolate 40% é feito com leite e batido na hora. Deliciosamente cremeso, nosso leite vegetal, torna o milkshake mais leve, fazendo você aproveitar ele muito mais! Que tal experimentar?",
                "https://i.imgur.com/W6gfji1.png",
                "https://i.imgur.com/XIvYXFV.png",
                "https://i.imgur.com/W5sl9xa.png",
                "400ml",
                18.90
        );

        Produto p13 = new Produto(
                null, "Milkshake de morango",
                "O nosso milkshake de morango é feito com leite e batido na hora. Deliciosamente cremeso, nosso leite vegetal, torna o milkshake mais leve, fazendo você aproveitar ele muito mais! Que tal experimentar?",
                "https://i.imgur.com/cRoNYSe.png",
                "https://i.imgur.com/y81aEiz.png",
                "https://i.imgur.com/yD0gSj6.png",
                "400ml",
                18.90
        );

        Produto p14 = new Produto(
                null, "Mousse de chocolate",
                "Bateu a vontade de comer um doce gostoso? Que tal nosso mousse? Ele é feito com um super chocolate que tem 70% de cacau, que dá um sabor intenso e uma cremosidade sem igual. Além disso, a receita não leva farinha, então ele fica mais leve - e continua delicioso. E ainda tem pedaços de chocolate por cima, que surpreendem você numa mordida aqui, outra ali, com um crec! Não dá pra não provar. E depois de provar, não dá pra não amar.",
                "https://i.imgur.com/eFkYD8J.png",
                "https://i.imgur.com/a9uk4Ea.png",
                "https://i.imgur.com/cejlf7l.png",
                "150g",
                12.90
        );

        Produto p15 = new Produto(
                null, "Suco Verde Green People",
                "O suco verde é para aquela pessoa que procura uma bebida natural ao seu alcance. Refresca, traz o docinho da maçã, as fibras da couve e algumas notas de cenoura.Ele é a combinação perfeita para um café da manhã equilibrado. Nada melhor do que começar o dia com um desses.",
                "https://i.imgur.com/K2cfxLP.png",
                "https://i.imgur.com/fSUTWSp.png",
                "https://i.imgur.com/80wuIMl.png",
                "250ml",
                8.00
        );

        Produto p16 = new Produto(
                null, "Suco de laranja",
                "O suco verde é para aquela pessoa que procura uma bebida natural ao seu alcance. Refresca, traz o docinho da maçã, as fibras da couve e algumas notas de cenoura.Ele é a combinação perfeita para um café da manhã equilibrado. Nada melhor do que começar o dia com um desses.",
                "https://i.imgur.com/K2cfxLP.png",
                "https://i.imgur.com/fSUTWSp.png",
                "https://i.imgur.com/80wuIMl.png",
                "250ml",
                8.00
        );

        Produto p17 = new Produto(
                null, "Suco de frutas vermelhas",
                "O suco verde é para aquela pessoa que procura uma bebida natural ao seu alcance. Refresca, traz o docinho da maçã, as fibras da couve e algumas notas de cenoura.Ele é a combinação perfeita para um café da manhã equilibrado. Nada melhor do que começar o dia com um desses.",
                "https://i.imgur.com/RXInUx2.png",
                "https://i.imgur.com/c3cwjIp.png",
                "https://i.imgur.com/gLJ8Vz8.png",
                "250ml",
                9.00
        );

        Produto p18 = new Produto(
                null, "Suco Verde",
                "O suco verde é para aquela pessoa que procura uma bebida natural ao seu alcance. Refresca, traz o docinho da maçã, as fibras da couve e algumas notas de cenoura.Ele é a combinação perfeita para um café da manhã equilibrado. Nada melhor do que começar o dia com um desses.",
                "https://i.imgur.com/K2cfxLP.png",
                "https://i.imgur.com/fSUTWSp.png",
                "https://i.imgur.com/80wuIMl.png",
                "250ml",
                6.00
        );

        Produto p19 = new Produto(
                null, "Pizza de calabresa",
                "Muçarela, calabresa, cebola e azeitonas.",
                "https://i.imgur.com/VTi1Us0.png",
                "https://i.imgur.com/QLPiUH5.png",
                "https://i.imgur.com/otZcQVS.png",
                "65cm",
                67.70
        );

        Produto p20 = new Produto(
                null, "Pizza de peperonni",
                "Muçarela e fatias de pepperoni (salame especial condimentado com páprica).",
                "https://i.imgur.com/sOH2ALA.png",
                "https://i.imgur.com/5IjzywG.png",
                "https://i.imgur.com/GvUYBMr.png",
                "65cm",
                67.70
        );

        Produto p21 = new Produto(
                null, "Pizza de cogumelos e milho",
                "Muçarela, tomate, champignon, pimentão, cebola e milho.",
                "https://i.imgur.com/cZJX9eT.png",
                "https://i.imgur.com/uwZ8f2H.png",
                "https://i.imgur.com/ifAytYU.png",
                "65cm",
                67.70
        );

        Produto p22 = new Produto(
                null, "Pizza de tomates secos",
                "Muçarela, requeijão cremoso, manjericão e tomates secos.",
                "https://i.imgur.com/2yPIoxT.png",
                "https://i.imgur.com/yO2HVNH.png",
                "https://i.imgur.com/XV3akY1.png",
                "65cm",
                67.70
        );

        categoria1.getProdutos().addAll(Arrays.asList(p1, p2, p3, p4));
        categoria2.getProdutos().addAll(Arrays.asList(p5, p6, p7, p8, p9));
        categoria3.getProdutos().addAll(Arrays.asList(p1, p2, p3, p4, p7));
        categoria4.getProdutos().addAll(Arrays.asList(p19, p20, p21, p22));
        categoria5.getProdutos().addAll(Arrays.asList(p10, p11, p12, p13, p14));
        categoria6.getProdutos().addAll(Arrays.asList(p15, p16, p17, p18));

        p1.getCategorias().addAll(Arrays.asList(categoria1, categoria3));
        p2.getCategorias().addAll(Arrays.asList(categoria1, categoria3));
        p3.getCategorias().addAll(Arrays.asList(categoria1, categoria3));
        p4.getCategorias().addAll(Arrays.asList(categoria1, categoria3));
        p5.getCategorias().addAll(Arrays.asList(categoria2));
        p6.getCategorias().addAll(Arrays.asList(categoria2));
        p7.getCategorias().addAll(Arrays.asList(categoria2, categoria3));
        p8.getCategorias().addAll(Arrays.asList(categoria2));
        p9.getCategorias().addAll(Arrays.asList(categoria2));
        p10.getCategorias().addAll(Arrays.asList(categoria5));
        p11.getCategorias().addAll(Arrays.asList(categoria5));
        p12.getCategorias().addAll(Arrays.asList(categoria5, categoria6));
        p13.getCategorias().addAll(Arrays.asList(categoria5, categoria6));
        p14.getCategorias().addAll(Arrays.asList(categoria6));
        p15.getCategorias().addAll(Arrays.asList(categoria6));
        p16.getCategorias().addAll(Arrays.asList(categoria6));
        p17.getCategorias().addAll(Arrays.asList(categoria6));
        p19.getCategorias().addAll(Arrays.asList(categoria4));
        p20.getCategorias().addAll(Arrays.asList(categoria4));
        p21.getCategorias().addAll(Arrays.asList(categoria4));
        p22.getCategorias().addAll(Arrays.asList(categoria4));

        categoriaRepositorio.saveAll(Arrays.asList(categoria1, categoria2, categoria3, categoria4, categoria5, categoria6));
        produtoRepositorio.saveAll(Arrays.asList(p1,p2,p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22));


        //instanciando posicao geografica Clientes
        Posicao posicaoCliente1 = new Posicao(null,56,78);
        Posicao posicaoCliente2 = new Posicao(null,12,63);
        Posicao posicaoCliente3 = new Posicao(null,01,51);

        //instanciando cliente
        Cliente cliente1 = new Cliente(null, "Pietra dos Santos Lopes", "pietralopes@gmail.com", "72739181485", posicaoCliente1, bCryptPasswordEncoder.encode("batata"));
        Cliente cliente2 = new Cliente(null, "Lucca Leandro Souza", "lluccaleandrosouza@gmail.com", "96985755291", posicaoCliente2, bCryptPasswordEncoder.encode("batata"));
        Cliente cliente3 = new Cliente(null, "Anderson Noah Silveira", "aandersonnoahsilveira@@gmail.com", "95433223841", posicaoCliente3, bCryptPasswordEncoder.encode("batata"));

        posicaoRepositorio.saveAll(Arrays.asList(posicaoCliente1, posicaoCliente2, posicaoCliente3));
        clienteRepositorio.saveAll(Arrays.asList(cliente1, cliente2, cliente3));

        //fazendo o pedido
        Pedido ped1 = new Pedido(null, 1, cliente1, posicaoCliente1, restauranteFilial1);
        Pedido ped2 = new Pedido(null, 2, cliente1, posicaoCliente1, restauranteFilial3);
        pedidoRepositorio.saveAll(Arrays.asList(ped1, ped2));
        //pedidos do cliente
        cliente1.getPedidos().addAll(Arrays.asList(ped1, ped2));

        ItemPedido ip1 = new ItemPedido(ped1, p1, 5, p1.getPreco());
        ItemPedido ip2 = new ItemPedido(ped1, p3, 2, p3.getPreco());
        ItemPedido ip3 = new ItemPedido(ped2, p5, 1, p5.getPreco());
        ItemPedido ip4 = new ItemPedido(ped2, p7, 1, p7.getPreco());
        ItemPedido ip5 = new ItemPedido(ped2, p13, 1, p13.getPreco());

        ped1.getItens().addAll(Arrays.asList(ip1, ip2));
        ped1.getItens().addAll(Arrays.asList(ip3, ip4, ip5));

        itemPedidoRepositorio.saveAll(Arrays.asList(ip1, ip2, ip3, ip4, ip5));

    }
}
