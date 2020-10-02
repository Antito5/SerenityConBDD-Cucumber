package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.Usuario;


public class UserStoreDefinitionsSteps {
    @Steps(shared=true)
    Usuario actor;

    @Given("^that (.*) go to Store$")
    public void that_the_user_go_to_Store(String nombre) {
        actor.isCalled(nombre);
        actor.that_the_user_go_to_Store();
    }

    @When("^(.*) select SignIn button$")
    public void the_user_select_SignIn_button(String nombre) {
        actor.isCalled(nombre);
        actor.the_user_select_SignIn_button();
    }

    @And("^(.*) input the following email address and password: (.*), (.*)$")
    public void the_user_input_the_following_email_address_and_password_anto_m_hotmail_com_antito(String nombre, String email, String pass) {
        actor.isCalled(nombre);
        actor.the_user_input_the_following_email_address_and_password_anto_m_hotmail_com_antito(email, pass);

    }

    @Then("^(.*) have to see the title: (.*)$")
    public void the_user_have_to_see_the_title_MY_ACCOUNT(String nombre, String expectedTitle) {
        actor.isCalled(nombre);
        actor.the_user_have_to_see_the_title_MY_ACCOUNT(expectedTitle);
    }

    @When("^(.*) add to cart one product")
    public void antoAddToCartTheProductProduct(String nombre) {
        actor.isCalled(nombre);
        actor.the_user_add_to_cart_the_product();
    }

    @And("^(.*) proceed to checkout$")
    public void antoProceedToCheckout(String nombre) {
        actor.isCalled(nombre);
        actor.the_user_proceed_to_checkout();
    }

    @And("^(.*) pass summary page$")
    public void antoPassSummaryPage(String nombre) {
        actor.isCalled(nombre);
        actor.the_user_pass_summary_page();
    }

    @And("^(.*) logIn into Store with email: (.*) and password: (.*)$")
    public void antoLogInIntoStoreWithEmailAnto_mHotmailComAndPasswordAntito(String nombre,String email,String pass) {
        actor.isCalled(nombre);
        actor.the_user_input_the_following_email_address_and_password_anto_m_hotmail_com_antito(email,pass);
    }

    @And("^(.*) pay the purchase$")
    public void antoPayThePurchase(String nombre) {
        actor.isCalled(nombre);
        actor.the_user_pay_th_purchase();
    }

    @Then("^(.*) have to see the following message: (.*)$")
    public void antoHaveToSeeTheFollowingMessageYourOrderOnMyStoreIsComplete(String nombre, String expectedMessage) {
        actor.isCalled(nombre);
        actor.the_user_hace_to_see_the_correct_message(expectedMessage);
    }



}
