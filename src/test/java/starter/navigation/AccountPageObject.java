package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountPageObject extends PageObject {

    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElementFacade lblTitle;

    public String returnResult() {
        return lblTitle.getText();
    }
}
