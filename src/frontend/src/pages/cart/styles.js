import styled from 'styled-components';

export const Content = styled.div`
    margin: auto;
    margin-top: 50px;
    align-items: center;

    .container {
        color: #333;
        justify-content: flex-start;
        .product{
            width: 992px;
            display: flex; 
            margin-bottom: 50px;
            justify-content: center;
            img {
                width: 209px;
                height: 104px;
            }
        }

        .description {
            p {
                font-size: 22px;
                font-weight: 500;
                padding-left: 40px;
                padding-bottom: 20px;
            }
        }

        .total {
            color: #333;
            display: flex;
            flex-direction: row;
            justify-content: space-between;

            p {
                padding: 0 190px;
                font-size: 20px;
                margin-bottom: 80px;
            }
        }

        .buttons {
            display: flex;
            justify-content: space-evenly;

            .keep-buying-button {
            color: #757575;
            border: 0;
            outline: 0;
            font-size: 22px;
            font-weight: 500;
            background-color: transparent;
            transition: all .3s;
            padding-right: 20px;

                &:hover {
                    opacity: 90%;
                }
            }

            .checkout-button {
                border: 0;
                outline: 0;
                color: #fff;
                width: 361px;
                height: 53px;
                font-size: 22px;
                font-weight: 600;
                border-radius: 4px;
                background-color: #12b018;
                transition: all .3s;
                padding-left: 20px;

                    &:hover {
                        opacity: 90%;
                    }
            }
        
        }

        .empty-bag {
            display: flex;
            padding: 40px;
            color: #E3E1E1;
            font-size: 24px;
            font-weight: bold;
            line-height: 50px;
            align-items: center;
            flex-direction: column;
        }
    }
    
`;

export const Item = styled.li`
    list-style: none;
    margin: auto;
    p {
        all:unset;
        padding-left: 50px;
    }
`;

export const EmptyCart = styled.div`
    display: flex;
    justify-content: center;
    margin: auto;
    color: rgb(153, 153, 153); 
`;