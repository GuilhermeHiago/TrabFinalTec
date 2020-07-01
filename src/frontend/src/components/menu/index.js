import React from 'react';
import Slider from 'infinite-react-carousel';
import { Link } from 'react-router-dom';
import { Container } from './styles';

import pizza from "../../assets/menu/pizza.png";
import lanches from "../../assets/menu/lanches.png";
import vegetariana from "../../assets/menu/vegetariana.png";
import massas from "../../assets/menu/massas.png";
import doces from "../../assets/menu/doces.png";
import bebidas from "../../assets/menu/bebidas.png";

export const Menu = () => {
    const settings = {
        slidesToShow: 2,
        slidesToScroll: 1,
        arrows: true,
        duration: 400,
        className: "menu-color"
    };
    return (
        <Container>
            <ul className="large">
                <li>
                    <Link to={`categorias/1`} style={{ textDecoration: 'none', color: '#333' }}>
                        <img src="https://i.imgur.com/l7PfOzS.png" alt="Especiais de Inverno" title="Especiais de Inverno" />
                        <p>Especiais de Inverno</p>
                    </Link>
                </li>
                <li>
                    <Link to={`categorias/2`} style={{ textDecoration: 'none', color: '#333' }}>
                        <img src="https://i.imgur.com/z61SfxX.png" alt="Lanches" title="Lanches" />
                        <p>Lanches</p>
                    </Link>
                </li>
                <li>
                    <Link to={`categorias/3`} style={{ textDecoration: 'none', color: '#333' }}>
                        <img src="https://i.imgur.com/jvXKKc8.png" alt="Vegetariana" title="Vegetariana" />
                        <p>Vegetariana</p>
                    </Link>
                </li>
                <li>
                    <Link to={`categorias/4`} style={{ textDecoration: 'none', color: '#333' }}>
                        <img src="https://i.imgur.com/pNFjucK.png" alt="Massas" title="Massas" />
                        <p>Massas</p>
                    </Link>
                </li>
                <li>
                    <Link to={`categorias/5`} style={{ textDecoration: 'none', color: '#333' }}>
                        <img src="https://i.imgur.com/dxTa404.png" alt="Doces e bolos" title="Doces e bolos" />
                        <p>Doces e bolos</p>
                    </Link>
                </li>
                <li>
                    <Link to={`categorias/6`} style={{ textDecoration: 'none', color: '#333' }}>
                        <img src="https://i.imgur.com/G08jnOG.png" alt="Bebidas" title="Bebidas" />
                        <p>Bebidas</p>
                    </Link>
                </li>
            </ul>

            <div className="mobile">
                <ul>
                    <Slider {...settings}
                        ref={(ele) => { window.Menu = ele; }}
                    >
                        <li>
                            <Link to={`categorias/1`} style={{ textDecoration: 'none', color: '#333' }}>
                                <img src={`${pizza}`} alt="Pizza" title="Pizza" />
                                <p>Pizza</p>
                            </Link>
                        </li>
                        <li>
                            <Link to={`categorias/2`} style={{ textDecoration: 'none', color: '#333' }}>
                                <img src={`${lanches}`} alt="Lanches" title="Lanches" />
                                <p>Lanches</p>
                            </Link>
                        </li>
                        <li>
                            <Link to={`categorias/3`} style={{ textDecoration: 'none', color: '#333' }}>
                                <img src={`${vegetariana}`} alt="Vegetariana" title="Vegetariana" />
                                <p>Vegetariana</p>
                            </Link>
                        </li>
                        <li>
                            <Link to={`categorias/4`} style={{ textDecoration: 'none', color: '#333' }}>
                                <img src={`${massas}`} alt="Massas" title="Massas" />
                                <p>Massas</p>
                            </Link>
                        </li>
                        <li>
                            <Link to={`categorias/5`} style={{ textDecoration: 'none', color: '#333' }}>
                                <img src={`${doces}`} alt="Doces e bolos" title="Doces e bolos" />
                                <p>Doces e bolos</p>
                            </Link>
                        </li>
                        <li>
                            <Link to={`categorias/6`} style={{ textDecoration: 'none', color: '#333' }}>
                                <img src={`${bebidas}`} alt="Bebidas" title="Bebidas" />
                                <p>Bebidas</p>
                            </Link>
                        </li>
                    </Slider>
                </ul>
            </div>
        </Container>
    )
};