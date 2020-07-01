import React from 'react';
import { Content, Item, EmptyCart } from './styles';
import { Navbar } from '../../components/navbar';
import { Footer } from '../../components/footer';

import hotdog from '../../assets/hamburguinho.jpg'

export const Cart = () => {


    // if (cart.length > 0) {
        return (
            <>
                <Navbar />
                <Content>
                    <div className="container">
                        <div className="product">
                            <img src={`${hotdog}`} alt="hot dog" />
                            <div className="description">
                                <p>Cachorro quente</p>
                                <p>R$ 7,90</p>
                            </div>
                        </div>
                        <div className="product">
                            <img src={`${hotdog}`} alt="hot dog" />
                            <div className="description">
                                <p>Cachorro quente</p>
                                <p>R$ 7,90</p>
                            </div>
                        </div>
                        <div className="product">
                            <img src={`${hotdog}`} alt="hot dog" />
                            <div className="description">
                                <p>Cachorro quente</p>
                                <p>R$ 7,90</p>
                            </div>
                        </div>

                        <div className="total">
                            <p>Subtotal:</p>
                            <p>40,50</p>
                        </div>

                        <div className="buttons">
                            <button className="keep-buying-button">
                                Continuar comprando
                            </button>

                            <button className="checkout-button">
                                Finalizar compra
                            </button>
                        </div>
                    </div>
                </Content>
                <Footer />
            </>
        );
    // } else {
    //     return (
    //         <>
    //             <Navbar />
    //             <Content>
    //                 <div className="container">
    //                     <div className="empty-bag">
    //                         <p>
    //                             Clique em "adicionar" para
    //                         </p>
    //                         <p>
    //                             adicionar a sua sacola :)
    //                         </p>
    //                     </div>
    //                 </div>
    //             </Content>
    //             <Footer />
    //         </>
    //     )
    // }

}