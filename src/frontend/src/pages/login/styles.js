import styled from 'styled-components';
import { Link } from 'react-router-dom';
//roxo: rgb(113, 89, 193);

export const LoginContainer = styled.div`
    width: 100%;
    max-width: 1120px;
    height: 100vh;
    margin: 0 auto;

    display: flex;
    align-items: center;
    justify-content: center;

    section {
        width: 100%;
        max-width: 456px;
        text-align: center;
    }

    input {
        outline: 0;
        width: 308px;
        height: 30px;
        border-color: #CCC;
        margin-bottom: 34px;
        border-width: 0 0 2px;
        transition: ease-in-out 0.4s;

        padding-left: 10px;
        padding-bottom: 8px;

        &:focus {
            border-color: #EA9E44;
        }
    }

    h1 {
        color: #666;
        font-size: 32px;
        margin-bottom: 32px;
    }
`;

export const Button = styled.button`
    width: 350px;
    max-width: 100%;
    height: 60px;
    background: #EA9E44;
    border: 0;
    border-radius: 8px;
    color: rgb(255, 255, 255);
    font-weight: 700;
    margin-top: 16px;
    display: inline-block;
    text-align: center;
    text-decoration: none;
    line-height: 60px;
    transition: filter .2s;
    cursor: pointer;

    &:hover {
        filter: brightness(90%);
    }
`;

// export const BackLink = styled(Link)`
//     display:flex;
//     text-align: center;
//     align-items: center;
//     justify-content: center;
//     margin-top: 20px;
//     color: rgb(65, 65, 77);
//     font-size: 16px;
//     text-decoration: none;
//     font-weight: 500;
//     transition: opacity 0.2s;

//     &:hover {
//         opacity: 0.8;
//     }

//     svg {
//         margin-right: 8px;
//     }
// `;