# Trabalho Final de Tecnicas de Programação
Site de delivery, backend Java (Maven e Springboot), frontend HTML, CSS e JavaScript

#### Grupo 21: Guilherme Hiago Santos e Suane Vallim

## Objetivos do sistema
Ifome é um aplicativo de entrega de comida online, no qual um cliente, previamente cadastrado, pode solicitar uma lista de pedidos mediante pagamento. O aplicativo é de uma rede de restaurantes de uma cidade, que  ao receber um pedido escolhe o restaurante mais proximo ao cliente, que possui o pedido e o aceita. Para realizar a entrega, será cobrado uma taxa fixa, dependendo da distacia do cliente em relação ao restaurante.

## Relações de funcionalidade
 - O Ifome conta com uma página inicial composta pelos menus navegáveis para o cliente, além de página de promoções e mais vendidos. Alem disso, suguestões de novas compras, baseadas no ultimo pedido feito pelo cliente. 
 
- No carrinho de compras, os descontos são aplicados e o preço final do produto é informado, junto com as taxas. O pagamento 
é aceito somente na hora de entrega. 

- Cupom de descontos podem ser aplicados ao valor final da compra, no carrinho de compras, nao podendo ser aplicado mais de um código por pedido.


## Rodando a aplicação
- Faça download da aplicação;
- Abra o projeto

#### Backend 
- Digite ```mvn spring-boot:run```.
