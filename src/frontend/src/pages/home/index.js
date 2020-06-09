import React from 'react';
import { Container } from './styles';
import { Navbar } from '../../components/navbar';
import { Header } from '../../components/header';
import { Footer } from '../../components/footer';
import { GlobalStyle } from '../../style';
import Categories from '../../components/categories';

const Home = () => (
  <>
    <Navbar />
    <Container>
      <Header />
      <Categories />
    </Container>
    <Footer />
    <GlobalStyle />
  </>
);

export default Home;