import React, { useState, useEffect } from 'react';

import { Link } from 'react-router-dom';

import { Content, Item, EmptyCart } from './styles';
import { Navbar } from '../../components/navbar';
import { Footer } from '../../components/footer';

export const Cart = () => {
    const [cart, setCart] = useState([]);

    const getCart = () => {
        if (localStorage.getItem('cart')) {
            setCart(JSON.parse(localStorage.getItem('cart')));
            console.log(JSON.parse(localStorage.getItem('cart')));
        }
    }

    const totalPrice = () => {
        const total = cart.reduce((sum, product) => {
            return sum += (product.preco * product.quantidade);
        }, 0);
        return total.toFixed(2)
    }

    useEffect(() => {
        getCart();
        console.log(cart)
    }, [])

    // if (cart.length > 0) {
    return (
        <>
            <Navbar />
            <Content>
                <div className="container">
                    {cart.map((product, index) => (
                        <div className="product" key={`${index}`}>
                            <img src={`${product.img}`} alt={`${product.img}`} />
                            <div className="description">
                                <p className="title">{`${product.nome}`}</p>
                                <p>quantidade: {`${product.quantidade}`}</p>
                                <p>Preço unitário: R$ {`${(product.preco).toFixed(2)}`}</p>
                                <p>Preço total: R$ {`${(product.preco * product.quantidade).toFixed(2)}`}</p>
                            </div>
                        </div>
                    ))}
                    <div className="total">
                        <p>Subtotal:</p>
                        <p>{totalPrice()}</p>
                    </div>

                    <div className="buttons">
                        <Link to="/categorias" >
                            <button className="keep-buying-button">
                                Continuar comprando
                            </button>
                        </Link>
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