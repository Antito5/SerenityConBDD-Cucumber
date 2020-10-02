package starter.steps;

import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import starter.navigation.*;

import static org.hamcrest.MatcherAssert.assertThat;

public class Usuario extends ScenarioActor {


    String actor;

    @Steps(shared=true)
    IndexPageObject indexPageObject;
    @Steps(shared=true)
    AccountPageObject accountPageObject;
    @Steps(shared = true)
    CheckOutPageObject checkOutPageObject;
    @Steps(shared = true)
    SummaryPageObject summaryPageObject;
    @Steps(shared = true)
    AddressPageObject addressPageObject;
    @Steps(shared = true)
    ShippingPageObject shippingPageObject;
    @Steps(shared = true)
    PaymentPageObject paymentPageObject;
    @Steps(shared = true)
    CheckPageObject checkPageObject;



    @Step("that #actor go to Store")
    public void that_the_user_go_to_Store() {
        indexPageObject.setDefaultBaseUrl("http://automationpractice.com");
        indexPageObject.open();
    }

    @Step("#actor select SignIn button")
    public void the_user_select_SignIn_button() {
        indexPageObject.goToSignIn();
    }

    @Step("#actor input the following email address and password: {0}, {1}")
    public void the_user_input_the_following_email_address_and_password_anto_m_hotmail_com_antito(String email, String pass) {
        indexPageObject.insertAccount(email, pass);
    }

    @Step("#actor have to see the title: {0}")
    public void the_user_have_to_see_the_title_MY_ACCOUNT(String expectedTitle) {
        String result = accountPageObject.returnResult();
        System.out.println(expectedTitle);
        System.out.println(result);
        assertThat(result, Matchers.equalTo(expectedTitle));
    }

    @Step("#actor add to cart one product")
    public void the_user_add_to_cart_the_product() {
        indexPageObject.addProductToTheCart();
    }

    @Step("#actor proceed to checkout")
    public void the_user_proceed_to_checkout() {
        checkOutPageObject.proceedToCheckOut();
    }

    @Step("#actor pass the summary page")
    public void the_user_pass_summary_page() {
        summaryPageObject.proceedToPayment();
    }

    @Step("#actor pay the purchase")
    public void the_user_pay_th_purchase() {

        addressPageObject.proceedToPayment();
        shippingPageObject.proceedToPayment();
        paymentPageObject.proceedToPayment();
        checkPageObject.proceedToPayment();
    }

    @Step("#actor have to see the following message: {0}")
    public void the_user_hace_to_see_the_correct_message(String expectedMessage) {
        String result= checkPageObject.result();
        System.out.println("Expected Message: "+expectedMessage);
        System.out.println("Current Message: "+result);

        assertThat(result,Matchers.equalTo(expectedMessage));
    }


}