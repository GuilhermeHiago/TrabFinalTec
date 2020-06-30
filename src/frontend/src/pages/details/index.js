import React from 'react';
import { Container, Content } from './styles';
import { Navbar } from '../../components/navbar';
import hamburguer from '../../assets/hamburguinho.jpg'

const Details = () => {
  return (
    <>
      <Navbar />
      <Container>
        <Content>
          <div className="a">
            <img src={`${hamburguer}`} width={656} height={348} alt="hamburguer" />
          </div>
          <div className="description-sale">
            <h1>Hamburguer tradicional</h1>
            <p>R$ 16,90</p>
            <button>adicionar</button>
          </div>
        </Content>
        <div className="description-style">
            <p className="description-height">280g</p>
            <p>peso total</p>
            <p className="description-text">
              Pão branco, 280g de carne, 2 fatias de queijo prato gratinado no
              maçarico, maionese verde, cebola caramelizada, tomate, picles e
              alface.
          </p>
          </div>
      </Container>
    </>
  );
}

export default Details;

//esta pagina necessita de img, produto, preço, descrição, e valor