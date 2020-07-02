
let dadosClient;
let pedidoAtual = null;

async function login(){
    let url = "http://localhost:8080/consultacliente/getclientes";

    try{
        let resposta = await fetch(url);
        //console.log(resposta);
        if (resposta.ok){
            let dados = await resposta.json();
            dadosClient = dados[0];
            //console.log(dadosClient);
            return dados[0].cpf;
        }else{
            //console.log(resposta.status+", text="+resposta.statusText);
            return null;
        }
    }catch(erro){
        console.log(erro);
    }
}

async function criaPedido(){
    let url = "http://localhost:8080/consultacliente/criapedido";
    try{
        resposta = await fetch(url);

        if(resposta.ok){
            pedidoAtual = await resposta.json();
            //console.log(pedidoAtual);
        }
    }catch(erro){
        console.log(erro);
    }
}

async function carregaProdutos(){
    let listVisual = document.getElementById("listProd");
    let listaPedidos;

    let url = "http://localhost:8080/consultacliente/getprodutos";

    try{
        let resposta = await fetch(url);
        //console.log(resposta);
        if (resposta.ok){
            let dados = await resposta.json();
            let listItens = "";

            dados.forEach(element => {
                //console.log(element);

                let nomeProd = '<label for="produtos" style="width: 30%;background-color: wheat;"text-align: center;>' + element.nome + '</label>';
                let precoProd = '<label style="width: 20%;background-color: wheat;text-align: center;">' + "R$" + element.valor + '</label>';
                let labelN = '<label style="width: 20%;background-color: wheat;text-align: center;">Quantidade:</label>';
                let inQtd = '<input style="width: 20%;background-color: wheat;text-align: center;"/>';
                let botaoAddProd = '<button class="btAdd" style="width: 10%;""text-align: center;>+</button></br>';
                listItens += '<div style="background-color: wheat;padding:2%;heigth=max-content;">' + nomeProd + precoProd + labelN + inQtd + botaoAddProd+ "</div></br>";
            });

            listVisual.innerHTML = listItens;
            let alert = await listVisual.innerHTML;
            atualizaBotaoProduto();
            return null;//dados[0].cpf;
        }else{
            //console.log(resposta.status+", text="+resposta.statusText);
            return null;
        }
    }catch(erro){
        console.log(erro);
    }

    return null;
}

async function addItemPedido(nomePedido, quantidade){
    let url = "http://localhost:8080/consultacliente/additem?";
    //console.log("entrei add item");
    let idPedido = "idPedido=" + pedidoAtual.id.toString();
    let nome = "nome=" + nomePedido;
    let qtd = "qtd=" + quantidade.toString();
    //console.log(qtd);
    url += (idPedido + "&" + nome + "&" + qtd);

    try{
        let resposta = await fetch(url);
        //console.log(resposta);
        if(resposta.ok){
            pedidoAtual = await resposta.json();
            atualizaListaPedidoVisual();
            getDadosDTO();
            //console.log("pedidoatual: ");
            //console.log(pedidoAtual);
        }
    }catch(erro){
        console.log(erro);
    }
}

async function removeItemPedido(nomePedido, quantidade){
    let url = "http://localhost:8080/consultacliente/removeitem?idPedido="+pedidoAtual.id;
    
    try{
        let resposta = await fetch(url);
        //console.log(resposta);
        if(resposta.ok){
            pedidoAtual = await resposta.json();
            let alert = await pedidoAtual;
            console.log("pedido dentro do remove");
            console.log(pedidoAtual);

            let tabela = document.getElementById("tabelaPedido");
            tabela.deleteRow(tabela.rows.length-1);

            getDadosDTO();
            //atualizaListaPedidoVisual();
            //console.log("pedidoatual: ");
            //console.log(pedidoAtual);
        }
    }catch(erro){
        console.log(erro);
    }
}

async function fechaPedido(){
    let url = "http://localhost:8080/consultacliente/fechapedido?";
    let cpf = "cpfCliente=" + dadosClient.cpf;
    let id = "&idPedido=" + pedidoAtual.id;
    console.log(dadosClient);
    url = url + cpf + id

    try{
        let resposta = await fetch(url);
        //console.log(resposta);
        if(resposta.ok){
            pedidoAtual = await resposta.json();
            console.log("pedido apos remoção:")
            console.log(pedidoAtual);
            let a = criaPedido();
            let alert = await a;
            atualizaListaPedidoVisual();
            getDadosDTO();
            //console.log("pedidoatual: ");
            //console.log(pedidoAtual);
        }
    }catch(erro){
        console.log(erro);
    }
}

