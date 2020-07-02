import styled from "styled-components";

export const Container = styled.footer`
    /* bottom: 0; */
    margin: auto;
    width: 100%;
    margin-top: 50px;
    position: absolute;
    align-items: center;
    justify-content: center;
    background-color: #F9F9F9;

    .links {
        width: 100%;
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
        padding-bottom: 50px;
        justify-content: center;
    }

    .social-medias {
        color: #333;
        font-size: 16px;
        margin-top: 50px;
        font-weight: bold;
        margin-right: 150px;
        background-color: #F9F9F9;

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