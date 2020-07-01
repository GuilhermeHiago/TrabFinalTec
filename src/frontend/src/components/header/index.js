import React from 'react';
import { Container } from './styles';
import banner from '../../assets/banner3.webp';
import bannermd from '../../assets/banner.webp';

export const Header = () => (
  <Container>
      <img className="picture" src={`${banner}`} alt="Peça mercado no iFome" title="Peça mercado no iFome" />
      <img className="picture-md" src={`${bannermd}`} alt="Peça mercado no iFome" title="Peça mercado no iFome" />
  </Container>
);