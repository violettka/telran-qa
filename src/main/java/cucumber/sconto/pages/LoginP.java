package cucumber.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import d220407.sconto.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginP {

    /* Properties */
    private static String validEmail = PropertiesLoader.loadProperty("valid.email");
    private static String validPwd = PropertiesLoader.loadProperty("valid.password");

    /* Elements */

    private static By emailInput = By.id("loginEmail");
    private static By pwdInput = By.id("loginPassword");
    private static By loginBtn = By.id("login-submit");
    private static By loginHeader = By.cssSelector(".existingAccount__headline");

    private static By validationMessage = By.id("loginEmail-error");

    public void validLoginInput() {
        $(emailInput).setValue(validEmail);
        $(pwdInput).setValue(validPwd);
    }

    public void clickLoginBtn() {
        $(loginBtn).click();
    }

    public SelenideElement loginPageHeader() {
        return $(loginHeader);
    }

    public void invalidLoginInput() {
        $(emailInput).setValue("va");
        $(pwdInput).setValue(validPwd);
    }

    public SelenideElement invalidLoginMessage() {
    return $(validationMessage);
    }
}
