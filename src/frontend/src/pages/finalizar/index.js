import React, { useState, useEffect } from 'react';

import api from '../../services/api';
import * as jwtDecode from 'jwt-decode';

import { Content } from './styles';
import { Navbar } from '../../components/navbar';
import { Footer } from '../../components/footer';

export const Finalizar = () => {
  const [itens, setCart] = useState([]);
  const [restauranteEscolhido, setRestauranteEscolhido] = useState(1);
  const [restaurantes, setRestaurantes] = useState([]);
  const [id, setID] = useState([]);
  const [endEntrega, setEntrega] = useState([]);
  const [pedido, setPedido] = useState({ cliente: id, enderecoDeEntrega: endEntrega, itens: itens, pagamento: 1 })

  const getPositionRestaurant = async () => {
    const token = localStorage.getItem('token');
    try {
      const response = await api.get(`/api/restaurantes`,
        { headers: { Authorization: token } });
      setRestaurantes(response.data)
      console.log(response.data)
    } catch (err) {
      console.log('Falha ao buscar produtos categoria, tente novamente.', err)
    }
  }

  const getDadosCliente = async () => {
    const token = localStorage.getItem('token');
    const decoded = jwtDecode(token);
    const email = decoded.sub;

    try {
      const response = await api.get(`/api/cliente/${email}`,
        { headers: { Authorization: token } });

      setID(response.data.id);
      setEntrega(response.data.posicao);
    } catch (err) {
      alert('Falha ao buscar perfil de usuário, tente novamente.', err)
    }
  }

  const getCart = () => {
    if (localStorage.getItem('cart')) {
      setCart(JSON.parse(localStorage.getItem('cart')));
      console.log(JSON.parse(localStorage.getItem('cart')));
    }
  }

  useEffect(() => {
    getCart();
    getPositionRestaurant();
    getDadosCliente();
    console.log(pedido)
  }, [])

  return (
    <>
      <Navbar />
      <Content >
        <h2>Fechamento pedido</h2>
        
      </Content>
      <Footer />
    </>
  )
};