package controllers;

import models.Notebook;
import play.data.Form;
import play.mvc.*;
import views.html.*;



public class Application extends Controller {

        public Result index() {
        Notebook notebook = new Notebook() ;
        Form<Notebook> noteForm = Form.form(Notebook.class).fill(notebook);
        return ok(index.render(noteForm));
    }

}