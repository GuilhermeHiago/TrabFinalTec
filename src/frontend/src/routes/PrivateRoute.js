import React from 'react';
import { Redirect, Route } from 'react-router-dom';

const PrivateRoute = ({ component: Component, ...rest }) => (
    <Route
        {...rest}
        render={props => (
            true ?
                <Redirect to="/login" />
                :
                <Component {...props} />

        )}
    />
);

export default PrivateRoute;