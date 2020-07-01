import styled from 'styled-components';

export const Container = styled.section`
    margin: auto;
    display: flex;
    margin-top: 50px;
    align-items: center;
    flex-direction: column;
    justify-content: center;

    .description-style {
        color: #979595;
        font-size: 22px;
        max-width: 960px;

        .description-height {
         color: #333;
         font-size: 24px;
         font-weight: bold;   
        }

        .description-text {
            margin-top: 30px;
        }
    }

    .price-style {
        font-size: 22px;
        color: #444;
        margin-bottom: 80px;
    }

    /* @media screen and (max-width: 815px) {
        margin: 0;
        width: 100%;
        height: 55px;
        position: relative;
        background-color: red;
        
        .menu-960 {
            display: initial;
        }

        .resolution-mobile {
            display: none;
            box-shadow: none;
        }

        .mobile {
            display: initial;
            ul {
                display: flex;
                flex-direction: row;
            }
            li {
                display: flex;
                flex-direction: column;
            }
        }
    } */
`;

export const Content = styled.div`
    color: #333;
    display: flex;
    flex-direction: row;
    max-width: 960px;
    justify-content: center;

    .a {
        img {
            padding: 14px;
            margin-right: 30px;
        }
    }

    .description-sale {
        display: flex;
        flex-direction: column;



        h1 {
            font-size: 28px;
            font-weight: bold;
            padding-bottom: 30px;
        }

        button {
            border: none;
            outline: none;
            display: flex;
            width: 350px;
            height: 50px;
            color: white;
            cursor: pointer;
            font-size: 20px;
            font-weight: bold;
            align-items: center;
            margin-bottom: 15px;
            transition: all 0.3s;
            justify-content: center;
            background-color: #EA9E44;

            &:hover {
                opacity: 90%;
            }
        }
    }

    @media screen and (min-width: 1440px) {
        margin: auto;
    }

    /* @media screen and (max-width: 815px) {
        margin: 0;
        width: 100%;
        height: 55px;
        position: relative;
        background-color: red;
        
        .menu-960 {
            display: initial;
        }

        .resolution-mobile {
            display: none;
            box-shadow: none;
        }

        .mobile {
            display: initial;
            ul {
                display: flex;
                flex-direction: row;
            }
            li {
                display: flex;
                flex-direction: column;
            }
        }
    } */

`;

