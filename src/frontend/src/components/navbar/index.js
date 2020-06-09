import React from 'react';
import { Container } from './styles';
import { FaUser, FaShoppingBag, FaPercentage, FaSearch } from 'react-icons/fa';

export const Navbar = () => (
  <Container>
    <div className="search-area">
      <FaSearch size={24} color={'#757575'}/>
      <input placeholder="Busque por item" />
    </div>
    <ul>
      <li>
        <FaPercentage size={26} color={'#333'} />
        <p>Promoções</p>
      </li>
      <li>
        <FaShoppingBag size={26} color={'#333'} />
        <p>Sacola</p>
      </li>
      <li>
        <FaUser size={26} color={'#333'} />
        <p>Perfil</p>
      </li>
    </ul>
  </Container>
);