async function atualizaListaPedidoVisual(){
    let listVisual = document.getElementById("listPedidoVisual");
    let listaPedidos = "";

    let tabela = document.getElementById("tabelaPedido");

    for(i = 1; i < tabela.rows.length; i++){
        console.log(tabela.rows);
        tabela.deleteRow(i);
    }

    //console.log("lista:");
    if(pedidoAtual != null){
        //console.log(pedidoAtual.itemPedido);

        pedidoAtual.itemPedido.forEach(element => {
            /*let nomeProd = '<label for="produtos" style="width: 40%;"text-align: center;>' + element.nome + '</label>';
            let qtd = '<label style="width: 40%;""text-align: center;">' + element.quantidade + '</label>';
            let precoProd = '<label style="width: 20%;""text-align: center;">' + "R$" + element.valorUnitario + '</label>';
            listaPedidos += '<div style="width=max-content">' + nomeProd + qtd + precoProd + '</div>'; */

            let numOfRows = tabela.rows.length;
            let newRow = tabela.insertRow(numOfRows);
            let newCod = newRow.insertCell(0);
            newCod.innerHTML = element.nome;
            let newQtdade = newRow.insertCell(1);
            newQtdade.innerHTML = element.quantidade;
            let newValor = newRow.insertCell(2);
            newValor.innerHTML = element.valorUnitario;
        });
    }

    //listVisual.innerHTML = listaPedidos;

    return null;
}

async function getDadosDTO(){
    let url = "http://localhost:8080/consultacliente/dadoscompraDTO?";
    let cpf = "cpfCliente=" + dadosClient.cpf;
    let id = "&idPedido=" + pedidoAtual.id;
    url = url + cpf + id

    try{
        let resposta = await fetch(url);
        //console.log(resposta);
        if(resposta.ok){
            dadosAtuais = await resposta.json();
            //console.log("dto")
            //console.log(pedidoAtual);
            
            let valores = document.getElementById("valores").childNodes;
            document.getElementById("restaurante").textContent = "Restaurante: " + dadosAtuais.restaurante;
            document.getElementById("total").textContent = "Preço: R$ " + dadosAtuais.valorCompra;
            //document.getElementById("desconto").textContent = dadosAtuais.valorCompra;
            document.getElementById("entrega").textContent = "Entrega: R$ " + dadosAtuais.entrega;
            document.getElementById("final").textContent = "Preço Final: R$ " + dadosAtuais.valorCompraFinal;
        }
        else{
            console.log("resposta !ok");
        }
    }catch(erro){
        console.log(erro);
    }
}

async function atualizaBotaoProduto(){
    let addButtons = document.querySelectorAll('button[class^=btAdd]');
    //console.log(addButtons);
    
    addButtons.forEach(element => {
        element.onclick = async function () {
            let nomeProd = element.parentElement.childNodes[0].textContent;
            let qtd = Number(element.parentElement.childNodes[3].value);
            element.parentElement.childNodes[3].value = " ";
            if(qtd >= 1){addItemPedido(nomeProd, qtd);}
        }
    });
}

// --- início do programa
login();
criaPedido();
atualizaListaPedidoVisual();
carregaProdutos();
/*document.getElementById("btDados").onclick = async function () {
    matricula = document.getElementById("matricula").value;
    let resposta = await consultaDadosAluno(matricula);
    let div = document.getElementById("resposta");
    if (resposta != null){
        div.innerHTML = JSON.stringify(resposta);
        jsonTest = document.getElementById("jsonTest");
        jsonTest.innerHTML = resposta.nome+"<br>"+resposta.sobrenome+"<br>"+resposta.telefone;
    }else{
        div.innerHTML = "Erro";
    }
}*/
document.getElementById("btConclui").onclick = async function () {
    fechaPedido();
}

document.getElementById("btRemove").onclick = async function () {
    removeItemPedido();
}