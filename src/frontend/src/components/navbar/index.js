import React from 'react';
import { Link } from 'react-router-dom';

import { Container } from './styles';
import { FaUser, FaShoppingBag, FaSearch, FaListUl } from 'react-icons/fa';

export const Navbar = () => (
  <Container>
      <div className="search-area">
        <FaSearch size={24} className="search-icon" />
        <input className="menu-search" placeholder="Busque por item" />
        <p className="name">Busca</p>
      </div>
      <ul >
        <Link to={`categorias`} style={{ textDecoration: 'none', color: '#333' }}>
          <li>
            <FaListUl size={30} className="icon" style={{ marginRight: 5 }} />
            <p className="menu name">Categorias</p>
          </li>
        </Link>
        <Link to={`sacola`} style={{ textDecoration: 'none', color: '#333' }}>
          <li>
            <FaShoppingBag size={30} className="icon"  />
            <span className="basket-quantity">0</span>
            <p className="menu name">Sacola</p>
          </li>
        </Link>
        <Link to={`perfil`} style={{ textDecoration: 'none', color: '#333' }}>
          <li>
            <FaUser size={30} className="icon" />
            <p className="menu name">Perfil</p>
          </li>
        </Link>
      </ul>
  </Container>
);