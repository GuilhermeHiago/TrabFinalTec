# Trabalho Final de Tecnicas de Programação
#### Grupo 21: Guilherme Hiago Santos e Suane Vallim

## Objetivos do sistema
Ifome é um aplicativo de entrega de comida online, no qual um cliente, previamente cadastrado, pode solicitar uma lista de pedidos mediante pagamento. O aplicativo é de uma rede de restaurantes de uma cidade, que  ao receber um pedido escolhe o restaurante mais proximo ao cliente, que possui o pedido e o aceita. Para realizar a entrega, será cobrado uma taxa fixa, dependendo da distacia do cliente em relação ao restaurante.

## Relações de funcionalidade
 - O Ifome conta com uma página inicial composta pelos menus navegáveis para o cliente, além de página de promoções e mais vendidos. Alem disso, suguestões de novas compras, baseadas no ultimo pedido feito pelo cliente. 
 
- No carrinho de compras, os descontos são aplicados e o preço final do produto é informado, junto com as taxas. O pagamento 
é aceito somente na hora de entrega. 

- Cupom de descontos podem ser aplicados ao valor final da compra, no carrinho de compras, nao podendo ser aplicado mais de um código por pedido.

### Feito com
- [Java](https://www.java.com/pt_BR/)
- [Spring Boot](https://spring.io/)
- [React JS](https://github.com/facebook/react);
- [Axios](https://github.com/axios/axios);

## Rodando a aplicação
- Faça download da aplicação;
- Abra o projeto

#### Backend 
- Digite ```mvn spring-boot:run```.

#### Frontend
- Se é a primeira vez rodando o projeto, abra o terminal e digite ```npm install```;
- Então, digite ```npm start```.

### Diagrama de classes 
	
### Mocks
<img src="https://i.imgur.com/f9mYWrH.png" alt="Home - Desktop" title="Home - Desktop">
<img src="https://i.imgur.com/CPh02lm.png" alt="Carrinho - Desktop" title="Carrinho - Desktop">
<img src="https://i.imgur.com/IH7COaR.png" alt="Home - Mobile" title="Home - Mobile">
<img src="https://i.imgur.com/Bj0WCt8.png" alt="Carrinho - Mobile" title="Carrinho - Mobile">	
