package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class IndexPageObject extends PageObject {


    @FindBy(xpath = "//a[@class='login']")
    WebElementFacade btnSignIn;
    @FindBy(xpath = "//input[@id='email']")
    WebElementFacade inputEmail;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElementFacade inputPass;
    @FindBy(xpath = "//p[@class='submit']//span[1]")
    WebElementFacade btnSignIn2;
    @FindBy(xpath = "//*[@id='homefeatured']/li[7]/div/div[2]/h5/a")
    WebElementFacade imgProduct;
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElementFacade btn_agregar_carrito;

    public void goToSignIn() {
        btnSignIn.click();
    }

    public void insertAccount(String email, String pass) {
        inputEmail.type(email);
        inputPass.type(pass);
        btnSignIn2.click();
    }

    public void addProductToTheCart() {
    imgProduct.click();
    btn_agregar_carrito.click();

    }
}
