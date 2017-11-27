package controllers;

import play.*;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;


import utils.*;
import views.html.*;


public class Application extends Controller {



    public Result index() {
         return ok(index.render());
    }

    public Result customizeNotebook(){
        //FormFactory formFactory = new FormFactory();
       // Form<Notebook> notebookForm = formFactory.form(Notebook.class);
        return ok(index.render());

    }

}