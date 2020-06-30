import styled from 'styled-components';

export const Container = styled.nav`
    margin: auto;
    height: 80px;
    display: flex;
    margin-top: 10px;
    margin-bottom: 10px;
    align-items: center;
    justify-content: center;
    background-color: white;
    box-shadow: 0px 1px 1px rgba(50, 50, 50, 0.25);

    .search-area {
        display: flex;
        padding: 15px;
        margin-right: 120px;
        border-radius: 8px;
        background-color: #EBEBEB;

        input {
            outline: 0;
            border: none;
            width: 300px;
            font-size: 16px;
            padding-left: 20px;
            background-color: #EBEBEB;
        }
    }

    .icon {
        color: #333;
    }

    .search-icon {
        color: #757575;
    }

    section {
        display: flex;
    }

    ul {
        display: flex;
        list-style: none;
        margin-top: 10px;
        flex-direction: row;
        justify-content: flex-end;
    }

    li {
        display: flex;
        font-size: 18px;
        cursor: pointer;
        margin-left: 20px;
        margin-right: 20px;
        align-items: center;
        flex-direction: row;
            
        &:hover {
            opacity: 85%;
        }
    }

    p {
        padding: 5px;
        padding-left: 10px;
        padding-top: 15px;
    }

    .menu, .menu-search {
        display: initial;
    }

    .basket-quantity {
        top: 8px;
        left: -10px;
        width: 20px;
        color: #fff;
        height: 20px;
        font-size: 14px;
        position: relative;
        text-align: center;
        border-radius: 100%;
        background-color: #14bd82;
    }

    @media screen and (max-width: 768px) {
        li {
            flex-direction: column;
        }

        .search-icon {
            all: unset;
            height: 36px;
            color: #333;
            padding-top: 7px;
        }

        .menu-search {
            display: none;
        }

        .search-area {
            color: #333;
            padding: 20px;
            font-size: 18px;
            margin-right: 0px;
            flex-direction: column;
            background-color: transparent;
        }

        .icon {
            height: 40px;
            color: #333;
        }
    }

    @media screen and (min-width: 768.1px)  and (max-width: 992px){
        .name {
            display: none;
        }

        .search-area {
            p {
                padding-top: 0; 
                display: none; 
            }
        }

    }

    @media screen and (min-width: 992.1px) {
        .search-area {
            p {
                padding-top: 0;  
                display: none; 
            }
        }
    }

`;