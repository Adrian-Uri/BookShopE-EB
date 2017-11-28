package controllers;

import play.*;
import play.data.*;
import play.mvc.*;

import views.html.*;

import models.*;

import javax.inject.Inject;

public class Application extends Controller {

    private final Form<WidgetData> form;
    private final List<Widget> widgets;
 
    Form<Book> bookForm = formFactory.form(Book.class);

    public Result index() {
        return ok(index.render());

    }



}