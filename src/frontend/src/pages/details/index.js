import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';

import api from '../../services/api';

import { Container, Content } from './styles';
import { Navbar } from '../../components/navbar';

const Details = () => {
  const [cart, setCart] = useState([{}]);
  const [product, setProduct] = useState([]);

   const { id } = useParams();

  const showProduct = async () => {
    const token = localStorage.getItem('token');
    try {
      const response = await api.get(`/api/produtos/${id}`,
        { headers: { Authorization: token } });
      setProduct([response.data]);
      console.log([response.data]);
    } catch (err) {
      console.log('Falha ao buscar categoria, tente novamente.', err)
    }
  }

  const addItem = (produto) => {
    const produts = { id: produto.id, nome: produto.nome, preco: produto.preco, img: produto.imgCart, quantidade: produto.quantidade = 1 };
    const cartCopy = [...cart];
    let id = produts.id;
    let position = cart.find(cartItem => cartItem.id === id);

    if (position) {
      position.quantidade += produts.quantidade;
    }
    else {
      cartCopy.push(produts)
    }
    setCart(cartCopy);
    console.log(cart)
    let stringCart = JSON.stringify(cartCopy);
    localStorage.setItem("cart", stringCart);
  }
  const addProduct = () => {
    if (localStorage.getItem('cart')) {
      setCart(JSON.parse(localStorage.getItem('cart')));
    }
  }

  useEffect(() => {
    showProduct();
    addProduct();
  }, [])

  return (
    <>
      <Navbar />
      <Container>
        {product.map((product, index) => (
          <div key={`${product.id}`}>
            <Content >
              <div className="a">
                <img src={`${product.imgDetails}`} width={656} height={348} alt={`${product.nome}`} />
              </div>
              <div className="description-sale">
                <h1>{`${product.nome}`}</h1>
                <p className="price-style">{`${(product.preco).toFixed(2)}`}</p>
                <button onClick={() => addItem(product)}>adicionar</button>
              </div>
            </Content>
            <div>
              <div className="description-style">
                <p className="description-height">{`${product.peso}`}</p>
                <p>peso total</p>
                <p className="description-text">
                  {`${product.descricao}`}
                </p>
              </div>
            </div>
          </div>
        ))}
      </Container>
    </>
  );
}

export default Details;