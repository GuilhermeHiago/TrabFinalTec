import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';

import { Container, Card } from './styles';

export const Categories = ({ categories, nomeCategoria, idCategoria }) => {
    const [cart, setCart] = useState([]);
    const addItem = (produto) => {
        let cartCopy = [...cart];
        const produts = { id: produto.id, nome: produto.nome, preco: produto.preco, img: produto.imgCart, quantidade: produto.quantidade = 1 };
        let id = produts.id;
        let position = cart.find(cartItem => cartItem.id === id);

        if (position) {
            position.quantidade += produts.quantidade;
        }
        else {
            cartCopy.push(produts)
        }

        setCart(cartCopy);
        let stringCart = JSON.stringify(cartCopy);
        localStorage.setItem("cart", stringCart);
    }
    const getCart = () => {
        if (localStorage.getItem('cart')) {
            setCart(JSON.parse(localStorage.getItem('cart')));
        }
    }

    useEffect(() => {
        getCart();
    }, [])
    return (
        <Container>
            <div className="header">
                <h3>{nomeCategoria}</h3>
                <Link to={`categoria/${idCategoria}`}>
                    <p className="red">ver todos</p>
                </Link>
            </div>
            <Card>
                {categories.map((food, index) => (
                    <div key={`${index}`}>
                        <img src={food.imgCard} alt={food.nome} height={106} width={190} />
                        <p className="product-style">{food.nome}</p>
                        <section>
                            <p className="quantity-style">{food.peso}</p>
                            <p className="value-style">R$ {(food.preco).toFixed(2)}</p>
                        </section>
                        <button onClick={() => addItem(food)}>Ver mais</button>
                    </div>
                ))}
            </Card>
        </Container>
    )
};

