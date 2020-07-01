import React, { useState, useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';

import api from '../../services/api';

import { Container, Card } from './styles';

import { Navbar } from '../../components/navbar';
import { Header } from '../../components/header';
import { Footer } from '../../components/footer';

export const Category = () => {
    const [category, setCategory] = useState([]);

    const { id } = useParams();

    const showCategory = async () => {
        const token = localStorage.getItem('token');
        try {
            const response = await api.get(`/api/categorias/${id}`,
                { headers: { Authorization: token } });
            setCategory(response.data.produtos);
        } catch (err) {
            console.log('Falha ao buscar produtos categoria, tente novamente.', err)
        }
    }

    useEffect(() => {
        showCategory();    
    },[])

    return (
        <Container>
            <Navbar />
            <Header />
            <Card>
                {category.map((food, index) => (
                    <div key={`${index}`}>
                        <img src={food.imgDetails} alt={food.nome} width={350} />
                        <p className="product-style">{food.nome}</p>
                        <Link to={`/produtos/detalhes/${food.id}`}>
                            <button>Ver mais</button>
                        </Link>
                    </div>
                ))}
            </Card>
            <Footer />
        </Container>
    );
}