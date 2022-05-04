package cucumber.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class CustomerAccountP {

    /* Elements */
    private static By title = By.cssSelector(".titleHeadline");
    private static final By logout = By.xpath("//a[contains(@href, '/bestellung/logout')]");

    public SelenideElement accountTitle() {
        return $(title);
    }

    public LoginP clickOnLogout() {
        $(logout).click();
        return page(LoginP.class);
    }
}
