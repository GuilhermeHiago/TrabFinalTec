import React from 'react';
import { Container } from './styles';
import pizza from "../../assets/menu/pizza.png";
import lanches from "../../assets/menu/lanches.png";
import vegetariana from "../../assets/menu/vegetariana.png";
import massas from "../../assets/menu/massas.png";
import doces from "../../assets/menu/doces.png";
import bebidas from "../../assets/menu/bebidas.png";

const Categories = () => (
    <Container>
        <ul>
            <li>
                <img src={`${pizza}`} alt="Pizza" title="Pizza"/>
                <p>Pizza</p>
            </li>
            <li>
                <img src={`${lanches}`} alt="Lanches" title="Lanches" />
                <p>Lanches</p>
            </li>
            <li>
                <img src={`${vegetariana}`} alt="Vegetariana" title="Vegetariana" />
                <p>Vegetariana</p>
            </li>
            <li>
                <img src={`${massas}`} alt="Massas" title="Massas" />
                <p>Massas</p>
            </li>
            <li>
                <img src={`${doces}`} alt="Doces e bolos" title="Doces e bolos" />
                <p>Doces e bolos</p>
            </li>
            <li>
                <img src={`${bebidas}`} alt="Bebidas" title="Bebidas" />
                <p>Bebidas</p>
            </li>
        </ul>
    </Container>
);

export default Categories;