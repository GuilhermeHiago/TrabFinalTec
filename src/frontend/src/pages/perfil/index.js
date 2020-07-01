import React, { useEffect, useState } from 'react';
import { useHistory } from 'react-router-dom';

import api from '../../services/api';
import * as jwtDecode from 'jwt-decode';

import { Container, Content, Button, BackLink } from './styles';
import { FiLogOut } from 'react-icons/fi';
import { Navbar } from '../../components/navbar';
import { Footer } from '../../components/footer';

export const Perfil = () => {
    const [perfil, setPerfil] = useState([]);
    const [posicaoX, setPosicaoX] = useState([]);
    const [posicaoY, setPosicaoY] = useState([]);

    const history = useHistory();

    const showPerfil = async () => {
        const token = localStorage.getItem('token');
        const decoded = jwtDecode(token);
        const email = decoded.sub;

        try {
            const response = await api.get(`/api/cliente/${email}`,
                { headers: { Authorization: token } });

            setPerfil(response.data)
            setPosicaoX([response.data.posicao.x])
            setPosicaoY([response.data.posicao.y])
        } catch (err) {
            alert('Falha ao buscar perfil de usuário, tente novamente.', err)
        }
    }

    const handleLogout = () => {
        localStorage.clear();

        history.push('/login');
    }

    useEffect(() => {
        showPerfil();
    }, [])

    return (
        <>
            <Navbar />
            <Container>
                <Content>
                    <h2>Seu perfil</h2>
                    <p className="title">Nome completo</p>
                    <p className="data">{perfil.nome}</p>
                    <p className="title">Email</p>
                    <p className="data">{perfil.email}</p>
                    <p className="title">CPF</p>
                    <p className="data">{perfil.cpf}</p>
                    <p className="title">Endereço</p>
                    <p className="data">X: {posicaoX}</p> 
                    <p className="data">Y: {posicaoY}</p>

                    <div className="buttons">
                        <BackLink to="/perfil/pedidos" onClick={handleLogout}>
                            <FiLogOut size={30} color="rgb(231, 34, 27)" style={{marginLeft: 80}}/>
                                logout
                        </BackLink>
                        <Button>Meus pedidos</Button>
                    </div>
                </Content>
            </Container>
            <Footer />
        </>
    );
}