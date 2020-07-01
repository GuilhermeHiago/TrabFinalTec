import styled from 'styled-components';
import { Link } from 'react-router-dom';

export const Container = styled.div`
    width: 100%;
    max-width: 1120px;
    height: 100vh;
    margin: auto;

    align-items: center;
    justify-content: center;

    input {
        margin-bottom: 12px;
    }

    h2 {
        color: #333;
        font-size: 28px;
        text-align: center;
        margin-top: 50px;
        margin-bottom: 50px;
    }
`;

export const Content = styled.div`
    width: 960px;
    margin: auto;

    h4 {
        padding-top: 10px;
        padding-bottom: 10px;
    }

    h4, p {
        padding-left: 80px;
    }

    .title {
        font-weight: 500;
        font-size: 16px;
        color: #555;
    }

    .data {
        font-size: 20px;
        font-weight: 600;
        margin-bottom: 30px;
        margin-left: 2px;
    }

    .buttons {
        display: flex;
        margin-top: 80px;
        justify-content: space-between;
        margin-bottom: 80px;
    }
`;

export const Button = styled.button`
    width: 350px;
    max-width: 100%;
    font-size: 20px;
    height: 60px;
    background: rgb(51, 231, 27);
    border: 0;
    border-radius: 8px;
    color: rgb(255, 255, 255);
    font-weight: 700;
    margin-top: 16px;
    display: inline-block;
    text-align: center;
    justify-content: flex-end;
    text-decoration: none;
    line-height: 60px;
    transition: filter .2s;
    cursor: pointer;

    &:hover {
        filter: brightness(90%);
    }
`;

export const BackLink = styled(Link)`
    display:flex;
    text-align: center;
    align-items: center;
    justify-content: center;
    margin-top: 20px;
    color: rgb(65, 65, 77);
    font-size: 20px;
    text-decoration: none;
    font-weight: 500;
    transition: opacity 0.2s;

    &:hover {
        opacity: 0.8;
    }

    svg {
        margin-right: 8px;
    }
`;