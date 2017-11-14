package controllers;

import play.mvc.*;

import views.html.*;

public class CartController extends Controller {


    public Result transaction() {
        return ok(cart.render());
    }

}