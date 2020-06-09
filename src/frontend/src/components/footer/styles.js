import styled from "styled-components";

export const Container = styled.footer`
    bottom: 0;
    margin: 0;
    width: 100%;
    display: flex;
    position: relative;
    align-items: center;
    flex-direction: column;
    justify-content: center;
    background-color: #DDD;
    margin-top: 50px;

    .links {
        width: 100%;
        margin: auto;
        color: white;
        font-size: 16px;
        font-weight: bold;
        background-color: #AF1414;
        
        ul {
            display: flex;
            list-style: none;
            align-items: center;
            justify-content: center;
        }

        li {
            margin: 30px;
            cursor: pointer;
            padding-left: 30px;
        }
    }

    .infos {
        display: flex;
        flex-direction: row;
        align-items: center;
        margin-bottom: 50px;
    }

    .social-medias {
        color: #333;
        font-size: 16px;
        font-weight: bold;
        background-color: #DDD;
        margin-top: 50px;
        margin-right: 150px;

        p {
            text-align: center;
        }
    }

    .privacy-policies{
        margin-top: 60px;
        margin-left: 150px;
        p {
            color: #757575;
            text-align: right;
            font-weight: 700px;
        }
    }
`;