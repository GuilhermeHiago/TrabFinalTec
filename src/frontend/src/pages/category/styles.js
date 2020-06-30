import styled from 'styled-components';

export const Container = styled.div`
    
`;

export const Card = styled.div`
    display: flex;
    margin: auto;
    flex-wrap: wrap;
    justify-content: center;
    max-width: 960px;
    
    div {
        max-width: 400px;
        margin: 30px;
        padding: 20px;
        flex-direction: row;
        box-shadow: 1px 1px 10px 0px rgba(51,51,51,0.3);
    }

    section {
        display: flex;
        justify-content: space-between;

        .quantity-style {
            font-weight: 500;
        }

        .value-style {
            font-weight: 700;
        }

    }

    p {
        color: #333;
    }

    .product-style {
        text-align: center;
        font-size: 20px;
        font-weight: 700;
        padding-top: 8px;
        margin-top: 10px;
        margin-bottom: 30px;
    }

    button {
        margin: auto;
        border: none;
        outline: none;
        display: flex;
        width: 350px;
        height: 45px;
        cursor: pointer;
        color: white;
        font-weight: bold;
        align-items: center;
        transition: all 0.3s ;
        justify-content: center;
        background-color: #EA9E44;

        &:hover {
            opacity: 90%;
        }
    }

    @media screen and (max-width: 768px) {
        flex-direction: column;
    }
`;
