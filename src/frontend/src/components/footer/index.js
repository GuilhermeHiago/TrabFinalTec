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
                <FaFacebook title="Facebook" color="#AF1414" size={40} style={{ border: "1px solid #AF1414", padding: 5, margin: 8, cursor: 'pointer' }} />
                <FaInstagram title="Instagram" color="#AF1414" size={40} style={{ border: "1px solid #AF1414", padding: 5, margin: 8, cursor: 'pointer' }} />
                <FaWhatsapp title="Whatsapp" color="#AF1414" size={40} style={{ border: "1px solid #AF1414", padding: 5, margin: 8, cursor: 'pointer' }} />
                <FaTwitter title="Twitter" color="#AF1414" size={40} style={{ border: "1px solid #AF1414", padding: 5, margin: 8, cursor: 'pointer' }} />
            </div>

            <div className="privacy-policies">
                <p>Termos de uso • política de privacidade</p>
                <p>Ifome - Todos os direitos reservados</p>
            </div>
        </div>
    </Container>
);