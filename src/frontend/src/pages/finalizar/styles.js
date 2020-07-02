import styled from 'styled-components';

export const Content = styled.div`
  display: flex;
  margin: auto;
  align-items: center;
  justify-content: center;
  flex-direction: column;

  h2 {
    color: #333;
    font-weight: 600;
    font-size: 26px;
  }

  p {
    margin-top: 20px;
    font-size: 20px;
  }

  div {
    margin: auto;
  
    input, select {
        margin-top: 8px;
        width: 400px;
    }
  }

  
`;


