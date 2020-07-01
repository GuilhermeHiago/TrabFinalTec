import styled from "styled-components";

export const Container = styled.section`
    margin: auto;
    margin-top: 50px;
    align-items: center;

    h3 {
        color: #333;
        cursor: pointer;
        font-weight: bold;
    }

    .header {
        padding: 15px 6px;
        margin: auto;
        display: flex;
        flex-direction: row;
        justify-content: space-between;
    }

    .red {
        color: red;
        cursor: pointer;
        font-weight: bold;
        margin-top: 20px;
    }

`;

export const Card = styled.div`
    display: flex;
    
    div {
        margin: 8px;
        padding: 25px;
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

    img {
        display: flex;
        margin: 0;
        justify-content: center;
    }

    p {
        color: #333;
    }

    .product-style {
        font-size: 18px;
        font-weight: 400;
        padding-top: 8px;
        margin-bottom: 50px;
    }

    button {
        margin: auto;
        border: none;
        outline: none;
        display: flex;
        width: 190px;
        height: 31px;
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