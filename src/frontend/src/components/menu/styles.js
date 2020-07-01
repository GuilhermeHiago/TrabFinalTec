import styled from "styled-components";

export const Container = styled.section`
    ul {
        margin: 0;
        list-style: none;
        align-items: center;
        justify-content: center;
    }
    
    div {
        outline: 0;
        width: 600px;
        display: flex;
        padding-top: 10px;
        align-items: center;
        justify-content: center;
    }

    li {
        cursor: pointer;
        display: flex;
        flex-direction: row;
        text-align: center;
        margin-bottom: 0px;
        justify-content: center;
    }

    p {
        font-size: 18px;
        padding-top: 8px;
    }

    img {
        border-radius: 10px;
        transition: all 0.3s;

        &:hover {
            opacity: 90%;
            box-shadow: 2px 2px rgba(0, 0, 0, 0.2);
        }
    }

    .mobile {
        margin: auto;
        background-color:  transparent;
    }

    .large {
        li {
            margin-left: 20px;
            margin-right: 20px;
        }
    }

    @media screen and (max-width: 768px) {
        .large {
            display: none;
        }

        .mobile {
            display: flex;
        }
    }

    @media screen and (min-width: 768.1px) and (max-width: 992px) {
        .large {
            display: flex;
        }

        .mobile {
            display: none;
        }
    }

    @media screen and (min-width: 993px) {
        .large {
            display: flex;
        }

        .mobile {
            display: none;
        }
    }
`;