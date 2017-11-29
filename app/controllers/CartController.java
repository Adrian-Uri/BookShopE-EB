package controllers;

import play.data.Form;
import play.mvc.*;

import models.Notebook;
import views.html.*;

public class CartController extends Controller {



   public Result transaction() {
        return ok(pay.render());
    }


    public Result postCart(){
        Form<Notebook> notebookForm = Form.form(Notebook.class).bindFromRequest();
        return ok(cart.render(notebookForm));
    }
    public Result confirm(){
        return ok(confirmation.render());
    }
}