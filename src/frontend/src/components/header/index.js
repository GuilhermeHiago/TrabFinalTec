import React from 'react';
import { Container } from './styles';
import banner from '../../assets/banner3.webp';

export const Header = () => (
  <Container>
    <img src={`${banner}`} alt="Peça mercado no iFome" title="Peça mercado no iFome"/>
  </Container>
);