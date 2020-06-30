import React from 'react';
import { Link } from 'react-router-dom';

import { Container, Card } from './styles';

export const Categories = ({ categories, nomeCategoria, idCategoria }) => {

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
                        <button>Adicionar</button>
                    </div>
                ))}
            </Card>
        </Container>
    )
};

