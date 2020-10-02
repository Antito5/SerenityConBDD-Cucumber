package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckPageObject extends PageObject {

    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
    WebElementFacade btnConfirmOrder;
    @FindBy(xpath = "//p[@class='alert alert-success']")
    WebElementFacade lblMessage;


    public void proceedToPayment() {
        btnConfirmOrder.click();
    }


    public String result() {
        return lblMessage.getText();
    }
}
