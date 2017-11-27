package controllers;

import play.*;
import play.data.*;
import play.mvc.*;

import views.html.*;

import models.*;
public class Application extends Controller {

    Form<Book> bookForm = formFactory.form(Book.class);

    public Result index() {
        return ok(index.render());

    }



}