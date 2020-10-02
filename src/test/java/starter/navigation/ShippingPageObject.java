package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ShippingPageObject extends PageObject{

    @FindBy(xpath = "//*[@id='uniform-cgv']/span")
    WebElementFacade checkAgree;
    @FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
    WebElementFacade btnCheckout;


    public void proceedToPayment() {
        checkAgree.click();
        btnCheckout.click();
    }
}
