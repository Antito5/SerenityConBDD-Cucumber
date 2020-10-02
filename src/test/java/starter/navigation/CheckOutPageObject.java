package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckOutPageObject extends PageObject {

    @FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
    WebElementFacade btnCheckOut;

    public void proceedToCheckOut() {
        btnCheckOut.click();
    }

}
