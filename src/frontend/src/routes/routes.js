import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';

import Home from '../pages/home';
import Details from '../pages/details';
import { Login } from '../pages/login';
import { Cart } from '../pages/cart';
import { NotFound } from '../pages/notFound';
import { Categories } from '../pages/categories';
import { Category } from '../pages/category';
import { Perfil } from '../pages/perfil';
import PrivateRoute from './PrivateRoute';


const Routes = () => (
    <Router>
        <Switch>
            <Route exact path="/login">
                <Login />
            </Route>
            <Route exact path="/" >
                <Home />
            </Route>
            <Route exact path="/produtos/detalhes/:id">
                <Details />
            </Route>
            <Route exact path="/sacola">
                <Cart />
            </Route>
            <Route exact path="/categorias/">
                <Categories />
            </Route>
            <Route exact path="/categorias/:id">
                <Category />
            </Route>
            <Route exact path="/perfil">
                <Perfil />
            </Route>
            <Route>
                <NotFound />
            </Route>
        </Switch>
    </Router >
);

export default Routes;