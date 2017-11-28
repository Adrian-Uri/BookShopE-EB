package controllers;

import com.google.inject.Inject;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.Form.*;
import play.data.FormFactory;
import play.mvc.*;
import utils.*;
import views.html.*;
import static play.data.Form.form;


public class Application extends Controller {

    public Result index() {

        DynamicForm notebookForm = Form.form().bindFromRequest();
        return ok(index.render(notebookForm));
    }



}