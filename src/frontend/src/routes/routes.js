import React from 'react';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';

import Home from '../pages/home';
import Details from '../pages/details';

const Routes = () => (
    <Router>
        <Switch>
            <Route exact path="/">
                <Home />
            </Route>
            <Route>
                <Details path="/details/:id"/>
            </Route>
            {/* <Route>
                <NotFound />
            </Route> */}
        </Switch>
    </Router>
);

export default Routes;