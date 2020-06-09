import React from 'react';
import { Container } from './styles';
import { FaFacebook, FaInstagram, FaWhatsapp, FaTwitter } from 'react-icons/fa';

export const Footer = () => (
    <Container>
        <div className="links">
            <ul>
                <li>área de entrega</li>
                <li>dúvidas frequentes</li>
                <li>precisa de ajuda?</li>
            </ul>
        </div>
        <div className="infos">
            <div className="social-medias">
                <p>Redes sociais</p>
                <FaFacebook color="#AF1414" size={40} style={{ border: "1px solid #AF1414", padding: 5, margin: 8 }} />
                <FaInstagram color="#AF1414" size={40} style={{ border: "1px solid #AF1414", padding: 5, margin: 8 }} />
                <FaWhatsapp color="#AF1414" size={40} style={{ border: "1px solid #AF1414", padding: 5, margin: 8 }} />
                <FaTwitter color="#AF1414" size={40} style={{ border: "1px solid #AF1414", padding: 5, margin: 8 }} />
            </div>

            <div className="privacy-policies">
                <p>Termos de uso • política de privacidade</p>
                <p>Ifome - Todos os direitos reservados</p>
            </div>
        </div>
    </Container>
);