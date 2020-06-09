import styled from 'styled-components';

export const Container = styled.nav`
    margin: auto;
    display: flex;
    align-items: center;
    justify-content: center;
    background-color: white;
    margin-top: 10px;

    .mobile {
        display: none;
    }

    .search-area {
        display: flex;
        padding: 15px;
        margin-right: 120px;
        border-radius: 8px;
        background-color: #EBEBEB;

        input {
            outline: 0;
            width: 300px;
            border: none;
            padding-left: 20px;
            font-size: 16px;
            background-color: #EBEBEB;
        }
    }

    ul {
        display: flex;
        list-style: none;
        flex-direction: row;
        justify-content: flex-end;
    }

    li {
        display: flex;
        cursor: pointer;
        padding-left: 20px;
        padding-right: 20px;
        flex-direction: row;
        
        &:hover {
            opacity: 85%;
        }
    }

    p {
        padding: 5px;
        padding-left: 10px;
    }

    @media screen and (max-width: 1440px) {
        height: 80px;
        box-shadow: 0px 1px 1px rgba(0, 0, 0, 0.25);
    }

    @media screen and (max-width: 960px) {
        height: 80px;
        box-shadow: 0px 1px 1px rgba(0, 0, 0, 0.25);
    }

    /* @media screen and (max-width: 1140px) {
        height: 62px;

        .mobile {
            display: initial;
        }
    } */
`;