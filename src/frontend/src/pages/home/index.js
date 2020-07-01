import React, { useState } from 'react';

import api from '../../services/api';

import { Container } from './styles';
import { Navbar } from '../../components/navbar';
import { Header } from '../../components/header';
import { Menu } from '../../components/menu';
import { Footer } from '../../components/footer';
import { Categories } from '../../components/categories';
import { useEffect } from 'react';

const Home = () => {
  const [categories1, setCategories1] = useState([]);
  const [categories2, setCategories2] = useState([]);
  const [categories3, setCategories3] = useState([]);

  const showCategories1 = async (number) => {
    const token = localStorage.getItem('token');
    try {
      const response = await api.get('/api/categorias',
        { headers: { Authorization: token } });
      setCategories1(response.data[number].produtos);
    } catch (err) {
      console.log('Falha ao buscar categorias, tente novamente.', err)
    }
  }

  const showCategories2 = async (number) => {
    const token = localStorage.getItem('token');
    try {
      const response = await api.get('/api/categorias',
        { headers: { Authorization: token } });
      setCategories2(response.data[number].produtos);
    } catch (err) {
      console.log('Falha ao buscar categorias, tente novamente.', err)
    }
  }

  const showCategories3 = async (number) => {
    const token = localStorage.getItem('token');
    try {
      const response = await api.get('/api/categorias',
        { headers: { Authorization: token } });
      setCategories3(response.data[number].produtos);
    } catch (err) {
      console.log('Falha ao buscar categorias, tente novamente.', err)
    }
  }

  useEffect(() => {
    showCategories1(0);
    showCategories2(3);
    showCategories3(5);
  }, [])

  return (
    <>
      <Navbar />
      <Container>
        <Header />
        <Menu />
        <Categories categories={categories1} nomeCategoria={'Especiais de Inverno'} idCategoria={1} />
        <Categories categories={categories2} nomeCategoria={'Pizzas'} idCategoria={4} />
        <Categories categories={categories3} nomeCategoria={'Bebidas'} idCategoria={6} />
      </Container>
      <Footer />
    </>
  )
};

export default Home;