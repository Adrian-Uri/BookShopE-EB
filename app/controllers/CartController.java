package controllers;

import models.Customer;
import play.data.Form;
import play.mvc.*;

import models.Notebook;
import views.html.*;

public class CartController extends Controller {



   public Result transaction() {
        return ok(pay.render());
    }


    public Result postCart(){
        Customer customer= new Customer();
        Form<Notebook> notebookForm = Form.form(Notebook.class).bindFromRequest();
        Form<Customer> customerForm = Form.form(Customer.class).fill(customer);
        if(customerForm.hasErrors()){
            return badRequest(cart.render(notebookForm,customerForm));
        }
        return ok(cart.render(notebookForm,customerForm));

    }

    public Result confirm(){
        Form<Customer> customerForm =Form.form(Customer.class).bindFromRequest();
        Form<Notebook> notebookForm = Form.form(Notebook.class).bindFromRequest();
        if(customerForm.hasErrors()){
            return badRequest(cart.render(notebookForm,customerForm));
        }


        return ok(confirmation.render(customerForm));
    }
}