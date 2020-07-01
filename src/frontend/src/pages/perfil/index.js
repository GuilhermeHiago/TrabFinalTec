import React, { useEffect } from 'react';

import api from '../../services/api';
import * as jwtDecode from 'jwt-decode';

import { Container } from './styles';

import { Navbar } from '../../components/navbar';
import { Footer } from '../../components/footer';

export const Perfil = () => {
  

    const showPerfil = async () => {
        const token = localStorage.getItem('token');
                const decoded = jwtDecode(token);
                const email = decoded.sub;

        try {
            const response = await api.get(`/api/clientes/${email}`,
                { headers: { Authorization: token } });

                
       
            // setCategory(response.data.produtos);
            console.log(response);
        } catch (err) {
            alert('Falha ao buscar perfil de usuário, tente novamente.', err)
        }
    }

    useEffect(() => {
        showPerfil();
    }, [])

    return (
        <>
            <Navbar />
            <Container>

            </Container>
            <Footer />
        </>
    );
}