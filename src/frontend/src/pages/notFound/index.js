import React from 'react';
import { Container } from './styles';

export const NotFound = () => {
  return (
      <Container>
        <div className="not-found-style">
            <h1>Oops!</h1>
            <p>Parece que voce se perdeu, não há nada aqui :(</p>
        </div>
      </Container>
  )
}