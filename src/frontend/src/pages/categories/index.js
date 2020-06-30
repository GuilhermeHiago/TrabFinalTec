import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';

import { Container, Card } from './styles';

import api from '../../services/api';

import { Navbar } from '../../components/navbar';
import { Header } from '../../components/header';
import { Footer } from '../../components/footer';

export const Categories = () => {
    const [categories, setCategories] = useState([]);

    const listCategories = async () => {
        const token = localStorage.getItem('token');
        try {
            const response = await api.get('/api/categorias',
                { headers: { Authorization: token } });
            setCategories(response.data);
            console.log(response.data);
        } catch (err) {
            console.log('Falha ao buscar categorias, tente novamente.', err)
        }
    }

    useEffect(() => {
        listCategories();
    }, [])

    return (
        <>
            <Container>
                <Navbar />
                <Header />
                <Card>
                    {categories.map((category, index) => (
                        <div key={`${index}`}>
                            <img src={category.produtos[1].imgDetails} alt={category.nome} width={350} />
                            <p className="product-style">{category.nome}</p>
                            <Link to={`categorias/${category.id}`} >
                                <button>Ver mais</button>
                            </Link>
                        </div>
                    ))}
                </Card>
            </Container>
            <Footer />
        </>
    );
}