package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class PaymentPageObject extends PageObject {

    @FindBy(xpath = "//a[@class='cheque']")
    WebElementFacade btnCheque;


    public void proceedToPayment() {
        btnCheque.click();
    }
}
