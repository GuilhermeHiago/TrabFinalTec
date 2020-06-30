import React, { useState } from 'react';
import { useHistory } from 'react-router-dom';
import api from '../../services/api';
import { LoginContainer, Button} from './styles';

export const Login = () => {
  const [email, setEmail] = useState('');
  const [senha, setSenha] = useState('');

  const history = useHistory();

  const handleLogin = async (e) => {
    e.preventDefault();

    try {
      const response = await api.post('/login', {
        email: email,
        senha: senha
      });

      localStorage.setItem('token', response.headers.authorization);

      history.push('/');
    } catch (err) {
      alert('Falha no login, tente novamente.', err)
    }
  }

  return (
    <LoginContainer>
      <section>
        <form onSubmit={handleLogin}>
          <h1>Faça seu login</h1>

          <input 
            type="text"
            placeholder="Username"
            value={email}
            onChange={e => setEmail(e.target.value)}
          />
          <input
            type="password"
            placeholder="Senha"
            value={senha}
            onChange={e => setSenha(e.target.value)}
            autoComplete="on"
          />
          <Button type="submit">Entrar</Button>
        </form>
      </section>
    </LoginContainer>
  );
}
