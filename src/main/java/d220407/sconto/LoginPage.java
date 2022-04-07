package d220407.sconto;

import org.openqa.selenium.By;

import java.security.PublicKey;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    private static final By emailField = By.id("loginEmail");
    private static final By passField = By.id("loginPassword");
    private static final By loginButton = By.id("login-submit");

    public void fillCred(String login, String pass) {
        $(emailField).setValue(login);
        $(passField).setValue(pass);
    }

    public HeaderMenu clickOnLoginBtn() {
        $(loginButton).click();
        return page(HeaderMenu.class);
    }
}
