import styled from "styled-components";

export const Container = styled.header`
    display: flex;
    align-items: center;
    justify-content: center;

    .picture, .picture-md {
        cursor: pointer;
        margin-top: 40px;
        margin-bottom: 40px;
    }

    @media screen and (max-width: 768px) {
        .picture, .picture-md  {
            display: none;
        }
    }

    @media screen and (min-width: 768.1px) and (max-width: 992px) {
        .picture {
            display: none;
        }

        .picture-md {
            display: initial;
        }
    }

    @media screen and (min-width: 993px) {
        .picture {
            display: initial;
        }

        .picture-md {
            display: none;
        }
    }
`;
