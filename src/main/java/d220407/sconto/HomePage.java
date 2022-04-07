package d220407.sconto;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class HomePage {

    private static By acceptBtn = By.xpath("//*[@data-accept-action='all']");

/*
    private static final By iconLogin = By.cssSelector(".headerElement__suffix");

    public LoginPage clickOnLoginIcon() {
        $(iconLogin).click();
        return page(LoginPage.class);
    }

    public KontoPage clickMyKontoIcon() {
        $(iconLogin).click();
        return page(KontoPage.class);
    }

    public void checkIconText(String iconText) {
    $(iconLogin).shouldHave(Condition.text(iconText));
    }

 */
}
