import { createGlobalStyle } from 'styled-components';

export const GlobalStyle = createGlobalStyle`
  * {
    margin: 0;
    padding: 0;
    box-sizing: 0;
    font-family: 'Roboto', sans-serif;
  }

  html {
      scroll-behavior: smooth;
    }
    
  body {
    background: white;
    -webkit-font-smoothing: antialiased;
  }

  button {
    cursor: pointer;

    &:hover {
      opacity: 90%;
    }
  }
`;